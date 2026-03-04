import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

// ============================================================
// AnimalShowcaseGUI
// A graphical user interface (Swing) that lets users browse a
// collection of Animal objects and view all of their details,
// including any interface-specific capabilities (Swimmable,
// Flyable, Predator, Pettable).
//
// LAYOUT (BorderLayout on the JFrame):
// NORTH – header bar with the app title
// WEST – dark sidebar containing the animal list
// CENTER – scrollable HTML details pane
// SOUTH – row of action buttons (Fact, Sound, Eat, Move)
// ============================================================
public class AnimalShowcaseGUI {

    // ------------------------------------------------------
    // COLOR PALETTE
    // These static constants define every color used in the UI
    // so the theme can be changed in one place.
    // Color(r, g, b) creates a color from red/green/blue values
    // (each 0-255).
    // ------------------------------------------------------
    private static final Color BG_DARK = new Color(45, 52, 64); // header background
    private static final Color BG_LIST = new Color(59, 66, 82); // sidebar / list background
    private static final Color BG_CONTENT = new Color(246, 248, 250); // details pane background
    private static final Color ACCENT = new Color(94, 129, 172); // button color
    private static final Color ACCENT_HOVER = new Color(129, 161, 193);// button hover color
    private static final Color TEXT_LIGHT = new Color(236, 239, 244); // light text on dark bg
    private static final Color TEXT_DIM = new Color(180, 190, 205); // dimmed/secondary text
    private static final Color SELECTION = new Color(76, 86, 106); // selected list item bg

    // INSTANCE VARIABLES
    private JFrame frame; // the main application window
    private JList<Animal> animalList; // the clickable list of animals in the sidebar
    private DefaultListModel<Animal> listModel; // data model backing the JList
    private JEditorPane detailsPane; // HTML-capable pane that shows animal info
    private JPanel buttonPanel; // bottom panel holding the action buttons
    private List<Animal> animals; // master list of all Animal objects
    private Animal selectedAnimal; // whichever animal the user currently has selected

    // CONSTRUCTOR – builds the entire GUI
    public AnimalShowcaseGUI() {
        // Create the Animal objects and store them in a list.
        // Each concrete class (Axolotl, Pangolin, Eagle) extends
        // Animal and may implement one or more interfaces.
        animals = new ArrayList<>();
        animals.add(new MenelausBlueMorpho());

        // Try to use the operating system's native look-and-feel
        // so the window blends in with other apps on the user's computer.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }

        // Create the main window (JFrame) and configure it.
        frame = new JFrame("Animal Show and Tell");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close app when window closes
        frame.setSize(880, 580); // initial width x height in pixels
        frame.setMinimumSize(new Dimension(700, 450)); // prevent the window from getting too small
        frame.setLocationRelativeTo(null); // center window on screen
        frame.setLayout(new BorderLayout()); // use BorderLayout (NORTH/SOUTH/EAST/WEST/CENTER)

        // Add the four main panels to the frame.
        // Each helper method below creates and returns a fully-configured panel.
        frame.add(createHeaderPanel(), BorderLayout.NORTH);
        frame.add(createSidebarPanel(), BorderLayout.WEST);
        frame.add(createDetailsPanel(), BorderLayout.CENTER);
        frame.add(createButtonPanel(), BorderLayout.SOUTH);

        // Make the window visible (must be done after all components are added).
        frame.setVisible(true);
    }

    // ------------------------------------------------------
    // createHeaderPanel()
    // Builds the dark banner at the top of the window with a
    // title and a short subtitle.
    // ------------------------------------------------------
    private JPanel createHeaderPanel() {
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(BG_DARK);
        // EmptyBorder adds padding: top, left, bottom, right (in pixels)
        header.setBorder(new EmptyBorder(14, 20, 14, 20));

        // Title label – large bold text
        JLabel title = new JLabel("Animal Show and Tell");
        title.setFont(new Font("SansSerif", Font.BOLD, 22));
        title.setForeground(TEXT_LIGHT);

        // Subtitle label – smaller, dimmer text
        JLabel subtitle = new JLabel("Select an animal to explore");
        subtitle.setFont(new Font("SansSerif", Font.PLAIN, 13));
        subtitle.setForeground(TEXT_DIM);

        // Stack the title and subtitle vertically using a BoxLayout
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setOpaque(false); // transparent so the header's dark background shows through
        textPanel.add(title);
        textPanel.add(Box.createVerticalStrut(2)); // 2-pixel vertical spacer
        textPanel.add(subtitle);

        header.add(textPanel, BorderLayout.WEST);
        return header;
    }

    // --------------------------------------------------------
    // createSidebarPanel()
    // Builds the dark left panel that contains:
    // 1. A small "ANIMALS" label at the top
    // 2. A JList of Animal objects with a custom renderer
    // (AnimalListRenderer) that displays the scientific name.
    //
    // When the user clicks an item, a ListSelectionListener
    // fires and updates the details pane.
    // --------------------------------------------------------
    private JPanel createSidebarPanel() {
        JPanel sidebar = new JPanel(new BorderLayout());
        sidebar.setPreferredSize(new Dimension(210, 0)); // fixed width, height stretches
        sidebar.setBackground(BG_LIST);

        // Small category label at the top of the sidebar
        JLabel listLabel = new JLabel("  ANIMALS");
        listLabel.setFont(new Font("SansSerif", Font.BOLD, 11));
        listLabel.setForeground(TEXT_DIM);
        listLabel.setBorder(new EmptyBorder(12, 10, 6, 0));
        listLabel.setOpaque(true);
        listLabel.setBackground(BG_LIST);

        // Populate the list model with every Animal in our collection.
        // DefaultListModel is the data structure that JList reads from.
        listModel = new DefaultListModel<>();
        for (Animal animal : animals) {
            listModel.addElement(animal);
        }

        // Create the JList and style it to match the dark sidebar.
        animalList = new JList<>(listModel);
        animalList.setBackground(BG_LIST);
        animalList.setForeground(TEXT_LIGHT);
        animalList.setSelectionBackground(SELECTION);
        animalList.setSelectionForeground(Color.WHITE);
        animalList.setFont(new Font("SansSerif", Font.PLAIN, 15));
        animalList.setFixedCellHeight(44); // each row is 44 pixels tall
        animalList.setBorder(new EmptyBorder(4, 0, 4, 0));
        animalList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Tell the JList to use our custom renderer (defined at the bottom
        // of this file) so each cell shows the animal's scientific name.
        animalList.setCellRenderer(new AnimalListRenderer());

        // Lambda listener: when the user clicks an animal in the list,
        // store it in selectedAnimal and refresh the details pane.
        // getValueIsAdjusting() is true while the mouse is still being
        // pressed; we wait until it is false (mouse released) to respond.
        animalList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                selectedAnimal = animalList.getSelectedValue();
                if (selectedAnimal != null) {
                    displayAnimalDetails(selectedAnimal);
                }
            }
        });

        // Wrap the list in a JScrollPane so it can scroll if there
        // are more animals than fit on screen.
        JScrollPane scrollPane = new JScrollPane(animalList);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getViewport().setBackground(BG_LIST);

        sidebar.add(listLabel, BorderLayout.NORTH);
        sidebar.add(scrollPane, BorderLayout.CENTER);
        return sidebar;
    }

    // --------------------------------------------------------
    // createDetailsPanel()
    // Builds the large center area that displays animal info.
    //
    // We use a JEditorPane (instead of a plain JTextArea) so we
    // can render HTML, which lets us use bold text, colors,
    // headings, and styled badges for each interface capability.
    // --------------------------------------------------------
    private JScrollPane createDetailsPanel() {
        detailsPane = new JEditorPane();
        detailsPane.setContentType("text/html"); // tells Swing to render HTML
        detailsPane.setEditable(false);
        detailsPane.setBackground(BG_CONTENT);
        detailsPane.setBorder(new EmptyBorder(16, 20, 16, 20));
        // HONOR_DISPLAY_PROPERTIES makes the pane respect the font we set
        // rather than using its own default HTML font.
        detailsPane.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);

        // Show a welcome message until the user picks an animal.
        detailsPane.setText(buildWelcomeHtml());

        JScrollPane scrollPane = new JScrollPane(detailsPane);
        // A thin left border visually separates the sidebar from the details.
        scrollPane.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, new Color(218, 222, 228)));
        scrollPane.getViewport().setBackground(BG_CONTENT);
        return scrollPane;
    }

    // --------------------------------------------------------
    // createButtonPanel()
    // Builds the bottom toolbar with four action buttons.
    //
    // Each button uses an ActionListener (lambda) that checks
    // whether an animal is selected, then either:
    // - appends a styled callout to the details pane, or
    // - also calls the animal's console-printing method.
    // --------------------------------------------------------
    private JPanel createButtonPanel() {
        // GridLayout(rows, cols, hgap, vgap) – one row, four columns, 8px gap
        buttonPanel = new JPanel(new GridLayout(1, 4, 8, 0));
        buttonPanel.setBackground(new Color(235, 238, 242));
        buttonPanel.setBorder(new EmptyBorder(10, 16, 10, 16));

        // Create four styled buttons using the helper method below.
        JButton factButton = makeStyledButton("Random Fact");
        JButton soundButton = makeStyledButton("Make Sound");
        JButton eatButton = makeStyledButton("Eat");
        JButton moveButton = makeStyledButton("Move");

        // Wire up each button's click behavior.
        // appendAction() adds a styled HTML block to the details pane.
        // The console methods (makeSound, eat, move) still print to
        // System.out as well, preserving their original behavior.
        factButton.addActionListener(e -> {
            if (selectedAnimal != null) {
                appendAction("Random Fact", selectedAnimal.getFact());
            }
        });
        soundButton.addActionListener(e -> {
            if (selectedAnimal != null) {
                appendAction("Sound", selectedAnimal.getSoundDescription());
                selectedAnimal.makeSound(); // also prints to console
            }
        });
        eatButton.addActionListener(e -> {
            if (selectedAnimal != null) {
                appendAction("Eating", selectedAnimal.getEatDescription());
                selectedAnimal.eat(); // also prints to console
            }
        });
        moveButton.addActionListener(e -> {
            if (selectedAnimal != null) {
                appendAction("Movement", selectedAnimal.getMoveDescription());
                selectedAnimal.move(); // also prints to console
            }
        });

        buttonPanel.add(factButton);
        buttonPanel.add(soundButton);
        buttonPanel.add(eatButton);
        buttonPanel.add(moveButton);
        return buttonPanel;
    }

    // --------------------------------------------------------
    // makeStyledButton(text)
    // Factory method that creates a single JButton with custom
    // colors, a rounded border, and a hover effect.
    //
    // The hover effect is achieved by adding a MouseListener
    // that changes the background color when the mouse enters
    // or exits the button.
    // --------------------------------------------------------
    private JButton makeStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("SansSerif", Font.BOLD, 13));
        button.setBackground(ACCENT);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false); // removes the dotted focus rectangle
        // CompoundBorder layers two borders: an outer colored LineBorder
        // and an inner EmptyBorder that acts as padding.
        button.setBorder(new CompoundBorder(new LineBorder(ACCENT.darker(), 1, true),
                new EmptyBorder(8, 14, 8, 14)));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // pointer cursor on hover
        button.setOpaque(true); // required on some platforms for background color to show

        // MouseAdapter lets us override only the methods we care about.
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                button.setBackground(ACCENT_HOVER); // lighter shade on hover
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                button.setBackground(ACCENT); // back to normal
            }
        });
        return button;
    }

    // --------------------------------------------------------
    // displayAnimalDetails(animal)
    // Replaces the details pane content with a full HTML page
    // describing the given animal (taxonomy, habitat, interface
    // capabilities, and a random fun fact).
    // --------------------------------------------------------
    private void displayAnimalDetails(Animal animal) {
        detailsPane.setText(buildAnimalHtml(animal));
        detailsPane.setCaretPosition(0); // scroll back to the top
    }

    // --------------------------------------------------------
    // appendAction(label, text)
    // Adds a styled callout block at the bottom of the current
    // HTML content in the details pane (used by the buttons).
    //
    // It finds the </body> tag in the existing HTML and inserts
    // a new <div> just before it, so the page structure stays
    // valid and the new content appears at the end.
    // --------------------------------------------------------
    private void appendAction(String label, String text) {
        String current = detailsPane.getText();
        // Build a styled <div> with a blue left border (callout style).
        String insertion = "<div style='margin:6px 0; padding:8px 12px; "
                + "background:#e8ecf1; border-left:3px solid #5e81ac; font-family:SansSerif; font-size:11pt;'>"
                + "<b>" + label + ":</b> " + text + "</div>";

        // Insert the new block right before the closing </body> tag.
        int bodyEnd = current.lastIndexOf("</body>");
        if (bodyEnd != -1) {
            String updated = current.substring(0, bodyEnd) + insertion + current.substring(bodyEnd);
            detailsPane.setText(updated);
        } else {
            detailsPane.setText(current + insertion);
        }
        // Scroll to the bottom so the user sees the new content.
        detailsPane.setCaretPosition(detailsPane.getDocument().getLength());
    }

    // ============================================================
    // HTML BUILDER METHODS
    // These methods construct HTML strings that are displayed
    // inside the JEditorPane. Swing's HTML renderer supports a
    // subset of HTML 3.2 / CSS 1, so we use inline styles.
    // ============================================================

    // Returns the HTML shown before any animal is selected.
    private String buildWelcomeHtml() {
        return "<html><body style='font-family:SansSerif; color:#4c566a; padding:30px; text-align:center;'>"
                + "<h2 style='color:#2e3440; margin-top:60px;'>Welcome!</h2>"
                + "<p style='font-size:12pt;'>Pick an animal from the list on the left to see its details.</p>"
                + "</body></html>";
    }

    // --------------------------------------------------------
    // buildAnimalHtml(animal)
    // Constructs a full HTML page for the given animal.
    //
    // It always shows taxonomy and habitat. Then it uses
    // instanceof checks to see which interfaces the animal
    // implements and adds a color-coded badge section for each:
    // Swimmable → teal badge with swim speed & depth
    // Flyable → purple badge with flight speed & altitude
    // Predator → red badge with prey info
    // Pettable → green badge with friendliness & energy bars
    // --------------------------------------------------------
    private String buildAnimalHtml(Animal animal) {
        StringBuilder sb = new StringBuilder();
        sb.append(
                "<html><body style='font-family:SansSerif; color:#2e3440; margin:0; padding:0;'>");

        // Animal common name heading, with scientific name as subtitle
        sb.append("<h2 style='margin:0 0 2px 0; color:#2e3440;'>").append(animal.getName())
                .append("</h2>");
        sb.append(
                "<p style='margin:0 0 14px 0; color:#7b88a0; font-size:10pt; font-style:italic;'>")
                .append(animal.getScientificName()).append("</p>");

        // ---- Taxonomy section ----
        sb.append(sectionHeader("Taxonomy"));
        sb.append(infoRow("Kingdom", Animal.KINGDOM));
        sb.append(infoRow("Order", animal.getOrder()));
        sb.append(infoRow("Family", animal.getFamily()));
        sb.append(infoRow("Genus", animal.getGenus()));
        sb.append(infoRow("Species", animal.getSpecies()));
        sb.append(infoRow("Common Name", animal.getName()));

        // ---- Habitat section ----
        sb.append(sectionHeader("Habitat"));
        sb.append("<p style='margin:2px 0 10px 0; font-size:11pt;'>").append(animal.getHabitat())
                .append("</p>");

        // ---- Interface capability sections ----
        // Each block only appears if the animal implements that interface.
        // This is the power of polymorphism: we can treat every Animal
        // the same way, but still access interface-specific data using
        // instanceof + casting.

        if (animal instanceof Swimmable) {
            Swimmable s = (Swimmable) animal;
            sb.append(badgeHeader("CAN SWIM", "#0b7285"));
            sb.append(infoRow("Swim speed", s.getSwimSpeed() + " km/h"));
            sb.append(infoRow("Preferred depth", s.getPreferredDepth() + " m"));
        }

        if (animal instanceof Flyable) {
            Flyable f = (Flyable) animal;
            sb.append(badgeHeader("CAN FLY", "#5f3dc4"));
            sb.append(infoRow("Flight speed", f.getFlightSpeed() + " km/h"));
            sb.append(infoRow("Max altitude", f.getMaxAltitude() + " m"));
        }

        if (animal instanceof Predator) {
            Predator p = (Predator) animal;
            sb.append(badgeHeader("CAN HUNT", "#c92a2a"));
            sb.append(infoRow("Primary prey", p.getPrimaryPrey()));
            sb.append(infoRow("Average prey mass", p.getAveragePreyMass() + " kg"));
        }

        if (animal instanceof Pettable) {
            Pettable p = (Pettable) animal;
            sb.append(badgeHeader("CAN BE A PET", "#2b8a3e"));
            // ratingBar() returns HTML for a row of 10 filled/empty circles.
            sb.append(infoRow("Friendliness", ratingBar(p.getFriendlinessLevel())));
            sb.append(infoRow("Energy", ratingBar(p.getEnergyLevel())));
        }

        // ---- Fun Fact section ----
        sb.append(sectionHeader("Fun Fact"));
        sb.append(
                "<p style='margin:2px 0 10px 0; font-size:11pt; font-style:italic; color:#4c566a;'>")
                .append(animal.getFact()).append("</p>");

        sb.append("</body></html>");
        return sb.toString();
    }

    // ============================================================
    // HTML HELPER METHODS
    // Small utilities that return styled HTML fragments so the
    // main builder method stays readable.
    // ============================================================

    // Returns an <h3> with an underline, used to start each section.
    private String sectionHeader(String title) {
        return "<h3 style='margin:16px 0 6px 0; padding-bottom:3px; "
                + "border-bottom:2px solid #d8dee9; color:#4c566a; font-size:11pt;'>" + title
                + "</h3>";
    }

    // Returns a small colored badge (like a tag/chip) used for
    // interface capability headers (CAN SWIM, CAN FLY, etc.).
    private String badgeHeader(String title, String color) {
        return "<div style='margin:14px 0 6px 0;'>" + "<span style='background:" + color
                + "; color:white; " + "padding:3px 10px; font-size:9pt; font-weight:bold; "
                + "border-radius:4px;'>" + title + "</span></div>";
    }

    // Returns a single "Label: value" row of info.
    private String infoRow(String label, String value) {
        return "<div style='margin:3px 0; font-size:11pt;'>" + "<b style='color:#4c566a;'>" + label
                + ":</b> " + "<span style='color:#2e3440;'>" + value + "</span></div>";
    }

    // Returns a visual rating bar made of 10 circles (●).
    // Filled circles use the accent color; empty ones use a light gray.
    // Example for level 7: ●●●●●●●○○○ (7/10)
    private String ratingBar(int level) {
        StringBuilder bar = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            if (i <= level) {
                bar.append("<span style='color:#5e81ac; font-size:13pt;'>&#9679;</span>"); // filled
            } else {
                bar.append("<span style='color:#d8dee9; font-size:13pt;'>&#9679;</span>"); // empty
            }
        }
        bar.append(" <span style='color:#7b88a0; font-size:9pt;'>(").append(level)
                .append("/10)</span>");
        return bar.toString();
    }

    // ============================================================
    // AnimalListRenderer (inner class)
    //
    // A custom cell renderer that controls how each Animal appears
    // in the sidebar JList. By default JList calls toString() on
    // each item; this renderer overrides that to display the
    // animal's scientific name and apply our dark color scheme.
    //
    // Swing calls getListCellRendererComponent() once per visible
    // row every time the list repaints.
    // ============================================================
    private static class AnimalListRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            // Let the parent class do its default setup first.
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            // Cast the value to Animal so we can access getName().
            Animal animal = (Animal) value;
            setText("   " + animal.getName());
            setFont(new Font("SansSerif", Font.PLAIN, 14));
            setBorder(new EmptyBorder(0, 6, 0, 6));

            // Apply different colors depending on whether this row is selected.
            if (isSelected) {
                setBackground(SELECTION);
                setForeground(Color.WHITE);
            } else {
                setBackground(BG_LIST);
                setForeground(TEXT_LIGHT);
            }
            return this;
        }
    }

    // --------------------------------------------------------
    // main() – entry point
    // SwingUtilities.invokeLater() ensures the GUI is created
    // on the Event Dispatch Thread (EDT), which is required by
    // Swing for thread safety.
    // --------------------------------------------------------
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AnimalShowcaseGUI::new);
    }
}
