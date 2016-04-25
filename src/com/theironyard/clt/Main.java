package com.theironyard.clt;

public class Main extends Object {
    /**
     * This main method should perform a variety of actions:
     * <ol>
     *     <li>Assign a variable of type `Animal` a new `Bird`</li>
     *     <li>Set a new number of legs for the bird.</li>
     *     <li>Call `flapWings()` on the bird object.</li>
     * </ol>
     *
     * @param args: The parameters from the command line
     */
    public static void main(String[] args) {
        Animal bird = new Bird(2, 2);

        bird.setNumLegs(3);

        bird.setNumArms(2);
        ((Bird)bird).flapWings();
    }
}

