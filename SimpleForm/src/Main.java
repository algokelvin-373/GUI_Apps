import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GUI_SimpleForm form = new GUI_SimpleForm();
        JFrame frame = new JFrame("GUI AlgoKelvin: Simple Form");
        frame.setContentPane(form.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
