import java.util.Scanner;
public class Main {
   public static void main(String[] args) { 
      System.out.print("����>>"); 
      Scanner s=new Scanner(System.in); 
      
      float op1=s.nextFloat(); 
      String op=s.next(); 
      float op2=s.nextFloat(); 
      float res=0; 
      
      if(op.equals("+")) 
         res=op1+op2; 
      else if(op.equals("-")) 
         res=op1-op2; 
      else if(op.equals("*")) 
         res=op1*op2; 
      else if(op.equals("/")) 
      { 
         if(op2==0) // 0���� ������ ���
         { 
            System.out.print("0���� ���� �� �����ϴ�."); 
            s.close(); 
            return; 
         } 
         else //0�� �ƴ� ���� ������ �ϴ� ���
            res=op1/op2; 
      } 
      else
      { 
         System.out.print("������."); 
         s.close(); 
         return; 
      } 
      System.out.println(op1+op+op2+"�� �������"+res); 
      s.close(); 
      }
}