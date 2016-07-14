package example;

public class GaraKPhone extends Phone
{
    public GaraKPhone( String number )
    {
        super( number );
    }

    @Override
    public String phoneType()
    {
        return "ガラケー";
    }

}
