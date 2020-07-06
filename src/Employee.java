public class Employee {
    private String name;
    private Date_Created birthDate;

    public  Employee(String name, Date_Created birthdate)
    {
        this.name = name;
        this.birthDate = birthdate;
    }

    public String toString()
    {
        return String.format("%s, %s",
                name, birthDate);
    }
}
