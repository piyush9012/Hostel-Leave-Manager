import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main {

    private JTextArea announcementsArea;

    public void userTypeSelection() {
        JFrame userTypeFrame = new JFrame("NITTE HOSTEL LEAVE MANAGER");
        userTypeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userTypeFrame.setSize(400, 200);
        userTypeFrame.getContentPane().setBackground(new Color(167, 197, 241));
        userTypeFrame.setLocationRelativeTo(null);
        userTypeFrame.setLayout(null);

        JLabel userTypeLabel = new JLabel("Select User Type:");
        userTypeLabel.setBounds(50, 50, 150, 30);
        userTypeFrame.add(userTypeLabel);

        JComboBox<String> userTypeComboBox = new JComboBox<>(new String[]{"Student", "Admin"});
        userTypeComboBox.setBounds(200, 50, 150, 30);
        userTypeFrame.add(userTypeComboBox);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 100, 100, 30);
        userTypeFrame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedUserType = (String) userTypeComboBox.getSelectedItem();
                userTypeFrame.dispose(); // Close user type selection frame

                // Open respective login page based on user type
                if (selectedUserType.equals("Student"))
                    studentLogin();
                else if (selectedUserType.equals("Admin"))
                    adminLogin();
            }
        });

        userTypeFrame.setVisible(true);
    }

    public void studentLogin() {
        JFrame studentLoginFrame = new JFrame("Student Login");
        studentLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentLoginFrame.setSize(400, 200);
        studentLoginFrame.getContentPane().setBackground(new Color(167, 197, 241));
        studentLoginFrame.setLocationRelativeTo(null);
        studentLoginFrame.setLayout(null);

        JLabel loginID, password;
        loginID = new JLabel("LOGIN ID");
        password = new JLabel("PASSWORD");
        loginID.setBounds(20, 10, 100, 30);
        studentLoginFrame.add(loginID);

        password.setBounds(20, 50, 100, 30);
        studentLoginFrame.add(password);

        JTextField id_text = new JTextField();
        id_text.setBounds(100, 10, 200, 30);
        JPasswordField pwrd = new JPasswordField();
        pwrd.setBounds(100, 50, 200, 30);
        studentLoginFrame.add(id_text);
        studentLoginFrame.add(pwrd);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(150, 110, 100, 30);
        studentLoginFrame.add(submit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loginID = id_text.getText();
                String passwrd = pwrd.getText();
                if (loginID.equals("st") && passwrd.equals("st")) {
                    studentHomeScreen();
                    studentLoginFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "WRONG LOGIN ID/PASSWORD");
                    id_text.setText("");
                    pwrd.setText("");
                }
            }
        });
        studentLoginFrame.setVisible(true);
    }

    public void studentHomeScreen() {
        JFrame frame = new JFrame("NITTE HOSTEL LEAVE MANAGER | Student Home Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.getContentPane().setBackground(new Color(167, 197, 241));
        frame.setLocationRelativeTo(null);
    
        JButton leave = new JButton("APPLY FOR LEAVE");
        JButton complaints = new JButton("APPLY FOR COMPLAINS");
        JButton viewAnnouncements = new JButton("VIEW ANNOUNCEMENTS");
        JLabel collegeName = new JLabel("NITTE Hostels, NMIT College");
        JLabel collegeAddress = new JLabel("Yelahanka, Bangalore - 560064");
        collegeName.setFont(new Font("TimesNewRoman", Font.BOLD, 30));
        collegeAddress.setFont(new Font("TimesNewRoman", Font.ROMAN_BASELINE, 20));
        collegeName.setHorizontalAlignment(SwingConstants.CENTER);
        collegeAddress.setHorizontalAlignment(SwingConstants.CENTER);
        collegeName.setBounds(280, 10, 420, 100);
        collegeAddress.setBounds(280, 50, 420, 100);
    
        leave.setBounds(60, 180, 250, 60);
        complaints.setBounds(365, 180, 250, 60);
        viewAnnouncements.setBounds(670, 180, 250, 60);
    
        leave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    leaveForm();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    
        complaints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    complaintForm();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        viewAnnouncements.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayAnnouncements(frame);
            }
        });

        frame.add(collegeName);
        frame.add(collegeAddress);
        frame.add(leave);
        frame.add(complaints);
        frame.add(viewAnnouncements);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void adminLogin() {
        JFrame adminLoginFrame = new JFrame("Admin Login");
        adminLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminLoginFrame.setSize(400, 200);
        adminLoginFrame.getContentPane().setBackground(new Color(167, 197, 241));
        adminLoginFrame.setLocationRelativeTo(null);
        adminLoginFrame.setLayout(null);
    
        JLabel loginID, password;
        loginID = new JLabel("LOGIN ID");
        password = new JLabel("PASSWORD");
        loginID.setBounds(20, 10, 100, 30);
        adminLoginFrame.add(loginID);
    
        password.setBounds(20, 50, 100, 30);
        adminLoginFrame.add(password);
    
        JTextField id_text = new JTextField();
        id_text.setBounds(100, 10, 200, 30);
        JPasswordField pwrd = new JPasswordField();
        pwrd.setBounds(100, 50, 200, 30);
        adminLoginFrame.add(id_text);
        adminLoginFrame.add(pwrd);
    
        JButton submit = new JButton("SUBMIT");
        submit.setBounds(150, 110, 100, 30);
        adminLoginFrame.add(submit);
    
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loginID = id_text.getText();
                String passwrd = pwrd.getText();
                if (loginID.equals("ad") && passwrd.equals("ad")) {
                    adminHomeScreen();
                    adminLoginFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "WRONG LOGIN ID/PASSWORD");
                    id_text.setText("");
                    pwrd.setText("");
                }
            }
        });
    
        adminLoginFrame.setVisible(true);
    }

    public void adminHomeScreen() {
        JFrame adminFrame = new JFrame("NITTE HOSTEL LEAVE MANAGER | Admin Home Screen");
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminFrame.setSize(1000, 500);
        adminFrame.getContentPane().setBackground(new Color(167, 197, 241));
        adminFrame.setLocationRelativeTo(null);

        JLabel collegeName = new JLabel("NITTE Hostels, NMIT College");
        JLabel collegeAddress = new JLabel("Yelahanka, Bangalore - 560064");
        JLabel admin = new JLabel("Admin's Login Page");
        collegeName.setFont(new Font("TimesNewRoman", Font.BOLD, 30));
        collegeAddress.setFont(new Font("TimesNewRoman", Font.ROMAN_BASELINE, 20));
        admin.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        collegeName.setBounds(280, 10, 420, 100);
        collegeAddress.setBounds(340, 50, 420, 100);
        admin.setBounds(390,90, 350,100);
        adminFrame.add(admin);
        adminFrame.add(collegeName);
        adminFrame.add(collegeAddress);

        JButton viewLeaveButton = new JButton("VIEW LEAVE APPLICATIONS");
        viewLeaveButton.setBounds(60, 180, 250, 60);
        adminFrame.add(viewLeaveButton);

        JButton viewComplaintsButton = new JButton("VIEW COMPLAINS");
        viewComplaintsButton.setBounds(370, 180, 250, 60);
        adminFrame.add(viewComplaintsButton);

        JButton editAnnouncementsButton = new JButton("EDIT ANNOUNCEMENTS");
        editAnnouncementsButton.setBounds(680, 180, 250, 60);
        adminFrame.add(editAnnouncementsButton);

        // Action listener for view leave applications button
        viewLeaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLeaveApplications(adminFrame);
            }
        });

        // Action listener for view complaints button
        viewComplaintsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayComplaints(adminFrame);
            }
        });

        // Action listener for edit announcements button
        editAnnouncementsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Main().announcementForm();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        
        adminFrame.setLayout(null);
        adminFrame.setVisible(true);
    }

    class LeaveDetails {
        String leaveType, fromdate, todate, reason, place, mode;

        LeaveDetails() {
        }
    }

    public void leaveForm() throws IOException {

        JFrame frame = new JFrame("NITTE HOSTEL LEAVE MANAGER | APPLY FOR LEAVE");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(167, 197, 241));

        JLabel leaveType = new JLabel("SELECT LEAVE TYPE");
        leaveType.setBounds(20, 10, 150, 30);
        JTextField dropdown = new JTextField();
        dropdown.setBounds(160, 10, 300, 30);

        JLabel from = new JLabel("From Date : ");
        from.setBounds(20, 60, 100, 30);
        JTextField fromCalendar = new JTextField();
        fromCalendar.setBounds(110, 60, 183, 25);
        JTextField toCalendar = new JTextField();

        JLabel to = new JLabel("To date : ");
        to.setBounds(20, 100, 100, 30);
        toCalendar.setBounds(110, 100, 183, 25);
        JTextField leaveReason = new JTextField();
        JLabel leaveReasonLabel = new JLabel("Select Leave Reason : ");
        leaveReasonLabel.setBounds(20, 150, 150, 30);
        leaveReason.setBounds(160, 150, 280, 30);

        JLabel contactDetails = new JLabel("Parents Contact Details : ");
        JTextField parentsName = new JTextField("RAJESH KUMAR VAISH");
        JTextField parentsMobNo = new JTextField("9798657090");
        parentsName.setEditable(false);
        parentsMobNo.setEditable(false);
        contactDetails.setBounds(20, 190, 150, 30);
        parentsName.setBounds(20, 230, 200, 30);
        parentsMobNo.setBounds(230, 230, 200, 30);

        JLabel approverLabel = new JLabel("Note to the Approver : ");
        JLabel placeVisit = new JLabel("Place Of Visit : ");
        JTextField placeOfVisit = new JTextField();
        JLabel modeVisit = new JLabel("Mode Of Visit : ");
        JTextField modeOfVisit = new JTextField();
        approverLabel.setBounds(20, 280, 200, 30);
        placeVisit.setBounds(20, 320, 100, 30);
        placeOfVisit.setBounds(130, 330, 200, 20);
        modeVisit.setBounds(20, 350, 100, 30);
        modeOfVisit.setBounds(130, 360, 200, 20);

        JCheckBox termsAndConditions = new JCheckBox("I Accept all the Terms and Conditions .");
        termsAndConditions.setBounds(20, 400, 250, 30);

        JButton apply = new JButton("APPLY");
        JButton refresh = new JButton("REFRESH");
        apply.setBounds(100, 470, 100, 30);
        refresh.setBounds(300, 470, 100, 30);

        frame.add(leaveType);
        frame.add(dropdown);
        frame.add(from);
        frame.add(fromCalendar);
        frame.add(to);
        frame.add(toCalendar);
        frame.add(leaveReasonLabel);
        frame.add(leaveReason);
        frame.add(contactDetails);
        frame.add(parentsName);
        frame.add(parentsMobNo);
        frame.add(approverLabel);
        frame.add(placeVisit);
        frame.add(placeOfVisit);
        frame.add(modeVisit);
        frame.add(modeOfVisit);
        frame.add(termsAndConditions);
        frame.add(apply);
        frame.add(refresh);

        frame.setLayout(null);
        frame.setVisible(true);

        File file = new File("E:\\Coding\\Java\\Database.txt");
        boolean fileExists = file.exists();
        BufferedWriter fw = new BufferedWriter(new FileWriter(file, true));

        // Write header only if file doesn't exist or is empty
        if (!fileExists || file.length() == 0) {
            fw.write("Leave Type\tFrom Date\tTo Date\tLeave Reason\tPlace Of visit\tMode Of visit\n\n");
            // fw.close();
        }
        
        apply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // FileWriter fw1 = new FileWriter(file);
                    fw.write(dropdown.getText() + "\t" + fromCalendar.getText() + "\t" + toCalendar.getText() + "\t" + leaveReason.getText() + "\t" + placeOfVisit.getText() + "\t" + modeOfVisit.getText() + "\n");
                    fw.flush();

                    dropdown.setText("");
                    fromCalendar.setText("");
                    toCalendar.setText("");
                    leaveReason.setText("");
                    placeOfVisit.setText("");
                    modeOfVisit.setText("");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dropdown.setText("");
                fromCalendar.setText("");
                toCalendar.setText("");
                leaveReason.setText("");
                placeOfVisit.setText("");
                modeOfVisit.setText("");
            }
        });
    }

    public void complaintForm() throws IOException {

        JFrame frame = new JFrame("NITTE HOSTEL LEAVE MANAGER | APPLY FOR COMPLAINS");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(167, 197, 241));

        JTextField category = new JTextField();
        JLabel categoryLabel = new JLabel("Enter Category : ");
        categoryLabel.setBounds(20, 20, 100, 30);
        category.setBounds(20, 50, 450, 30);

        JTextField subCategory = new JTextField();
        JLabel subCategoryLabel = new JLabel("Enter Sub Category : ");
        subCategoryLabel.setBounds(20, 80, 150, 30);
        subCategory.setBounds(20, 110, 450, 30);

        JLabel urgency = new JLabel("Urgency");
        JCheckBox basic = new JCheckBox("BASIC");
        JCheckBox medium = new JCheckBox("MEDIUM");
        JCheckBox critical = new JCheckBox("CRITICAL");
        ButtonGroup urgencyGroup = new ButtonGroup();
        urgencyGroup.add(basic);
        urgencyGroup.add(medium);
        urgencyGroup.add(critical);
        JPanel urgencyCheckBox = new JPanel();
        urgencyCheckBox.setLayout(new GridBagLayout());
        GridBagConstraints urgencyConstraints = new GridBagConstraints();
        urgencyConstraints.gridx = GridBagConstraints.RELATIVE;
        urgencyConstraints.gridy = 1;
        urgencyCheckBox.add(basic, urgencyConstraints);
        urgencyCheckBox.add(medium, urgencyConstraints);
        urgencyCheckBox.add(critical, urgencyConstraints);
        urgency.setBounds(20, 150, 50, 30);
        urgencyCheckBox.setBounds(100, 150, 250, 30);

        JLabel description = new JLabel("Describe Your Complain: ");
        JTextField descriptionField = new JTextField();
        description.setBounds(20, 180, 200, 30);
        descriptionField.setBounds(20, 220, 400, 200);

        JButton submit = new JButton("SUBMIT");
        JButton refresh = new JButton("REFRESH");
        submit.setBounds(100, 470, 100, 30);
        refresh.setBounds(300, 470, 100, 30);

        frame.add(categoryLabel);
        frame.add(category);
        frame.add(subCategoryLabel);
        frame.add(subCategory);
        frame.add(urgency);
        frame.add(urgencyCheckBox);
        frame.add(description);
        frame.add(descriptionField);
        frame.add(submit);
        frame.add(refresh);

        frame.setLayout(null);
        frame.setVisible(true);
        File complains = new File("E:\\Coding\\Java\\complains.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(complains));
        bw.write("Category\tSub - Category\t\t Description" + "\n\n");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    bw.write(category.getText() + "\t" + subCategory.getText() + "\t\t" + descriptionField.getText()+ "\n");
                    bw.flush();

                    category.setText("");
                    subCategory.setText("");
                    descriptionField.setText("");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                category.setText("");
                subCategory.setText("");
                descriptionField.setText("");
            }
        });
    }

    public void announcementForm() throws IOException {
        JFrame frame = new JFrame("NITTE HOSTEL ANNOUNCEMENT");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(167, 197, 241));

        JLabel titleLabel = new JLabel("Announcement Title:");
        titleLabel.setBounds(20, 20, 150, 30);
        JTextField titleField = new JTextField();
        titleField.setBounds(20, 50, 450, 30);

        JLabel contentLabel = new JLabel("Announcement Content:");
        contentLabel.setBounds(20, 90, 150, 30);
        JTextArea contentArea = new JTextArea();
        contentArea.setLineWrap(true);
        JScrollPane contentScrollPane = new JScrollPane(contentArea);
        contentScrollPane.setBounds(20, 130, 450, 150);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(100, 300, 100, 30);
        JButton refresh = new JButton("REFRESH");
        refresh.setBounds(300, 300, 100, 30);

        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(contentLabel);
        frame.add(contentScrollPane);
        frame.add(submit);
        frame.add(refresh);

        frame.setLayout(null);
        frame.setVisible(true);

        File announcements = new File("E:\\Coding\\Java\\announcements.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(announcements, true));
        bw.write("Category\t Description" + "\n\n");

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    bw.write(titleField.getText() + "\t" + contentArea.getText() + "\n");
                    bw.flush();

                    titleField.setText("");
                    contentArea.setText("");
                    announcementsArea.setText("");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titleField.setText("");
                contentArea.setText("");
            }
        });
    }

    private void displayAnnouncements(JFrame frame) {
        JTextArea announcementsArea = new JTextArea(); // Initialize announcementsArea
        JScrollPane announcementsScrollPane = new JScrollPane(announcementsArea);
        announcementsScrollPane.setBounds(250, 250, 500, 200);
        frame.add(announcementsScrollPane);
        frame.revalidate(); // Revalidate the frame to reflect the changes

        announcementsArea.setText(""); // Clear the text area
        try {
            BufferedReader br = new BufferedReader(new FileReader("announcements.txt"));
            String line;
            boolean empty = true;
            while ((line = br.readLine()) != null) {
                announcementsArea.append(line + "\n");
                empty = false;
            }
            br.close();
            if (empty) {
                JOptionPane.showMessageDialog(null, "No announcements found", "No Records", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading announcements file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    // Method to read and display leave applications
    private void displayLeaveApplications(JFrame frame) {

        JTextArea adminTextArea = new JTextArea(); // Initialize adminTextArea
        JScrollPane scrollPane = new JScrollPane(adminTextArea);
        scrollPane.setBounds(200, 250, 600, 200);
        frame.add(scrollPane);
        frame.revalidate(); // Revalidate the frame to reflect the changes

        adminTextArea.setText("");
        try {
            BufferedReader br = new BufferedReader(new FileReader("Database.txt"));
            String line;
            boolean empty = true;
            while ((line = br.readLine()) != null) {
                adminTextArea.append(line + "\n");
                empty = false;
            }
            br.close();
            if (empty) {
                JOptionPane.showMessageDialog(null, "No leave applications found", "No Records", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading leave applications file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to read and display complaints
    private void displayComplaints(JFrame frame) {
        JTextArea adminTextArea = new JTextArea(); // Initialize adminTextArea
        JScrollPane scrollPane = new JScrollPane(adminTextArea);
        scrollPane.setBounds(250, 250, 500, 200);
        frame.add(scrollPane);
        frame.revalidate(); // Revalidate the frame to reflect the change

        adminTextArea.setText("");
        try {
            BufferedReader br = new BufferedReader(new FileReader("complains.txt"));
            String line;
            boolean empty = true;
            while ((line = br.readLine()) != null) {
                adminTextArea.append(line + "\n");
                empty = false;
            }
            br.close();
            if (empty) {
                JOptionPane.showMessageDialog(null, "No complaints found", "No Records", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading complaints file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {

        new Main().userTypeSelection();
    }
}
