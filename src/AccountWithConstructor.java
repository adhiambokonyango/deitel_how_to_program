public class AccountWithConstructor {
    private String name; // instance variable

    // constructor
    public AccountWithConstructor(String name)
    {
        this.name = name;
    }

    public  void setName(String name)
    {
        this.name = name; // store name
    }
    public String getName()
    {
        return name; // return value of name to caller
    }
}
