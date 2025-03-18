package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Circle;
import org.w3c.dom.css.Rect;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    ShapeRenderer sr;
    private Vector2 circleVelocity;
    private Vector2 square2Velocity;
    private Circle1 circle1;
    private Square1 square1;
    private Square2 square2;


    @Override
    public void create() {
        sr = new ShapeRenderer();
        circleVelocity = new Vector2(0, 0);
        square2Velocity = new Vector2(100, 100);
        circle1 = new Circle1();
        square1 = new Square1();
        square2 = new Square2();
    }

    @Override
    public void render() {
        int screenHeight = Gdx.graphics.getHeight();
        int screenWidth = Gdx.graphics.getWidth();
        float squareX = square1.getSquareX();
        float squareY = square1.getSquareY();
        float squareHeight = square1.getSquareHeight();
        float squareWidth = square1.getSquareWidth();
        float circleX = circle1.getCircleX();
        float circleY = circle1.getCircleY();
        float circleR = circle1.getCircleR();
        float squareX2 = square2.getSquareX2();
        float squareY2 = square2.getSquareY2();
        float squareHeight2 = square2.getSquareheight2();
        float squareWidth2 = square2.getSquareWidth2();
        float deltaTime = Gdx.graphics.getDeltaTime();

        circle1.setPosition(circle1.getCircleX() + circleVelocity.x * deltaTime, circle1.getCircleY() + circleVelocity.y * deltaTime);
        square2.setPositionSquare(square2.getSquareX2() + square2Velocity.x * deltaTime, square2.getSquareY2() + square2Velocity.y * deltaTime);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.circle(circleX, circleY, circleR);
        sr.end();
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.rect(squareX, squareY, squareWidth, squareHeight);
        sr.end();
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.rect(squareX2,squareY2,squareWidth2,squareHeight2);
        sr.end();


        //Collisions on wall
        if (circleX - circleR <= 0) {
            circleVelocity.x = circleVelocity.x * -1;
            circle1.setPosition(circleX + circleR, circleY);
        }
        if (circleX + circleR >= screenWidth) {
            circleVelocity.x = circleVelocity.x * -1;
            circle1.setPosition(circleX - circleR, circleY);
        }
        if (circleY - circleR <= 0) {
            circleVelocity.y = circleVelocity.y * -1;
            circle1.setPosition(circleX, circleY + circleR);
        }
        if (circleY + circleR >= screenHeight) {
            circleVelocity.y = circleVelocity.y * -1;
            circle1.setPosition(circleX, circleY - circleR);
        }

        Vector2 circleDistance = new Vector2(circleX, circleY);
        Vector2 squareDistance = new Vector2(squareX, squareY);
        Vector2 square2Distance = new Vector2(squareX2,squareY2);
        float distanceOfCircleToSquare = circleDistance.dst(squareDistance);
        float distanceOfSquareToSquare = square2Distance.dst(squareX2,squareY2);

        //Square on Wall Collisions
        if (squareX2 <= 0){
            square2Velocity.x = square2Velocity.x * -1;
            square2.setPositionSquare(squareX2 + 1, squareY2);
        }
        if(squareX2 + squareWidth2 > screenWidth){
            square2Velocity.x = square2Velocity.x * -1;
            square2.setPositionSquare(squareX2 - 1, squareY2);
        }
        if (squareY2 <= 0){
            square2Velocity.y = square2Velocity.y * -1;
            square2.setPositionSquare(squareX2, squareY2 + 1);
        }
        if (squareY2 + squareHeight2 >= screenHeight){
            square2Velocity.y = square2Velocity.y * -1;
            square2.setPositionSquare(squareX2,squareY2 - 1 );
        }

        //Square on Square Collisions

        //Square Left/Right side collisions
        if (squareY2 + squareHeight2 >= squareY && squareY2 <= squareY + squareHeight) {
                if (squareX2 + squareWidth2 >= squareX) {
                    square2Velocity.x = square2Velocity.x * -1;
                    square2.setPositionSquare(squareX2 - 40, squareY2);
                }
                if (squareX + squareWidth <= squareX2){
                    square2Velocity.x = square2Velocity.x * -1;
                    square2.setPositionSquare(squareX2 + 1, squareY2);
                }
            }

        //Square Top/Bottom collisions
        if (squareX2 + squareWidth2 > squareX){
            if (squareX2 < squareX + squareWidth){
                if (squareY2 + squareHeight2 > squareY){
                    square2Velocity.y = square2Velocity.y * -1;
                    square2.setPositionSquare(squareX2, squareY2 - 1);
                }
                if (squareY2 > squareY + squareHeight){
                    square2Velocity.y = square2Velocity.y * - 1;
                    square2.setPositionSquare(squareX2, squareY2 + 1);
                }
            }
        }

       // if (squareX2 < squareX + screenWidth){
       //     if (squareY2 < squareY){
       //         if (squareY2 > squareY + squareWidth){
       //             square2Velocity.x = square2Velocity.x * - 1;
       //             System.out.println(squareY2);
       //         }
       //     }
     //   }

       // if ()




        // Collisions between circle and square


        //if (distanceOfShapes < circleR) {
            //if (circleX - circleR < squareX) {
            //    circle1.setPosition(circleX + circleR + 5, circleY);
             //   circleVelocity.x = circleVelocity.x * -1;
          //  }

           // if (circleY + circleR > squareY) {
           //     circle1.setPosition(circleX, circleY - circleR - circleR - 5);
          //      circleVelocity.y = circleVelocity.y * -1;
          //  }

          //  if (circleY - circleR < circleR) {
          //      circle1.setPosition(circleX, circleY + circleR + 5);
          //      circleVelocity.y = circleVelocity.y * -1;
         //   }

          //  if (circleX + circleR > squareX + squareWidth) {
          //      circle1.setPosition(circleX - circleR - 5, circleY);
           //     circleVelocity.x = circleVelocity.x * -1;
           // }


           // if (circleX - circleR < squareX + squareWidth) {
           //     circle1.setPosition(circleX + circleR + 5, circleY);
           //     circleVelocity.x = circleVelocity.x * -1;
           // }


           // if (circleX + circleR > squareX + (squareWidth / 2)) {
           //     circle1.setPosition(circleX + circleR + 5, circleY);
           //     circleVelocity.x = circleVelocity.x * -1;
          //  }


           // if (circleX + circleR > squareX) {
           //     circle1.setPosition(circleX - circleR + 5, circleY);
            //}
       // }


    }
}

