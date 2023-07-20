package Ex;

import java.util.Scanner;

public class purposeofException {
    public static void main(String[] args)
    {
        String makecreate=" the verb create usually used suggest newless or innovation for make creating";

        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("which index of value you want start and end");
            System.out.println(makecreate.substring(scan.nextInt(), scan.nextInt()));
        }
        catch(StringIndexOutOfBoundsException str)
        {
            System.out.println(str);
            System.out.println("which index of value you want start and end");
            System.out.println(makecreate.substring(scan.nextInt(), scan.nextInt()));
        }
        finally
        {
            System.out.println("Thank you Exception Handling");
        }

    }
}
