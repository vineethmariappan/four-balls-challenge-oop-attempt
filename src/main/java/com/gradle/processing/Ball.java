package com.gradle.processing;


public class Ball {
    private int diameter;
    private int movementSpeed;
    private int positionX;
    private int positionY;
    public Ball(int positionX, int positionY,int movementSpeed, int diameter) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.diameter = diameter;
        this.movementSpeed = movementSpeed;
    }


    public void moveByPositionX(){
        positionX+=movementSpeed;
    }
    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
