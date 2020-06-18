package me.lulu.geometrydash.scene;

import sun.security.x509.AVA;

import java.awt.*;

/**
 * 2020-06-18 上午 10:33
 */
public abstract class Scene {
    private String name;

    public Scene(String name) {
        this.name = name;
    }

    public abstract void init();

    public abstract void update(double dt);

    public abstract void draw(Graphics2D graphics2D);
}