import java.util.Scanner;
public class Main {
   public static void main(String[] args) { 
      System.out.print("연산>>"); 
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
         if(op2==0) // 0으로 나누는 경우
         { 
            System.out.print("0으로 나눌 수 없습니다."); 
            s.close(); 
            return; 
         } 
         else //0이 아닌 수로 나눗셈 하는 경우
            res=op1/op2; 
      } 
      else
      { 
         System.out.print("계산오류."); 
         s.close(); 
         return; 
      } 
      System.out.println(op1+op+op2+"의 계산결과는"+res); 
      s.close(); 
      }
}