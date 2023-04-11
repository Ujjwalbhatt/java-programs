//Write a program to demonstrate the use of super keyword in java.
class A {   

    A(){
        System.out.println("This is the constructor of the A class");
    }
    int i = 10;
}

class B extends A {
    B(){
        super();
        System.out.println("This is the constructor of the B class");
    }
   
    int i = 20;

    void display() {
        System.out.println("Value of i in class A is: " + super.i);
        System.out.println("Value of i in class B is: " + i);
    }
}
class SuperFunc {
    
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
