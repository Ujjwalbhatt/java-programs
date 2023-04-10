/*

WAP  to compute the tax according to the givedn codnition in the table 02 and display the output
inputInfo();
computeTax();
displayInfo();

tax:
upto 250000 no tax
upto 250000 to 300000 10% of the income excedding 2,50,000
upto 300000 to 400000 5000+20% of the income excedding 3,00,000
above 400000 25000+30% of the income exceeding 4,00,000
member: 
name: to store the name of the employee
income : to store the income of the employee
tax : to store the tax amount
panNo: to store the pan number of the employee
*/
// #include<iostream>
// using namespace std;
// #include<string.h>
// class Employee{
//     public:
//     char name[50];
//     int income;
//     float tax;
//     char panNo[50];
//     Employee(){}
//     void inputInfo(){
//         cout<<"Enter the name of the employee: ";
//         cin>>name;
//         cout<<"Enter the income of the employee: ";
//         cin>>income;
//         cout<<"Enter the pan number of the employee: ";
//         cin>>panNo;
//     }
// void computeTax(){
//     if(income<=250000){
//         tax=0;
//     }
//     else if(income<=300000){
//         tax=0.1*(income-250000);
//     }
//     else if(income<=400000){
//         tax=5000+0.2*(income-300000);
//     }
//     else{
//         tax=25000+0.3*(income-400000);
//     }
// }
//      void displayInfo(){
//         cout<<"---------------------------------------------------"<<endl;
//         cout<<"Name of the employee: "<<name<<endl;
//         cout<<"Income of the employee: "<<income<<endl;
//         cout<<"Tax amount of the employee: "<<tax<<endl;
//         cout<<"Pan number of the employee: "<<panNo<<endl;
//         cout<<"---------------------------------------------------"<<endl;
//     }
// };
// int main()
// {
//     Employee e;
//     e.inputInfo();
//     e.computeTax();
//     e.displayInfo();
//     return 0;
// }

//java code 

import java.util.Scanner;

class Employee{
    String name;
     int income;
    float tax;
    String panNo;
    Employee(){}
    void inputInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        name=sc.nextLine();
        System.out.print("Enter the income of the employee: ");
        income=sc.nextInt();
        System.out.print("Enter the pan number of the employee: ");
        panNo=sc.next();
    }

void computeTax(){
    if(income<=250000){
        tax=0;
    }
    else if(income>250000 && income<=300000){
        tax=0.1f*(income-250000);
    }
    else if(income>300000 && income<=400000){
        tax=5000+0.2f*(income-300000);
    }
    else{
        tax=25000+0.3f*(income-400000);
    }
}
     void displayInfo(){
        System.out.println("---------------------------------------------------");
        System.out.println("Name of the employee: "+name);
        System.out.println("Income of the employee: "+income);
        System.out.println("Tax amount of the employee: "+tax);
        System.out.println("Pan number of the employee: "+panNo);
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.inputInfo();
        e.computeTax();
        e.displayInfo();
    }
} 


