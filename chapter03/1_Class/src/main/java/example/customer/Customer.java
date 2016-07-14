package example.customer;
/*
パッケージ　src/main/java/example/model/customerフォルダ
*/

/*
 クラスの定義です。
 public・・・他のクラスから参照が可能(private・・・他のクラスから参照不可/なし・・・他のパッケージから参照可能)

 クラスは、メンバ変数（情報)とメソッド(振る舞い)で構成される。コンストラクタ(生成メソッド)はメソッドの1種
*/
public class Customer
{
    // メンバ変数です。
    // 名前
    private Name name;

    // 電話番号
    private Phone phone;

    // コンストラクタ
    // このクラスのインスタンスを作る起点になります。
    public Customer( Name name, Phone phone )
    {
        this.name = name;
        this.phone = phone;
    }

    // オーバーロード
    // 引数が違えば同じメソッドやコンストラクタを複数作成することが可能です。
    public Customer( String familyName, String firstName, String phone )
    {
        this.name = new Name( familyName, firstName );
        this.phone = new Phone( phone );
    }

    // メソッドです。
    public String fullName()
    {
        return this.name.fullName();
    }
}
