package entitypack;

import entitypack.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-03-14T01:17:51")
@StaticMetamodel(Producers.class)
public class Producers_ { 

    public static volatile SingularAttribute<Producers, String> producerImg;
    public static volatile CollectionAttribute<Producers, Products> productsCollection;
    public static volatile SingularAttribute<Producers, String> producerName;
    public static volatile SingularAttribute<Producers, String> producerProfile;
    public static volatile SingularAttribute<Producers, Integer> producerID;

}