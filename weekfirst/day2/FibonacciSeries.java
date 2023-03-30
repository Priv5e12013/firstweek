package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int firNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(firNum +"\n"+ secNum);
		for(int i=3; i<=range; i++) {
			int num=firNum+secNum;
			firNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
	}

}
