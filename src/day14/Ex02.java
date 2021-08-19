package day14;

import java.io.IOException;
class A{
	public void test() throws IOException {
		ProcessBuilder b=new ProcessBuilder("calc");
		try {
			b.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void display() throws IOException{
		test();
	}
}


public class Ex02 {
	public static void main(String[] args) throws IOException {
		/*ProcessBuilder b= new ProcessBuilder("calc");
		try {
			b.start();
		}catch (IOException e) {
			System.out.println("해당");
			e.printStackTrace();
		}*/
		
		A a=new A();
		a.display();
		System.out.println("다음 문장들 실행");
	}
}
