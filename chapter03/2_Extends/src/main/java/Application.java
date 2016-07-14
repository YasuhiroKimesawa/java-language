import example.GaraKPhone;
import example.Phone;
import example.SmartPhone;

public class Application
{
    public static void main( String[] args )
    {
        Phone phone = new Phone( "03-1111-2222" );

        Phone smartPhone = new SmartPhone( "080-1111-2222" );

        Phone garaK = new GaraKPhone( "090-1111-2222" );

        System.out.println( phone.phoneType() );
        System.out.println( smartPhone.phoneType() );
        System.out.println( garaK.phoneType() );
    }
}
