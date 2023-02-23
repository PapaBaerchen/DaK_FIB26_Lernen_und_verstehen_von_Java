public class mehrdimensionalle_Array {

    public static void main(String[] args){

        String [][] ForNameSureName = new String [5][2];

        ForNameSureName[0][0] = "David";
        ForNameSureName[0][1] = "König";

        ForNameSureName[1][0] = "Frank";
        ForNameSureName[1][1] ="Winkler";

        ForNameSureName[2][0] = "Marcel";
        ForNameSureName[2][1] ="Walter";

        ForNameSureName[3][0] = "Sebastian";
        ForNameSureName[3][1] ="Kehrbeck";

        ForNameSureName[4][0] = "Marcel";
        ForNameSureName[4][1] ="Okur";








        //Äußere For-Schleife: Spaltenindex --> i
        //Innere For-Schleife: Spaltenindex --> j

        for(int i = 0;i < ForNameSureName.length ; i++ ){
            for(int k =0; k < ForNameSureName[i].length; k++) {
                System.out.print(ForNameSureName[i][k]+ " ");
            }
            System.out.println();
        }


    }
}
