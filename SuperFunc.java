//Write a program to demonstrate the use of super keyword in java.

class A {
    int i = 10;
}

class B extends A {
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
