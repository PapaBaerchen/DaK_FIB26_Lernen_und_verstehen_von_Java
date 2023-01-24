public class While_Schleife {
    static public void main(String[] args){

        int num = 1;
        int num2= 6;
                //kopfgesteuerte Schleife
            while(num <=5){                // ist immer an den Ausdruck in der Klammer gebunden
                System.out.println(num);    //gibt den Wert aus
                num = num +1;                //berechnet solange die Schleife bis der Wert erreicht ist. Also die Bedingung "num<=5" -> kurzschreibweise "num ++" oder "num += 1;
            }
            while(num2 >=12){
                System.out.println(num2); // Variante 2 als Kurzschreibweise
                num2 ++;
            }
    }
}
