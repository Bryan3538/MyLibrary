package MyLibrary;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 * Validates input for the various MyLibrary classes.
 * @author Bryan Fulton
 */
public class InputValidator {
    
    /**
     * Retrieves and validates a String from a JTextComponent.
     * @param field The JTextComponent to be read.
     * @return The String in the JTextComponent if valid; Unknown otherwise.
     */
    public static String getString(JTextComponent field) {
        if (field.getText().isEmpty()) {
            field.setText(LibraryConstants.UNKNOWN.toString());
            return LibraryConstants.UNKNOWN.toString();
        } else {
            return field.getText();
        }
    }
    
    /**
     * Retrieves and validates a String from a BufferedReader object.
     * @param in The BufferedReader to be used.
     * @return The String extracted from the BufferedReader.
     * @throws EOFException Thrown if the BufferedReader returns null.
     * @throws IOException 
     */
    public static String getString(BufferedReader in) 
                throws EOFException, IOException {
        String input = in.readLine();
        if (input == null || input.equals("null")) {
            throw new EOFException();
        } else {
            return input;
        }     
    }
    
    /**
     * Reads a String with a BufferedReader and returns an appropriate
     * LibraryConstants Object.
     * @param in The BufferedReader Object to be used.
     * @return A LibraryConstants Object based upon what String is read.
     * @throws EOFException Thrown if the BufferedReader returns null.
     * @throws IOException 
     */
    public static LibraryConstants getType(BufferedReader in) 
            throws EOFException, IOException {
        String input = getString(in);
        
        if (input.equals(LibraryConstants.NONFICTION.toString())) {
            return LibraryConstants.NONFICTION;
        } else {
            return LibraryConstants.FICTION;
        }
    }
    
    /**
     * Retrieves and validates a String representing a year from a JTextComponent.
     * @param field The JTextCompnent object to be read.
     * @return The year contained within the JTextComponent if it was valid,
     * Unknown otherwise.
     */
    public static String getYear(JTextComponent field) {
        String input = getString(field);
        String year = LibraryConstants.UNKNOWN.toString();
        
        if (isInteger(input) || 
                LibraryConstants.UNKNOWN.toString().equals(input)) {
            year = input;
        } else {
            String newInput = JOptionPane.showInputDialog(null, 
                    "The date must be a number. " +
                    "Please enter a new date or leave the field blank " +
                    "to set the date field to unknown", "Date input error", 
                    JOptionPane.OK_OPTION);
            if (newInput == null) {
                year = LibraryConstants.UNKNOWN.toString();
            } else {
                field.setText(newInput);
                getYear(field);
            }
        }
        return year;
    }
        
    /**
     * Checks if a String is numeric.
     * @param str The String to be checked.
     * @return true if numeric, false otherwise.
     */
    private static boolean isInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
