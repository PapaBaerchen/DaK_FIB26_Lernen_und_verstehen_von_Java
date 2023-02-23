public class Foreach_Schleife {
    public static void main(String[] args){

        {

           /* String[] names = new String [5]; // die Größe des Arrays wird immer bei der Initialisierung festgelegt ("[5]") begrenzt die Anzahl der verwendbaren Ausgaben "names"


            names[0] = "David";
            names[1] = "Frank";
            names[2] = "Marcel";
            names[3] = "Sebastian";
            names[4] = "MO";
            */
        /*
        System.out.println(names[1]);
        */

            String [] names ={"David", "Frank" , "MO" , "Sebastian" , "Marcel" }; // in dieser Schreibweise muss die größe nicht definiert werden
            // (new String [Ziffer der verwendbaren Ausgaben] <-- entfällt durch {Text}, anzahl der eingetragenen "Objekte" addiert Java selbst

            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);

            }

        }
    }
}
