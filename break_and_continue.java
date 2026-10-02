import com.sun.security.jgss.GSSUtil;

public class break_and_continue {
    public static void main(String[] args) {
        // break and continue

//        for (int i = 0; i < 10;i++) {
//            System.out.println(i);
//            System.out.println(" java is great");
//            if (i == 2) {
//                System.out.println("Ending the loops");
//
//                break;
//            }
//        }
//    }
//}
//        int i = 5;
//        while (i < 15) {
//            System.out.println(i);
//            System.out.println("java is great");
//            i++;
//            if (i == 7) {
//                System.out.println("ending the loop");
//                break;
//            }
//                System.out.println("loop ends here");
//            }
//        }
//    }
        //  int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("java is great");
//            if (i == 2) {
//                System.out.println("ending the loops");
//                break;
//            }
//                i++;
//            }
//            while (i < 5) ;
//                System.out.println("loops end here");
//            }


        int   i = 0;
        do {
            i++;
            if (i == 3) {
                System.out.println(" ending the loops here");
                continue;

            }
            System.out.println(i);
            System.out.println(" java is great");
        }

             while(i<5);
                 System.out.println("loops end here");

             }
        }





