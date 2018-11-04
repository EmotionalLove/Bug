package com.sasha.bug;

import java.util.UUID;

/**
 * The actual bug
 */
public class BugEntity {

    /**
     * The 1-dimensional position of the bug
     */
    private int position;
    /**
     * Our turn helper
     */
    protected EntityTurnHelper turnHelper;
    /**
     * A unique identifer that we could use to register and manage multiple bugs at once.
     */
    private UUID identifier;

    public BugEntity(int startingPos) {
        this.position = startingPos;
        identifier = UUID.randomUUID();
        this.turnHelper = new EntityTurnHelper();
    }

    /**
     * Prints this bug's position
     */
    public void printEntityPosition() {
        System.out.println("The bug " + identifier.toString() + " is at " + position);
    }

    /**
     * move the entity
     */
    public void move() {
        if (turnHelper.isTurning()) {
            position--;
        }
        else {
            position++;
        }
    }
    public void move(int amt) {
        if (turnHelper.isTurning()) {
            position -= amt;
        }
        else {
            position += amt;
        }
    }

}
