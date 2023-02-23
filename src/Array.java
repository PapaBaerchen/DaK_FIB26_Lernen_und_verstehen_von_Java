public class Array {
    public static void main(String[] args){

        String[] names = new String [3]; // die Größe des Arrays wird immer bei der Initialisierung festgelegt ("[3]") begrenzt die Anzahl der verwendbaren Zeichen


        names[0] = "David";
        names[1] = "Frank";
        names[2] = "Marcel";
        /*
        System.out.println(names[1]);
        */

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

    }
}
