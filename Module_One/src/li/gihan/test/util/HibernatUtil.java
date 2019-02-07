package li.gihan.test.util;

import li.gihan.test.entity.Customer;
import li.gihan.test.entity.Order;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernatUtil {

    private static SessionFactory  sessionFactory =buildSessionFactory();

    public static SessionFactory buildSessionFactory(){

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(registry)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Customer.class)
                .getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();

        return factory;

    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
