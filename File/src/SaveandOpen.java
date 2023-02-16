import java.io.IOException;
import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee{
    private String name;
    private String dept;

    public void insert() throws IOException{
        Scanner console = new Scanner(System.in);
        PrintStream ps = new PrintStream(new File("employee.txt"));
        String answer;
        do{
            System.out.print("Enter name:");
            name = console.next();
            System.out.print("Enter department: ");
            dept = console.next();
            //write data to File
            System.out.print("Enter data again? ");
            answer = console.next();
        }while(answer.equalsIgnoreCase("y"));
    }//end of Insert() method
}
