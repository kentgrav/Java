/*
* File: TestPointAccess.java
* Author: Dr. Robertson
* Date: January 1, 2015
* Purpose: This program constructs instances
* of the Point class and uses
* its methods
*/

public class TestPointAccess {	
    public static void main(String[] args)  { 

	// Construct a point with 1.0, 1.0
        PointAccess p1 = new PointAccess(1.0,1.0);
     
	// Construct a default point
	PointAccess p2 = new PointAccess();	

	// Call the getter methods
	double p1X = p1.getX();
	double p1Y = p1.getY();
	// Print results
	System.out.println("p1 values from getX() getY() " + 
                             p1X + "," + p1Y);

	double p2X = p2.getX();
	double p2Y = p2.getY();
	// Print results
	System.out.println("p2 values from getX() getY() " + 
                             p2X + "," + p2Y);

	// Call the Distance Method
//	double distance = p1.getDistance(p1,p2);
	// Print results
//	System.out.println("Distance between p1 and p2 is: " + 
  //                           distance);
	// Change the XY value of P1
	// Using the setter method
	double newX = 2.0;
	double newY = 2.0;
	p1.setX(newX);
	p1.setY(newY);

	// Recalculate the Distance
//	distance = p1.getDistance(p1,p2);
	// Print results
//	System.out.println("New Distance between p1 and p2 is: " + 
//                             distance);
	// Display the values using toString
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	// Display the y value directly
	System.out.println("p1.y is " + p1.y);
	System.out.println("p2.y is " + p2.y);



    }

}