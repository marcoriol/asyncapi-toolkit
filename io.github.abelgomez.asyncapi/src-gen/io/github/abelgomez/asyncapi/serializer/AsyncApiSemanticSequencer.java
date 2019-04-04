/*
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.serializer;

import com.google.inject.Inject;
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.Component;
import io.github.abelgomez.asyncapi.asyncApi.Contact;
import io.github.abelgomez.asyncapi.asyncApi.Info;
import io.github.abelgomez.asyncapi.asyncApi.License;
import io.github.abelgomez.asyncapi.asyncApi.Message;
import io.github.abelgomez.asyncapi.asyncApi.Reference;
import io.github.abelgomez.asyncapi.asyncApi.Schema;
import io.github.abelgomez.asyncapi.asyncApi.Server;
import io.github.abelgomez.asyncapi.asyncApi.Topic;
import io.github.abelgomez.asyncapi.asyncApi.Variable;
import io.github.abelgomez.asyncapi.services.AsyncApiGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class AsyncApiSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AsyncApiGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AsyncApiPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AsyncApiPackage.ASYNC_API:
				sequence_AsyncAPI(context, (AsyncAPI) semanticObject); 
				return; 
			case AsyncApiPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case AsyncApiPackage.CONTACT:
				sequence_Contact(context, (Contact) semanticObject); 
				return; 
			case AsyncApiPackage.INFO:
				sequence_Info(context, (Info) semanticObject); 
				return; 
			case AsyncApiPackage.LICENSE:
				sequence_License(context, (License) semanticObject); 
				return; 
			case AsyncApiPackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case AsyncApiPackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case AsyncApiPackage.SCHEMA:
				sequence_Schema(context, (Schema) semanticObject); 
				return; 
			case AsyncApiPackage.SERVER:
				sequence_Server(context, (Server) semanticObject); 
				return; 
			case AsyncApiPackage.TOPIC:
				sequence_Topic(context, (Topic) semanticObject); 
				return; 
			case AsyncApiPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AsyncAPI returns AsyncAPI
	 *
	 * Constraint:
	 *     (
	 *         (version=VersionNumber | info=AbstractInfo)? 
	 *         (servers+=AbstractServer servers+=AbstractServer*)? 
	 *         (topics+=AbstractTopic topics+=AbstractTopic*)? 
	 *         (components+=AbstractComponent components+=AbstractComponent*)?
	 *     )+
	 */
	protected void sequence_AsyncAPI(ISerializationContext context, AsyncAPI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponent returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     ((schemas+=AbstractSchema schemas+=AbstractSchema*) | (messages+=AbstractMessage messages+=AbstractMessage*))*
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractContact returns Contact
	 *     Contact returns Contact
	 *
	 * Constraint:
	 *     (name=STRING | url=STRING | email=STRING)*
	 */
	protected void sequence_Contact(ISerializationContext context, Contact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractInfo returns Info
	 *     Info returns Info
	 *
	 * Constraint:
	 *     (
	 *         title=STRING | 
	 *         version=STRING | 
	 *         description=STRING | 
	 *         termsOfService=STRING | 
	 *         contact=AbstractContact | 
	 *         license=AbstractLicense
	 *     )*
	 */
	protected void sequence_Info(ISerializationContext context, Info semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractLicense returns License
	 *     License returns License
	 *
	 * Constraint:
	 *     (name=STRING | url=STRING)*
	 */
	protected void sequence_License(ISerializationContext context, License semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractMessage returns Message
	 *     Message returns Message
	 *
	 * Constraint:
	 *     (name=STRING? (summary=STRING | description=STRING | headers=AbstractSchema | payload=AbstractSchema)*)
	 */
	protected void sequence_Message(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractInfo returns Reference
	 *     AbstractContact returns Reference
	 *     AbstractLicense returns Reference
	 *     AbstractServer returns Reference
	 *     AbstractVariable returns Reference
	 *     AbstractTopic returns Reference
	 *     AbstractMessage returns Reference
	 *     AbstractSchema returns Reference
	 *     AbstractComponent returns Reference
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     (refname=STRING? uri=STRING)
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractSchema returns Schema
	 *     Schema returns Schema
	 *
	 * Constraint:
	 *     (
	 *         name=STRING? 
	 *         (
	 *             (title=STRING | summary=STRING | description=STRING | format=STRING | default=STRING)? 
	 *             (enum+=STRING enum+=STRING*)? 
	 *             (schemas+=AbstractSchema schemas+=AbstractSchema*)? 
	 *             (payloads+=AbstractSchema payloads+=AbstractSchema*)?
	 *         )+
	 *     )
	 */
	protected void sequence_Schema(ISerializationContext context, Schema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractServer returns Server
	 *     Server returns Server
	 *
	 * Constraint:
	 *     ((title=STRING | scheme=Scheme | description=STRING)? (variables+=AbstractVariable variables+=AbstractVariable*)?)+
	 */
	protected void sequence_Server(ISerializationContext context, Server semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractTopic returns Topic
	 *     Topic returns Topic
	 *
	 * Constraint:
	 *     (name=STRING (publish=AbstractMessage | subscribe=AbstractMessage)*)
	 */
	protected void sequence_Topic(ISerializationContext context, Topic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractVariable returns Variable
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=STRING ((description=STRING | default=STRING)? (enum+=STRING enum+=STRING*)?)+)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}