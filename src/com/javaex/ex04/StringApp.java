package com.javaex.ex04;

public class StringApp {

	public static void main(String[] args) {
		//인스턴스 2개생성
		String s01 = new String("hi");
		String s02 = new String("hi");
		System.out.println("====주소 같은지 확인====");
		System.out.println(s01==s02);//진짜 주소 비교
		//hashCode는 정확한 주소가 아니다.
		System.out.println(s01.hashCode());
		System.out.println(s02.hashCode());
		
		//3번은 신스턴스 생성 4번은 같은값을 찾아보고 있으면 같은주소 대입
		String s03 = "hello";
		String s04 = "hello";
		System.out.println("====주소 같은지 확인====");
		System.out.println(s03==s04);//같은주소
		System.out.println(s03.hashCode());
		System.out.println(s04.hashCode());
		
		//s04값이 바뀌어 새로운 인스턴스에 대입(주소값이 바뀜)    
		s04 = "hellow!!!!!!!";
		System.out.println("====주소 같은지 확인====");
		System.out.println(s03==s04);
	}
}
