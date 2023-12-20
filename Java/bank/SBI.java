package bank;
class Account{
    public String name;
    protected String email;
    private String password;

    public String getpassword(){
        return this.password;
    }
    public void setpassword(String p){
        this.password=p;
    }

}
public class SBI{
    public static void main(String[] args)
    {
        Account account1=new Account();
        account1.name="Ranjit Singh";
        account1.email="ranjits121212@gmail.com";
        //     cannot be accesed here name1.password="abcd";
        account1.setpassword("abcdef");
        System.out.println(account1.getpassword());
    }
    
}