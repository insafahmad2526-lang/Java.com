import java.sql.SQLOutput;

public class ArraysLength {
    public static void main(String[] args) {
       /* float[] marks = {87.5f, 67.5f, 88.5f, 56.5f,};
       String[] students = {"Insaf", " Suhel", "Shivansh", " Gautam"};
        System.out.println(students.length);
        System.out.println(marks[2]);
    }
}
*/
        int[] marks = {87, 65, 77, 79,};
       //System.out.println(marks.length);
      ///  display the array///( navie way)
       /* System.out.println(" Printing using naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }
}
     */
       /* System.out.println("Printing using for loop ");
        for( int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        }
    }
    }
        */
    // quick quiz //

        System.out.println(" Printing using for loop in reverse order");
    for (int i =marks.length -1; i>=0;i-- ){
        System.out.println(marks [i]);
    }
    // quick quiz printing th for each loop//
        System.out.println("Printing using for-each-loop");
    for( int elements: marks ){
        System.out.println( elements);
    }
    }
    }