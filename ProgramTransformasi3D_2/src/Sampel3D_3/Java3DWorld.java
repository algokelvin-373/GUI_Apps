package Sampel3D_3;

import Sampel3D_2.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;

 // Java extension packages
 import javax.swing.event.*;
 import javax.media.j3d.*;
 import javax.vecmath.*;

 // Java 3D utility packages
 import com.sun.j3d.utils.universe.*;
 import com.sun.j3d.utils.image.*;
 import com.sun.j3d.utils.geometry.*;
 import com.sun.j3d.utils.behaviors.mouse.*;
import com.sun.j3d.utils.behaviors.keyboard.*;
public class Java3DWorld extends Canvas3D {
    private Appearance appearance; // 3D object's appearance
    //private Box shape; // 3D object to manipulate
    //private Cylinder shape2;
    private Box shape = new Box(0.3f, 0.3f, 0.3f,
                        Box.GENERATE_NORMALS | Box.GENERATE_TEXTURE_COORDS,
                        appearance);
    private Cylinder shape2 = new Cylinder(0.3f , 0.3f, appearance);
    private Cone shape3 = new Cone(0.3f, 0.3f, Cone.GENERATE_NORMALS, appearance);
    private Color3f lightColor; // Light color
    private Light ambientLight; // ambient scene lighting
    private Light directionalLight; //directional light
    private Material material; // 3D objects color object
    private SimpleUniverse simpleUniverse; // 3D scene environment
    private TextureLoader textureLoader; // 3D object's texture
    
    // holds 3D transformation information
    private TransformGroup transformGroup;

    private String imageName; // texture image file name
    private static int Gambar3Dimensi = 0;

    // Java3DWorld constructor
    public Java3DWorld(int x)
    {
        super( SimpleUniverse.getPreferredConfiguration() );
        
        Gambar3Dimensi = x;
        //imageName = imageFileName;
        // create SimpleUniverse (3D Graphics environment)
        simpleUniverse = new SimpleUniverse( this );

        // set default view point and direction
        ViewingPlatform viewPlatform =
        simpleUniverse.getViewingPlatform();

        viewPlatform.setNominalViewingTransform();

        // create 3D scene
        BranchGroup branchGroup = createScene();

        // attach BranchGroup to SimpleUniverse
        simpleUniverse.addBranchGraph( branchGroup );

    } // end Java3DWorld constructor

    // create 3D scene
    public BranchGroup createScene()
    {
        BranchGroup scene = new BranchGroup();

        // initialize TransformGroup
        transformGroup = new TransformGroup();

        // set TransformGroup's READ and WRITE permission
        transformGroup.setCapability(
        TransformGroup.ALLOW_TRANSFORM_READ );

        transformGroup.setCapability(
        TransformGroup.ALLOW_TRANSFORM_WRITE );

        // add TransformGroup to BranchGroup
        scene.addChild( transformGroup );

        // create BoundingSphere
        BoundingSphere bounds = new BoundingSphere(
        new Point3d( 0.0f, 0.0f, 0.0f ), 100.0 );

        appearance = new Appearance(); // create object appearance
        material = new Material(); // create texture matieral
        appearance.setMaterial( material );

        String rgb = new String( "RGB" );
        
        switch (Gambar3Dimensi) {
            case 1 : transformGroup.addChild( shape );
                     break;
            case 2 : transformGroup.addChild( shape2 );
                     break;
            case 3 : transformGroup.addChild( shape3 );
                     break;
        }
        
        ambientLight = new AmbientLight();
        lightColor = new Color3f();
        ambientLight.setColor(lightColor);
        
        ambientLight.setCapability(
        AmbientLight.ALLOW_COLOR_WRITE );

        ambientLight.setCapability(
        AmbientLight.ALLOW_COLOR_READ );

        ambientLight.setInfluencingBounds( bounds );
        
        /*
        // initialize directionalLight
        directionalLight = new DirectionalLight();

        lightColor = new Color3f(); // initialize light color

        // set initial DirectionalLight color
        directionalLight.setColor( lightColor );

        // set capability bits to allow DirectionalLight's
        // Color and Direction to be changed
        directionalLight.setCapability(
        DirectionalLight.ALLOW_DIRECTION_WRITE );

        directionalLight.setCapability(
        DirectionalLight.ALLOW_DIRECTION_READ );

        directionalLight.setCapability(
        DirectionalLight.ALLOW_COLOR_WRITE );

        directionalLight.setCapability(
        DirectionalLight.ALLOW_COLOR_READ );

        directionalLight.setInfluencingBounds( bounds ); */
        // add light nodes to BranchGroup
        scene.addChild( ambientLight );
        //scene.addChild( directionalLight ); 

        // initialize rotation behavior
        MouseRotate rotateBehavior = new MouseRotate();
        rotateBehavior.setTransformGroup( transformGroup );
        rotateBehavior.setSchedulingBounds( bounds );
        
        //KeyNavigator translasi = new KeyNavigator(transformGroup);
        //translasi.processKeyEvent();
        
        // initialize translation behavior
        MouseTranslate translateBehavior = new MouseTranslate();
        translateBehavior.setTransformGroup( transformGroup );
        translateBehavior.setSchedulingBounds(
        new BoundingBox( new Point3d( -1.0f, -1.0f, -1.0f ),
        new Point3d( 1.0f, 1.0f, 1.0f ) ) );

        // initialize scaling behavior
        MouseZoom scaleBehavior = new MouseZoom();
        scaleBehavior.setTransformGroup( transformGroup );
        scaleBehavior.setSchedulingBounds( bounds );

        // add behaviors to BranchGroup
        scene.addChild( scaleBehavior );
        scene.addChild( rotateBehavior );
        scene.addChild( translateBehavior );

        scene.compile();

        return scene;

    } // end method createScene

    // change DirectionLight color
    public void changeColor( Color color )
    {
        lightColor.set( color );
        ambientLight.setColor( lightColor );
    }

    // return preferred dimensions of Container
    public Dimension getPreferredSize()
    {
        return new Dimension( 500, 500 );
    }

    // return minimum size of Container
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }
}
