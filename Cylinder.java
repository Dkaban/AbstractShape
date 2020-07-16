//*************************************************************************************
//  Cylinder.java
//
//  Dustin Kaban T00663749
//  COMP 1231 Assignment 1
//
//  This is a child class of ThreeDShape, which represents a Cylinder shape.
//  This class requires two variables, radius and height.
//  It calculates the volume and surface Area and returns all of
//  the information to be displayed to the user.
//*************************************************************************************

import java.text.DecimalFormat;

public class Cylinder extends ThreeDShape
{
    //Variables to store attribute dimensions
    private double radius, height;

    //Constructor (sets the name, radius and height)
    public Cylinder(double cylinderRadius, double cylinderHeight)
    {
        super("Cylinder");
        this.radius = cylinderRadius;
        this.height = cylinderHeight;
    }

    //Calculates the Volume of a Cylinder given a radius and height
    public double getVolume()
    {
        if(radius < 0 || height < 0) return 0;
        return Math.PI*Math.pow(radius,2)*height;
    }

    //Calculates the Surface Area of a cylinder given a radius and height
    public double getSurfaceArea()
    {
        if(radius < 0 || height < 0) return 0;
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius,2));
    }

    //Returns all the information about this Cylinder
    public String toString()
    {
        DecimalFormat df = new DecimalFormat(".00");
        return super.toString() + ", Radius: " + radius + ", Height: " + height
                + ",\n Volume: " + df.format(getVolume())
                + ", Surface Area: " + df.format(getSurfaceArea());
    }
}
