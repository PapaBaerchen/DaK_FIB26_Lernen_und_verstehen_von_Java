import java.util.Scanner;

public class Do_while_schleife {
    public static void main(String[] args){
        import java.util.Scanner;
        Scanner tastatur = new Scanner();

        int num = 6;


        //Fußgesteuerte Schleife --> wird erst am Ende der Bedingung geprüft und daher die Schleife bereits einmal ausgeführt
        do {
            System.out.println(num); // Variante 2 als Kurzschreibweise
            num ++;
        }
        while(num <=5 ); //auch wenn die Bedingung nicht erfüllt ist, wird der Wert "int num = 6" dennoch einmal ausgegeben



             // int num2= 6;
                 //kopfgesteuerte Schleife
                //while(num <=5){                // ist immer an den Ausdruck in der Klammer gebunden
                //  System.out.println(num);    //gibt den Wert aus
                    //num = num +1;                //berechnet solange die Schleife bis der Wert erreicht ist. Also die Bedingung "num<=5" -> kurzschreibweise "num ++" oder "num += 1;

                //  while(num2 >=12){
                //   System.out.println(num2); // Variante 2 als Kurzschreibweise
                // num2 ++;


    }
}
