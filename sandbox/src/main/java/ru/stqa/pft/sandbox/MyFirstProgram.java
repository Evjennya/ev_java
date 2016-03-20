package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] arsg) {

    Point p = new Point();
    p.x = -1;
    p.y = 2;

    Point q = new Point();
    q.x = 9;
    q.y = 11;


    System.out.println("Расстояние между двумя точками = " + distance(p, q));

  }
    public static double distance(Point p1, Point p2){
    return Math.sqrt( Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2));
  }



  }



