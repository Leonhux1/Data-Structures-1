// a package named Lab3 to organize all the files
package Lab3;

// imports
import java.util.*;
import java.text.*;

// an AbstractShape class that extends TwoDShape, and ThreeDShape
public abstract class AbstractShape implements TwoDShape, ThreeDShape{

   // static int variable that holds the number of shapes created
   protected static int numShapesCreated;
   
   // static method that increments the number of shapes created
   public static void incrementNumShapesCreated() {
      AbstractShape.numShapesCreated++;
   }
   
   // accessor method that returns the number of shapes created
   public static int getNumShapesCreated() {
      return numShapesCreated;
   }
   
   // abstract methods
   public abstract double area();
   
   public abstract double perimeter();
   
   public abstract double volume();
}

// a Rectangle class that extends the AbstractShape class
class Rectangle extends AbstractShape {

   // variables that hold information about rectangles
   private static int numRectanglesCreated = 0;
   private double length;
   private double width;
   
   // default constructor
   public Rectangle() {
      incrementNumRectanglesCreated();
      incrementNumShapesCreated();
   }
   
   // custom constructor that sets the appropriate variables in a rectangle object
   public Rectangle(double len, double wid) {
      length = len;
      width = wid;
      incrementNumRectanglesCreated();
      incrementNumShapesCreated();
   }
   
   // calculates and returns the area of a rectangle
   public double area() {
      double area = length * width;
      return area;
   }
   
   // calculates and returns the perimeter of a rectangle
   public double perimeter() {
      double perimeter = 2 * (length + width);
      return perimeter;
   }
   
   // returns the volume of a rectangle
   public double volume() {
      return 0.0;
   }
   
   // incremeents the number of rectangles created 
   private void incrementNumRectanglesCreated() {
     numRectanglesCreated++;
   }
    
   // increments the number of shapes created
   public static void incrementNumShapesCreated() {
     numShapesCreated++;
   }
   
   // accessor method that returns the number of rectangles created 
   public static int getNumCreated() {
     return numRectanglesCreated;
   } 
}

// a Circle class that extends the AbstractShape class
class Circle extends AbstractShape {

   // variables that hold information about the circles
   private static int numCirclesCreated = 0;
   private double radius = 0.0;
   
   // default constructor
   public Circle() {
      incrementNumCirclesCreated();
      incrementNumShapesCreated();
   }
   
   // custom constructor that sets appropriate variables in a rectangle object
   public Circle(double rad) {
      this.radius = rad;
      incrementNumCirclesCreated();
      incrementNumShapesCreated();
   }
   
   // calculates and returns the area of a circle
   public double area() {
      double area = Math.PI * (radius * radius);
      return area;
   }
   
   // calculates and returns the perimeter of a circle
   public double perimeter() {
      double perimeter = 2 * (Math.PI * radius);
      return perimeter;
   }
   
   // calculates and returns the volume of a circle
   public double volume() {
      return 0.0;
   }
    
   // increments the number of circles created
   private void incrementNumCirclesCreated() {
      numCirclesCreated++;
   }
    
   // increments the number of shapes created
   public static void incrementNumShapesCreated() {
     numShapesCreated++;
   }
    
   // accessor method that returns the number of circles created 
   public static int getNumCreated() {
     return numCirclesCreated;
   }
}

// a Cuboid class that extends the AbstractShape class
class Cuboid extends AbstractShape {

   // variables that hold information about the cuboid
   private static int numCuboidsCreated = 0;
   private double length = 0.0;
   private double width = 0.0;
   private double height = 0.0;
   
   // default constructor
   public Cuboid() {
      incrementNumCuboidsCreated();
      incrementNumShapesCreated();
   }
   
   // custom constructor that sets appropriate variables in a cuboid object
   public Cuboid(double len, double wid, double hei) {
      this.length = len;
      this.width = wid;
      this.height = hei;
      incrementNumCuboidsCreated();
      incrementNumShapesCreated();
   }
   
   // calculates and returns the area of a cuboid
   public double area() {
      double area = 2 * (length * width + width * height + height * length);
      return area;
   }
   
   // calculates and returns the perimeter of a cuboid
   public double perimeter() {
      return 0.0;
   }
   
   // calculates and returns the volume of a cuboid
   public double volume() {
      double volume = length * (width * height);
      return volume;
   }
    
   // increments the number of cuboids created 
   private void incrementNumCuboidsCreated() {
     numCuboidsCreated++;
   }
    
   // increments the number of shapes created 
   public static void incrementNumShapesCreated() {
     numShapesCreated++;
   }
   
   // returns the number of cuboids created 
   public static int getNumCreated() {
     return numCuboidsCreated;
   }
}

// a Sphere class that extends the AbstractShape class
class Sphere extends AbstractShape {
   
   // variables that hold information about the sphere   
   private static int numSpheresCreated = 0;
   private double radius = 0.0;
   
   // default constructor
   public Sphere() {
      incrementNumSpheresCreated();
      incrementNumShapesCreated();
   }
   
   // custom constructor that sets appropriate variables in a sphere object
   public Sphere(double rad) {
      this.radius = rad;
      incrementNumSpheresCreated();
      incrementNumShapesCreated();
   }
   
   // calculates and returns the area of a sphere
   public double area() {
      double area = 4.0 * (Math.PI * radius * radius);
      return area;
   }
   
   // calculates and returns the perimeter of a sphere
   public double perimeter() {
      return 0.0;
   }
   
   // calculates and returns the volume of a sphere
   public double volume() {
      double volume = (4.0 * Math.PI * (radius * radius * radius)) / 3.0;
      return volume;
   }
    
   // increments the number of spheres created 
   private void incrementNumSpheresCreated() {
     numSpheresCreated++;
   }
    
   // increments the number of shapes created
   public static void incrementNumShapesCreated() {
     numShapesCreated++;
   }
    
   // returns the number of spheres created 
   public static int getNumCreated() {
     return numSpheresCreated;
   }
}