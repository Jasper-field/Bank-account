public class BankAccount
{
private String name;
private int accountNum;
private double balance;
private String password;
private boolean loggedIn;

public BankAccount(String name, int acc, double balance, String password){
  this.name=name;
  this.accountNum=acc;
  this.balance=balance;
  this.password=password;
  this.loggedIn=false;
}
public boolean logIn(String username, String password)
{
  if (username.equals(this.name) && password.equals(this.password))
  {
    loggedIn=true;
    return true;
  }
  else
  {
    return false;
  }
}
public void logout()
{
  loggedIn=false;
}
public double getBalance()
{
  if (loggedIn==true)
  {
    return balance;
  }
  else
  {
    throw new IllegalStateException("Not Logged In");
  }
}
  public double deposit(double amount)
  {
    if (loggedIn==true)
    {
      this.balance+=amount;
      return this.balance;
    }
    else 
    {
      throw new IllegalStateException("Not Logged In");
    }
  }
  public double withdrawal(double withdrawal)
  {
    if (loggedIn==true)
    {
      this.balance-=withdrawal;
      return this.balance;
    }
    else{
      throw new IllegalStateException("Not Logged In");
    }
  
  }
  public String toString()
  {
    if (loggedIn== false)
    {
      return "account num is "+ this.accountNum;
    }
    else{
      return "account num is: "+ this.accountNum + ", balance is: "+ this.balance;
    }
  }
}


