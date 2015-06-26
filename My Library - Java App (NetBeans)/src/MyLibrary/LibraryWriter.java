package MyLibrary;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 * Writes a Library's Books to file.
 * @author Bryan Fulton
 */
public class LibraryWriter implements Runnable {
    ArrayList<Book> list;
    
    /**
     * Creates a new LibraryWriter object
     * @param list A List of Books to be written.
     */
    private LibraryWriter(ArrayList<Book> list) {
        this.list = list;
    }
    
    /**
     * The method to be called for writing a Library to file.
     * @param list A List of Books to be written.
     */
    public static void write(ArrayList<Book> list) {
        Thread writer = new Thread(new LibraryWriter(list));
        writer.start();
    }

    /**
     * Runs the LibraryWriter thread.
     * This method should not be called explicitly.
     * To write a Library to file, call the write method.
     */
    @Override
    public void run() {
        PrintWriter out = null;
        StringTokenizer tokens;
        File libFile = new File("Library.txt");
        
        try {
            out = new PrintWriter(
                    new BufferedWriter(
                    new FileWriter(libFile)));
            
            for (Book book: list) {
                tokens = new StringTokenizer(book.toString(), "<>");
                while(tokens.hasMoreTokens()) {
                    out.println(tokens.nextToken());
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Your Library failed to save.",
                    "Library Save Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        
        if (out != null) {
                out.close(); 
        }
        
        JOptionPane.showMessageDialog(null, "Your Library has been saved.",
                "Library Save Success", JOptionPane.INFORMATION_MESSAGE);
    }
}