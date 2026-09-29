public class Dimensional_Arrays {
    public static void main(String[] args) {


        int[] marks;// 1D-Arrays
        int[][] flats;   // 2D arrays
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

// Displaying the 2D array using for loop //
        System.out.println("Printing a 2- D - arrays using for loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" \n");
        }
    }
}
// 3D arrays
//public static void main (String[] args) {
//  */  int[][][] flats;
//    flats = new int[3][4][5];
//    flats[0][0][0] = 101;
//    flats[0][1][1] = 102;
//    flats[0][2][2] = 103;
//    flats[0][3][3] = 201;
//    flats[1][0][4] = 202;
//    flats[1][1][0] = 203;
//    flats[1][2][1] = 204;
//    flats[2][3][2] = 301;
//    flats[2][0][3] = 302;
//    flats[2][1][4] = 303;
//    flats[2][2][0] = 304;
//    flats[2][3][0] = 301;
//    System.out.println("printing 3D arrays using for loop");
//    int value = 101;
//    for (int i = 0; i < flats.length; i++) {
//        for (int j = 0; j < flats[i].length; j++) {
//            for (int k = 0; k < flats[i][j].length; k++) {
//                flats[i][j][k]= value ;
//                value++;
//                System.out.print(flats[i][j][k]);
//                System.out.println(" ");
//            }
//            System.out.println(" \n");
//        }
//    }
//}
