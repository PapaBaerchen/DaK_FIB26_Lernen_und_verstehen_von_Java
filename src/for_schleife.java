import java.util.Scanner;
public class for_schleife {

    static public void main(String[] args){
        //findet anwendung, wenn man schon ganz genau weiß, wie oft die Schleife durchlaufen werden soll

        //Variablen deklarieren
        int num;
        // scnanner festlegen
        Scanner keyboard = new Scanner(System.in);
        // Eingabe
        System.out.println("Bitte geben Sie den Prüfwert für die Schleifenfunktion ein: ");
        num = keyboard.nextInt();
        for
        (int i = num; //wert in der Variable wird gesetzt
        num<10;
        num++) {
            System.out.println(num);
            keyboard.close();
        }
    }

}
