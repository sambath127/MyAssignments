package week1.Day1;

import java.util.Iterator;

public class Fibbinocci {
public static void main(String[] args) {
	int firstNum = 0, secNum = 1, sum = 0;
	System.out.println(firstNum);
for (int i = 1; i < 11; i++) {
	sum= firstNum+secNum; //1
firstNum=secNum; //1
secNum=sum; //1
System.out.println(sum);

}
}

}
