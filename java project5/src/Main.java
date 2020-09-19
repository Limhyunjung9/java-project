import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String answer[] = {"가위","바위","보"}; 
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true)
		{
			System.out.print("가위 바위 보!>>");
			String user = scanner.next();
			if(user.equals("그만"))
			{
				System.out.println("게임을 종료합니다.");
				break;
			}
			int a = (int)(Math.random()*3);
			
			/* 독자와 컴퓨터가 비겼을 경우 */
		    if(user.equals(answer[a]))
			{
				System.out.println("사용자 = "+ user + ", 컴퓨터 = "+answer[a] + ", 비겼습니다.");
			}
			/*사용자가 이겼을 경우*/
			else if((a==0 && user.equals("바위")) ||(a==1 && user.equals("보")) ||(a==2 && user.equals("가위")))
			{
				System.out.println("사용자 = " + user + ",컴퓨터 = " + answer[a] + ", 사용자가 이겼습니다.");
			}
			else if((a==0 && user.equals("보")) ||(a==1 && user.equals("가위")) ||(a==2 && user.equals("바위")))
			{
				System.out.println("사용자 = " + user + ",컴퓨터 = " + answer[a] + ", 사용자가 졌습니다.");
			}
			else 
			{
				System.out.println("다시 입력 해주세요 ");
			}		   
		}		
	}	
}

