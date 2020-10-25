package Quiz;

import java.io.*; 
import java.util.*; 
//������Ʈ ���� �ȿ��� �־ ������ ��Ű�� �ȴ�. 
public class Main2 { 
  Scanner scanner = new Scanner(System.in); 
  Vector<String> lineVector = new Vector<String>(); 
  private void readFile(String fileName) { 
    File targetFile = new File(fileName); 
    try { 
      Scanner fScanner = new Scanner(new FileInputStream(targetFile)); 
      while(fScanner.hasNext())  
      lineVector.add(fScanner.nextLine()); 
      fScanner.close(); 
   } 
   catch (FileNotFoundException e) { 
     e.printStackTrace(); 
  } 
} 
private void searchWord(String word) { 
  String line = ""; 
  for(int i=0 ; i<lineVector.size() ; i++) { 
    line = lineVector.get(i); 
    if( line.indexOf(word) != -1 ) { 
      System.out.println( (i+1) + ": " + line); 
   } 
} 
} 
public void run() { 
  System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�."); 
  System.out.print("��� ���ϸ� �Է�>> "); 
  String fileName = scanner.nextLine(); 
  String input = ""; 
  readFile( fileName ); 
  while( true ) { 
    System.out.print("�˻��� �ܾ ����>> "); 
    input = scanner.nextLine(); 
    if( input.equals("�׸�") ) { 
      break; 
   } 
   searchWord( input ); 
} 
scanner.close(); 
System.out.println("���α׷��� �����մϴ�."); 
} 
public static void main(String[] args) { 
  new Main2().run(); 
} 
} 
