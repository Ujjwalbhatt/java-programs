class Bank {
    double getRateOfInterest()
    {
      return 0;
    }

}
class HDFC extends Bank{
    double getRateOfInterest()
    {
	System.out.println("HDFC bank rate of interest");
        return 4.0;
    }

}
class SBI extends Bank {
    double getRateOfInterest()
    {
	System.out.println("SBI bank rate of interest");
        return 4.5;
    }

}
class PNB extends Bank {
    double getRateOfInterest() {
	System.out.println("PNB bank rate of interest");
        return 5.0;
    }

}
class Abc
{
    public static void main(String args[])
    {
        Bank b;
        b=new HDFC();
        System.out.println(b.getRateOfInterest());
        b=new SBI();
        System.out.println(b.getRateOfInterest());
        b=new PNB();
        System.out.println(b.getRateOfInterest());

    }
}

