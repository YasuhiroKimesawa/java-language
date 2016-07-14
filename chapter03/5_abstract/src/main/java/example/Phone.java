package example;

public class Phone
{
    private String number;

    public Phone( String number )
    {
        this.number = number;
    }

    public String getNumber()
    {
        return this.number;
    }

    public String phoneType()
    {
        return "電話";
    }
}
