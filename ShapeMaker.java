//*************************************************************************************
//  ShapeMaker.java
//
//  Dustin Kaban T00663749
//  COMP 1231 Assignment 1
//
//  This is the driver class, we use it to create an array of 3D Shapes and
//  print out the information about the shapes types, volumes, and surface areas.
//*************************************************************************************

public class ShapeMaker
{
    public static void main(String[] args)
    {
        //Create an array of shapes, assigning at least one of each shape
        ThreeDShape[] shapes = new ThreeDShape[3];
        shapes[0] = new Cube(3);
        shapes[1] = new Sphere(5);
        shapes[2] = new Cylinder(2,4);

        //Loop through the array to display the information
        for(int i=0;i<shapes.length;i++)
        {
            System.out.println(shapes[i]);
        }
    }
}
