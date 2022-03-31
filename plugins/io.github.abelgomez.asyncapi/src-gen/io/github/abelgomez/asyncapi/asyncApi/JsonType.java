/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Json Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getJsonType()
 * @model
 * @generated
 */
public enum JsonType implements Enumerator
{
  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(0, "string", "\"string\""),

  /**
   * The '<em><b>Number</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMBER_VALUE
   * @generated
   * @ordered
   */
  NUMBER(1, "number", "\"number\""),

  /**
   * The '<em><b>Integer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(2, "integer", "\"integer\""),

  /**
   * The '<em><b>Boolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(3, "boolean", "\"boolean\""),

  /**
   * The '<em><b>Object</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OBJECT_VALUE
   * @generated
   * @ordered
   */
  OBJECT(4, "object", "\"object\""),

  /**
   * The '<em><b>Array</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARRAY_VALUE
   * @generated
   * @ordered
   */
  ARRAY(5, "array", "\"array\""),

  /**
   * The '<em><b>Any</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANY_VALUE
   * @generated
   * @ordered
   */
  ANY(6, "any", "\"any\""),

  /**
   * The '<em><b>Null</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NULL_VALUE
   * @generated
   * @ordered
   */
  NULL(7, "null", "\"null\"");

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="string" literal="\"string\""
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 0;

  /**
   * The '<em><b>Number</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMBER
   * @model name="number" literal="\"number\""
   * @generated
   * @ordered
   */
  public static final int NUMBER_VALUE = 1;

  /**
   * The '<em><b>Integer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model name="integer" literal="\"integer\""
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 2;

  /**
   * The '<em><b>Boolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model name="boolean" literal="\"boolean\""
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 3;

  /**
   * The '<em><b>Object</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OBJECT
   * @model name="object" literal="\"object\""
   * @generated
   * @ordered
   */
  public static final int OBJECT_VALUE = 4;

  /**
   * The '<em><b>Array</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARRAY
   * @model name="array" literal="\"array\""
   * @generated
   * @ordered
   */
  public static final int ARRAY_VALUE = 5;

  /**
   * The '<em><b>Any</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANY
   * @model name="any" literal="\"any\""
   * @generated
   * @ordered
   */
  public static final int ANY_VALUE = 6;

  /**
   * The '<em><b>Null</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NULL
   * @model name="null" literal="\"null\""
   * @generated
   * @ordered
   */
  public static final int NULL_VALUE = 7;

  /**
   * An array of all the '<em><b>Json Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final JsonType[] VALUES_ARRAY =
    new JsonType[]
    {
      STRING,
      NUMBER,
      INTEGER,
      BOOLEAN,
      OBJECT,
      ARRAY,
      ANY,
      NULL,
    };

  /**
   * A public read-only list of all the '<em><b>Json Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<JsonType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Json Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static JsonType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JsonType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Json Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static JsonType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JsonType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Json Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static JsonType get(int value)
  {
    switch (value)
    {
      case STRING_VALUE: return STRING;
      case NUMBER_VALUE: return NUMBER;
      case INTEGER_VALUE: return INTEGER;
      case BOOLEAN_VALUE: return BOOLEAN;
      case OBJECT_VALUE: return OBJECT;
      case ARRAY_VALUE: return ARRAY;
      case ANY_VALUE: return ANY;
      case NULL_VALUE: return NULL;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private JsonType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //JsonType
