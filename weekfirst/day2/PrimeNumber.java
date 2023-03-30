package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		
		for(int i=2; i<=input/2; i++) {
			if(input%i==0) {
				flag=true;
			}if (flag) {
				System.out.println("the given number is" +input+ "is not prime");
			}else {
				System.out.println("the given number is" +input+ "is prime");
			}
		}
		

	}

}
