package com.cctc.amatlock.test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener
{
    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
    Paddle paddle = Screen.getInstance().paddle;

    if(e.getKeyCode() == KeyEvent.VK_A)
        {
            paddle.setVelX(3);

        }
        else if(e.getKeyCode() == KeyEvent.VK_D)
    {
        paddle.setVelX(-3);
    }

    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        Paddle paddle = Screen.getInstance().paddle;

        if(e.getKeyCode() == KeyEvent.VK_A)
        {
            paddle.setVelX(0);

        }
        else if(e.getKeyCode() == KeyEvent.VK_D)
        {
            paddle.setVelX(0);
        }
    }
}
