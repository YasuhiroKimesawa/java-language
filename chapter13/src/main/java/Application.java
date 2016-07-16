import example.customer.Customer;
import example.customer.CustomerList;

import java.util.*;

public class Application
{
    public static void main( String[] args )
    {
        // new クラス名()で該当クラスのコンストラクタが呼ばれます。→インスタンス化といいます。
        Customer yosuke = new Customer( "柏木", "陽介", "090-1111-2222" );
        System.out.println( yosuke.fullName() ); // 柏木 陽介

        Customer sinzo = new Customer( "興梠", "慎三", "090-2222-3333" );
        System.out.println( sinzo.fullName() ); // 興梠 慎三

        Customer ri = new Customer( "李", "忠成", "090-2222-3333" );
        System.out.println( ri.fullName() ); // 李 忠成

        Customer nishikawa = new Customer( "西川", "周作", "090-2222-3333" );
        System.out.println( nishikawa.fullName() ); // 西川 周作

        Customer uga = new Customer( "宇賀神", "友弥", "090-2222-3333" );
        System.out.println( uga.fullName() ); // 宇賀神 友弥

        Customer nasu = new Customer( "那須", "大亮", "090-2222-3333" );
        System.out.println( nasu.fullName() ); // 那須 大亮

        Customer wataru = new Customer( "遠藤", "航", "090-2222-3333" );
        System.out.println( wataru.fullName() ); // 遠藤 航

        Customer ume = new Customer( "梅崎", "司", "090-2222-3333" );
        System.out.println( ume.fullName() ); // 梅崎 司

        Customer muto = new Customer( "武藤", "雄樹", "090-2222-3333" );
        System.out.println( muto.fullName() ); // 武藤 雄樹

        Customer abe = new Customer( "阿部", "勇樹", "090-2222-3333" );
        System.out.println( abe.fullName() ); // 阿部 勇樹

        Customer sekine = new Customer( "関根", "貴大", "090-2222-3333" );
        System.out.println( sekine.fullName() ); // 関根 貴大

        List<Customer> customerList = new ArrayList<>();
        customerList.add( yosuke );
        customerList.add( sinzo );
        customerList.add( ri );
        customerList.add( nishikawa );
        customerList.add( uga );
        customerList.add( nasu );
        customerList.add( wataru );
        customerList.add( ume );
        customerList.add( muto );
        customerList.add( abe );
        customerList.add( sekine );

        Set<Customer> customerSet = new HashSet<>();
        customerSet.add( yosuke );
        customerSet.add( sinzo );
        customerSet.add( ri );
        customerSet.add( nishikawa );
        customerSet.add( uga );
        customerSet.add( nasu );
        customerSet.add( wataru );
        customerSet.add( ume );
        customerSet.add( muto );
        customerSet.add( abe );
        customerSet.add( sekine );

        Map<Integer, Customer> customerMap = new HashMap<>();
        customerMap.put( 8, yosuke );
        customerMap.put( 30, sinzo );
        customerMap.put( 20, ri );
        customerMap.put( 1, nishikawa );
        customerMap.put( 3, uga );
        customerMap.put( 4, nasu );
        customerMap.put( 6, wataru );
        customerMap.put( 7, ume );
        customerMap.put( 9, muto );
        customerMap.put( 22, abe );
        customerMap.put( 24, sekine );

        CustomerList customers = new CustomerList( customerList, customerSet, customerMap );

        customers.printList();
        customers.printSet();
        customers.mapSet();
    }
}
