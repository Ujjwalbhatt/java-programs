class Bill
{
    int unit;
    String name;
    double bill_amt;

    void setter(String name,int unit)
    {
        this.name=name;
        this.unit=unit;
    }
    void bill_calculate(int unit)
    {
        bill_amt=50;
        if(unit<=100)
        {
            bill_amt+=unit*0.6;
        }
        else if(unit>100 && unit<=200)
        {
            bill_amt+=(100*0.6)+((unit-100)*0.8);
        }
        else {
            bill_amt+=(100*0.6)+ (200*0.8)+ ((unit-300)*0.9);
        }
        if(bill_amt>300)
        {
            bill_amt=bill_amt+(bill_amt*0.15);
        }
    }
    void showDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Units: "+ unit);
        System.out.println("Total Bill: "+bill_amt);
    }

    public static void main(String args[])
    {
        Bill b=new Bill();
        b.setter("Ujjwal",350);
        b.bill_calculate(350);
        b.showDetails();
    }
}
