//*************************************************************************************
//  Sphere.java
//
//  Dustin Kaban T00663749
//  COMP 1231 Assignment 1
//
//  This is a child class of ThreeDShape, which represents a Sphere shape.
//  This class only has one variable, radius.  It calculates the volume
//  and surface Area and returns all of the information to be
//  displayed to the user.
//*************************************************************************************

import java.text.DecimalFormat;

public class Sphere extends ThreeDShape
{
    //Variables to store the radius
    private double radius;

    //Constructor (sets the name and radius)
    public Sphere(double rad)
    {
        super("Sphere");
        this.radius = rad;
    }

    //Calculates the Volume of a Sphere given a radius
    public double getVolume()
    {
        if(radius < 0) return 0;
        return (4.0/3.0)*Math.PI*Math.pow(radius,3);
    }

    //Calculates the Surface Area of a Sphere given a side length
    public double getSurfaceArea()
    {
        if(radius < 0) return 0;
        return (4.0 * Math.PI * Math.pow(radius,2));
    }

    //Returns all the information to the user about this Sphere
    public String toString()
    {
        DecimalFormat df = new DecimalFormat(".00");
        return super.toString() + ", Radius: " + radius + ",\n Volume: " + df.format(getVolume())
                + ", Surface Area: " + df.format(getSurfaceArea());
    }
}
