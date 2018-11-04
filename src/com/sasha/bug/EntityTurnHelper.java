package com.sasha.bug;

/**
 * Helps manage whether the Bug is turning or not.
 */
public class EntityTurnHelper {

    private boolean isTurning;

    /**
     * Cause the entity to turn (180 degrees, as of right now)
     */
    public void turn() {
        this.isTurning = !this.isTurning;
    }

    public boolean isTurning() {
        return isTurning;
    }

}
