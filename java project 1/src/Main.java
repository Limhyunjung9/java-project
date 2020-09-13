import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    System.out.println("첫번째 원의 중심과 반지름 입력>>");
   Scanner s= new Scanner(System.in);
   
   int x1 = s.nextInt(); //첫번째 원 x좌표
   int y1 = s.nextInt(); //첫번째 원 y좌표
   double r1=s.nextDouble(); //첫번째 원의 반지름
   
   System.out.println("두 번째 원의 중심과 반지름 입력>>");

   int x2=s.nextInt(); //두번째 원의 x좌표
   int y2=s.nextInt(); //두번째 원의 y좌표
   double r2=s.nextDouble(); //두번째 원의 반지름
   
   double distance=0; 
   distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)); 
   
   if (distance<=r1+r2) 
      System.out.println("두 원은 서로 겹친다."); 
   else System.out.println("두 원은 서로 안겹친다."); 
   s.close();

   }
   
}