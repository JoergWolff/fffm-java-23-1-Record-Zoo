# fffm-java-23-1-Record-Zoo

## Aufgabe: Java-Record Zoo Projekt

Erstellt ein neues Projekt in IntelliJ und legt damit den Grundstein für das Java-Record Zoo Projekt.

* Lege eine Java-Record-Klasse "Animal" an, die für ID, Name, Art und Alter folgende Eigenschaften haben soll. Wähle geeignete Feldnamen.
* Macht einen Commit. Bitte poste hier den Link zu eurem GitHub-Repos, in dem ihr diese Aufgabe gemeinsam gelöst habt.
  `inputfield`

## Record-Methoden aufrufen

Nun prüfen wir die automatisch generierten Methoden.

* In einer main-Methode, erstellt mehrere Animals.
* Ruft die automatisch im Record generierten Methoden auf, und prüft, ob sie das tun, was ihr erwartet (equals, toString).

## Verschachtelung

Nun verwenden wir einen Record als Attribut eines anderen Records.

* Legt nun einen `Owner`-Record an, der einige Eigenschaften eines Tierbesitzers speichert (Name, Alter, Adresse).
* Lasst jedes `Animal` einen `Owner` haben.

## Verschachtelung + Wiederverwenden

Einen Record in mehreren anderen Records verwenden.

* Erstellt einen `Species`-Record, der die Eigenschaften einer Tierart speichert (Name, Futterbedarf in Gramm pro Tag).
* Lasst jedes `Animal` eine `Species` haben.
* In Eurer main-Methode, lasst mehrere `Animal`-Objekte die gleiche `Species` haben.
* Falls ihr diese Aufgabe bereits früher abgeschlossen habt, dürft ihr die Bonusaufgabe auf der nächsten Seite bearbeiten.

## Bonus-Aufgabe With-Methoden

Wenn ihr die Hauptaufgabe bereits gemeistert habt, könnt ihr euch an dieser Bonusaufgabe versuchen.

* Schreibe with-Methoden ('wither', so wie bei den Rechereche-Fragen) für alle Eigenschaften des `Animal`-Records.

## Bonus-Aufgabe Zoo

Wenn ihr die Hauptaufgabe bereits gemeistert habt, könnt ihr euch an dieser Bonusaufgabe versuchen.

* Implementiere einen "Zoo"-Record, der eine Liste aller Animals hat und den Gesamtfutterbedarf aller Tiere im Zoo berechnen kann.
