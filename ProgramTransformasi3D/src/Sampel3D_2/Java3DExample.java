package Sampel3D_2;

import java.awt.*;
import java.awt.event.*;

 // Java extension packages
import javax.swing.*;
import javax.swing.event.*;
public class Java3DExample extends JFrame {
    private Java3DWorld java3DWorld; // 3D scene panel
    private JPanel controlPanel; // 3D scene control panel

    // initialize Java3DWorld and ControlPanel
    public Java3DExample()
    {
        super( "Java 3D Graphics Demo" );
        //jjava3DWorld = new Java3DWorld("src/foto/sampel2.png");
        java3DWorld = new Java3DWorld("src/foto/sampel2.png");
        controlPanel = new ControlPanel( java3DWorld );

        // add Components to JFrame
        getContentPane().add( java3DWorld, BorderLayout.CENTER );
        getContentPane().add( controlPanel, BorderLayout.EAST );
        

    } // end Java3DExample constructor

    // start program
    public static void main( String args[] )
    {
        Java3DExample application = new Java3DExample();
        application.setSize(800, 800);
        application.setDefaultCloseOperation( EXIT_ON_CLOSE );
        application.pack();
        application.setVisible( true );
    }
}
