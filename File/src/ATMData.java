public class ATMData{
    private String accountNumber;
    private String password;

    public ATMData(String accountNumber , String password){
        accountNumber = " ";
        password = " ";
    }
    public String getID(){
        return this.accountNumber;
    }
    public String getPass(){
        return this.password;
    }
}

