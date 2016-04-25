package com.theironyard.clt;

/**
 * The animal class serves as the base class for all animals.
 * It has a variety of protected fields:
 * <ul>
 *     <li>hasVertebra: true or false</li>
 *     <li>numLegs: any whole number</li>
 *     <li>numArms: any whole number</li>
 * </ul>
 *
 * Each of these fields needs to be protected, with public getters and setters.
 */
public class Animal extends Object {
    protected boolean hasVertebra;
    protected int numLegs;
    protected int numArms;

    public boolean getHasVertebra() {
        return hasVertebra;
    }

    public void setHasVertebra(Boolean hasVertebra) {
        this.hasVertebra = hasVertebra;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getNumArms() {
        return numArms;
    }

    public void setNumArms(int numArms) {
        this.numArms = numArms;
    }
}
