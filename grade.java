import java.util.Scanner;
class grade
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Subjects and Names Subjects");
        int n=sc.nextInt();
        String name[]=new String[n];
        int m[]=new int[n];
        int sum=0;
        int avg;
        char grade=' ';
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter Subject "+(i+1));
            name[i]=sc.next();
        }
        System.out.println("Entered Subjects");
        for(i=0;i<n;i++)
        {
            System.out.println(name[i]);
        }
        System.out.println("Enter Marks in Subjects");
        System.out.println("");
        for(i=0;i<n;i++)
        {
            System.out.println("Enter Marks in "+name[i]);
            m[i]=sc.nextInt();
        }
        System.out.println("Entered Marks");
        for(i=0;i<n;i++)
        {
            System.out.println("Marks in "+name[i]+" is "+m[i]);  
        }
        for(i=0;i<n;i++)
        {
            sum=sum+m[i];
        }
        System.out.println("Marks Obtained="+sum+" Out of "+(n*100));
        avg=sum/n;
        if(avg>90)
        {
            grade='A';
        }
        if(avg<89)
        {
            grade='B';
        }if(avg<70)
        {
            grade='C';
        }
        if(avg<59)
        {
            grade='F';
        }
        System.out.println("Grade of Student="+grade);
    }
}