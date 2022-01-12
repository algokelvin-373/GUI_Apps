package Sampel3D;

import java.awt.*;
import javax.swing.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.geometry.ColorCube;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.Canvas3D;
import javax.swing.JFrame;

public class RotasiMouse extends JFrame {
    public RotasiMouse() {
        super("Demo Rotasi Kubus");
        Canvas3D canvas3D = createCanvas3D();
        BranchGroup scene = createSceneGraph();
        connect(canvas3D, scene);
    }

// 1. Menciptakan kanvas 3D
    private Canvas3D createCanvas3D() {
        setSize(300, 300);
        getContentPane().setLayout(new BorderLayout());
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas3D = new Canvas3D(config);
        setSize(300, 300);
        getContentPane().add(canvas3D);
        return canvas3D;
    }
// Menciptakan scene graph
    private BranchGroup createSceneGraph() {
        // Menciptakan transformasi group
        Transform3D transform = new Transform3D();
        transform.set(new Vector3d(0.0, 0.0, -50.0));
        
        TransformGroup tg = new TransformGroup(transform);

        // Transformasi sumbu X
        Transform3D rotXTransform = new Transform3D();
        rotXTransform.rotX(Math.toRadians(45));

        // Transformasi sumbu Y
        Transform3D rotYTransform = new Transform3D();
        rotYTransform.rotY(Math.toRadians(-45)); 

        // Kombinasi rotasi ke dalam transformasi
        Transform3D rtf = new Transform3D(rotXTransform);
        rtf.mul(rotYTransform); 
        TransformGroup rg = new TransformGroup(rtf); 
        tg.addChild(rg); 
        ColorCube cube = new ColorCube(7.0f);
        BranchGroup objRoot = new BranchGroup();
        
        rg.addChild(cube);

        // Menciptakan handler/behavior mouse rotate
        rg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        rg.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        MouseTranslate mr = new MouseTranslate(rg); 
        mr.setSchedulingBounds(new BoundingSphere(new Point3d(0, 0, 0), Double.MAX_VALUE)); 

        objRoot.addChild(mr);
        objRoot.addChild(tg);
        objRoot.compile();
        return objRoot; 
    }
// Mengaitkan kanvas dan branch group
    private void connect(Canvas3D canvas3D, BranchGroup scene){
        SimpleUniverse simpleU = new SimpleUniverse(canvas3D);
        simpleU.getViewingPlatform().
        setNominalViewingTransform();
        simpleU.addBranchGraph(scene);
    }
    public static void main(String[] args) {
        new RotasiMouse().setVisible(true);
    }
}
