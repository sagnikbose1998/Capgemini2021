package com.capgemini.SampleMavenProject;

public class ArithmeticOperations {
	public int add(int a, int b) { return (a+b); }
	public int subs(int a, int b) { return Math.abs(a-b); }
	public int mult(int a, int b) { return a*b; }
	public int div(int a, int b) { return (a > b) ? a/b : b/a; }
}
