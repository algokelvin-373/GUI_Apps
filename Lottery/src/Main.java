public class Main extends FrameController {
    public static void main(String[] args) {
        GUI_Loterry gui = new GUI_Loterry();
        String title = "GUI AlgoKelvin: Lottery";
        setFrameGUI(gui.getPanel(), title);

        gui.getBtnLottery().addActionListener(e -> gui.setActionPerformedBtnLottery());

    }
}
