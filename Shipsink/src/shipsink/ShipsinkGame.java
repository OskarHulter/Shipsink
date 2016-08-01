/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipsink;

/**
 *
 * @author Stresslessness
 */
public class ShipsinkGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        
        Shipsink theShipsink = new Shipsink();
        
        int randomNum = (int) (Math.random() * 5);
        
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theShipsink.setLocationCells(locations);
        boolean isAlive = true;
        
        while(isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theShipsink.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
