package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.utils.ScreenUtils;


public class Main extends ApplicationAdapter {

    private SpriteBatch batch;
    private Texture image;
    ShapeRenderer sr;
    private int screenHeight;
    private int screenWidth;
    private BoardSquare square;

    @Override
    public void create() {
        screenHeight = Gdx.graphics.getHeight();
        screenWidth = Gdx.graphics.getWidth();
        sr = new ShapeRenderer();
    }

    @Override
    public void render() {

        //Getter methods for square dimensions
        float xSquare = square.getxSquare();
        float ySquare = square.getySquare();
        float widthSquare = square.getWidthSquare();
        float heightSquare = square.getHeightSquare();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        //Draws Array

        sr.begin();
        sr.rect(xSquare,ySquare,widthSquare,heightSquare);
        sr.end();

        batch.begin();
        batch.draw(MakeBoard,xSquare,ySquare);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
