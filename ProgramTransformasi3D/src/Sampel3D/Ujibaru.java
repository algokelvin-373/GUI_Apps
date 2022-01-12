package Sampel3D;

import java.awt.*;
import javax.swing.*;
public class Ujibaru {
    public static void main(String[] args) {
        new baru();
    }
}
class baru {
    //deklarasi variable
    private JFrame frame;
    JDesktopPane desktop = new JDesktopPane();
    JInternalFrame iframe=new JInternalFrame("Internal Frame",true,true,true,true);

    //konstruktor dari objek class baru
    baru()
    {
        buatFrame();
        frame.setVisible(true);
    }

    //method untuk membuat frame 
    public void buatFrame()
    {
        frame = new JFrame ("FRAME UTAMA");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        desktop.setBackground(Color.PINK);//memberi warna background frame induk
        frame.setLocationRelativeTo(null);//window ada di tengah dekstop
        frame.setLayout(null); // mengatur layout 
        internal_frame();
    }

    //method untuk internal frame
    public void internal_frame() {
        iframe.setLocation(20,20);
        iframe.setSize(300,300);
        iframe.setVisible(true);
        desktop.add(iframe);//memasukkan frame anak ke frame induk
        iframe.setBackground(Color.YELLOW);//memberi warna background pada internakl frame
        frame.setContentPane(desktop);
    }
} 