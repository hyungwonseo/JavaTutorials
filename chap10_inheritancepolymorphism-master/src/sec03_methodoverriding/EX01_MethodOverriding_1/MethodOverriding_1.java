package sec03_methodoverriding.EX01_MethodOverriding_1;

/*메서드 오버라이딩의 기본 동작*/

class A{
	int a = 5;
	void print() {
		System.out.println("A 클래스 " + a );
	}
}
class B extends A{
	int a = 10;
	@Override
	void print() {
		System.out.println("B 클래스" + a);
	}
}
public class MethodOverriding_1 {
	public static void main(String[] args) {
		//#1. A 타입 / A 생성자
		A aa = new A();
		aa.print(); //A 클래스
		
		//#2. B 타입 / B 생성자
		B bb = new B();
		bb.print(); //B 클래스
		
		//#3. A 타입 / B 생성자
		A ab = new B();
		ab.print(); //B 클래스

		A aClass = bb;
		ab.print();
	}
}
