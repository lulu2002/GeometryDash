package me.lulu.geometrydash.listener;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 2020-06-18 上午 10:27
 */
public class KeyListener extends KeyAdapter {
    private boolean keyPressed[] = new boolean[128];

    @Override
    public void keyPressed(KeyEvent e) {
        keyPressed[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyPressed[e.getKeyCode()] = false;
    }

    public boolean isKeyPressed(int keyCode) {
        return keyPressed[keyCode];
    }
}