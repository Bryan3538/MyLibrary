package MyLibrary;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * Reads a Library Object from file.
 * @author Bryan Fulton
 */
public class LibraryReader {
 
    private static BufferedReader in = null;


    /**
     * Creates a new Library Object containing all of the Books saved to file.
     * @return A populated Library Object.
     * @see InputValidator
     */
    public static Library read() {
        Library lib = new Library();
        String title, author, publisher, publicationDate, isbn, description;
        LibraryConstants type;
        
        try {
            in = new BufferedReader(new FileReader("Library.txt"));
            
            while(true) {
                title = InputValidator.getString(in);
                author = InputValidator.getString(in);
                publisher = InputValidator.getString(in);
                publicationDate = InputValidator.getString(in);
                isbn = InputValidator.getString(in);
                description = InputValidator.getString(in);
                type = InputValidator.getType(in);
                lib.add(title, author, publisher, publicationDate,
                        isbn, description, type);
            }
        } catch (FileNotFoundException e) {
            lib = null;
        } catch (EOFException e) {
            //let it drop down and close the file
        }catch (IOException e) {
            lib = null;
        }
        try {
            if (in != null) {
                in.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error in closing file!");
            System.exit(0);
        }
        return lib;
    }
}