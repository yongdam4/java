package test.t220240705;

import java.util.Scanner;

public class T_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	while(true) {
	System.out.print("연산자(+, -, *, /, %) : ");
	String op = sc.next();
	
	if(op.equals("exit")) {
		System.out.print("프로그램을 종료합니다.");
		break;
	}
	
	System.out.print("정수1 : ");
	int num1 = sc.nextInt();
	
	System.out.print("정수2 : ");
	int num2 = sc.nextInt();
	
switch(op.charAt(0)) {
case '+':
	System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
break;
case '-':
	System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	break;
case '*':
	System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
	break;
case '/':
	if(num2 == 0) {
		System.out.println("0으로 나눌수  없습니다. 다시 입력해주세요.");
		break;
	}
	System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	break;
case '%':
	System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
default :
	System.out.println("없는 연산자입니다. 다시 입력해 주세요");
}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	}
	}
