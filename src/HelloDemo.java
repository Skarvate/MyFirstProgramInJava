import javax.swing.*;

public class HelloDemo extends JFrame {
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnOK;

    public HelloDemo() {
        btnOK.addActionListener(_ -> JOptionPane.showMessageDialog(btnOK, "Hello " + txtName.getText() + "!"));
    }
    public static void main(String[] args) {
        HelloDemo h=new HelloDemo();
        h.setContentPane(h.panelMain);
        h.setSize(300, 200);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
