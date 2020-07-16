//*************************************************************************************
//  Cube.java
//
//  Dustin Kaban T00663749
//  COMP 1231 Assignment 1
//
//  This is a child class of ThreeDShape, which represents a Cube shape.
//  This class requires only one variable, sideLength.
//  It calculates the volume and surface Area and returns all
//  of the information to be displayed to the user.
//*************************************************************************************

import java.text.DecimalFormat;

public class Cube extends ThreeDShape
{
    //Variable to store the length of one side
    private double sideLength;

    //Constructor (setting the name and length)
    public Cube(double length)
    {
        super("Cube");
        this.sideLength = length;
    }

    //Calculates the Volume of a Cube given a side length
    public double getVolume()
    {
        if(sideLength < 0 ) return 0;
        return Math.pow(sideLength,3);
    }

    //Calculates the Surface Area of a cube given a side length
    public double getSurfaceArea()
    {
        if(sideLength < 0 ) return 0;
        return 6*(Math.pow(sideLength,2));
    }

    //Returns all the information pertaining to this cube
    public String toString()
    {
        DecimalFormat df = new DecimalFormat(".00");
        return super.toString() + ", Side Length: " + sideLength + ",\n Volume: " + df.format(getVolume())
                + ", Surface Area: " + df.format(getSurfaceArea());
    }
}
