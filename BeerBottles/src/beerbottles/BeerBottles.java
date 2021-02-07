package beerbottles;

public class BeerBottles {

    public static void main(String[] args) {

        // instance variables
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) { // condition to enter loop

            if (beerNum == 1) { // run when 1 bottle left, at end of loop
                word = "bottle";  // singular, as in ONE bottle

            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1; // counts down from 99 to 1

            if (beerNum > 0) { // run at very end, when no more bottles left
                System.out.println(beerNum + " " + word + " of beer on the wall");

            } else {
                System.out.println("No more bottles of beer on the wall");
            } // end else
        } // end while loop

    } // end main method

} // end class
