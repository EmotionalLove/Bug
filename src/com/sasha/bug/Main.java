package com.sasha.bug;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Bugz");
	    BugEntity bug = new BugEntity(0);
	    bug.move();
	    bug.printEntityPosition();
	    bug.move(4);
	    bug.printEntityPosition();
	    bug.turnHelper.turn();
	    bug.move(5);
	    bug.printEntityPosition();
    }
}
