package me.lulu.geometrydash.listener;

import lombok.Getter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 2020-06-17 下午 11:28
 */
@Getter
public class MouseListener extends MouseAdapter {

    private boolean mousePressed = false;
    private boolean mouseDragged = false;
    private int mouseButton = -1;
    private float x = -1.0f, y = -1.0f;
    private float distanceX = -1.0f, distanceY = -1.0f;


    @Override
    public void mousePressed(MouseEvent e) {
        this.mousePressed = true;
        this.mouseButton = e.getButton();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.mousePressed = false;
        this.mouseDragged = false;
        this.distanceX = 0;
        this.distanceY = 0;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.mouseDragged = true;
        this.distanceX = e.getX() - this.x;
        this.distanceY = e.getY() - this.y;
    }
}