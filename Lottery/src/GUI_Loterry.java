import javax.swing.*;
import java.awt.*;

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
}
