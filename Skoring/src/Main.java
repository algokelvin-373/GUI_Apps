public class Main extends FrameController {
    public static void main(String[] args) {
        GUI_Skoring gui = new GUI_Skoring();
        setFrameGUI(gui.getPanel(),
                "GUI AlgoKelvin: Skoring");

        gui.getBtnSkorTimA().addActionListener(e -> gui.setActionPerformedBtnSkorTimA());
        gui.getBtnSkorTimB().addActionListener(e -> gui.setActionPerformedBtnSkorTimB());
        gui.getBtnSkorAkhir().addActionListener(e -> gui.setActionPerformedBtnSkorAkhir());
        gui.getBtnResetSkor().addActionListener(e -> gui.setActionPerformedBtnResetSkor());

    }
}
