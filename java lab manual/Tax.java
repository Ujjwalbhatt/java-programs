import java.util.Scanner;
class Tax
{
    int pan;
    String name;
    double taxIncome,tax;
    void inputInfo(int pan,String name,double taxIncome)
    {
        this.pan=pan;
        this.name=name;
        this.taxIncome=taxIncome;
    }
    void taxCalc()
    {
        if(taxIncome<=250000)
        {
            tax=0;
        }
        else if(taxIncome>250000 && taxIncome<=300000)
        {
            tax=0.1*taxIncome;
        }
        else if(taxIncome>300000 && taxIncome<400000)
        {
            tax=5000+(0.2 * taxIncome);
        }
        else {
            tax=25000+(0.3* taxIncome);
        }
    }
    void displayInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Pan No.: "+pan);
        System.out.println("Income: "+taxIncome);
        System.out.println("Tax: "+tax);
    }

    public static void main(String args[])
    {
        Tax t=new Tax();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();

        System.out.println("Enter your pan number: ");
        int pan=sc.nextInt();

        System.out.println("Enter your income: ");
        double taxIncome=sc.nextDouble();

        t.inputInfo(pan,name,taxIncome);
        t.taxCalc();
        t.displayInfo();
       }

}


