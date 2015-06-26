package MyLibrary;

import java.util.ArrayList;
import java.util.Collections;

/**
 * An Object representing a Library full of Books.
 * @author Bryan Fulton
 */
public class Library {
    
    /**
     * The internal list of books contained within the Library
     */
    private ArrayList<Book> list = new ArrayList<Book>();
    /**
     * The sort and search type of the Library
     */
    static LibraryConstants sortAndSearchType = LibraryConstants.BY_TITLE;
    
    /**
     * Read the Library contained within the Library file.
     * @return A library object read from the root folder 
     */
    public static Library getLibrary() {
        return LibraryReader.read();
    }
    
    /**
     * Sorts the Library's book list
     */
    public void sort() {
        Collections.sort(list);
    }
    
    /**
     * Add a Book to the Library with the specified information.
     * @param title
     * @param author
     * @param publisher
     * @param publicationDate
     * @param isbn
     * @param description
     */
    public void add(String title, String author, String publisher,
            String publicationDate, String isbn, String description,
            LibraryConstants type) {
            Book b = new Book(title, author, publisher, publicationDate,
                    isbn, description, type);
            list.add(b);
    }
    
    /**
     * Add the specified Book to the Library.
     * @param book An already existing Book object.
     */
    public void add(Book book) {
        list.add(book);
    }
    
    /**
     * Retrieve a String containing all Book data.
     * @return String representation of Book Object
     */
    public String getBookData(int index) {
        return list.get(index).toString();
    }
    
    /**
     * Search the Library.
     * @param key A title or author value to be searched for.
     * @return The index of the Book Object being searched for.
     */
    public int search(String key) {
        Book keyBook = new Book();
        int result = -1;
        keyBook.setTitle(key);
        keyBook.setAuthor(key);
        
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(keyBook) == 0) {
                return i;
            } else if (list.get(i).compareTo(keyBook) ==  Book.PARTIAL) {
                result = i;
            }
        }
        return result;
    }
    
    /**
     * Saves the Library to a file.
     */
    public void save() {
        list.trimToSize();
        LibraryWriter.write(list);
    }
    
    /**
     * Retrieves every title within the Library.
     * @return Array List of titles contained within the Library
     */
    public ArrayList<String> getTitles() {
        ArrayList<String> titlesList = new ArrayList<String>(list.size());
        for (Book book: list) {
            titlesList.add(book.getTitle());
        }
        
        titlesList.trimToSize();
        
        if (titlesList.isEmpty()) {
            titlesList.add("The Library is empty!");
        }
        
        return titlesList;
    }
    
    /**
     * Retrieves every author within the Library.
     * @return ArrayList of authors contained within the Library
     */
    public ArrayList<String> getAuthors() {
        ArrayList<String> authorsList = new ArrayList<String>(list.size());
        
        for (Book book: list) {
            authorsList.add(book.getAuthor());
        }
        
        authorsList.trimToSize();
        
        if (authorsList.isEmpty()) {
            authorsList.add("The Library is empty!");
        }
        return authorsList;
    }

    public void removeBook(int index) {
        list.remove(index);
    }

    
    /**
     * Find out whether or not the Library is currently empty.
     * @return Whether or not library is empty
     */
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } 
        return false;
    }
    
    /**
     * Get the type of the specified Book.
     * @param index The index of a specified Book
     * @return A LibraryConstants representing a Book type.
     */
    public LibraryConstants getType(int index) {
        return list.get(index).getType();
    }
}
