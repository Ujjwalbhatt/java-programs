/*
 1.	An electricity board charges the following rates to domestic users to discourage large consumption of energy. For the first 100 units:- 60 P per unit, for the next 200 units:-80 P per unit, Beyond 300 units:-90 P per unit. All users are charged a minimum of Rs 50.  If the total amount is more than Rs 300 then an additional surcharge of 15% is added. Write a Java program to read the names of users and number of units consumed and display the charges with names.
*/
import java.util.Scanner;

class Question1{
    private String name;
    private int units;
    private float charge, total;

    Question1(){}

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the user: ");
        name = sc.nextLine();
        System.out.print("Enter the number of units consumed: ");
        units = sc.nextInt();
    }

    void calculate(){
        if(units <= 100){
            charge = units * 0.60f+50;
        }
        else if(units <= 300){
            charge = 50+100 * 0.60f + (units - 100) * 0.80f;
        }
        else if(units > 300){
            charge = 50+(100 * 0.60f) + (200 * 0.80f) + ((units - 300) * 0.90f);
        }
        
         if(charge > 300){
            total = charge + charge * 0.15f;
            charge = total;
         }
    }
    void display(){
        System.out.println("Name of the user: " + name);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Total amount to be paid: " + charge);
    }
    public static void main(String[] args) {
        Question1 b = new Question1();
        b.getdata();
        b.calculate();
        b.display();
    }

}

 



