package io.github.some_example_name;



public class Circle1 {
    private float circleX = 300;


    public float getCircleX() {
        return circleX;
    }

    private float circleY = 50;

    public float getCircleY() {
        return circleY;
    }

    public float getCircleR() {
        return (float) 40;
    }

    public void setPosition(float circleX, float circleY) {
        this.circleX = circleX;
        this.circleY = circleY;
    }
}

