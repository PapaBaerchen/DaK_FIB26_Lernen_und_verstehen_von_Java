
import java.util.Scanner;
public class scanner_anwendung {

    static public void main(String[] args){


        //Deklaration der Variablen

        double sideA, sideB, flaeche, umfang;

        Scanner keyboard = new Scanner (System.in); // Scanner benannt mit "Keybaord" ausgabe als neuer Scanner in dem Block "System.in" fungiert dabei als eingabefunktion
        //enter side A
        System.out.println("Enter Side A: ");
        sideA = keyboard.nextDouble();

        //enter side B
        System.out.println("Enter Side B: ");
        sideB = keyboard.nextDouble();

        // Verarbeitung nach EVA
        umfang = (2* sideA) + (2 *sideB);
        flaeche = sideA * sideB;

        System.out.println("umfang = " + umfang +" cm");
        System.out.println("Fläche = " + flaeche + " cm");
        );

        keyboard.close();
    }
}
