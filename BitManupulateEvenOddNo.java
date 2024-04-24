public class BitManupulateEvenOddNo {
    public static void EvenOdd(int n)
    {
        int bitmask=1;
        if((n & bitmask)==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        EvenOdd(4);
        EvenOdd(1);
        EvenOdd(2);
        EvenOdd(3);
        EvenOdd(4);

    }
}
