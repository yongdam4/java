package b.operator;

public class Operator3 {
	/*
	 *산술 연산자
	 *+ - * / %
	 *
	 ** / % > + -
	 *
	 *복합 대입 연산자
	 *산술연산자와 대입연산자를 결합해서 사용할 수있다
	 *
	 *+= -= /= *= %=
	 *
	 *a = a + 3; - > a += 3; 
	 */
	 
	public static void main(String[] args) {
	int a = 5;
	int b = 10;
	int c = (++a) +b; // a = 6, b = 10, c =16
	int d = c / a; //d = 2
	int e = c % a; //e = 4
	int f = e++; // e = 5, f = 4
	int g = (--b) + (d--); // b = 9, d = 2(1), g = 11
	int h = 2;
	int i = (a++) + b / (--c / f) *(g-- - d) % (++e + h);
	
	// a++ = 6, b = 10, --c = 15, f = 4, g-- = 11, d = 1, ++e = 6, h = 2
	// =  6+10/15/4*10%8
	// = 12
	}
}
