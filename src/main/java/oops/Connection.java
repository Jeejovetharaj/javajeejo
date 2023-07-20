package oops;
import java.util.Scanner;
import java.util.Arrays;
public class Connection implements BillProjectActions
{
    ElectricityBillProject [] management=new ElectricityBillProject[4];

    public String addnewcustomers(ElectricityBillProject customer) {
        for(int index=0;index<management.length;index++)
        {
            if (management[index]==null)
            {
                management[index]=customer;
                return customer.getUsername()+"has been added in electricity management";
            }
        }
        return customer.getUsername()+" has not been added";
    }

    public void listallcustomerdetails() {
        for(ElectricityBillProject bill:management)
        {
            System.out.println(bill);
        }

    }

    public void updatingcustomervalues(String username) {
        Scanner scan=new Scanner(System.in);
        for(int pos=0;pos< management.length;pos++)
        {
            if(management[pos].getUsername().equalsIgnoreCase(username))
            {
                System.out.println(username+" in the user details which field you want edit");
                String fieldname=scan.next();
                switch (fieldname)
                {
                    case "Username":
                        System.out.println("please enter your new customer name:");
                        String newcustomername= scan.next();
                        management[pos].setUsername(newcustomername);
                        listallcustomerdetails();
                        break;
                }
                System.out.println(fieldname+" in this field  is updated");

            }
        }

    }

    public void updatingcustomervalues(long Billno) {


    }

    public void deletingcustomervalue(int userid) {
        for(int index=0;index< management.length;index++)
        {
            if(management[index].getUserid()==userid)
            {
                management[index]=null;
                System.out.println(userid+" has been deleted successfully");
                return;
            }
        }
        System.out.println("your value is not deleted");

    }

    public void searchingancustomervalues(int userid) {
        try {
            for (int index = 0; index < management.length; index++) {
                if (management[index].getUserid() == userid) {
                    System.out.println(management[index]);
                }
            }
        }
        catch(Exception e)
        {
            System.out.print("Few values are null");
        }
        return;

    }

    @Override
    public void sorting() {
        Scanner scan=new Scanner(System.in);
        ElectricityBillProject bill=null;
        System.out.println("field name -sort perforamnce");
        String field=scan.next();
        for (int i=0;i<management.length;i++)
        {
            for(int j=i+1;j<management.length;j++)
            {
                if(field.equalsIgnoreCase("username"))
                {
                    if(management[i].getUsername().compareTo(management[j].getUsername())>0)
                    {
                        bill=management[i];
                        management[i]=management[j];
                        management[j]=bill;
                    }
                }
                else if (field.equalsIgnoreCase("userid"))
                {
                    if(management[i].getUserid()<=management[j].getUserid())
                    {
                        bill=management[i];
                        management[i]=management[j];
                        management[j]=bill;
                    }
                }
            }
        }
    }

    public Connection()
    {
        management[0]=new ElectricityBillProject(4567,"Manojkumar",8907896565645l,"7/234-1,Agaram,Elachipalayam",234.76);
        management[1]=new ElectricityBillProject(4568,"Hari",8907896565645l,"7/234-1,Agaram,Elachipalayam",234.76);
        management[2]=new ElectricityBillProject(4569,"Kishore",8907896565645l,"7/234-1,Agaram,Elachipalayam",234.76);
        System.out.println(Arrays.toString(management));
    }


    public static void main(String[] args)
    {
        Connection connect=new Connection();

        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("which process perforamnce you want\n 1.Addnew customers\n2.listallcustomerdetails\n3.update\n4.search\n5.delete\n6.sort");
            int menu=scan.nextInt();
            switch (menu)
            {
                case 1:
                    System.out.println("new customer details-userid,username,billno,address,currentmonthcharge");
                    ElectricityBillProject customer2=new ElectricityBillProject(scan.nextInt(),scan.next(), scan.nextLong(),scan.next(),scan.nextDouble() );
                    System.out.println(connect.addnewcustomers(customer2));
                    break;
                case 2:
                    System.out.println("electricity management customer detailsb are");
                    connect.listallcustomerdetails();
                    break;
                case 3:
                    System.out.println("which customer detail you are edit ");
                    String customername= scan.next();
                    connect.updatingcustomervalues(customername);
                    break;
                case 4:
                    System.out.println("search based on user id");
                    System.out.println("which user id you want search");
                    int userid= scan.nextInt();
                    connect.searchingancustomervalues(userid);
                    break;
                case 5:
                    System.out.println("which user id you want delete in electricitybillmanagement");
                    int id=scan.nextInt();
                    connect.deletingcustomervalue(id);
                    break;
                case 6:
                    connect.sorting();
                    break;

            }

        }
        while (
                true
        );


    }
}
