class A{
    A(){
        System.out.println("This is the constructor of the class");
    }
 void display(){
        System.out.println("This is the display method of the class");
    }


}
class B extends A{
    B(){
        System.out.println("This is the constructor of the class 2");
    }
}
 class Inheritence {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}