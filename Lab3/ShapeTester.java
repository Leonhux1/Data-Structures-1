// a package named Lab3 to organize all the files

package Lab3;

public class ShapeTester {
   public static void main(String[] args) {
   
      // Declares an array of AbstractShape 
       AbstractShape[] myShapes = new AbstractShape[16];
       
      // create 4 objects of Rectangle
      AbstractShape rectangle1 = new Rectangle(10.0, 5.0);
      AbstractShape rectangle2 = new Rectangle(20.0, 30.0);
      AbstractShape rectangle3 = new Rectangle(50.0, 10.0);
      AbstractShape rectangle4 = new Rectangle(-10.0, -20.0);
      
      // add rectangle objects to array
      myShapes[0] = rectangle1;
      myShapes[1] = rectangle2;
      myShapes[2] = rectangle3;
      myShapes[3] = rectangle4;
      
      // create 4 objects of Circle 
      AbstractShape circle1 = new Circle(20);
      AbstractShape circle2 = new Circle(10);
      AbstractShape circle3 = new Circle(30);
      AbstractShape circle4 = new Circle(-20); 
      
      // add circle objects to array
      myShapes[4] = circle1;
      myShapes[5] = circle2;
      myShapes[6] = circle3;
      myShapes[7] = circle4;
      
      // create 4 objects of cuboid
      AbstractShape cuboid1 = new Cuboid(20, 10, 6);
      AbstractShape cuboid2 = new Cuboid(40, 5, 50);
      AbstractShape cuboid3 = new Cuboid(30, 20, 20);
      AbstractShape cuboid4 = new Cuboid(-20, 30, -10); 
      
      // add cuboid objects to array
      myShapes[8] = cuboid1;
      myShapes[9] = cuboid2;
      myShapes[10] = cuboid3;
      myShapes[11] = cuboid4;
      
      // create 4 objects of cuboid
      AbstractShape sphere1 = new Sphere(15);
      AbstractShape sphere2 = new Sphere(25);
      AbstractShape sphere3 = new Sphere(12);
      AbstractShape sphere4 = new Sphere(-10);
      
       // add cuboid objects to array
      myShapes[12] = sphere1;
      myShapes[13] = sphere2;
      myShapes[14] = sphere3;
      myShapes[15] = sphere4;
      
      // loop through myShapes and print each shape 
      for (AbstractShape shape : myShapes) {
         System.out.println("Area: " + String.format("%.2f", shape.area()) + " \nPerimeter: "
         + String.format("%.2f", shape.perimeter()) + "\nVolume: " + String.format("%.2f", shape.volume()));
         System.out.println();
      }
      // print totals
      System.out.println("Total number of Rectangle objects = " + Rectangle.getNumCreated());
      System.out.println("Total number of Circle objects = " + Circle.getNumCreated());
      System.out.println("Total number of Cuboid objects = " + Cuboid.getNumCreated());
      System.out.println("Total number of Sphere objects = " + Sphere.getNumCreated());
      System.out.println("Total number of Shape objects = " + AbstractShape.getNumShapesCreated());
   }
}