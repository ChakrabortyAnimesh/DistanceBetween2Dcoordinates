package com.company;

public class Point {
   /* private int x1;
    private  int y1;
    private int x2;
    private int y2;*/
   private int x;
   private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /*
        public Point(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }*/
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

  /*  public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }*/
}
