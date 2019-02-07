package li.gihan.test.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Customer {

    @Id
    private
    String cusID;
    private String name;
    private String address;
    @Temporal(TemporalType.DATE)
    @Column(name = "DOB")
    private
    Date date;

    public Customer() {
    }

    public Customer(String cusID, String name, String address, Date date) {
        this.cusID = cusID;
        this.name = name;
        this.address = address;
        this.date = date;
    }

    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
