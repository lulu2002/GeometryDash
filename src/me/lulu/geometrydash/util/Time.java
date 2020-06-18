package me.lulu.geometrydash.util;

/**
 * 2020-06-17 下午 11:19
 */
public class Time {
    public static double timeStarted = System.nanoTime();

    public static double getTimeInSeconds() {
        return (System.nanoTime() - timeStarted) * 1E-9;
    }

}