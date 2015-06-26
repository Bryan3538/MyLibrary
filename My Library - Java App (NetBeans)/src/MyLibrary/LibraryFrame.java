package MyLibrary;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.ArrayList;

/**
 * The main interface container for the Library's interface.
 * @author Bryan Fulton
 */
public class LibraryFrame extends javax.swing.JFrame {

    private Library lib;
    private BrowsePanel browse;
    private AddPanel add;
    private InfoPanel info;
    private CardLayout cards;
    
    /**
     * Creates new form LibraryFrame
     */
    public LibraryFrame() {
        initComponents();
        cards = (CardLayout) mainPanel.getLayout();
        addPanels();
        loadLibrary();
        pack();
        centerWindow(this);
    }
    
    /**
     * Centers the LibraryFrame
     * @param w The window to be centered.
     */
    private void centerWindow(Window w){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width - w.getWidth())/2, (d.height-w.getHeight())/ 2);
    }
    
    /**
     * Adds all of the required panels to the frame's mainPanel.
     */
    private void addPanels() {
        browse = new BrowsePanel(this);
        mainPanel.add(browse, LibraryConstants.BROWSE.toString());
        add = new AddPanel(this);
        mainPanel.add(add, LibraryConstants.ADD.toString());
        info = new InfoPanel(this);
        mainPanel.add(info, LibraryConstants.INFO.toString());
    }
    
    /**
     * Refreshes the lists of the BrowsePanel
     */
    public void refreshLists() {
        ArrayList<String> titles = new ArrayList<String>();
        ArrayList<String> authors = new ArrayList<String>();
        lib.sort();
        titles = lib.getTitles();
        authors = lib.getAuthors();
        browse.loadLists(titles, authors);
    }
    
    /**
     * Loads the Library Object from a file.
     */
    private void loadLibrary() {
        lib = Library.getLibrary();

        if (lib == null) {
            lib = new Library();
            lib.save();
        }
        refreshLists();
    }
    
    /**
     * Changes which Panel is being viewed.
     * @param c A LibraryConstants Object representing which Panel to show.
     */
    public void showPanel(LibraryConstants c) {
        cards.show(mainPanel, c.toString());
    }
    
    /**
     * Adds a new Book to the LibraryFrame's Library Object.
     * @param title
     * @param author
     * @param publisher
     * @param publicationDate
     * @param isbn
     * @param description
     * @param type 
     */
    public void addNewBook(String title, String author, String publisher,
            String publicationDate, String isbn, String description,
            LibraryConstants type) {
        
        lib.add(title, author, publisher, publicationDate,
                        isbn, description, type);
        refreshLists();
    }
    
    /**
     * Retrieves Book information from the LibraryFrame's Library.
     * @param index The index to specify which Book is requested.
     * @return A String representation of the Book requested.
     */
    public String getBookData(int index) {
        return lib.getBookData(index);
    }
    
    /**
     * Find a Book based upon a key within the LibraryFrame's Library.
     * @param key The key to be used for searching.
     * @return The index of the specified book or -1 if it was not found.
     */
    public int findBook(String key) {
        return lib.search(key);
    }
    
    /**
     * Removes a Book from the LibraryFrame's Library. To be used in combination
     * with BrowsePanel's removal validation.
     * @param index The index to specify which Book is to be removed.
     */
    public void removeBook(int index) {
        lib.removeBook(index);
        refreshLists();
    }
    
    /**
     * Removes the currently selected Book. To be used as a stand alone method
     * that does not prompt before removal. Should only be used when modifying
     * an already existing Book.
     */
    public void removeCurrent() {
        int index = browse.getCurIndex();
        if (index >= 0) {
            lib.removeBook(browse.getCurIndex());
            refreshLists();
        }

    }
    
    /**
     * Displays the AddPanel and populates it with a Book's information to be modified.
     * @param data An array containing all of a Book's information.
     */
    public void modify(String[] data) {
        add.modify(data);
        showPanel(LibraryConstants.ADD);
    }

    /**
     * Retrieves a specified Book's type.
     * @param index The number to specify which Book's type is being requested.
     * @return A LibraryConstants object representing the Book's type.
     */
    public LibraryConstants getType(int index) {
        return lib.getType(index);
    }
    
    /**
     * Displays the InfoPanel and populates it with a Book's information.
     * @param data A String representation of the Book to be viewed.
     */
    public void showInfo(String data) {
        info.displayData(data);
        showPanel(LibraryConstants.INFO);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        addBookMenuItem = new javax.swing.JMenuItem();
        browseBooksMenuItem = new javax.swing.JMenuItem();
        toolsMenu = new javax.swing.JMenu();
        searchMenuItem = new javax.swing.JMenuItem();
        randomReadMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Library");
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        mainPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(mainPanel);

        fileMenu.setText("File");

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Features");

        addBookMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        addBookMenuItem.setText("Add Book");
        addBookMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(addBookMenuItem);

        browseBooksMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        browseBooksMenuItem.setText("Browse Books");
        browseBooksMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBooksMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(browseBooksMenuItem);

        jMenuBar1.add(editMenu);

        toolsMenu.setText("Tools");

        searchMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        searchMenuItem.setText("Search...");
        searchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(searchMenuItem);

        randomReadMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        randomReadMenuItem.setText("Random Read...");
        randomReadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomReadMenuItemActionPerformed(evt);
            }
        });
        toolsMenu.add(randomReadMenuItem);

        jMenuBar1.add(toolsMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Displays the AddPanel
     * @param evt 
     */
    private void addBookMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookMenuItemActionPerformed
        showPanel(LibraryConstants.ADD);
    }//GEN-LAST:event_addBookMenuItemActionPerformed

    /**
     * Exits the program.
     * @see saveAndExit()
     * @param evt 
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        saveAndExit();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * Safely exits the program when a user clicks the Frame's default close button.
     * @param evt 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        saveAndExit();
    }//GEN-LAST:event_formWindowClosing

    /**
     * Saves the Library when the user selects the Menu Item to do so.
     * @param evt 
     */
    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        lib.save();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    /**
     * Displays the Browse Panel and calls its searchLibrary() method when the user
     * selects the search option from the Menu.
     * @see BrowsePanel.searchLibrary()
     * @param evt 
     */
    private void searchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenuItemActionPerformed
        showPanel(LibraryConstants.BROWSE);
        browse.searchLibrary();
    }//GEN-LAST:event_searchMenuItemActionPerformed

    /**
     * Displays the BrowsePanel.
     * @param evt 
     */
    private void browseBooksMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBooksMenuItemActionPerformed
        showPanel(LibraryConstants.BROWSE);
    }//GEN-LAST:event_browseBooksMenuItemActionPerformed

    /**
     * Calls BrowsePanel's randomRead() method when the user selects it from
     * the program's Menu.
     * @param evt 
     */
    private void randomReadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomReadMenuItemActionPerformed
        browse.randomRead();
    }//GEN-LAST:event_randomReadMenuItemActionPerformed
    
    /**
     * Saves the Library and safely exits the application.
     */
    public void saveAndExit() {
        lib.save();
        System.exit(0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new LibraryFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addBookMenuItem;
    private javax.swing.JMenuItem browseBooksMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem randomReadMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem searchMenuItem;
    private javax.swing.JMenu toolsMenu;
    // End of variables declaration//GEN-END:variables
}
