# AsyncAPI Toolkit
Repository to host the grammar, metamodel, and code generation tools for [AsyncAPI](https://www.asyncapi.com). 

> _AsyncAPI provides a specification that allows you to define Message-Driven APIs in a machine-readable format. It's protocol-agnostic, so you can use it for APIs that work over Kafka, MQTT, AMQP, WebSockets, STOMP, etc. The spec is very similar to OpenAPI/Swagger so, if you're familiar with it, AsyncAPI should be easy for you._

The tools hosted in this repository aim to provide the toolset necessary to develop Message-Driven APIs following a Model-based approach starting from AsyncAPI specifications.

## AsyncAPI Metamodel

Below you can find the simplified [AsyncAPI v2.0.0](https://www.asyncapi.com/docs/specifications/2.0.0/) Metamodel Derived from the AsyncAPI Xtext Grammar.

![AsyncAPI Metamodel](plugins/io.github.abelgomez.asyncapi/model/AsyncApi.png)

## Installation

To install the toolkit use the following update site:

> https://som-research.github.io/asyncapi-toolkit/updates

### Prerequisites

* The toolkit requires [Eclipse 4.12 (2019-06)](https://download.eclipse.org/eclipse/downloads/drops4/R-4.12-201906051800/) or [above](https://download.eclipse.org/eclipse/downloads/).
* An external MQTT broker (e.g. [mosqutitto](https://mosquitto.org/download/)) is recommended for the Example project to be executable (in favor of the embedded Moquette server).

## Quick Start Guide

To start using the toolkit, just install the plugins, using the previous Update site:

![AsyncAPI Toolkit Update Site](doc/update_site.png)

After installation is complete, a new wizard will appear in the `New Project` dialog:

![New Project Wizard - Step 1](doc/wizard1.png)

Select _AsyncAPI Project_, set a project name, and continue.

![New Project Wizard - Step 2](doc/wizard2.png)

After that, the _Streetlights API_ template project will appear. The _Streetlights API_ template contains a fully working example (provided a mqtt broker is running in localhost) demonstrating the capabilities of the framework.

![New Project Wizard - Step 3](doc/wizard3.png)

Finally, the wizard can be completed.

![New Project Wizard - Step 4](doc/wizard4.png)

After that, A new project with the following contents will appear in the workspace.

![Streetlights API Project Contents](doc/project_contents.png)

Pay special attention to the following files:

* `src/streetlights/StreetlightsAPI.asyncapi` is an example specification (see below) of an API using the JSON format of the AsyncAPI specification. Code in `src-gen` will be generated from the specification contained in this file.

``` js
{
  "asyncapi": "2.0.0",
  "info": {
    "title": "Streetlights API",
    "version": "1.0.0",
       "description": "The Smartylighting Streetlights API allows you to remotely manage the city lights.\n\n### Check out its awesome features:\n\n* Turn a specific streetlight on/off 🌃\n* Dim a specific streetlight 😎\n* Receive real-time information about environmental lighting conditions 📈\n",
    "license": {
      "name": "Apache 2.0",
      "url": "https://www.apache.org/licenses/LICENSE-2.0"
    }
  },
  "servers": {
    "production": {
      "url": "localhost:{port}",
      "protocol": "mqtt",
      "description": "Test broker",
      "variables": {
        "port": {
          "description": "Secure connection (TLS) is available through port 8883.",
          "default": "1883",
          "enum": [
            "1883",
            "8883"
          ]
        }
      },
    }
  },
  "channels": {
    "smartylighting/streetlights/1/0/event/{streetlightId}/lighting/measured": {
      "description": "The topic on which measured values may be produced and consumed.",
      "parameters": {
        "streetlightId": {
          "$ref": "#/components/parameters/streetlightId"
        }
      },
      "subscribe": {
        "summary": "Receive information about environmental lighting conditions of a particular streetlight.",
        "operationId": "receiveLightMeasurement",
        "message": {
          "$ref": "#/components/messages/lightMeasured"
        }
      },
    "publish": {
        "summary": "Publish information about environmental lighting conditions of a particular streetlight.",
        "operationId": "sendLightMeasurement",
        "message": {
          "$ref": "#/components/messages/lightMeasured"
        }
      }
    },
    "smartylighting/streetlights/1/0/action/{streetlightId}/turn/on": {
      "parameters": {
        "streetlightId": {
          "$ref": "#/components/parameters/streetlightId"
        }
      },
      "publish": {
        "operationId": "turnOn",
        "message": {
          "$ref": "#/components/messages/turnOnOff"
        }
      }
    },
    "smartylighting/streetlights/1/0/action/{streetlightId}/turn/off": {
      "parameters": {
        "streetlightId": {
          "$ref": "#/components/parameters/streetlightId"
        }
      },
      "publish": {
        "operationId": "turnOff",
        "message": {
          "$ref": "#/components/messages/turnOnOff"
        }
      }
    },
    "smartylighting/streetlights/1/0/action/{streetlightId}/dim": {
      "parameters": {
        "streetlightId": {
          "$ref": "#/components/parameters/streetlightId"
        }
      },
      "publish": {
        "operationId": "dimLight",
        "message": {
          "$ref": "#/components/messages/dimLight"
        }
      }
    }
  },
  "components": {
    "messages": {
      "lightMeasured": {
        "name": "lightMeasured",
        "title": "Light measured",
        "summary": "Inform about environmental lighting conditions for a particular streetlight.",
        "payload": {
          "$ref": "#/components/schemas/lightMeasuredPayload"
        }
      },
      "turnOnOff": {
        "name": "turnOnOff",
        "title": "Turn on/off",
        "summary": "Command a particular streetlight to turn the lights on or off.",
        "payload": {
          "$ref": "#/components/schemas/turnOnOffPayload"
        }
      },
      "dimLight": {
        "name": "dimLight",
        "title": "Dim light",
        "summary": "Command a particular streetlight to dim the lights.",
        "payload": {
          "$ref": "#/components/schemas/dimLightPayload"
        }
      }
    },
    "schemas": {
      "lightMeasuredPayload": {
        "type": "object",
        "properties": {
          "lumens": {
            "type": "integer",
            "minimum": 0,
            "description": "Light intensity measured in lumens."
          },
          "sentAt": {
            "$ref": "#/components/schemas/sentAt"
          }
        }
      },
      "turnOnOffPayload": {
        "type": "object",
        "properties": {
          "command": {
            "type": "string",
            "enum": [
              "on",
              "off"
            ],
            "description": "Whether to turn on or off the light."
          },
          "sentAt": {
            "$ref": "#/components/schemas/sentAt"
          }
        }
      },
      "dimLightPayload": {
        "type": "object",
        "properties": {
          "percentage": {
            "type": "integer",
            "description": "Percentage to which the light should be dimmed to.",
            "minimum": 0,
            "maximum": 100
          },
          "sentAt": {
            "$ref": "#/components/schemas/sentAt"
          }
        }
      },
      "sentAt": {
        "type": "string",
        "format": "date-time",
        "description": "Date and time when the message was sent."
      }
    },
    "parameters": {
      "streetlightId": {
        "description": "The ID of the streetlight.",
        "schema": {
          "type": "string"
        }
      }
    }
  }
}
```

* `src/main/MainExample.java` is an example program demonstrating how to use the generated code, which provides an internal DSL based on fluent APIs to generate messages, and to publish and subscribe them. The example code is the following:

``` java
package main;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.UUID;

import schemas.LightMeasuredPayload;
import smartylighting.streetlights._1._0.event._streetlightId_.lighting.measured.ReceiveLightMeasurement;
import smartylighting.streetlights._1._0.event._streetlightId_.lighting.measured.SendLightMeasurement;
import smartylighting.streetlights._1._0.event._streetlightId_.lighting.measured.SendLightMeasurement.SendLightMeasurementParams;

public class MainExample {
	public static void main(String[] args) throws Exception {
		try {
			// Register a new subscription to the LightMeasured operation
			ReceiveLightMeasurement.subscribe((payload, params) -> {
				// Inform about the message received
				System.err.println(MessageFormat.format(
						"Subscription to ''{0}'' with ID ''{1}'':\n{2} lumens at {3}",
						ReceiveLightMeasurement.TOPIC_ID,
						// Notice that both the params and the payload fields can be
						// queried via getters that know about the domain being modeled 
						params.getStreetlightId(),
						payload.getLumens(), 
						payload.getSentAt()));
			});
	
			// Prepare to publish several messages
			for (int i = 0; i < 5; i++) {
				// Create the payload via the payloadBuiler offered by the publish  operation
				LightMeasuredPayload payload = SendLightMeasurement.payloadBuilder()
						// Notice that the properties of the payload can be set via
						// setter that know about the domain (e.g., name and type of
						// the property
						.withLumens(10)
						.withSentAt(LocalDateTime.now().toString())
						.build();
				
				// Set the value of the parameters. Notice that a setter is also provided
				SendLightMeasurementParams params = SendLightMeasurementParams.create()
						.withStreetlightId(UUID.randomUUID().toString());
				
				// Inform about the message to be sent
				System.out.println(MessageFormat.format(
						"Publishing at ''{0}'':\n{1}",
						SendLightMeasurement.expand(params), payload.toJson(true)));
				
				// Publish the LightMeasured message
				SendLightMeasurement.publish(payload, params);
			}
		} finally {
			// Unsubscribe from the topic
			ReceiveLightMeasurement.unsubscribe();
		}
	}
}
```

## Generating an AsyncAPI Specification from an Ecore model

It is possible to generate an skeleton AsyncAPI Specification from an Ecore model. The generator will create a reusable JSON Schema for each domain class. Channels will be created out of annotated EClasses. Moreover, hosts information can also be specified via EAnnotations. Currently, the following EAnnotations are allowed:


| Ecore Element      | EAnnotation Source                                         | Description
| ------------------ | ---------------------------------------------------------- | -----------
| EPackage           | `http://io.github.abelgomez/asyncapi/eAnnotations/Server`  | List of Servers. Expect entries: `name` (Server name), `url` (Server url, including port) and `protocol` (AsyncAPI supported protocol).
| EClass             | `http://io.github.abelgomez/asyncapi/eAnnotations/Channel` | The EClass represents the Payload of a given Channel. Expected entries: `name` (Channel name), `description` (Channel description), `publish` (publish `operationId`), `subscribe` (subscribe `operationId`) and `parameters` (comma-separated list of parameters used in the Channel `name`, if any).
| EClass             | `http://io.github.abelgomez/asyncapi/eAnnotations/Message` | The EClass represents the Payload of a given Message. Expected entries: `name` (Message name).
| EClass             | `http://io.github.abelgomez/asyncapi/eAnnotations/Schema`  | The EClass represents a Payload. Expected entries: `name` (Schema name), `title` (Friendly name of the Schema).
| EStructuralFeature | `http://io.github.abelgomez/asyncapi/eAnnotations/Schema`  | The EStructuralFeature is a property part of a Payload. Expected entries: `title` (Friendly name for the property).

For example, starting from the following ecore class diagram:

![Ecore Model Graphical](doc/annotated_ecore_graph.png)

It is possible to add the following annotations:

![Ecore Model Tree](doc/annotated_ecore_tree.png)

In XMI, this model is serialized as follows:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" name="Events" nsURI="http://org.example/Events" nsPrefix="Events">
  <eAnnotations source="http://io.github.abelgomez/asyncapi/eAnnotations/Server">
    <details key="name" value="production"/>
    <details key="url" value="localhost:1883"/>
    <details key="protocol" value="mqtt"/>
  </eAnnotations>
  <eClassifiers xsi:type="ecore:EClass" name="Sensor">
    <eAnnotations source="http://io.github.abelgomez/asyncapi/eAnnotations/Channel">
      <details key="name" value="sensors/{group}/events"/>
      <details key="description" value="Description"/>
      <details key="publish" value="publishOp"/>
      <details key="subscribe" value="subscribeOp"/>
      <details key="parameters" value="group"/>
    </eAnnotations>
    <eStructuralFeatures xsi:type="ecore:EAttribute" name="name" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
    <eStructuralFeatures xsi:type="ecore:EReference" name="events" upperBound="-1"
        eType="#//Event" containment="true"/>
  </eClassifiers>
  <eClassifiers xsi:type="ecore:EClass" name="Event">
    <eStructuralFeatures xsi:type="ecore:EAttribute" name="type" lowerBound="1" eType="#//EventType"/>
    <eStructuralFeatures xsi:type="ecore:EReference" name="timestamp" lowerBound="1"
        eType="#//Timestamp" containment="true"/>
  </eClassifiers>
  <eClassifiers xsi:type="ecore:EClass" name="Timestamp">
    <eStructuralFeatures xsi:type="ecore:EAttribute" name="year" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
    <eStructuralFeatures xsi:type="ecore:EAttribute" name="month" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
    <eStructuralFeatures xsi:type="ecore:EAttribute" name="day" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
    <eStructuralFeatures xsi:type="ecore:EAttribute" name="hour" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
    <eStructuralFeatures xsi:type="ecore:EAttribute" name="minute" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
    <eStructuralFeatures xsi:type="ecore:EAttribute" name="second" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
  </eClassifiers>
  <eClassifiers xsi:type="ecore:EEnum" name="EventType">
    <eLiterals name="UNDEFINED"/>
    <eLiterals name="STATE_CHANGED" value="1"/>
    <eLiterals name="DIED" value="2"/>
  </eClassifiers>
</ecore:EPackage>
```

And the automatically generated specification for it is as follows:

```js
{
	"asyncapi": "2.0.0",
	"info": {
		"title" : "Events",
		"version" : "1.0.0"
	},
	"servers": {
		"production" : {
			"url" : "localhost:1883",
			"protocol" : "mqtt"
		}
	},
	"channels": {
		"sensors/{group}/events" : {
			"description" : "Description",
			"parameters" : {
				"group" : {
					"schema" : {
						"type" : "string"
					}
				}
			},
			"publish" : {
				"operationId" : "publishOp",
				"message": {
					"$ref" : "#/components/messages/Sensor"
				}
			},
			"subscribe" : {
				"operationId" : "subscribeOp",
				"message": {
					"$ref" : "#/components/messages/Sensor"
				}
			}
		}
	},
	"components": {
		"messages": {
			"Sensor" : {
				"name" : "Sensor",
				"payload" : {
					"$ref" : "#/components/schemas/Sensor"
				}
			}
		},
		"schemas": {
			"Sensor" : {
				"type" : "object",
				"properties" : {
					"name" : {
						"type" : "string"
					},
					"events" : {
						"type" : "array",
						"items" : {
							"$ref" : "#/components/schemas/Event"
						}
					}
				}
			},
			"Event" : {
				"type" : "object",
				"properties" : {
					"type" : {
						"type" : "string",
						"enum" : [
							"UNDEFINED",
							"STATE_CHANGED",
							"DIED"
						]
					},
					"timestamp" : {
						"$ref" : "#/components/schemas/Timestamp"
					}
				}
			},
			"Timestamp" : {
				"type" : "object",
				"properties" : {
					"year" : {
						"type" : "integer"
					},
					"month" : {
						"type" : "integer"
					},
					"day" : {
						"type" : "integer"
					},
					"hour" : {
						"type" : "integer"
					},
					"minute" : {
						"type" : "integer"
					},
					"second" : {
						"type" : "integer"
					}
				}
			}
		}
	}
}
``` 

## AsyncAPI Grammar

See the simplified AsyncAPI/JSON Xtext Grammar in the file [`plugins/io.github.abelgomez.asyncapi/src/io/github/abelgomez/asyncapi/AsyncApi.xtext`](plugins/io.github.abelgomez.asyncapi/src/io/github/abelgomez/asyncapi/AsyncApi.xtext).

## Project Contents

This project contains the following plug-ins:

* `io.github.abelgomez.asyncapi`: Base plug-in with the [Xtext Grammar](plugins/io.github.abelgomez.asyncapi/src/io/github/abelgomez/asyncapi/AsyncApi.xtext), generator scripts, and AsyncAPI parser.

* `io.github.abelgomez.asyncapi.ide`: Automatically generated plug-in providing the platform-independent IDE integration (e.g., services for content assist).

*  `io.github.abelgomez.asyncapi.ui`: Automatically generated plug-in providing the Eclipse UI integration (editor, wizards, etc.).
