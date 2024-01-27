package org.example.CH4.section_4.Rectangle;

public class WrongRectangle {
    private int left;
    private int top;
    private int right;
    private int bottom;

    public WrongRectangle(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public int getLeft() {
        return left;
    }

    public int getTop() {
        return top;
    }

    public int getRight() {
        return right;
    }

    public int getBottom() {
        return bottom;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
}
/*
1. 변경에 취약하다.

어떤 다른 곳에서 사각형의 넓이를 변경시키기 위해
 */