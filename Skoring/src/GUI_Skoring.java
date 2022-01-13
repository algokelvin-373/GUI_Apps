import javax.swing.*;
import java.awt.*;

public class GUI_Skoring {
    private JPanel panel;
    private JPanel panelTitleTim;
    private JLabel txtTimA;
    private JLabel txtTimB;
    private JPanel panelSkorTim;
    private JLabel txtSkorTimA;
    private JLabel txtSkorTimB;
    private JPanel panelBtnSkorTim;
    private JButton btnSkorTimA;
    private JButton btnSkorTimB;
    private JPanel panelBtnSkorAkhir;
    private JButton btnSkorAkhir;
    private JPanel panelBtnResetSkor;
    private JButton btnResetSkor;

    public JPanel getPanel() {
        panel.setPreferredSize(new Dimension(300, 300));
        return panel;
    }

}
