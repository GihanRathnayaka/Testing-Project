package li.gihan.test.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "`Order`")
public class Order {

    @Id
    private
    String oID;
    @Temporal(TemporalType.DATE)
    private
    Date odate;
    private double total;
    @ManyToOne
    @JoinColumn(name = "cusID",referencedColumnName = "cusID")
    private
    Customer customerID;


    public Order() {
    }

    public Order(String oID, Date odate, double total, Customer customerID) {
        this.oID = oID;
        this.odate = odate;
        this.total = total;
        this.customerID = customerID;
    }

    public String getoID() {
        return oID;
    }

    public void setoID(String oID) {
        this.oID = oID;
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oID='" + oID + '\'' +
                ", odate=" + odate +
                ", total=" + total +
                ", customerID=" + customerID +
                '}';
    }
}
