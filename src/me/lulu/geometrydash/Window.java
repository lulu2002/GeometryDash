package me.lulu.geometrydash;

import me.lulu.geometrydash.listener.KeyListener;
import me.lulu.geometrydash.listener.MouseListener;
import me.lulu.geometrydash.scene.Scene;
import me.lulu.geometrydash.scene.impl.LevelEditorScene;
import me.lulu.geometrydash.util.Time;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * 2020-06-17 下午 11:14
 */
public class Window extends JFrame implements Runnable {
    private static Window window = null;
    private boolean isRunning = true;

    public MouseListener mouseListener = new MouseListener();
    public KeyListener keyListener = new KeyListener();

    private Scene scene = null;

    public Window() {
        setupWindow();
        addListeners();
    }

    private void setupWindow() {
        setSize(1280, 720);
        setTitle("Geometry Dash");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // set center
    }

    private void addListeners() {
        addMouseListener(mouseListener);
        addMouseMotionListener(mouseListener);
        addKeyListener(keyListener);
    }


    public static Window getWindow() {
        if (window == null)
            window = new Window();

        return window;
    }


    public void init() {
        changeScene(new LevelEditorScene());
    }

    public void changeScene(Scene scene) {
        this.scene = scene;
    }

    public void update(double dt) {
        scene.update(dt);
    }

    @Override
    public void run() {
        double lastFrameTime = 0D;

        try {
            while (isRunning) {
                double time = Time.getTimeInSeconds();
                double deltaTime = time - lastFrameTime;
                lastFrameTime = time;

                update(deltaTime);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}