package entitypack;

import entitypack.Products;
import entitypack.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-03-14T01:17:51")
@StaticMetamodel(Comments.class)
public class Comments_ { 

    public static volatile SingularAttribute<Comments, Integer> cmtID;
    public static volatile SingularAttribute<Comments, Products> productID;
    public static volatile SingularAttribute<Comments, String> cmtContent;
    public static volatile SingularAttribute<Comments, Users> userID;

}