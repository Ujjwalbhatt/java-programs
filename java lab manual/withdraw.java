class LowBalanceException  extends RuntimeException
{

}
class Bank
{
    float balance=100.0f;
    void withdrawl(float f)
    {
        try
        {
            if(balance<f)
            {
                throw new LowBalanceException();
            }
            else {
                balance = balance - f;
            }
        }
        catch(LowBalanceException e)
        {
            System.out.println("withdrawing amount is higher than balance...");
        }
    }
    public static void main(String args[])
    {
        Bank b=new Bank();
        b.withdrawl(2500);
    }

}
