import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    System.out.println("ù��° ���� �߽ɰ� ������ �Է�>>");
   Scanner s= new Scanner(System.in);
   
   int x1 = s.nextInt(); //ù��° �� x��ǥ
   int y1 = s.nextInt(); //ù��° �� y��ǥ
   double r1=s.nextDouble(); //ù��° ���� ������
   
   System.out.println("�� ��° ���� �߽ɰ� ������ �Է�>>");

   int x2=s.nextInt(); //�ι�° ���� x��ǥ
   int y2=s.nextInt(); //�ι�° ���� y��ǥ
   double r2=s.nextDouble(); //�ι�° ���� ������
   
   double distance=0; 
   distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)); 
   
   if (distance<=r1+r2) 
      System.out.println("�� ���� ���� ��ģ��."); 
   else System.out.println("�� ���� ���� �Ȱ�ģ��."); 
   s.close();

   }
   
}