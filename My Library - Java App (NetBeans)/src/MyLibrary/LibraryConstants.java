package MyLibrary;

/**
 * A class containing many useful constants for working with a Library.
 * @author Bryan Fulton
 */
public enum LibraryConstants {
    /**
     * Specified a search or sort type.
     */
    BY_AUTHOR("Search or sort by author."),
    /**
     * Specifies a search or sort type.
     */
    BY_TITLE("Search or sort by title."),
    /**
     * Specifies a specific screen of the Library interface.
     */
    BROWSE("browse"),
     /**
     * Specifies a specific screen of the Library interface.
     */
    ADD("add"),
    /**
     * Specifies a specific screen of the Library interface.
     */
    INFO("info"),
    /**
     * Constant to represent an Unknown field within a Book's data.
     */
    UNKNOWN("Unknown"),
    /**
     * Represents the Book type Fiction.
     */
    FICTION("Fiction"),
    /**
     * Represents the Book type Non-Fiction.
     */
    NONFICTION("Non-Fiction");
    
    private String message;
    
    /**
     * Instantiates a LibraryConstants Object
     * @param message The String representation of the new Object.
     */
    LibraryConstants(String message) {
        this.message = message;
    }
    
    /**
     * A String representation of the LibraryConstants Object.
     * @return The Objects String representation.
     */
    @Override
    public String toString() {
        return message;
    }
}