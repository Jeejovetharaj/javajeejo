package HomeWork;

import java.util.Scanner;

public class Booking implements BusBooking{

    Itenery rb[]=new Itenery[2];

    @Override
    public String addName(Itenery name) {
        for(int i=0;i<rb.length;i++)
        {
            if(rb[i]==null)
            {
                rb[i]=name;
                return name.getName()+"has been added";
            }

        }
        return name.getName()+"cannot be added";

    }

    @Override
    public void deleteName(String name) {
            for (int i = 0; i < rb.length; i++) {
                if (rb[i].getName() == name) {
                    rb[i] = null;
                    System.out.println("Passenger" + name + " has been deleted successfully");
                    return;
                }
            }
            System.out.println("Not Deleted");

    }

    @Override
    public void updateName(String name) {
        Scanner scan=new Scanner(System.in);
        for(int pos=0;pos< rb.length;pos++)
        {
            if(rb[pos].getName().equalsIgnoreCase(name))
            {
                System.out.println(name+" in the user details which field you want edit");
                String filenames=scan.next();
                switch (filenames)
                {
                    case "name":
                        System.out.println("please enter your new customer name:");
                        String newname= scan.next();
                        rb[pos].setName(newname);
                        listPassengers();
                        break;
                }
                System.out.println(filenames+" in this field  is updated");

            }
        }

    }

    @Override
    public void count(String gender) {

    }

    @Override
    public void listPassengers() {
        for(Itenery s:rb)
            System.out.println(s);

    }
    Booking()
    {
        rb[0]=new Itenery("Jeejo",32,"Male", "Nagercoil","Chennai");
        rb[1]=new Itenery("Haritha",25,"Female", "Nagercoil","Madurai");
    }

    public static void main(String[] args) {
        Booking b=new Booking();
        Scanner s=new Scanner(System.in);
        do {
            System.out.println("1.AddName\n2. List Passenger\n3.Delete Passenger\n4.Update Name ");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    Itenery Passenger = new Itenery(s.next(), s.nextInt(), s.next(), s.next(), s.next());
                    System.out.println(b.addName(Passenger));
                    break;
                case 2:
                    b.listPassengers();
                    break;
                case 3:
                    //System.out.println("Whom do u want to delete");
                    String a = s.next();
                    b.deleteName(a);
                    break;
                case 4:
                    System.out.println("Whom do u want to update");
                    String nnn=s.next();
                    b.updateName(nnn);

            }
        }while ((true));
    }
}
