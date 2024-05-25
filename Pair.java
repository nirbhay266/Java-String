public class Pair {
    public static int friendPair(int n);
    {
        //Base case
        if(n==1||n==2)
        {
            return n;
        }
        //Choice
        //Single
        int fnm1=friendPair(n-1);
        //pair
        int fnm2=friendPair(n-2);
        int Pairways=(n-1)*fnm2;
        return fnm1+Pairways;
    }
    public static void main(String[] args)
    {
        int n=3;
        friendPair(n);
    }
}
