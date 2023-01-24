public class Switch_case_Blöcke {

    public static void main (String[] args){

        int month = 7;
        // int kann auch durch String month = Juli als Konstante ersetzt werden, dem entsprechend muss aber case angepasst werden: case Januar, case Februar, usw. ...

        switch (month ){ //schalter Prüfe bedingung mit dem festgelegten Wert (Konstante) "int month"
            case 1: System.out.println("Januar");break; // erfüllt die Bedingung nicht, springe zur nächsten bedingung
            case 2: System.out.println("Februar");break; // ...
            case 3: System.out.println("März");break; // ...
            case 4: System.out.println("April");break; // ... löscht man zwischen drinnen ein "break" so wird der Monat ausgegeben & case-abfrage läuft dennoch weiter...
            case 5: System.out.println("Mai");break; // ...
            case 6: System.out.println("Juni");break; // ...
            case 7: System.out.println("Juli");break; // Bedingung wird erfüllt Konstante = case 7 --> "break" wird erfüllt ung geht zur ausgabe über
            case 8: System.out.println("August");break; // ...wird nicht beachtet, da durch "break" die Datenabfrage bereits beendet wurde
            case 9: System.out.println("September");break;
            case 10: System.out.println("October");break;
            case 11: System.out.println("November");break;
            case 12: System.out.println("Dezember");break;
            default: System.out.println("Überprüfen Sie Ihre Eingabe! Monat entspricht nicht dem Kalender");
            // ersetzt durch "default" alle "Konstanten" die nicht den "case"s entsprechen und gibt eine eingegebene Antwort aus
        }


    }
}
