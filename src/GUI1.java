import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI1 {

    private JFrame frame1;
    private JButton inlog;

    public GUI1(){
        frame1 = new JFrame();
        frame1.setSize(900,600);
        frame1.setResizable(false);
        frame1.setTitle("Login");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setLayout(null);

        JLabel titleLabel = new JLabel("Inloggen");
        titleLabel.setBounds(410, 100, 100, 20);
        frame1.add(titleLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(320, 160, 250, 30);
        frame1.add(usernameField);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(320, 210, 250, 30);
        frame1.add(passwordField);

        JLabel Hydro = new JLabel("Hydro-Home");
        Hydro.setFont(new Font("Serif", Font.BOLD, 100));
        Hydro.setForeground(new Color(200,200,200,50));
        Hydro.setOpaque(false);
        Hydro.setBounds(20,400,700,100);
        frame1.add(Hydro);

        inlog = new JButton("Login");
        inlog.setBounds(320,300,250,30);
        inlog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                new GUI();
                frame1.dispose();
            }
        });
        frame1.add(inlog);

        frame1.setVisible(true);
    }

    public static void main(String [] args) {
        new GUI1();
    }
}
