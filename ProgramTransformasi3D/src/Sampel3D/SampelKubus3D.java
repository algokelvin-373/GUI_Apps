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
public class SampelKubus3D extends javax.swing.JFrame {
    public SampelKubus3D() {
        initComponents();/*
        System.out.println ("Method ini berjalan");
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
      Canvas3D canvas = new Canvas3D(config);
      Container cp = this.getContentPane();
      cp.setLayout(new BorderLayout());
      cp.add(canvas, BorderLayout.CENTER);
      SimpleUniverse universe = new SimpleUniverse(canvas);
   
      // Set up the viewer looking into the scene.
      universe.getViewingPlatform().setNominalViewingTransform();
   
      // Create the content branch and add it to the universe
      BranchGroup scene = createSceneGraph();
      universe.addBranchGraph(scene); */
        
        Canvas3D canvas3D = createCanvas3D();
        BranchGroup scene = createSceneGraph();
        connect(canvas3D, scene);
    }
    /*
    public BranchGroup createSceneGraph() {
      // Create the root node of the content branch
      BranchGroup nodeRoot = new BranchGroup();
   
      // Create the TransformGroup node, which is writable to support
      // animation, and add it under the root
      TransformGroup nodeTrans = new TransformGroup();
      nodeTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      nodeRoot.addChild(nodeTrans);
   
      // Create a visual object node (color cube) and add it to the scene.
      nodeTrans.addChild(new ColorCube(0.4));
  
      // Create a Behavior node to rotate the cube add it to the scene.
      Transform3D yAxis = new Transform3D();
      Alpha timing = new Alpha(-1, 4000);
      RotationInterpolator nodeRotator = new RotationInterpolator(timing,
            nodeTrans, yAxis, 0.0f, (float)Math.PI * 2.0f);
      BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
      nodeRotator.setSchedulingBounds(bounds);
      nodeRoot.addChild(nodeRotator);
   
      // Compile to perform optimizations on this content branch.
      nodeRoot.compile();
  
      return nodeRoot;
   }*/
    
    private Canvas3D createCanvas3D() {
        
        getContentPane().setLayout(new BorderLayout());
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas3D = new Canvas3D(config);
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
        rotXTransform.rotX(Math.toRadians(20.0));

        // Transformasi sumbu Y
        Transform3D rotYTransform = new Transform3D();
        rotYTransform.rotY(Math.toRadians(20.0)); 

        // Kombinasi rotasi ke dalam transformasi
        Transform3D rtf = new Transform3D(rotXTransform);
        rtf.mul(rotYTransform); 
        TransformGroup rg = new TransformGroup(rtf); 
        tg.addChild(rg); 
        ColorCube cube = new ColorCube(5.0f);
        BranchGroup objRoot = new BranchGroup();
        
        rg.addChild(cube);

        //Menciptakan handler/beha1ior mouse rotate
        rg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        rg.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        MouseRotate mr = new MouseRotate(rg); 
        mr.setSchedulingBounds(new BoundingSphere(new Point3d(0, 0, 0), Double.MIN_VALUE)); 

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SampelKubus3D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
/*
class Sampel3D extends JFrame {
    public Sampel3D () {
        System.out.println ("Method ini berjalan");
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
      Canvas3D canvas = new Canvas3D(config);
      SimpleUniverse universe = new SimpleUniverse(canvas);
   
      // Set up the viewer looking into the scene.
      universe.getViewingPlatform().setNominalViewingTransform();
   
      // Create the content branch and add it to the universe
      BranchGroup scene = createSceneGraph();
      universe.addBranchGraph(scene);
    }
    public BranchGroup createSceneGraph() {
      // Create the root node of the content branch
      BranchGroup nodeRoot = new BranchGroup();
   
      // Create the TransformGroup node, which is writable to support
      // animation, and add it under the root
      TransformGroup nodeTrans = new TransformGroup();
      nodeTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      nodeRoot.addChild(nodeTrans);
   
      // Create a visual object node (color cube) and add it to the scene.
      nodeTrans.addChild(new ColorCube(0.4));
  
      // Create a Behavior node to rotate the cube add it to the scene.
      Transform3D yAxis = new Transform3D();
      Alpha timing = new Alpha(-1, 4000);
      RotationInterpolator nodeRotator = new RotationInterpolator(timing,
            nodeTrans, yAxis, 0.0f, (float)Math.PI * 2.0f);
      BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
      nodeRotator.setSchedulingBounds(bounds);
      nodeRoot.addChild(nodeRotator);
   
      // Compile to perform optimizations on this content branch.
      nodeRoot.compile();
  
      return nodeRoot;
   }
}*/