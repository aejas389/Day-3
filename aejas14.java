import java.util.*;
public class aejas14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of student:");
        String s = sc.next();

        System.out.println("enter the marks");
        int s1 =sc.nextInt();
        int s2 =sc.nextInt();
        int s3 =sc.nextInt();
        int s4 =sc.nextInt();
        int s5 =sc.nextInt();

        boolean p=s1>=35 && s2>=35 && s3>=35 && s4>=35 && s5>=35;
        double avg=(s1+s2+s3+s4+s5)/5;
        if(avg>=80  && avg<=100 && p){
            String f = String.format("%s your status='PASS' avg=%1f and grade='a'",s,avg);


            System.out.println(f);

        }
        else if (avg>=60 && avg<80 && p)
        {
            String f = String.format("%s your status ='PASS' avg=%1f and grade='b'",s,avg);  
            System.out.println(f);

        }
        else if(avg>=40 && avg<60 && p)
        {
            String f = String.format("%s your status ='PASS' avg=%1f and grade='c'",s,avg);  
            System.out.println(f);  
        }
        else
        {
            String f = String.format("%s your status ='FAIL' avg=%1f and grade='e'",s,avg);  
            System.out.println(f);    
        }
    }

}
    

