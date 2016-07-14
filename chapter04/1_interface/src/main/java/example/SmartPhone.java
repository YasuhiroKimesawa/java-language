package example;

public class SmartPhone implements Phone
{
    private String number;

    public SmartPhone( String number )
    {
        this.number = number;
    }

    @Override
    public String getNumber()
    {
        return number;
    }

    @Override
    public PhoneType phoneType()
    {
        return PhoneType.スマホ;
    }
}
