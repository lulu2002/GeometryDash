package me.lulu.geometrydash;

/**
 * 2020-06-17 下午 11:12
 */
public class Main {

    public static void main(String args[]) {
        Window window = Window.getWindow();
        window.init();

        Thread mainThread = new Thread(window);
        mainThread.start();
    }

}