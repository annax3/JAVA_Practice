import java.util.*;
class Poly{
	public static void main(String[] args) {

      /* ##3 Now, we can create objects of both classes and store them in a list of type "Shape".*/

		List<Shape> shapes = new ArrayList<>();
         shapes.add(new Rectangle(10, 20));
         shapes.add(new Circle(5));

/*
##4 We can now iterate through the list of shapes and call the "calculateArea" method on each object, 
without knowing the actual type of the object. The correct implementation of the method will be called 
based on the type of the object.
*/


         for (Shape shape : shapes) {
              shape.calculateArea();
         }


	}
}
/*
##1 Polymorphism is a concept in Object-Oriented Programming that allows objects of different classes to be 
treated as objects of the same class. It allows for a single function or method to work with objects of 
different types, providing a high level of abstraction and code reuse.

Here's an example to demonstrate polymorphism in Java:

Suppose we have a class named "Shape" with an abstract method named "calculateArea".
*/

abstract class Shape{
	abstract void calculateArea();
}

/*
##2 Now, we can create two subclasses "Rectangle" and "Circle" that both extend the "Shape" class and provide 
their own implementation of the "calculateArea" method.
*/


class Rectangle extends Shape {
   int length, width;
   
   Rectangle(int length, int width) {
      this.length = length;
      this.width = width;
   }
   
   void calculateArea() {
      System.out.println("The area of the rectangle is " + (length * width));
   }
}

class Circle extends Shape {
   int radius;
   
   Circle(int radius) {
      this.radius = radius;
   }
   
   void calculateArea() {
      System.out.println("The area of the circle is " + (Math.PI * radius * radius));
   }
}

/*
This is an example of polymorphism, where the same method "calculateArea" can work with objects of 
different classes (Rectangle and Circle) and call the appropriate implementation based on the type of 
the object.
*/