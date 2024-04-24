public class stringCamparision {
    public static void main(String[] args) {
        String str1="nirbhay";
        String str2="nirbhay";
        String str3=new String("nirbhay");

        if(str1==str2) 
        {
            System.out.println("str1 and  str2 are equal");
        }
        else{
            System.out.println("str1 and str2 are Not equal");

        }
    if(str1.equals(str3))
        {
            System.out.println("str1 and str2 are equal");
        }
    else{
        System.out.println("str1 And str2 are Not equal");
    }

    }
}
