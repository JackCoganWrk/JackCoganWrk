package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.utils.ScreenUtils;
import jdk.jfr.internal.consumer.filter.CheckpointEvent;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {


    ShapeRenderer sr;
    private Vector2 circleVelocity;
    private Thingy circle;



    @Override
    public void create() {

        sr = new ShapeRenderer();
        int screenHeight = Gdx.graphics.getHeight();
        circleVelocity = new Vector2(200,200);
        circle = new Thingy();

    }

    @Override
    public void render() {


        float shapeX = circle.getShapeX();
        float shapeY = circle.getShapeY();
        float shapeR = circle.getShapeR();

        float deltaTime = Gdx.graphics.getDeltaTime();
        circle.setPosition(circle.getShapeX() + circleVelocity.x * deltaTime, circle.getShapeY() + circleVelocity.y * deltaTime);

        System.out.println("Checkpoint 1");
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.circle(shapeX, shapeY, shapeR);
        sr.end();

        System.out.println("Checkpoint 2");
       if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
           circle.setPosition(shapeX - 5,shapeY);
        }

    }
}
