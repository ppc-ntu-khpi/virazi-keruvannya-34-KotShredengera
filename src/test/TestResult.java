package test;

import domain.Exercise;

public class TestResult {

	public static void main(String[] args) {

		short R = 1253;
		System.out.println("Число - " + R + ", число Армстронга? (" + Exercise.Calculate(R) + ")");
	}
}
