package MyLibrary;

import java.io.Serializable;

/**
 * An Object that represents a Book.
 * @author Bryan Fulton
 */
public class Book implements Comparable {
    private String title;
    private String author;
    private String publisher;
    private String publicationDate;
    private String isbn;
    private String description;
    private LibraryConstants type;
    public static final int PARTIAL = 500;
    
    /**
     * Sets all Book variables to Unknown
     */
    public Book() {
        title = LibraryConstants.UNKNOWN.toString();
        author = LibraryConstants.UNKNOWN.toString();
        publisher = LibraryConstants.UNKNOWN.toString();
        publicationDate = LibraryConstants.UNKNOWN.toString();
        isbn = LibraryConstants.UNKNOWN.toString();
        description = LibraryConstants.UNKNOWN.toString();
        type = LibraryConstants.FICTION;
        
    }
    
    /**
     * Creates a new Book object with the specified parameters.
     * @param title
     * @param author
     * @param publisher
     * @param publicationDate
     * @param isbn
     * @param description
     * @param type 
     */
    public Book(String title, String author, String publisher,
            String publicationDate, String isbn, String description,
            LibraryConstants type) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.isbn = isbn;
        this.description = description;
        this.type = type;
    }
    
    /**
     * Compares two Book objects. For use in searching and sorting.
     * The Comparison is made based on the search and sort type of the Library
     * that the Books are being held in.
     * @param o The Object to be compared to.
     * @return 0 if equal, -1 if less than, 1 if greater than.
     */
    @Override
    public int compareTo(Object o) {
        Book temp = (Book) o;
        int compared = 0;
        String base = "";
        String target = "";
        if (Library.sortAndSearchType == LibraryConstants.BY_TITLE) {
            base = this.title.toUpperCase();
            target = temp.title.toUpperCase();
        } else {
            base = this.author.toUpperCase();
            target = temp.author.toUpperCase();
        }

        if (base.compareTo(target) == 0) {
            compared = 0;
        } else if (base.contains(target)) {
            compared = PARTIAL;
        } else {
            compared = base.toUpperCase().compareTo(target.toUpperCase());
        }
        return compared;
    }
    
    /**
     * Converts a Book to a String representation.
     * @return A String containing all Book information separated by "<>".
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(title);
        builder.append("<>");
        builder.append(author);
        builder.append("<>");
        builder.append(publisher);
        builder.append("<>");
        builder.append(publicationDate);
        builder.append("<>");
        builder.append(isbn);
        builder.append("<>");
        builder.append(description);
        builder.append("<>");
        builder.append(type);
        
        return builder.toString();
    }

    /**
     * Retrieves the Book's title.
     * @return The Book's title as a String.
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Retrieves the Book's author.
     * @return The Book's author as a String.
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * Change the Book's title.
     * @param title The new title to be used.
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Change the Book's author.
     * @param author The new author to be used.
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    
    /**
     * Retrieves the Book's type.
     * @return The Book's type as a LibraryConstants.
     */
    public LibraryConstants getType() {
        return type;
    }
}