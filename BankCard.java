public class BankCard
{
    // instance variables 
     int cardID; 
    private int balanceAmout;
    private String clientName;
    private String issuerBank;
    private String bankAccount;

    /**
     * Constructor for objects of class BankCard
     */
    public BankCard( String clientName,int cardID,int balanceAmout,String issuerBank,String bankAccount)
    {
        /*
         *initialise instance variables where clientName is empty and other 
         *attributes are assigned with their parameter values,
         */ 
        this.clientName = "";
        this.cardID = cardID; 
        this.balanceAmout = balanceAmout;
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
 
    }

    //getter or accessor method for all attributes

    public String getClientName()
    {
        return this.clientName;
    }
    
    public int getCardID()
    {
        return this.cardID;
    }
    
    public int getBalanceAmout()
    {
        return this.balanceAmout;
    }
    
    public String getIssuerBank()
    {
        return this.issuerBank;
    
    }
    
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    
    //setter method or mutator method for clientName and balanceAmout
    
    public void setClientName(String clientName)
    {
         this.clientName = clientName;
    }
    
    public void setBalanceAmout(int balanceAmout)
    {
         this.balanceAmout = balanceAmout;
    }
    
    
    //displaying output 
     void display()
     {
         System.out.println("The value of cardID is: " + this.getCardID());
        System.out.println("The value of issuerBank is: " + this.getIssuerBank());
        System.out.println("The value of bankAccount is: " + this.getBankAccount());
        System.out.println("The value of balanceAmout is: " + this.getBalanceAmout());
     if(this.getClientName().equals(""))
     //If clientName is empty or ("") then
     {
    
        System.out.println("clientName Not Found");
        
    }
     else //If client name is not empty.
        {
            System.out.println("The name of Account Holder is: " + this.getClientName());
        }        
   }
}

