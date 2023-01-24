public class Modulo_Operator {

    public static void main(String[] args){

        int num1 = 32/3;
        int num2 = 33%3;
        int num3 = 32%3;

        System.out.println(num1); // Ergebnis geht nicht genau auf "int" ganzzahlige Ausgabe daher rechnet das System 30/3 | rest 2
        System.out.println(num2); // "%" erstzt das geteilt-durch-zeichen "/" und Rechnet dabei 33/3 --> 11
        System.out.println(num3); // erechnet den Wert 30%3 und stell fest, der Wert ist 10 mal, aber nicht 11 mal dividierbar und gibt daher nur eine Restausgabe von "2" aus


    }
}
