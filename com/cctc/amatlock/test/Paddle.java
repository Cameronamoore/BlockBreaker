package com.cctc.amatlock.test;

import java.awt.*;

public class Paddle extends CoreObject
{

    /**
     * Creates the core object. All subclasses
     * will call this with super.
     * The super call to the Rectangle class.
     *
     * @param x
     * @param y
     * @param width
     * @param height
     * @param color
     */
    public Paddle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void tick()
    {
    Ball ball = Screen.getInstance().ball;

    x += velX;
    y += velY;
    if(ball.intersects(this))
    {
        ball.setVelY(ball.getVelY() * -1);
        ball.setVelX(ball.getVelX() * 1);
    }
    }

    @Override
    public void render(Graphics g)
    {
    g.setColor(color);
    g.fillRect(x, y, width, height);
    }
}
