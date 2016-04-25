package com.theironyard.clt;

/**
 * This bird class should extend the Animal class. It has a single field:
 * <ul>
 *     <li>numWings: any whole number</li>
 * </ul>
 *
 * This field should be private.
 *
 * The bird class should have a public constructor that takes two parameters:
 * <ul>
 *     <li>numLegs: a whole number</li>
 *     <li>numWings: a whole number</li>
 * </ul>
 *
 * This constructor should set the numArms field (from Animal) to 0, and set the
 * hasVertebra field to true.
 */
public class Bird extends Animal {
    private int numWings;

    public Bird(int numLegs, int numWings) {
        this.numLegs = numLegs;
        this.numArms = 0;
        this.numWings = numWings;

        hasVertebra = true;
    }

    /**
     * This method should print "I'm flapping my: {@code: numWings} wings!"
     * and then return nothing.
     */
    public void flapWings() {
        System.out.println(String.format("I'm flappin my: %s wings!", numWings));
    }
}
