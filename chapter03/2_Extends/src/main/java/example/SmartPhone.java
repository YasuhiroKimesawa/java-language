package example;

public class SmartPhone extends Phone
{
    public SmartPhone( String number )
    {
        super( number );
    }

    /*
    *  オーバーライド　継承元のメソッドの動きを継承先に合わせて変えることができる。
    */
    @Override
    public String phoneType()
    {
        return "スマートフォン";
    }
}
