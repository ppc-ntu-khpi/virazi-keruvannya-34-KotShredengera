package test;

import domain.Exercise;

public class TestResult {

	public static void main(String[] args) {

		short R = 1253;
		System.out.println("����� - " + R + ", ����� ����������? (" + Exercise.Calculate(R) + ")");
	}
}
