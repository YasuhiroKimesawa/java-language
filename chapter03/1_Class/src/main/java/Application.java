import example.customer.Customer;

public class Application
{
    // アプリケーション起動時に最初に実行されます。
    // args配列はアプリケーション実行時に渡される引数です。
    public static void main( String[] args )
    {
        // new クラス名()で該当クラスのコンストラクタが呼ばれます。→インスタンス化といいます。
        Customer yosuke = new Customer( "柏木", "陽介", "090-1111-2222" );
        System.out.println( yosuke.fullName() ); // 柏木 陽介

        Customer tatsuya = new Customer( "田中", "達也", "090-2222-3333" );
        System.out.println( tatsuya.fullName() ); // 田中 達也
    }
}
