package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Second;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-04T03:09:52")
@StaticMetamodel(First.class)
public class First_ { 

    public static volatile ListAttribute<First, Second> secondList;
    public static volatile SingularAttribute<First, Integer> idd;
    public static volatile SingularAttribute<First, String> description;

}