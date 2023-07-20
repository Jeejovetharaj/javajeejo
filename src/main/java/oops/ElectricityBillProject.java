package oops;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter setter method
@NoArgsConstructor//default constructor
@AllArgsConstructor
public class ElectricityBillProject
{
    private int userid;
    private String username;
    private long Billnumber;
    private String Address;
    private double currentMonthcharge;

//    public ElectricityBillProject(int userid, String username, long billnumber, String address, double currentMonthcharge) {
//        this.userid = userid;
//        this.username = username;
//        Billnumber = billnumber;
//        Address = address;
//        this.currentMonthcharge = currentMonthcharge;
}

