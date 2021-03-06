package example;

public class GaraKPhone implements Phone
{
    private String number;

    public GaraKPhone( String number )
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
        return PhoneType.ガラケー;
    }

}
