package Sampel3D;

import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.geometry.ColorCube;
import javax.media.j3d.*;
import javax.vecmath.*;
import java.awt.*;
import javax.swing.*;
public class Kubus3D extends JFrame {
    public Kubus3D() {
      // Setup a SimpleUniverse by referencing a Canvas3D
        System.out.println ("Metod ini berjalan");
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
      universe.addBranchGraph(scene);
   
      // Configure this JFrame
      this.setSize(250, 250);
      this.setLocation(200, 250);
      this.setTitle("Kubus 3D");
      this.setVisible(true);
   }
   
   // Create the content branch
   public BranchGroup createSceneGraph() {
       System.out.println ("Bagian ini berjalan");
      // Create the root node of the content branch
      BranchGroup nodeRoot = new BranchGroup();
   
      // Create the TransformGroup node, which is writable to support
      // animation, and add it under the root
      TransformGroup nodeTrans = new TransformGroup();
      nodeTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      nodeRoot.addChild(nodeTrans);
   
      // Create a visual object node (color cube) and add it to the scene.
      //nodeTrans.addChild(new ColorCube());
  
      // Create a Behavior node to rotate the cube add it to the scene.
      Transform3D yAxis = new Transform3D();
      yAxis.rotX(-45.0);
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
   
   // Entry main method to invoke the constructor on the event dispatcher thread.
   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Kubus3D();
         }
      });
   }
}
