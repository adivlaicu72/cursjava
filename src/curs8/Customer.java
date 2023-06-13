package curs8;

public class Customer {
    private String name;
    private String address;
    private String email;
   
     
    /**
     * Default constructor for the Customer class
     */
    public Customer ()
    {
         
    }
     
    /**
     * Constructor to initialize
     * @param name
     * @param address
     * @param email
     */
    public Customer (String name, String address, String email)
    {
        setName(name);
        setAddress(address);
        setEmail(email);
 
    
    public String getName()
    {
        return name;
    }
     
    
    public void settName(String name)
    {
        if (name != null)
        {
            this.name = name;
        }
    }
     
   
    public String getAddress ()
    {
        return address;
    }
     
   
    public void setAddress (String address)
    {
        if (address != null)
        {
            this.address = address;
        }
    }
     
    /**
     * 
     * @return the accountNumber as a String
     */
    public  String getAccountNumber ()
    {
        return accountNumber;
    }
     
    /**
     * 
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber (String accountNumber)
    {
        if (accountNumber != null)
        {
            this.accountNumber = accountNumber;
        }
    }
     
    /**
     * 
     * @return the password as a String
     */
    public String getPassword()
    {
        return password;
    }
     
    /**
     * 
     * @param password the password to set
     */
    public void setPassword (String password)
    {
        if (password != null)
        {
            this.password = password;
        }
    }
     
    /**
     * return the balance as a double
     */
    public double getBalance()
    {
        return balance;
    }
     
    /**
     * 
     * @param balance the balance to set
     */
    public void setBalance (double balance)
    {
        if (balance >= 0)
        {
            this.balance = balance;
        }
    }
     
    /**
     * 
     * @param amount to add to the balance
     */
    public void addToBalance(double amount)
    {
        if (amount > 0)  
        {
            balance += amount;
        }
    }
     
    /**
     * 
     * @param amount to subtract from the balance
     */
    public void subtractFromBalance (double amount)
    {
        if (amount > 0)
        {
            balance -= amount;
        }
    }
}

}
