KET Bedrijven Systeem - Mijn project

Inleiding
Dit is mijn eindproject voor het vak Programming Advanced. Ik moest een systeem maken voor de KET-school in Brussel om bedrijven te kunnen beheren. Het moest een werkende applicatie zijn met inloggen, zoeken, afdrukken en beheerfunctionaliteiten. Ik had geen ervaring met Java en het was echt een uitdaging, maar ik heb het stap voor stap aangepakt.

Hoe ik begonnen ben
Ik startte met het lezen van de cursus en de projectbeschrijving. Eerlijk gezegd snapte ik er eerst niet veel van. Ik begon met de eenvoudigste dingen: een project aanmaken in IntelliJ, de juiste naam geven (bedrijvenSysteem) en een GitHub-repository koppelen. Dat was al een eerste stap.

Stap 1: De basisklassen
Daarna maakte ik de `Bedrijf`-klasse. Ik had veel moeite met het begrijpen van constructors en getters/setters. Ik heb de voorbeelden uit de cursus (hoofdstuk 3.1 en 3.2) gebruikt en die aangepast aan mijn eigen gegevens. Ik had een paar keer fouten omdat ik `this` vergat te gebruiken, maar uiteindelijk lukte het.

Stap 2: Gebruikers en rollen
Vervolgens moest ik gebruikers kunnen aanmaken. De cursus legde uit hoe overerving werkt (hoofdstuk 4.1). Ik maakte een abstracte klasse `Gebruiker` en daarvan liet ik `Student`, `Docent` en `Admin` overerven. Ook maakte ik een `Rol`-enum (hoofdstuk 5.1), zodat ik makkelijk kon controleren welke rechten iemand had.

Stap 3: Testdata
De docent zei dat we voldoende testdata moesten voorzien, dus ik voegde 5 bedrijven en 3 gebruikers toe in `Main.java`. Dit hielp me om alles te testen zonder telkens opnieuw te moeten typen.

Stap 4: Inloggen
Ik schreef een inlogsysteem met een `for`-loop (hoofdstuk 2.2) en `equals()` (hoofdstuk 2.1). Eerst werkte het niet omdat ik vergeten was om `break;` te gebruiken. Toen ik dat oploste, werkte het.

Stap 5: Menu met while-loop
Het menu moest blijven draaien tot de gebruiker afsloot. Ik gebruikte een `while`-loop (hoofdstuk 1.6) en `switch` (hoofdstuk 1.5) om de opties af te handelen. Het was even zoeken hoe ik de verschillende rollen verschillende menu's kon tonen, maar met `if` en `getRol()` lukte dat.

Stap 6: Zoeken
De zoekfunctie was een van de lastigste delen. Ik moest door de lijst van bedrijven lopen en controleren of een zoekterm voorkwam in de naam, omschrijving of zoekterm. Ik gebruikte `toLowerCase()` en `contains()` (hoofdstuk 2.1) zodat hoofdletters geen probleem waren. Sorteren voegde ik later toe met `Collections.sort()` (hoofdstuk 6.5), dat maakte de resultaten overzichtelijker.

Stap 7: Afdrukken naar bestand
Het afdrukken naar een .txt-bestand deed ik met `FileWriter` (hoofdstuk 8.2). Ik had hier eerst problemen met exceptions (hoofdstuk 7.1), maar na het toevoegen van `try-catch` werkte het. Het bestand verschijnt gewoon in de projectmap.

Stap 8: Admin-functionaliteiten
Als admin moest ik bedrijven kunnen toevoegen, aanpassen en verwijderen. Ik schreef aparte methoden voor elk van deze acties. Bij het verwijderen en aanpassen moest ik eerst zoeken naar het juiste bedrijf. Ik gebruikte `equalsIgnoreCase()` zodat de gebruiker niet per se hoofdletters moest typen. Ik voegde ook foutcontroles toe zodat het programma niet zou crashen bij lege invoer of onbestaande bedrijven.

Stap 9: Interface en final
De docent had het over interfaces (hoofdstuk 4.4), dus maakte ik een `Afdrukbaar`-interface met een methode `getAfdrukInfo()`. `Bedrijf` implementeert deze interface. Ook voegde ik een `final`-constante `TYPE` toe (hoofdstuk 3.4).

Stap 10: Javadoc
Op het einde voegde ik Javadoc toe boven elke klasse en belangrijke methode, zoals de cursus voorschrijft. Ik gebruikte `@author`, `@version`, `@param` en `@return`. Getters en setters hoefden niet, dus die liet ik staan.

Wat ik heb bijgeleerd
- Werken met klassen, objecten en overerving
- Een menu met loops en condities
- Zoeken en sorteren in lijsten
- Bestanden lezen en schrijven
- Fouten opvangen met try-catch

Gebruikte bronnen
Hoofdbronnen
- Cursus Programming Advanced (modules 1 tot 8) - David Van Steertegem en Waldo Heudens
- De voorbeeldcode uit de cursus (variabelen, klassen, loops, collections, streams, etc.)

Extra hulp
- DeepSeek: gebruikte ik af en toe als ik vastzat, bijvoorbeeld bij het begrijpen van een bepaalde foutmelding of bij het toepassen van `Collections.sort()`. Het hielp me om de code te begrijpen en zelf toe te passen. Ik kopieerde nooit zomaar, maar probeerde altijd te snappen wat ik deed.

Hoe je de applicatie start
1. Open het project in IntelliJ
2. Run `Main.java`
3. Log in met bijvoorbeeld `admin1 / 1234`

Testgebruikers
- `student1 / 1234` (alleen zoeken en afdrukken)
- `docent1 / 1234` (alleen zoeken en afdrukken)
- `admin1 / 1234` (alles: zoeken, afdrukken, toevoegen, aanpassen, verwijderen)


Chayma abdessadak
