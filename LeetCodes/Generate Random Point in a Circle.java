"""
Given the radius and the position of the center of a circle, implement the function randPoint which generates a uniform random point inside the circle.

Implement the Solution class:

Solution(double radius, double x_center, double y_center) initializes the object with the radius of the circle radius and the position of the center (x_center, y_center).
randPoint() returns a random point inside the circle. A point on the circumference of the circle is considered to be in the circle. The answer is returned as an array [x, y].
"""


class Solution {

    public double[] center = new double[2];
    public double rad;
    public Solution(double radius, double x_center, double y_center) 
    {
        this.center =  new double[]{x_center, y_center};
        this.rad = radius;    
    }
    
    public double[] randPoint() 
    {
        double[] arr = new double[2];
        arr[0] = this.center[0]+((this.rad) * (2*(Math.random()-(0.5))));
        arr[1] = this.center[1]+((this.rad) * (2*(Math.random()-(0.5))));

        return(arr);    
    }
}
