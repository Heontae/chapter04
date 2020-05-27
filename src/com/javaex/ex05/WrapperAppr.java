package com.javaex.ex05;

public class WrapperAppr {
	public static void main(String[] args) {

		Integer num = new Integer(10); // int num=10; 둘이 다르다!
		System.out.println(num);

		Integer num01 = new Integer(2);
		Integer num02 = new Integer(5);
		Integer result = num01 + num02;
		System.out.println(result);

		Integer result02 = new Integer(2) + new Integer(5);
		System.out.println(result02);

		Integer num03 = 4; // new 안해도 자동으로 세팅해준다(boxing)
		System.out.println("============================");

		Integer num04 = new Integer(100);// 메소드 사용가능.(박싱)

		int num05 = num04;// 메소드,생성자를 제외하고 실제값(100)만 num05에입력(언박싱)

		Integer num10 = new Integer(100);
		// parseInt() 문자열을 숫자로 변환.
		int num11 = num10.parseInt("1234");
		System.out.println(num11 + 1);// 문자 1234로받았는데 연산 가능.

		int num12 = Integer.parseInt("1234");// parseInt는 static으로 먼저 올라가있는다.
		System.out.println(num12 + 1);

		// valueOf() 숫자(정수)를 문자열로 변환. String안에 static으로 선언되있다.
		String s101 = String.valueOf(100);
		System.out.println(s101+1);
	}
}
