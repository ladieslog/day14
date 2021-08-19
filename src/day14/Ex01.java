package day14;

import java.util.Scanner;

class AAA extends BBB{
	public int aaa;
}
class BBB {
	public void catch1(int a) {
		System.out.println("정수 : "+a );
	}
	public void catch1(String a) {
		System.out.println("문자열 : "+a);
	}
	public void catch1(Object a) {
		System.out.println("오브젝트 : "+a);
	}
}


public class Ex01 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int x,y,result;
		System.out.println("수입력");
		try {
			x=input.nextInt(); y=input.nextInt();
			result=x/y; 
			System.out.println("x / y = "+result);
		}catch (Exception e) {
			//System.out.println("0으로 나눌수 없습니다. ");
			e.printStackTrace();
		}
		System.out.println("다음 문장들 실행~~");
		
		//2
		//AAA a =new AAA();
		BBB a= new AAA();
		String ss ="test";
		a.catch1(11); a.catch1("test");
		a.catch1('t');
	}
}
