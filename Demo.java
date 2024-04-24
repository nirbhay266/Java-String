import java.util.*;
public class Demo
{
    public static void printletter(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        {
        //    String name = "Abigail";
        //    String address = "15 Street";
        //     System.out.println(name);
        // Scanner ob=new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name=ob.nextLine();
        // System.out.println("Enter your address");
        // String address=ob.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());
        // System.out.println(address);
        // System.out.println(address.length());
String FirstName="nirbhay";
String lastname="Kumar";
String FullName=FirstName+ " "+ lastname;

System.out.println(FullName);
System.out.println(FullName.length());
System.out.println(FullName.charAt(0));

printletter(FullName);
        }
    }
}