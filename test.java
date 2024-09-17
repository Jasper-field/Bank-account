public class test
{
public static void main (String[] args)
{
    BankAccount checking = new BankAccount("jsong",123,100.0,"mark");
    checking.logIn("jsong", "mark");
    System.out.println(checking);
    checking.deposit(100);
    System.out.println(checking.getBalance());
    checking.withdrawal(50);
    System.out.println(checking.getBalance());
    
}

}