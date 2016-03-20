package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] arsg) {

    Point p = new Point(-1, 2);

    Point q = new Point(11, 9);

    System.out.println("Расстояние между двумя точками " + p.x + ", " + p.y + " и " + q.x + ", " + q.y + " = " + p.distance(q));

  }

}



