package example;

public abstract class Phone
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

    public abstract String phoneType();
}
