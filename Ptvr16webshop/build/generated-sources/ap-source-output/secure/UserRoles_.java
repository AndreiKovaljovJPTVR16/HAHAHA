package secure;

import entity.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import secure.Role;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-28T14:40:32")
@StaticMetamodel(UserRoles.class)
public class UserRoles_ { 

    public static volatile SingularAttribute<UserRoles, Role> role;
    public static volatile SingularAttribute<UserRoles, Long> id;
    public static volatile SingularAttribute<UserRoles, Customer> customer;

}