# Schnittellenentwurf zur Entgegennahme von MIV-Daten  vom Datenbroker über MQTT
## Topic-Parameter:

|BEZEICHNER|DATENTYP|BESCHREIBUNG|
| - | - | - |
|**$base**|`string`|Geeigneter MQTT-Pfand zur Einbindung in das Gesamtsystem|
|**$vb_id**|`string`|ID des Verkehrsbereichs|
## Komplexer-Datentyp: EfdData

|BEZEICHNER|DATENTYP|BESCHREIBUNG|
| - | - | - |
|**id**|`int`|Über die Annäherung hinweg, feste ID des jeweils erfassten Fahrzeugs|
|**pos**|`(double x double)`| Geo-Position Lat x Lon in WGS84)|
|**lix**|`int`|[Optional] Spurzuordnung|
|**turn**|`int`| Abbiegewunsch (Blinkend): <br/> 0 - keinen <br/> 1 - links <br/> 2 - rechts|
|**speed**|`int`|Geschwindigkeit in km/h|
|**class**|`int`|Fahrzeugklasse: <br/> 1 - Krad <br/> 2 - Pkw <br/> 3 - Pkw mit Anhänger <br/> 4 - Bus <br/> 5 - Liferwagen <br/> 6 - Lkw <br/> 7 - Lkw mit Anhänger <br/> 8 - Sattelzug|
|**length**|`double`|Fahrzeuglänge|
## Topics: Datenbroker → MIV-Annährungsmodell
### `$base/miv/efd`

|||
|-|-|
|**BESCHREIBUNG**|Eine Liste mit allen detektierten Fahrzeugen|
|**DATENTYP**|`List<EfdData>`|
|**FREQUENZ**|jede 1 Sekunden|
|**BEISPIEL**|`[{"id": 17395, "pos": [50.92525,11.58757], "lix": 1, "turn": 0, "speed": 25, "class": 2, "length": 4.3 }, ... ]`|
|**RETAINED**|nein|
### `$base/miv/vb/$vb_id/los`

|||
|-|-|
|**BESCHREIBUNG**|https://de.wikipedia.org/wiki/Verkehrsqualit%C3%A4t#Stufe_der_Angebotsqualit%C3%A4t_(Level_of_Service) <br/> 0 - Unbekant <br/> (1-6) - (Frei-Stau)|
|**DATENTYP**|`int`|
|**FREQUENZ**|alle 10 Sekunden|
|**BEISPIEL**|`1`|
|**RETAINED**|ja|
### `$base/miv/vb/$vb_id/speed`

|||
|-|-|
|**BESCHREIBUNG**|mittlere Geschwindigkeit in km/h|
|**DATENTYP**|`int`|
|**FREQUENZ**|alle 10 Sekunden|
|**BEISPIEL**|`25`|
|**RETAINED**|ja|
### `$base/miv/vb/$vb_id/ltj`

|||
|-|-|
|**BESCHREIBUNG**|Rückstaulänge bis zu Haltelinie in Metern|
|**DATENTYP**|`double`|
|**FREQUENZ**|alle 10 Sekunden|
|**BEISPIEL**|`11.3`|
|**RETAINED**|ja|
### `$base/miv/vb/$vb_id/volume`

|||
|-|-|
|**BESCHREIBUNG**|Verkehrsmenge in Fahrzeuge/Stunde|
|**DATENTYP**|`int`|
|**FREQUENZ**|alle 10 Sekunden|
|**BEISPIEL**|`2380`|
|**RETAINED**|ja|
