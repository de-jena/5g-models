Host: http://...

# Name

Description

# API Root [/]

## Retrieve Entry Point [GET]

+ Response 200 (application/json)
  + Body

        {
            "update": "/update",
            "prognosis": "/prognosis"
        }


## Update [/update]

### Send the periodic update [POST]

+ Request (application/json)
  + Body

        PeriodicUpdate

    > see [klsa_interface.ecore](klsa_interface/klsa_interface.ecore)

+ Response 200

## Requests predicted release time vectors [/prognosis]

### Get the release time vector for a given intersection based on the actual arrival times and optionally specified scenarios [GET]
> TODO: intersection ID could also be GET parameter

+ Request (application/json)
  + Body

        ReleaseTimePrognosisRequest

    > see [klsa_interface.ecore](klsa_interface/klsa_interface.ecore)
  
+ Response 200 (application/json)
  + Body

        ReleaseTimePrognosisResponse

    > see [klsa_interface.ecore](klsa_interface/klsa_interface.ecore)
