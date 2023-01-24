public class If_Abfragen {

    public static void main(String[] args){

    //Boolscher Ausdruck ist immer ein Vergleich eines Wahheitswertes (true, false)


        int age = 35;
        age = age +0; // berechnung bezeichner vom Datentyp +5 = 40
        if (age>=40) {
            System.out.println("Das ist korrekt!"); //prüft den Wahrheitswert und bestätigt mit der Ausgabe in vorgegebener Textform "Das ist korrekt!"
        } // ist der Block falsch so spring die Abfrage zum nächsten Block "}" und gibt dem entsprechend nichts aus (die Anfrage wurde dementsprechend terminiert)
        else {
            System.out.println("You have reached your Midlivecrisises. Congratulations, this is your Motocycle! ;D");
        }

    }
}
