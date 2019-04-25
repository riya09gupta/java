package project1;

public class Shapes{
	float result;


	void circle(float r) {
		result=(3.14f)*r*r;
		printResult();
	}
	void square(float s) {
		result=s*s;
		printResult();
	}
	void printResult() {
		System.out.println("Result is :" + result);
	}
}
