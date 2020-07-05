import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args)
    {
        //create scanner object to obtain input
        Scanner input = new Scanner((System.in));
        // create account object and assign it to my account
        Account myAccount = new Account();
        AccountWithConstructor account1 = new AccountWithConstructor("mary");

        System.out.printf("account1 name: %s%n", account1.getName());

        // display initial value of name null
        System.out.printf("initial name is : %s%n%n", myAccount.getName());
        System.out.println("please enter the name:");
        String theName = input.nextLine();// read line of text
        myAccount.setName(theName);// put name in my account
        // output name stored in my account
        System.out.printf("Name:%n%s%n", myAccount.getName());
    }
}// end of class account test
