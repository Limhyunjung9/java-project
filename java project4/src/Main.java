import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ϰ��� �ϴ� �� �� �Է� >>");	
		while(true) {
		try {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			System.out.print(n + "x"+ m+"="+n*m);
			break;
		}
		catch(InputMismatchException e)
		{
			System.out.print("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
			scanner.nextLine();
			continue;
		}
		}
		scanner.close();	
	}
}
