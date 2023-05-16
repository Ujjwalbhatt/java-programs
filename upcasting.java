//Ceate a class "BAnk" having method getRateofInterst() Create a child classes as HDFC,SBI and PNB and override getRateofInterst() method and return interest rates as 4.0,4.5, and 5% correspondigly.

class Bank {
    public double getRateofInterst() {

        return 0;
    }
}
class HDFC extends Bank {
    public double getRateofInterst() {
        return 4.0;
    }
}

class SBI extends Bank {
    public double getRateofInterst() {
        return 4.5;
    }
}

class PNB extends Bank {
    public double getRateofInterst() {
        return 5.0;
    }
}

public class upcasting {
    public static void main(String[] args) {
      
        Bank b;
        b = new HDFC();
        System.out.println(b.getRateofInterst());
        b = new SBI();
        System.out.println(b.getRateofInterst());
        b = new PNB();
        System.out.println(b.getRateofInterst());

    }   
}
