package com.gradle.processing;

import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallsChallenge extends PApplet {
    public static final int FRAME_HEIGHT = 480;
    public static final int FRAME_WIDTH = 640;
    public static final int RGB1 = 255;
    public static final int NO_OF_BALLS = 4;
    public static final int BALL_DIAMETER = 10;
    public static final int INITIAL_BALL_POSITION_X = 0;

    ArrayList<Ball> balls = new ArrayList<>();
    public FourBallsChallenge(){
        initializeBalls();
    }

    private void initializeBalls() {
        for(int ballIndex = 0;ballIndex<NO_OF_BALLS;ballIndex++){
            int ballOrder = ballIndex+1;
            int ballPositionY = computeBallYPositionForTheFrameHeight(ballOrder);
            Ball ball = new Ball(INITIAL_BALL_POSITION_X,ballPositionY,ballOrder, BALL_DIAMETER);
            balls.add(ball);
        }
    }

    public static void main(String[] args) {
        PApplet.main("com.gradle.processing.FourBallsChallenge",args);

    }
    @Override
    public void settings(){
        super.settings();
        size(FRAME_WIDTH,FRAME_HEIGHT);
    }

    @Override
    public void setup() {
        paintWhite();
    }
    private void paintWhite() {
        background(RGB1);
    }
    @Override
    public void draw() {
        drawAllBalls();
    }

    private void drawAllBalls() {
        for(Ball ball:balls){
            drawBall(ball);
        }
    }
    private void drawBall(Ball ball){
        ellipse(ball.getPositionX(),ball.getPositionY(),ball.getDiameter(),ball.getDiameter());
        ball.moveByPositionX();
    }
    private int computeBallYPositionForTheFrameHeight(int ballOrder) {
        return ballOrder*FRAME_HEIGHT/(NO_OF_BALLS+1);
    }
}
