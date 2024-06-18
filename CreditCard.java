public class CreditCard extends BankCard
//child class or sub-class of BankCard
{
    // instance variables -
    private int cvcNumber;
    private double creditLimit;
    private double intrestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    

    /**
     * Constructor for objects of class CreditCard
     */
    public CreditCard(String clientName,int cardID,int balanceAmout,String issuerBank,String bankAccount,int cvcNumber,double intrestRate,String expirationDate)
    {
        // initialise instance variables
        super(clientName,cardID,balanceAmout,issuerBank,bankAccount);
        //calling the constructor of super class or parent class
        super.setClientName(clientName);
        this. cvcNumber = cvcNumber;
        this. intrestRate = intrestRate;
        this. expirationDate = expirationDate;
        this.isGranted = false;  //boolran value
        
    }
    
    
    //getter method for each attributes
    
    public int getCvcNumber() 
    {
        return this.cvcNumber;
    }
    
    public double getCreditLimit() 
    {
        return this.creditLimit;
    }
    
    public double getIntrestRate() 
    {
        return this.intrestRate;
    }
    
    public String getExpirationDate() 
    {
        return this.expirationDate;
    }
    
    public int getGracePeriod() 
    {
        return this.gracePeriod;
    }
    
    public boolean getIsGranted() 
    {
        return this.isGranted;
    }
    
    public void setCreditLimit(double creditLimit, int gracePeriod) 
    /*
     * setCreditLimit method accepts new credit limit and grace period where
     * if clause is used to check the condition.
     */
    {
        if (creditLimit <= (2.5 * super.getBalanceAmout())) {
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
            System.out.println("The credit limit has been successfully established => " + this.getCreditLimit());
        } else {
            System.out.println("Credit card not exists");
        }
        

    }
     public void cancelCreditCard() 
     /* 
      * Another method used to cancel creditCard where cvcNumber, creditLimit and
      * grace period value are assigned as o and isGranted is set as false
      */
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
        System.out.println("Please check again.The System has cancelled the credit card. ");
    }
    
    public void display()
    {
            System.out.println("The value of cardID is: " + this.getCardID());
            System.out.println("The Name of Client is: " + this.getClientName());
            System.out.println("The Name of Bank is: " + this.getIssuerBank());
            System.out.println("The value of bankAccount is: " + this.getBankAccount());
            System.out.println("The value of balanceAmout is: " + this.getBalanceAmout());
            System.out.println("The  CVC Number of Credit Card is: " + this.getCvcNumber());
            System.out.println("The intrest Rate is: " + this.getIntrestRate());
            System.out.println("The Expiration Date is: " + this.getExpirationDate());
        if(isGranted == true)
        {
            super.display();
            System.out.println("The Credit Limit is:" + this.getCreditLimit());
            System.out.println("The Grace Period is:" + this.getGracePeriod());
        }
        /*else
        {
            System.out.println("please figure the data first,Credit card has not been assumed yet");
      */}
   
}
