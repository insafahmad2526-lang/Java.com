import java.util.function.DoubleUnaryOperator;

class MyMainEmployee {
    private int id;
    private String name;
     public MyMainEmployee() {
         int id = 36;
         String name = " Your - Name -Here";
         System.out.println(id);
     }
    public MyMainEmployee(String myName, int myid) {
        int id = myid;
        name = myName;
        System.out.println(id);
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;

    }

    public int getId() {
        return id;

    }

    public void setId(int i) {
        id = i;

    }
}

    public class Constructors {
        public static void main(String[] args) {
            MyMainEmployee amit = new MyMainEmployee("amt",12);
            // MyEmployee amit = new MyEmployee();
             // amit.id= 32;
            //  amit.name = ( "amitKumar");throw an error due to private access modifier//

            amit.setName("amitkumar");

            System.out.println(amit.getName());
            amit.setId(56);
            System.out.println(amit.getId());


        }

    }


// quick  quiz//
/*class  EmployeeDetail {
    private int id;
    private String name;
    private int salary;

// constructorss 1//
    public EmployeeDetail( int  id, String name,int salary){
        this.id = id;
        this.name = name;

        this.salary = salary;

    }
//constructors 2 overlooad//
    public EmployeeDetail(int id ,String name){
        this.id = id;
       this.name=name;
       this.salary=10000;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name =n;
    }
    public int getId(){

        return id;
    }

}
class Constructors{
    public static void main( String[] args){
        EmployeeDetail suraj= new EmployeeDetail( 201,"suraj", 15000);
        EmployeeDetail amit  = new EmployeeDetail( 202,"amit");
        System.out.println(amit.getId());
        System.out.println(amit.getName());
    }
}


*/



