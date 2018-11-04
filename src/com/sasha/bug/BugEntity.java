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
    private EntityTurnHelper turnHelper;
    private UUID identifier;

    public BugEntity(int startingPos) {
        this.position = startingPos;
        identifier = UUID.randomUUID();
        this.turnHelper = new EntityTurnHelper();
    }

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

}
