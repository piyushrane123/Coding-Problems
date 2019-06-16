import java.*;
import java.util.Scanner;
public class onp
{
public static void main(String args[]) 
   {
    
    Scanner sc = new Scanner(System.in);
    int a=0;
    if(sc.hasNextInt())
    a = sc.nextInt();
    int len;
    while(a!=0)
    {
       
       
      String exp = sc.next();
        len = exp.length();
    int i =0;
    char arr[] = new char[400];
    int j=0;
       while(len!=0)
        {
           
           if((exp.charAt(i)>='a'&& exp.charAt(i)<='z') || (exp.charAt(i)>='A' && exp.charAt(i)<='Z' ))
             {
               System.out.print(exp.charAt(i));
              }

            else if (exp.charAt(i)=='(') 
            {
               System.out.print("");
            } 
            
            else if(exp.charAt(i)=='+' || exp.charAt(i)=='*' || exp.charAt(i)=='-' || exp.charAt(i)=='/' || exp.charAt(i)=='^')
            {
                 arr[j]=exp.charAt(i);
                 j++;
            }
            
            else if(exp.charAt(i)==')')
            {
               System.out.print(arr[j-1]);
               j--;
            }
            else {
               
            }  
              i++;
              len--; 
 
        }
       
       a--;
       System.out.println();
 
    }
    sc.close();
   }


}

