package io.github.abelgomez.asyncapi.generator.target.schemas;

import io.github.abelgomez.asyncapi.asyncApi.Schema
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension java.text.MessageFormat.*

class SchemaClass extends SchemaAbstractType {
	protected new(Schema schema) {
		super(schema)
	}
	
	private def classModifiers() {
		return if (schema.isReusable) 
			"public"
		else
			"public static"
	}
	
	override imports() {
		val result = new TreeSet	
				
		result += "com.google.gson.Gson"
		result += "com.google.gson.annotations.SerializedName"
		result += "java.util.UUID"
		result += schema.api.transform.jsonSerializableInterface.fqn
		referencedClasses.forEach[nc | result += nc.imports]

		return Collections.unmodifiableNavigableSet(result)
	}
	
	override serialize()  '''
		«IF schema.isReusable»
		package «pkg»;
		
		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
		
		«ENDIF»
		«javadoc»
		«classModifiers» class «name» implements «schema.api.transform.jsonSerializableInterface.name» {
			«nestedClasses.join(System.lineSeparator, System.lineSeparator, "", [c | c.serialize])»
			«referencedClasses.join(System.lineSeparator, System.lineSeparator, System.lineSeparator, [rc | rc.asProperty.declare])»
			
			
			// TODO: Move the messageId to header instead of payload.
			/**
			 *  Identifier of the message
			 */
			@SerializedName("messageId")
			private String messageId;
			
			/**
			 * Private constructor. Instances of «name» should be created using 
			 * {@link «asBuilder.name»} instead.
			 */ 
			private «name»() {
				//TODO: Move the messageId to header instead of payload.
				this.messageId = "msg-" + UUID.randomUUID().toString();
			}
			
			/**
			 * Return a new {@link «asBuilder.name»}
			 *
			 * @return A new instance of {@link «asBuilder.name»}
			 */
			public static final «asBuilder.name» newBuilder() {
				return «asBuilder.name».newBuilder();
			}
			
			/**
			 * Parses the given {@link «name»} represented as a JSON {@link String} passed
			 * as an argument.
			 *
			 * @param json
			 *        A JSON {@link String}
			 * @return A new {@link «name»}
			 */
			public static «name» fromJson(String json) {
				Gson gson = new Gson();
				return gson.fromJson(json, «name».class);
			}
			
			//TODO: Move MessageId to header instead of payload.
			/**
			 * Returns the <code>messageId</code> property
			 * 
			 * @return A {@link String}
			 */
			public String getMessageId() {
				return this.messageId;
			}
			
			«referencedClasses.join(System.lineSeparator, [rc | rc.asProperty.getter])»
			
			«asBuilder.serialize»
		}
	'''
}
