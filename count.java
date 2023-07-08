


import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        int s1=s.length();
        for(int i=0;i<s1-1;i++)
        {
            if(i ==0 && s.charAt(i)!=' ')
            {
             count++;  
            }
            if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
            {
                count=count+1;
               
               
            }
        }

   
        System.out.println(count);
    }
}
