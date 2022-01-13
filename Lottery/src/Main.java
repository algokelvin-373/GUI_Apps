public class Main extends FrameController {
    public static void main(String[] args) {
        GUI_Loterry gui = new GUI_Loterry();
        setFrameGUI(
                gui.getPanel(),
                "GUI AlgoKelvin: Lottery"
        );
    }
}
