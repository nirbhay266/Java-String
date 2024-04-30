public class stringDemo {
    public static void main(String[] args)
    {
        //  StringBuffer sb=new StringBuffer(" ");
         // System.out.print(sb.repeat(3, 100));//OutPut:-hello world
        StringBuffer sb=new StringBuffer("Nirbhay");
        System.out.println(sb.codePointBefore(2));
        System.out.println(sb.codePointAt(2));
        System.out.println(sb.codePointCount(2, 5));
        

       
        // StringBuffer sb=new StringBuffer();
       // System.out.println(sb.capacity());//Output:-16
        // StringBuffer sb=new StringBuffer("hello world");
        // System.out.println(sb.capacity());//Output:-16+chrecter of length

        // StringBuffer sb=new StringBuffer("Nirbhay ");
        // System.out.println(sb.append("Kumar"));//Output:-Nirbhay Kumar

        // StringBuffer sb=new StringBuffer("Nirbhay ");
        // System.out.println(sb.delete(2,5));//Output:-Niay

        // StringBuffer sb=new StringBuffer("Nirbhay kumar");
        // System.out.println(sb.indexOf("r"));//Output:-2
        // System.out.println(sb.lastIndexOf("r"));//Output12

        // StringBuffer sb=new StringBuffer("Nirbhay kumar");
        // System.out.println(sb.insert(13 , " Yadav"));//Output13:-Nirbhay kumar Yadav
        
        //   StringBuffer sb=new StringBuffer("Nirbhay kumar");
        // System.out.println(sb.replace(3,4 ,"n"));//Output14:-Nirnhay kumar

        // StringBuffer sb=new StringBuffer("Nirbhay kumar");
        // System.out.println(sb.reverse());

       //  StringBuffer sb=new StringBuffer("Nirbhay kumar");
         //System.out.println(sb.subSequence(3,7));//bhay

        // StringBuffer sb=new StringBuffer("Nirbhay kumar");
        // System.out.println(sb.substring(3));//bhay kumar

        // StringBuffer sb=new StringBuffer("Nirbhay kumar");
        // System.out.println(sb.substring(3,8));//bhay

        // StringBuffer sb=new StringBuffer("Nrbhay kumar");
        // sb.setCharAt(1,'i');
        // System.out.println(sb);//Output:-Nibhay Kumar

        // StringBuffer sb=new StringBuffer("Nirbhay kumar");
        // sb.setLength(7);
        // System.out.println(sb);//Output:-Nirbhay

        

    }
}
