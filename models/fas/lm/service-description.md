Host: http://...

# Name

Description

# API Root [/]

## Retrieve Entry Point [GET]

+ Response 200 (application/json)
  + Body

        {
            "calculation_url": "/calculation",
            "power_url": "/power"
        }


## Calculation [/calculation]

### Perform a calculation [POST]

+ Request (application/json)

        PrognosisForLM

  > see [lm_interface.ecore](lm_interface/lm_interface.ecore)

+ Response 200 (application/json)
  + Headers
    + /
  + Body

        ResponseFromLM

  > see [lm_interface.ecore](lm_interface/lm_interface.ecore)

## Current power consumption [/power]

### Get the power consumption [GET]

+ Response 200 (application/json)
  + Headers
    +  /
  + Body

        {
            "sectionId1": 3460,
            "sectionId2": 3430,
            "sectionId3": 3210,
        }


## Warning

Warning via MQTT?
or integrate in above power consumption query?
