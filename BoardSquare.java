package io.github.some_example_name;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Array;

public class BoardSquare {


    int screenHeight2 = 480;
    int screenWidth2 = 640;
    final float widthSquare = 40;
    final float heightSquare = 40;
    float xSquare = screenWidth2 - widthSquare;
    float ySquare = screenHeight2 - heightSquare;
    private TextureRegion BoardSquare;

    //Setter methods for square dimensions
    public float getWidthSquare() {
        return widthSquare;
    }

    public float getHeightSquare() {
        return heightSquare;
    }

    public float getxSquare() {
        return xSquare;
    }

    public float getySquare() {
        return ySquare;
    }
}
