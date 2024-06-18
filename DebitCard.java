public class DebitCard extends BankCard
// child class or sub-class of class BankCard
{
  // instance variables
    
   private int pinNumber;
   private int withdrawlAmout;
   private String dateOfWithdrawl;
   private boolean hasWithdrawn;  //boolean i.e. True or False


    /**
     * Constructor for objects of class DebitCard
     */
 DebitCard(int pinNumber,String clientName,int cardID,int balanceAmout,String issuerBank,String bankAccount)
 {
     super(clientName,cardID,balanceAmout,issuerBank,bankAccount);
     //calling parent class constructor 
     super.setClientName(clientName);
     //calling super class setter method of clientName Attributes
     this.pinNumber = pinNumber;
     this.dateOfWithdrawl="";
     this.hasWithdrawn= false;
     this.withdrawlAmout = 0;
     
     
     
}
//setter or mutator method for withdrawlAmout and dateOfWithdrawl

  public void setWithdrawlAmout(int withdrawlAmout)
   {
    this.withdrawlAmout = withdrawlAmout;
   }
   
  public void setDateOfWithdrawl(String dateOfWithdrawl)
   {
    this.dateOfWithdrawl= dateOfWithdrawl;
  }

//getter or accessor method for all 4 attributes

  public int getPinNumber() 
    {
        return this.pinNumber;
    }

  public int getWithdrawlAmout() 
    {
        return this.withdrawlAmout;
    }

  public String getDateOfWithdrawl() 
    {
        return this.dateOfWithdrawl;
    }
    
  public boolean getHasWithdrawn() 
    {
        return this.hasWithdrawn;
    }
    
public void withDraw(int withdrawlAmout, String dateOfWithdrawl, int pinNumber)
    /*
     * withDraw method is used to deduct money directly from
     * client amout which accepts (withdrawlAmout, dateOfWithdrawn and pinNumber).
     * there is one condition where Amout can be withdrawn if a valid pinNumber 
     * and sufficient amout is present then only the attribute hasWithdrawn is set to true.
     */
    {   
        if(pinNumber == this.getPinNumber()) 
           {
            if (withdrawlAmout <= super.getBalanceAmout()) 
            {
                this.setWithdrawlAmout(withdrawlAmout);
                this.setDateOfWithdrawl(dateOfWithdrawl);
                super.setBalanceAmout(super.getBalanceAmout() - this.getWithdrawlAmout());
                this.hasWithdrawn = true;
                System.out.println("successfully withdrawn. New Balance is => " + getBalanceAmout());

                
            } 
            else 
            {
                System.out.println("not enough balance");
            }
            
        }
        else
        {
            System.out.println("The pin is incorrect so Enter correct pincode");
        }
    }
    public void display() //using display method for DebitCard
    {
        super.display(); 
        //displaying the super class i.e. BankCard display method.
        if (hasWithdrawn == true)
        {
            System.out.println("The pin Number is: " + pinNumber);
            System.out.println("The withdrawl amout is: " + withdrawlAmout);
            System.out.println("The date of Withdrawal is: " + dateOfWithdrawl);
        } else {
            System.out.println("There is no any transcations");
      
        /*
         * The child-class DebitCard is used to withdrawl amout and display
         * the transcation process.
         */
    }
  }
}
