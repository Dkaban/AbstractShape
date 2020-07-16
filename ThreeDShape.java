//*************************************************************************************
//  ThreeDShape.java
//
//  Dustin Kaban T00663749
//  COMP 1231 Assignment 1
//
//  This is the parent class for all of the 3D shapes.
//  It contains only a name variable and sets up abstract methods
//  for the shapes to use.  This is the blueprint for all other shapes.
//*************************************************************************************

public abstract class ThreeDShape
{
    private String shapeName;

    //Constructor to set the Name
    public ThreeDShape(String name)
    {
        super();
        this.shapeName = name;
    }

    //Abstract methods that will be useful for all of our shapes
    public abstract double getVolume();
    public abstract double getSurfaceArea();

    //toString method to display the shapes name
    public String toString()
    {
        return "Type: " + this.shapeName;
    }
}
