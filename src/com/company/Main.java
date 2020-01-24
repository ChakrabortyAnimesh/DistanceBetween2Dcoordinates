package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int x1;
        int y1;
        int x2;
        int y2;
        Scanner sc = new Scanner(System.in);
        x1=sc.nextInt();
        y1=sc.nextInt();
        x2=sc.nextInt();
        y2=sc.nextInt();
        Point p1=new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        double distance = findDistance(p1, p2);
        DecimalFormat df=new DecimalFormat("0.000");
        String finalDistance = df.format(distance);
        System.out.println(finalDistance);

    }

    public static double findDistance(Point p1, Point p2) {
        double x = (p1.getX() - p2.getX());
        x = Math.pow(x, 2);
        double y = (p1.getY() - p2.getY());
        y = Math.pow(y, 2);
        double sum = (x + y);
        double distance = Math.sqrt(sum);
        return distance;
    }
}
