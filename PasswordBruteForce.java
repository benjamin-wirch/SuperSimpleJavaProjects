///////////////////////////////////////////////////////////////////////////////
// Title: PasswordBruteForce.java

// Author: Benjamin Wirch
// Email: bwirch@wisc.edu
//
///////////////////////////////////////////////////////////////////////////////

/**
 * Password guesser class that will scan through ASCII 20-126 until it gets the
 * correct phrase.
 */
public class PasswordBruteForce {
    public static void main(String[] args) {
        // Change this String to your secret phrase
        String secretString = "P@ssword?!@#";
        char guessChar = ' ';
        String currGuess = "";
        // Iterates through secretString until the entire phrase has been solved.
        for (int i = 0; i < secretString.length(); i++) {
            while (secretString.charAt(i) != guessChar) {
                System.out.println("" + currGuess + guessChar);
                if (guessChar < 127) {
                    guessChar++;
                } else {
                    throw new IllegalArgumentException("Invalid Character");
                }
            }
            currGuess += guessChar;
            // Resets back to ASCII char 20 (SPACE)
            guessChar = ' ';
        }
        System.out.println(currGuess + " is the secret phrase!");
    }
}