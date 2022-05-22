#Exercise 5

#### Warum werden Logging Bibliotheken verwendet?
Logging Bibliotheken werden dafür verwendet, einen Überblick über die Geschehnisse des Programms zu bewahren, indem alle relevanten Fehler, Status, etc. übersichtlich und auf die eigenen Bedürfnisse angepasst, geordnet ausgegeben oder gespeichert werden. 

#### Welche Loglevel gibt es in Log4J und was hat es damit auf sich?

- Loglevel werden zum Identifiieren des Schweregrades eines Ereignisses verwendet.
#### Loglevel: 
1. ALL – To log all events.
2. DEBUG – A general debugging event. ERROR – An error in the application, possibly recoverable.
3. FATAL – A severe error that will prevent the application from continuing.
4. INFO – An event for informational purposes.
5. TRACE – A fine-grained debug message, typically capturing the flow through the application.
6. WARN – An event that might possibly lead to an error.
7. OFF – No events will be logged.

#### Was für Konfigurationsmöglichkeiten bietet Ihnen log4J?
- Mit einer Konfigurationsdatei können verschiedene Dinge bei den Logs verändert werden. 
Man kann Logs bspw. auf der Konsole ausgeben oder in einer externen Datei speichern. Wird keine Konfigurationsdatei angelegt, verwendet Log4J Standardeinstellungen. 