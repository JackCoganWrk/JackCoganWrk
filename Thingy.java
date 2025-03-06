package io.github.some_example_name;

public class Thingy {
    private float shapeX = 40;

    public float getShapeX() {
        return shapeX;
    }

    private float shapeY = 40;

    public float getShapeY() {
        return shapeY;
    }

    private float shapeR = 40;

    public float getShapeR() {
        return shapeR;
    }

    public void setPosition(float shapeX, float shapeY) {
        this.shapeX = shapeX;
        this.shapeY = shapeY;
        this.shapeR = shapeR;
    }
}

