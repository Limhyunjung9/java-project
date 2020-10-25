package Quiz;

import java.io.*; 
import java.util.*; 
//프로젝트 파일 안에만 넣어서 실행을 시키면 된다. 
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
  System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다."); 
  System.out.print("대상 파일명 입력>> "); 
  String fileName = scanner.nextLine(); 
  String input = ""; 
  readFile( fileName ); 
  while( true ) { 
    System.out.print("검색할 단어나 문장>> "); 
    input = scanner.nextLine(); 
    if( input.equals("그만") ) { 
      break; 
   } 
   searchWord( input ); 
} 
scanner.close(); 
System.out.println("프로그램을 종료합니다."); 
} 
public static void main(String[] args) { 
  new Main2().run(); 
} 
} 
