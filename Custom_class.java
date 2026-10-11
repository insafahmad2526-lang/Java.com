import org.w3c.dom.ls.LSOutput;

class Employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println(" my id is " + id);
        System.out.println(" my name is " + name);
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
   return name;
    }
}

    public class Custom_class {
        public static void main(String[] args) {
            System.out.println(" this is our custom class");

            Employee harrry = new Employee();
            Employee john = new Employee();
            // Setting attributes
            harrry.id = 24;
            harrry.name = "Mohan";
            harrry.salary = 12;
            int salary= harrry.getSalary();
            // Setting Attributes// employee2
            john.id = 48;
            john.name = " Sohan";
            john.salary = 10;
            // Printing the attributes//
            harrry.printDetails();
            john.printDetails();
            int harrySalary = harrry.getSalary();
            int johnSalary= john.getSalary();
            System.out.println(" Harrry salary is" + harrySalary);
            System.out.println(" John salary is" + johnSalary);
            // int salary = harrry.getSalary();
            // System.out.println(harrry.id);
            //   System.out.println(harrry.name );

            //   System.out.println(john.name);
            //  System.out.println(john.id);
        }

    }
