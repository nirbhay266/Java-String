public class GetithBit {
    public static int ithBit(int n,int i)
    {
        int bitmask=1<<i;
        if((n & bitmask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static int setIthbit(int n,int i)
    {
        int bitmask=(1<<i);
        return n| bitmask;
    }
    public static int clearIthBit(int n,int i)
    {
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static int updateBit(int n, int i,int newBit)
    {
        // if(newBit==0)
        // {
        //     return clearIthBit(n,i);
        // }
        // else
        // {
        //     return setIthbit(n,i);
        // }
        n=clearIthBit(n,i);
        int bitmask=newBit<<i;
        return n|bitmask;
    }
    public static int clearLastbit(int n,int i)
    {
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static int clearRangeOfBit(int n,int i,int j)
    {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static boolean checkAnumberPowerOf2(int n)
    {
        return (n&(n-1))==0;
    }
    public static int countSetBits(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int n)
    {
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
      //  System.out.println(ithBit(10, 3));
     // System.out.println(setIthbit(10, 2));
      //System.out.println(clearIthBit(10, 1));
      //System.out.println(updateBit(10, 2,1));
     // System.out.println(clearLastbit(15, 2));
     //System.out.println(clearRangeOfBit(10, 2,4));
    // System.out.println(checkAnumberPowerOf2(8));
    //System.out.println(countSetBits(8));
    System.out.println(fastExpo(3,5));
    }
}
