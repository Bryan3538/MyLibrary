package MyLibrary;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 * The panel used for adding books to the Library through the interface.
 * @author Bryan Fulton
 */
public class AddPanel extends javax.swing.JPanel {

    private LibraryFrame frame;
    private String title, author, publisher, isbn, description, publicationDate;
    private LibraryConstants type = LibraryConstants.FICTION;
    boolean modify = false;
    String modifyText = "<html>S<u>a</u>ve Changes";
    String addText = "<html>A<u>d</u>d";
    String modifyInstruction = "Modify the following fields as you wish, then " +
            "click the \"Modify\" button.";
    String addInstruction = "Fill out the following fields and click the " +
                "\"Add\" button. Any field left blank, other than title, " +
                "will be set to Unknown.";

    /**
     * Creates a new AddPanel object
     * @param frame Requires reference to the frame which holds it.
     */
    public AddPanel(LibraryFrame frame) {
        initComponents();
        this.frame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        typeButtonGroup = new javax.swing.ButtonGroup();
        fieldsPanel = new javax.swing.JPanel();
        instructionLabel = new javax.swing.JLabel();
        titleLabel1 = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        publisherLabel = new javax.swing.JLabel();
        publicationYearLabel = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        publicationYearTextField = new javax.swing.JTextField();
        publisherTextField = new javax.swing.JTextField();
        titleTextField = new javax.swing.JTextField();
        isbnTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        authorTextField = new javax.swing.JTextField();
        addButtonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        cancelAddButton = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        fictionRadioButton = new javax.swing.JRadioButton();
        nonfictionRadioButton = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(847, 358));
        setLayout(new java.awt.GridBagLayout());

        fieldsPanel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fieldsPanel.setLayout(new java.awt.GridBagLayout());

        instructionLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        instructionLabel.setText("Fill out the following fields and click the \"Add\" button. Any field left blank, other than title, will be set to Unknown.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        fieldsPanel.add(instructionLabel, gridBagConstraints);

        titleLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        titleLabel1.setText("Title:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        fieldsPanel.add(titleLabel1, gridBagConstraints);

        authorLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        authorLabel.setText("Author:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        fieldsPanel.add(authorLabel, gridBagConstraints);

        publisherLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        publisherLabel.setText("Publisher:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        fieldsPanel.add(publisherLabel, gridBagConstraints);

        publicationYearLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        publicationYearLabel.setText("Publication Year:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        fieldsPanel.add(publicationYearLabel, gridBagConstraints);

        isbnLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        isbnLabel.setText("ISBN:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        fieldsPanel.add(isbnLabel, gridBagConstraints);

        descriptionLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        descriptionLabel.setText("Description:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        fieldsPanel.add(descriptionLabel, gridBagConstraints);

        publicationYearTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fields[3] = publicationYearTextField;
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 577;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        fieldsPanel.add(publicationYearTextField, gridBagConstraints);

        publisherTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fields[2] = publisherTextField;
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 578;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        fieldsPanel.add(publisherTextField, gridBagConstraints);

        titleTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fields[0] = titleTextField;
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 578;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        fieldsPanel.add(titleTextField, gridBagConstraints);

        isbnTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fields[4] = isbnTextField;
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 577;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 1);
        fieldsPanel.add(isbnTextField, gridBagConstraints);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setWrapStyleWord(true);
        fields[5] = descriptionTextArea;
        jScrollPane1.setViewportView(descriptionTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 560;
        gridBagConstraints.ipady = 81;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 11, 3);
        fieldsPanel.add(jScrollPane1, gridBagConstraints);

        authorTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fields[1] = authorTextField;
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 578;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        fieldsPanel.add(authorTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        add(fieldsPanel, gridBagConstraints);

        addButtonPanel.setLayout(new java.awt.GridLayout(2, 0));

        addButton.setMnemonic(KeyEvent.VK_A);
        addButton.setText("<html>A<u>d</u>d");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addButtonPanel.add(addButton);

        cancelAddButton.setMnemonic(KeyEvent.VK_C);
        cancelAddButton.setText("<html><u>C</u>ancel");
        cancelAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddButtonActionPerformed(evt);
            }
        });
        addButtonPanel.add(cancelAddButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(104, 15, 11, 0);
        add(addButtonPanel, gridBagConstraints);

        typeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeLabel.setText("Book Type: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 15, 0, 0);
        add(typeLabel, gridBagConstraints);

        typeButtonGroup.add(fictionRadioButton);
        fictionRadioButton.setSelected(true);
        fictionRadioButton.setText("Fiction");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 3);
        add(fictionRadioButton, gridBagConstraints);

        typeButtonGroup.add(nonfictionRadioButton);
        nonfictionRadioButton.setText("Non-Fiction");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 1);
        add(nonfictionRadioButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Adds the specified Book to the Library.
     * @param evt 
     */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        boolean isValid = true;

        title = InputValidator.getString(titleTextField);
        author = InputValidator.getString(authorTextField);
        publisher = InputValidator.getString(publisherTextField);
        publicationDate = InputValidator.getYear(publicationYearTextField);
        isbn = InputValidator.getString(isbnTextField);
        description = InputValidator.getString(descriptionTextArea);

        if (nonfictionRadioButton.isSelected()) {
            type = LibraryConstants.NONFICTION;
        } else {
            type = LibraryConstants.FICTION;
        }

        if (title.equals(LibraryConstants.UNKNOWN.toString())) {
            JOptionPane.showMessageDialog(null, "Please enter a title!",
                    "", JOptionPane.WARNING_MESSAGE);
            isValid = false;
        } else {
            if (!modify) {
                //Only check if the book exists if you are not modifying a Book.
                //This is because the modify process deletes and recreates the Book.
                //At this stage the original still exists.
                if (bookExists()) {
                    isValid = false;
                }
            }
            
            if (!isbn.matches("\\d{10}") && !isbn.matches(
                "\\d{13}") && !LibraryConstants.UNKNOWN.toString().equals(
                isbn)) {
            JOptionPane.showMessageDialog(null, "ISBN numbers must be"
                    + " numeric and be either 10 or 13 digits long!"
                    + "\nFor this application, do not include any hyphens"
                    + " or other special characters.", "ISBN Entry Error!",
                    JOptionPane.ERROR_MESSAGE);
            isValid = false;
            isbnTextField.selectAll();
            }   
        } 
            
        if (isValid) {
            if (modify) { //When done modifying, revert all changes made to the Panel
                addButton.setText(addText);
                instructionLabel.setText(addInstruction);
                modify = false;
                frame.removeCurrent();
            }
            frame.addNewBook(title, author, publisher, publicationDate,
                    isbn, description, type);
            clear();
            frame.showPanel(LibraryConstants.BROWSE);
        }

    }//GEN-LAST:event_addButtonActionPerformed

    /**
     * Checks if the Book being created is already in the Library
     * @return True if the Book exists within the Library, false otherwise.
     */
    private boolean bookExists() {
        boolean exists = false;
        LibraryConstants old = Library.sortAndSearchType;
        Library.sortAndSearchType = LibraryConstants.BY_TITLE;

        if (frame.findBook(title) >= 0) {
            int choice = JOptionPane.showConfirmDialog(null,
                    "A book with the same Title already exists in "
                    + "your library! \nDo you wish to add anyways?",
                    "", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            //Only return true if the user does not want to add another Book
            //with an already existing title.
            if (choice == JOptionPane.NO_OPTION
                    || choice == JOptionPane.CANCEL_OPTION) {
                exists = true;
            }
        }
        Library.sortAndSearchType = old;
        return exists;
    }

    /**
     * Loads data into the Panel to allow modification of a Book object.
     * @param data All major data held on a Book.
     */
    public void modify(String[] data) {
        modify = true;
        addButton.setText(modifyText);
        instructionLabel.setText(modifyInstruction);

        for (int i = 0; i < fields.length; i++) {
            fields[i].setText(data[i]);
        }

        if (data[data.length - 1].equals(
                LibraryConstants.NONFICTION.toString())) {
            nonfictionRadioButton.setSelected(true);
        } else {
            fictionRadioButton.setSelected(true);
        }
    }

    /**
     * Cancels the Book adding process, clears all fields, and resets the screen
     * back to the BrowsePanel.
     * @param evt 
     */
    private void cancelAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAddButtonActionPerformed
        if (modify) {
            addButton.setText(addText);
            instructionLabel.setText(addInstruction);
            modify = false;
        }
        clear();
        frame.showPanel(LibraryConstants.BROWSE);
    }//GEN-LAST:event_cancelAddButtonActionPerformed
    /**
     * Clears all of the fields in the AddPanel.
     */
    private void clear() {
        for (JTextComponent comp : fields) {
            comp.setText("");
        }
        fictionRadioButton.setSelected(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addButtonPanel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JButton cancelAddButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JRadioButton fictionRadioButton;
    private javax.swing.JPanel fieldsPanel;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton nonfictionRadioButton;
    private javax.swing.JLabel publicationYearLabel;
    private javax.swing.JTextField publicationYearTextField;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JTextField publisherTextField;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JTextField titleTextField;
    private javax.swing.ButtonGroup typeButtonGroup;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
    /**
     * An array containing all of the TextFields and TextAreas on the AddPanel.
     */
    private JTextComponent[] fields = new JTextComponent[6];
}