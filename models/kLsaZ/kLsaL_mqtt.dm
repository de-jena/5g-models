# Schnittellenentwurf zur Anbindung der zentralen Knotensteuerung an den Datenbroker über MQTT

## Topic-Parameter:
 

|BEZEICHNER|DATENTYP|BESCHREIBUNG|
| - | - | - |
|**\$base**|string|Geeigneter MQTT-Pfand zur Einbindung in das Gesamtsystem|
|**\$vsr\_id**|int|ID des Verkehrsrechner (Unterzentrale oder IG)|
|**\$lsa\_id**|int|ID des Lichtsignalanlage (Steuergerät)|
|**\$sg\_id**|string|ID der Signalgruppe zB: K1 oder F1|
|**\$det\_id**|string|ID des an der LSA angebundenen Detektors|
|**\$apw\_id**|int|ID eins AP-Wert, Ein frei in der lokalen Steuerung definierbarer int-Wert|
<br/>

## Topics: Datenbroker → zentralen Knotensteuerung
---
### `$base/klsa/$vsr_id/$lsa_id/status`
|||
|-|-|
|**BESCHREIBUNG**|Dient als Keepalive, wird regelmäßig erwartet, enthält den Staus der Anbindung an die kLSA.Der Status muss noch geeignet definiert werden. zB:<br/>`0` – Keine Verbindung zur Anlage möglich<br/>`1` – Verbindung steht, Anlage im kLSA betrieb.<br/>`2` – Verbindung steht, Anlage im Rückfallmodus<br/>`...`|
|**DATENTYP**|`int`|
|**FREQUENZ**|jede 1 Sekunden|
|**BEISPIEL**|`1`|
|**RETAINED**|nein|
<br/>

---
### `$base/klsa/$vsr_id/$lsa_id/spltu`
|||
|-|-|
|**BESCHREIBUNG**|Aktuelle Signalprogrammnummer, Umlaufzeit und der Zeitstempel der Aktivierung des Signalprogramms, in Millisekunde. <br/>`[Signalprogrammnummer, Umlaufzeit, Zeitstempel]`|
|**DATENTYP**|`int x int x long`|
|**FREQUENZ**|Bei Umschaltung|
|**BEISPIEL**|`[3,90000,1639288800000]`|
|**RETAINED**|ja|
<br/>
  
---
###  `$base/klsa/$vsr_id/$lsa_id/tx`
|||
|-|-|
|**BESCHREIBUNG**|Aktuelle Umlaufsekunde und der dazugehörige Zeitstempel, in Millisekunden. <br/>`[Umlaufsekunde, Zeitstempel]`|
|**DATENTYP**|`int x long`|
|**FREQUENZ**|alle 10 Sekunden|
|**BEISPIEL**|`[23000,1639302002000]`|
|**RETAINED**|ja|
<br/>
  
---
###  `$base/klsa/$vsr_id/$lsa_id/ph`
|||
|-|-|
|**BESCHREIBUNG**|Nummer der aktuelle laufende Phase|
|**DATENTYP**|`int`|
|**FREQUENZ**|Beim Phasenwechsel|
|**BEISPIEL**|`2`|
|**RETAINED**|nein|
<br/>
  
---
###  `$base/klsa/$vsr_id/$lsa_id/pue`
|||
|-|-|
|**BESCHREIBUNG**|Nummer und Bezeichnung des aktuell laufenden Phasenübergangs|
|**DATENTYP**|`int x string`|
|**FREQUENZ**|Beim Phasenwechsel|
|**BEISPIEL**|`[1,"von1nach3"]`|
|**RETAINED**|nein|
<br/>

---
###  `$base/klsa/$vsr_id/$lsa_id/sg/$sg_id`
|||
|-|-|
|**BESCHREIBUNG**|Nummer des Signalbildes von **\$sg\_id**. Nach: [ocit-c_lsa_versorgungsdaten_v2.0_a01.pdf](https://www.ocit.org/media/ocit-c_lsa_versorgungsdaten_v1.1_r1.pdf)<br/>(Anlage 1: Bitcode der Signalbilder)|
|**DATENTYP**|`int`|
|**FREQUENZ**|Bei Signalbildwechsel|
|**BEISPIEL**|`48`|
|**RETAINED**|nein|
<br/>
 
 ---
###  `$base/klsa/$vsr_id/$lsa_id/det/$det_id`
|||
|-|-|
|**BESCHREIBUNG**|Muss noch definiert werden, wenn klar ist welche Form die Detektorwerte haben, die bei der LSA abgefragt werden können. Möglich wäre Fzg/h, Belegung in %, das betätigen eins Tasters oder schon aggregierte Verkehrsinformationen|
|**DATENTYP**|?|
|**FREQUENZ**|Bei Änderung|
|**BEISPIEL**||
|**RETAINED**|nein|
<br/>

---
###  `$base/klsa/$vsr_id/$lsa_id/apw/$apw_id`
|||
|-|-|
|**BESCHREIBUNG**|Wert der als **\$apw\_id** in der lokalen Steuerung hinterlegten Variabel|
|**DATENTYP**|`int`|
|**FREQUENZ**|Beim Änderung|
|**BEISPIEL**|`20017`|
|**RETAINED**|nein|
<br/>

## Topics: zentralen Knotensteuerung → Datenbroker
---
###  `$base/klsa/$vsr_id/$lsa_id/keepalive`
|||
|-|-|
|**BESCHREIBUNG**|Bei Übertragung eines aktuellen Zeitstempels soll der dafür definierter Kontakt „kurz“ geschaltet werden. Beim Ausfall des Keepalive oder wenn die Systeme nicht Zeitsynchronlaufen, soll die LSA in ihren lokalen Modus zurück fallen.|
|**DATENTYP**|`long`|
|**FREQUENZ**|Bei ungestörten Betrieb der zentralen Kontensteuerung, jede Sekunden.|
|**BEISPIEL**|`1639302004000`|
|**RETAINED**|nein|
<br/>
  
---
###  `$base/klsa/$vsr_id/$lsa_id/control`
|||
|-|-|
|**BESCHREIBUNG**|Steuerungscode der Bitweise auf die verfügbaren parallelen Kontakte, ausgenommen dem Keepalivekontakt übertragen werden soll.|
|**DATENTYP**|`long`|
|**FREQUENZ**|Beim Änderung|
|**BEISPIEL**|`67` (bitweise: 1000011)|
|**RETAINED**|nein|

