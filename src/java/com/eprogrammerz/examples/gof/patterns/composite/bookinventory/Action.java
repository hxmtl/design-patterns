package com.eprogrammerz.examples.gof.patterns.composite.bookinventory;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Action implements Catalog {
    private DVD actionDVD;

    public Action(DVD actionDVD) {
        this.actionDVD = actionDVD;
    }

    @Override
    public void print() {
        System.out.println(" --- Drama");
        System.out.println(" ---- " + actionDVD.getTitle());
    }
}
