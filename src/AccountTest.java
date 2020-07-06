import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args)
    {
        //create scanner object to obtain input
        Scanner input = new Scanner((System.in));
        // create account object and assign it to my account
        Account myAccount = new Account();
        AccountWithConstructor account1 = new AccountWithConstructor("mary");
        Time1 time = new Time1();


        Date_Created birth = new Date_Created(7, 24, 1949);
        Employee employee = new Employee("Bob", birth);
        System.out.println(employee);

        //output string representation of the time
        displayTime("after time object is created", time);
        System.out.println();

        //attempts to set invalid values
        try
        {
            time.setTime(99,99,99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%s%n%n", e.getMessage());
        }


        //simple time
        SimpleTime time2 = new SimpleTime(15, 30, 19);
        System.out.println(time2.buildString());

        // display time after setting invalid values
        displayTime("After time object is created", time);



        System.out.printf("account1 name: %s%n", account1.getName());

        // display initial value of name null
        System.out.printf("initial name is : %s%n%n", myAccount.getName());
        System.out.println("please enter the name:");
        String theName = input.nextLine();// read line of text
        myAccount.setName(theName);// put name in my account
        // output name stored in my account
        System.out.printf("Name:%n%s%n", myAccount.getName());
    }
    // display time object
    private static void displayTime(String header, Time1 t)
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n ",
                header, t.toUniversalString(), t.toString());
    }
}// end of class account test

class SimpleTime
{
    private int hour;
    private int minute;
    private int second;

    public SimpleTime(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String buildString()
    {
        return String.format("%24s: %s%n%24s: %s",
                "this.toUniversalString()", this.toUniversalString() ,
                "toUniversalString()", toUniversalString() );
    }
    public String toUniversalString()
    {
// "this" is not required here to access instance variables,
// because method does not have local variables with same
// names as instance variables
        return String.format("%02d:%02d:%02d",
                this.hour , this.minute , this.second );
    }
}

