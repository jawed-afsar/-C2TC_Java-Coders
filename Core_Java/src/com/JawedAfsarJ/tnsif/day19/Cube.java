//Program to demonstrate Functional Interface

package com.JawedAfsarJ.tnsif.day19;

@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}