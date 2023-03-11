package week1.Day1;

public class IsPrime {
public static void main(String[] args) {

	int num=11;
	for(int i=2; i<num; i++) {
		if(num/i==0) {
			System.out.println(" not prime");
		}
		else {
			System.out.println("prime");
			break;
	}
	}
}
}
