import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String answer[] = {"����","����","��"}; 
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true)
		{
			System.out.print("���� ���� ��!>>");
			String user = scanner.next();
			if(user.equals("�׸�"))
			{
				System.out.println("������ �����մϴ�.");
				break;
			}
			int a = (int)(Math.random()*3);
			
			/* ���ڿ� ��ǻ�Ͱ� ����� ��� */
		    if(user.equals(answer[a]))
			{
				System.out.println("����� = "+ user + ", ��ǻ�� = "+answer[a] + ", �����ϴ�.");
			}
			/*����ڰ� �̰��� ���*/
			else if((a==0 && user.equals("����")) ||(a==1 && user.equals("��")) ||(a==2 && user.equals("����")))
			{
				System.out.println("����� = " + user + ",��ǻ�� = " + answer[a] + ", ����ڰ� �̰���ϴ�.");
			}
			else if((a==0 && user.equals("��")) ||(a==1 && user.equals("����")) ||(a==2 && user.equals("����")))
			{
				System.out.println("����� = " + user + ",��ǻ�� = " + answer[a] + ", ����ڰ� �����ϴ�.");
			}
			else 
			{
				System.out.println("�ٽ� �Է� ���ּ��� ");
			}		   
		}		
	}	
}

