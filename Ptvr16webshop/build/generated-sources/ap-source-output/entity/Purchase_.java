package entity;

import entity.Customer;
import entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-28T14:40:32")
@StaticMetamodel(Purchase.class)
public class Purchase_ { 

    public static volatile SingularAttribute<Purchase, Date> date;
    public static volatile SingularAttribute<Purchase, Date> dateReturn;
    public static volatile SingularAttribute<Purchase, Product> product;
    public static volatile SingularAttribute<Purchase, Integer> quantity;
    public static volatile SingularAttribute<Purchase, Long> id;
    public static volatile SingularAttribute<Purchase, Customer> customer;

}