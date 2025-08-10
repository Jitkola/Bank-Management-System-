package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox<String> comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1, r2;
    JButton next, back;
    String formno;

    Signup2(String formno) {
        super("APPLICATION FORM");

        this.formno = formno;

        setSize(850, 750);
        setLocation(450, 200);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 750, Image.SCALE_SMOOTH);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 750);
        iiimage.setLayout(null);
        add(iiimage);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        iiimage.add(image);

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        iiimage.add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        iiimage.add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        iiimage.add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(Color.WHITE);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        iiimage.add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        iiimage.add(l4);

        String Category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox<>(Category);
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        iiimage.add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        iiimage.add(l5);

        String income[] = {"Null", "<1,50,000", "<2,50,000", "5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        iiimage.add(comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        iiimage.add(l6);

        String educational[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox<>(educational);
        comboBox4.setBackground(Color.WHITE);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        iiimage.add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 340, 150, 30);
        iiimage.add(l7);

        String Occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox<>(Occupation);
        comboBox5.setBackground(Color.WHITE);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 340, 320, 30);
        iiimage.add(comboBox5);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 390, 150, 30);
        iiimage.add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(350, 390, 320, 30);
        iiimage.add(textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 440, 180, 30);
        iiimage.add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        textAadhar.setBounds(350, 440, 320, 30);
        iiimage.add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 490, 180, 30);
        iiimage.add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(350, 490, 100, 30);
        iiimage.add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(460, 490, 100, 30);
        iiimage.add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 30);
        iiimage.add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760, 10, 60, 30);
        iiimage.add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(450, 640, 100, 30);
        next.addActionListener(this);
        iiimage.add(next);

        back = new JButton("Back");
        back.setFont(new Font("Raleway", Font.BOLD, 14));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(250, 640, 100, 30);
        back.addActionListener(this);
        iiimage.add(back);

        setUndecorated(true);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == back) {
            new Signup();
            setVisible(false);
            return;
        }

        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText().trim().toUpperCase();
        String addhar = textAadhar.getText().trim();

        // Check if Senior Citizen radio buttons selected
        boolean scSelected = ValidationUtils.isRadioSelected(r1.isSelected(), r2.isSelected());

        // Validate all inputs using ValidationUtils methods and show error dialogs if invalid
        if (!ValidationUtils.isValidSelection(rel)) {
            JOptionPane.showMessageDialog(null, "Please select Religion");
            return;
        }

        if (!ValidationUtils.isValidSelection(cate)) {
            JOptionPane.showMessageDialog(null, "Please select Category");
            return;
        }

        if (!ValidationUtils.isValidSelection(inc)) {
            JOptionPane.showMessageDialog(null, "Please select Income");
            return;
        }

        if (!ValidationUtils.isValidSelection(edu)) {
            JOptionPane.showMessageDialog(null, "Please select Educational Qualification");
            return;
        }

        if (!ValidationUtils.isValidSelection(occ)) {
            JOptionPane.showMessageDialog(null, "Please select Occupation");
            return;
        }

        if (!ValidationUtils.isValidPAN(pan)) {
            JOptionPane.showMessageDialog(null, "Enter valid PAN Number (e.g. ABCDE1234F)");
            return;
        }

        if (!ValidationUtils.isValidAadhar(addhar)) {
            JOptionPane.showMessageDialog(null, "Enter valid 12-digit Aadhar Number");
            return;
        }

        if (!scSelected) {
            JOptionPane.showMessageDialog(null, "Please select if you are a Senior Citizen");
            return;
        }

        String scitizen = r1.isSelected() ? "Yes" : "No";

        try {
            Connn c = new Connn();
            String q = "insert into Signuptwo values('" + formno + "', '" + rel + "', '" + cate + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "','" + addhar + "','" + scitizen + "','No')";
            c.statement.executeUpdate(q);
            new Signup3(formno);
            setVisible(false);
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
