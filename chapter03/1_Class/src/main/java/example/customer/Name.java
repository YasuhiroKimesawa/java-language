package example.customer;

class Name
{
    // final・・・一度代入すると変更できなくなります。
    private final String familyName;
    private final String firstName;

    Name( String familyName, String firstName )
    {
        this.familyName = familyName;
        this.firstName = firstName;
    }

    // this・・・現在のインスタンス
    String fullName()
    {
        return String.format( "%s %s", this.familyName, this.firstName );
    }
}
