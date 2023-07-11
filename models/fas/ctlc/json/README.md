The conversion from ecore to JSON Schemes using EMF Forms currently has to following known issue:

When two classes contain a reference to a **common** other class, only the JSON Scheme of the class that is listed **first** in the ecore will be generated correctly.
The other one will be missing the attribute that is an instance of this common class in its `property` field.
However, when the attribute is required (has a lower and upper bound of 1), it will still be listed in the `required` field.

**Known cases**

| Missing attribute | Type | First Use Of Type | File |
| --- | --- | --- | --- |
| `PrognosisStopPlace.stopPosition` | `MarkedPosition` | `ProgosisArrivalAndPosition.arrivalPosition` | PeriodicUpdateView.json |
| `ScenarioPrognosis.releaseTimes` | `ReleaseTimeVector` | `ReleaseTimePrognosisResponse.releaseTimes` | ReleaseTimePrognosisResponse.json |

The missing attribute has been manually added to the JSON Scheme in the above listed cases.