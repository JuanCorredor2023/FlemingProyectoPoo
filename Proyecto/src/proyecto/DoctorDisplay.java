/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author juan
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DoctorDisplay extends JPanel {
    private List<Doctor> doctors;
    private JTextField filterTextField;
    private JComboBox<String> filterOptions;
    private JPanel cardsPanel;
    private JPanel cardsPanelDisplay;

    public DoctorDisplay() {
        super(new BorderLayout());
        doctors = new ArrayList<>(); // Doctors will be set here
        generateAndSetDoctors();
        initDisplay();
    }

    private void initDisplay() {
        
        JPanel leftPanel = new JPanel(new GridLayout(2, 1, 1, 1));
        // Filter setup
        JPanel filterPanel = new JPanel(new FlowLayout());
        filterTextField = new JTextField(20);
        filterOptions = new JComboBox<>(new String[]{"Name", "City"});
        JButton filterButton = new JButton("Filter");
        
        // ADD CARDS TO THE PANEL BUT some space that shouldnt be 
        cardsPanelDisplay = new JPanel(new GridLayout(10,2,4,4));
        for (Doctor doctor : doctors){
            cardsPanelDisplay.add(createDoctorCard(doctor));
        }
        
        filterButton.addActionListener(this::filterDoctors);
        filterPanel.add(new JLabel("Filter by:"));
        filterPanel.add(filterOptions);
        filterPanel.add(filterTextField);
        filterPanel.add(filterButton);
        
        this.add(filterPanel, BorderLayout.NORTH);
        
        //leftPanel.add(filterPanel);
        cardsPanelDisplay.setBackground(Color.GRAY);
        leftPanel.add(cardsPanelDisplay);

        
        this.add(new JScrollPane(leftPanel), BorderLayout.WEST);
        
        
        JLabel space = new JLabel("   ");
        this.add(space, BorderLayout.SOUTH);
        JLabel space2 = new JLabel("   ");
        this.add(space, BorderLayout.EAST);

        // Cards display
        cardsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 5;
        gbc.weighty = 5;
        cardsPanel.add(new JPanel(), gbc); // Dummy panel for spacing
        this.add(new JScrollPane(cardsPanel), BorderLayout.CENTER);
    }
    

    private void filterDoctors(ActionEvent e) {
        String filter = filterTextField.getText();
        String filterType = (String) filterOptions.getSelectedItem();
        cardsPanel.removeAll();
        for (Doctor doctor : doctors) {
            if (filterType.equals("Name") && doctor.getName().contains(filter) ||
                filterType.equals("City") && doctor.getCity().contains(filter)) {
                JPanel card = createDoctorCard(doctor);
                cardsPanel.add(card);
            }
        }
        cardsPanel.revalidate();
        cardsPanel.repaint();
    }


private JPanel createDoctorCard(Doctor doctor) {
    JPanel card = new JPanel(new BorderLayout());
    JLabel nameLabel = new JLabel(doctor.getName(),SwingConstants.CENTER); 
    nameLabel.setFont(new Font("Arial", Font.BOLD, 24));
    JLabel cityLabel = new JLabel("     City: " + doctor.getCity());
    JLabel addressLabel = new JLabel("     Address: " + doctor.getAddress());
    ImageIcon icon = new ImageIcon(doctor.getImagePath());
    JLabel imageLabel = new JLabel(icon);
    JButton contact = new JButton("Contact Doctor");
    /*try {
        // Ensure the path is correctly adjusted to your project structure
        ImageIcon icon = new ImageIcon("img1.jpeg");
        //imageLabel.setIcon(icon);
        JLabel imageLabel = new JLabel(icon);
    } catch (Exception e) {
        imageLabel.setText("Image not available");
        imageLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        System.err.println("Error loading image: " + e.getMessage());
    }*/
    
    contact.addActionListener(new ActionListener() {
        @Override
        /////////////////////////////// areglar perfil profesional completo //////////////////////////////////////
        public void actionPerformed(ActionEvent e) {
            PerfilProfesionalCompleto agendar = new PerfilProfesionalCompleto();
            agendar.setVisible(true);
            agendar.setSize(400, 400);
            agendar.setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(false);
            
            ////// repaint the center class of the filter card with the map and some information for the reservation
        }
    });

    JPanel infoPanel = new JPanel(new GridLayout(3, 1));
    infoPanel.add(cityLabel);
    infoPanel.add(addressLabel);
    infoPanel.add(contact);

    card.add(nameLabel, BorderLayout.NORTH);
    card.add(imageLabel, BorderLayout.CENTER);
    card.add(infoPanel, BorderLayout.SOUTH);

    return card;
}



///////////////////////////when id url
    /*
    private JPanel createDoctorCard(Doctor doctor) {
    JPanel card = new JPanel(new BorderLayout());
    JLabel nameLabel = new JLabel(doctor.getName());
    JLabel cityLabel = new JLabel("City: " + doctor.getCity());
    JLabel addressLabel = new JLabel("Address: " + doctor.getAddress());
    JLabel imageLabel = new JLabel();
    try {
        ImageIcon icon = new ImageIcon(new URL(doctor.getImagePath()));
        imageLabel.setIcon(icon);
    } catch (MalformedURLException e) {
        imageLabel.setText("Image not found");
    }

    JPanel infoPanel = new JPanel(new GridLayout(2, 1));
    infoPanel.add(cityLabel);
    infoPanel.add(addressLabel);

    card.add(nameLabel, BorderLayout.NORTH);
    card.add(imageLabel, BorderLayout.CENTER);
    card.add(infoPanel, BorderLayout.SOUTH);

    return card;
}

    */


    private void generateAndSetDoctors() {
        String[] names = {"John Doe", "Jane Smith", "Harold Finch", "Nathan Ingram", "Sameen Shaw", "Lionel Fusco", "Joss Carter", "Root", "Bear", "Grace Hendricks", "Zoe Morgan", "Alicia Corwin", "Jessica Arndt", "Jeremy Lambert", "Rick Morris", "Monica Jacobs", "Paula Vasquez", "Alberto Diaz", "Kara Stanton", "Mark Snow"};
        String[] cities = {"New York", "Los Angeles", "Chicago", "Chicago", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose", "Austin", "Jacksonville", "Fort Worth", "Columbus", "Charlotte", "San Francisco", "Indianapolis", "Seattle", "Denver", "Boston"};
        String[] addresses = {"101 Main St", "202 Center Dr", "303 Broad St", "404 Park Ave", "505 Fifth Ave", "606 First St", "707 Second St", "808 Third St", "909 Fourth St", "1010 Maple Dr", "1111 Oak St", "1212 Pine St", "1313 Cedar St", "1414 Elm St", "1515 Birch St", "1616 Chestnut St", "1717 Spruce St", "1818 Aspen St", "1919 Redwood St", "2020 Sequoia St"};

        for (int i = 0; i < 20; i++) {
            String imagePath = "images/_img" + (i + 1) + ".jpeg";
            doctors.add(new Doctor(names[i], cities[i], addresses[i], imagePath));
        }
    }
}
