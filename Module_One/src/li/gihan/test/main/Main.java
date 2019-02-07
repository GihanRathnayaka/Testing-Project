package li.gihan.test.main;

import li.gihan.test.entity.Customer;
import li.gihan.test.entity.Order;
import li.gihan.test.util.HibernatUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        SessionFactory sessionFactory = HibernatUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date d1 = df.parse(LocalDate.now().toString()); // for example, today's date
        Date d2 = df.parse("01-01-1900");
        Customer customer = session.load(Customer.class,"C002");

        Order o001 = new Order("O001", d1, 2000, customer);
        session.save(o001);


        session.getTransaction().commit();

        session.close();


    }
    
}
