class s1
{
	public static void main(String args[])
	{
		String str="HelloWord";
		nitya n=new nitya();
		System.out.println(n.substring(str,1,5));
	}

     }

class nitya
{
	public static String substring(String str,int si,int ei)
	{
		String substr=" ";
		for(int i=si;i<ei;i++)
		{
			substr+=str.charAt(i);
		}
		return substr;
	}
	
}