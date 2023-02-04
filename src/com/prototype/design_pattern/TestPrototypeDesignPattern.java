package com.prototype.design_pattern;

public class TestPrototypeDesignPattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Shape s1 = new Shape("Square");
		Shape s2 = s1.clone();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
}
