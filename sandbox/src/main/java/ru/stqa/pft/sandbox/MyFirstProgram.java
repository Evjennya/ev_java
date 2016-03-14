package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] arsg){
		System.out.println("Hello, world!");

    double l = 5;
    double a = 4;
    double b = 6;

    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

  }

  public static double area(double len){
    return len *len;
  }

  public static double area(double a, double b){
    return a * b;
  }
}
