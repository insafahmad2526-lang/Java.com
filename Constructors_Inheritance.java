class Base1{

    Base1() {
        System.out.println("I am a constructor ");
    }
        Base1(int a) {
            System.out.println("I am a overload constructor with the value of  a as " + a);
        }

}
class  Derived1 extends Base1 {
    Derived1(int x) {
       super(0);

        System.out.println(" i am a derived class constructors  ");
    }


    Derived1(int x,int y){
        super(x);

        System.out.println(" i am a derived class constructors with a value of a as  "+ y);
    }
}

public class Constructors_Inheritance {
    public static void main(String[] args) {
        // Base b = new Base();

        Derived1 d = new Derived1(5);


}

}





