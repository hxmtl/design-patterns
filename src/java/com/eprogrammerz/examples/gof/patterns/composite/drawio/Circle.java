package com.eprogrammerz.examples.gof.patterns.composite.drawio;

/**
 * Leaf
 */
public class Circle implements Graphic {

    //Draw Circle
    @Override
    public void draw() {
        System.out.println("Circle Drawn.");
    }
}
