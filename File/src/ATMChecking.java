import java.io.*;
import java.util.*;
public class ATMChecking extends ATMData {
    private int money;

    public ATMChecking(String accountNumber, String password,int money){
        super(accountNumber,password);
        money = this.money;
    }
    public boolean checkBookBank() throws IOException{
        Scanner read =new Scanner(new File("ATMBookbank.txt"));
        while(read.hasNext()){
            String account_num = read.Next();
            String password_num = read.Next();
        }
        
    }
    
}
