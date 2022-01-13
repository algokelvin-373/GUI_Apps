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

    private int skorA = 0, skorB = 0;

    GUI_Skoring() {
        setEnabledBtn(true, true);
    }

    JPanel getPanel() {
        panel.setPreferredSize(new Dimension(300, 300));
        return panel;
    }

    void setActionPerformedBtnSkorTimA() {
        skorA++;
        txtSkorTimA.setText(Integer.toString(skorA));
    }

    void setActionPerformedBtnSkorTimB() {
        skorB++;
        txtSkorTimB.setText(Integer.toString(skorB));
    }

    void setActionPerformedBtnSkorAkhir() {
        setEnabledBtn(false, false);
    }

    void setActionPerformedBtnResetSkor() {
        skorA = 0;
        skorB = 0;
        txtSkorTimA.setText(Integer.toString(skorA));
        txtSkorTimB.setText(Integer.toString(skorB));
        setEnabledBtn(true, true);
    }

    private void setEnabledBtn(Boolean enA, Boolean enB) {
        btnSkorTimA.setEnabled(enA);
        btnSkorTimB.setEnabled(enB);
    }

    JButton getBtnSkorTimA() {
        return btnSkorTimA;
    }

    JButton getBtnSkorTimB() {
        return btnSkorTimB;
    }

    JButton getBtnSkorAkhir() {
        return btnSkorAkhir;
    }

    JButton getBtnResetSkor() {
        return btnResetSkor;
    }

}
