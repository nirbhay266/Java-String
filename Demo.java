public class Demo
{
    public static void main(String[] args)
    {
       students s1=new students();
       s1.name="Nirbhay Yadav";
       s1.roll=1;
       s1.pasword="ABX";
       s1.marks[0]=10;
       s1.marks[1]=20;
       s1.marks[2]=30;
       students s2=new students(s1);
       System.out.println(s2.name);
       System.out.println(s2.roll);
       System.out.println(s2.pasword);
       s1.marks[2]=100;
       for(int i=0;i<3;i++)
        {
            System.out.println(s1.marks[i]);
        }
    }
}
class students
{
    String name;
    int roll;
    String pasword;
    int marks[];
    students(students s1)
    {
        name=s1.name;
        roll=s1.roll;
        pasword=s1.pasword;
    }
    students()
    {
        marks=new int[3];
        System.out.println("Constructor is called");
    }
    students(String name)
    {
        marks =new int[3];
        this.name=name;
    }
}
