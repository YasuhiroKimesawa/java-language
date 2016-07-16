package example.customer;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerList
{
    private List<Customer> customerList;

    private Set<Customer> customerSet;

    private Map<Integer, Customer> customerMap;


    public CustomerList()
    {
    }

    public CustomerList( List<Customer> customerList, Set<Customer> customerSet, Map<Integer, Customer> customerMap )
    {
        this.customerList = customerList;
        this.customerSet = customerSet;
        this.customerMap = customerMap;
    }

    public void printList()
    {
        for( Customer customer : customerList )
        {
            System.out.println( customer.fullName() );
        }
    }

    public void printSet()
    {
        for( Customer customer : customerSet )
        {
            System.out.println( customer.fullName() );
        }
    }

    public void mapSet()
    {
        for( Integer customerKey : customerMap.keySet() )
        {
            String print = String.format( "%s:%s", String.valueOf( customerKey ), customerMap.get( customerKey ).fullName()  );
            System.out.println( print );
        }
    }
}
