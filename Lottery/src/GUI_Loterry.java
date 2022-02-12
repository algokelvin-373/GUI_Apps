import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GUI_Loterry {
    private JPanel panel;
    private JPanel panelLottery;
    private JPanel panelAmountLottery;
    private JTextField txtFieldAmountLottery;
    private JLabel txtAmountLottery;
    private JPanel panelResultLottery;
    private JTextField txtFieldResultLottery;
    private JLabel txtResultLottery;
    private JPanel panelBtnLottery;
    private JButton btnLottery;

    JPanel getPanel() {
        panel.setPreferredSize(new Dimension(300, 150));
        return panel;
    }

    void setActionPerformedBtnLottery() {
        int amount = Integer.parseInt(txtFieldAmountLottery.getText());
        int random = getRandomNumber(amount);
        txtFieldResultLottery.setText(String.valueOf(random));
    }

    private int getRandomNumber(int interval) {
        Random random = new Random();
        return random.nextInt(interval + 1);
    }

    JButton getBtnLottery() {
        return btnLottery;
    }

}
