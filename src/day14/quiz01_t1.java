package day14;



import java.util.InputMismatchException;
import java.util.Scanner;

class Verval {
	public void start() {
		Scanner pulls =new Scanner(System.in);
		int joinYear,a;
		do{
			a=0;
			System.out.print("생일 년도날짜를 6자리로입력해주세요\n"
					+ "예(890214): ");
			
			try {
				
				joinYear=pulls.nextInt();
				if(joinYear>=100000&&joinYear<900000) {
					System.out.println("가입 가능"); a=1;
				}else if(joinYear<100000||joinYear>=1000000) {
					System.out.println("자리수가 안맞습니다. ");
				}else if(joinYear>=900000) {
					System.err.println("가입이 불가능 합니다.");	
					
				}
				
			} catch (InputMismatchException  e) {
				pulls.nextLine();
				System.out.println("잘목입력 숫자입력 정상적인 숫자를 입력하세요");
			}
			System.out.println("..");
		}while(a==0);
		
	}
}
public class quiz01_t1 {
	public static void main(String[] args) {
		Verval va =new Verval();
		va.start();
		
	}
}
