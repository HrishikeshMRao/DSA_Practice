"""
Given the radius and the position of the center of a circle, implement the function randPoint which generates a uniform random point inside the circle.

Implement the Solution class:

Solution(double radius, double x_center, double y_center) initializes the object with the radius of the circle radius and the position of the center (x_center, y_center).
randPoint() returns a random point inside the circle. A point on the circumference of the circle is considered to be in the circle. The answer is returned as an array [x, y].
  """



class Solution {
    double RAD, XC, YC;
    public Solution(double radius, double x_center, double y_center) {
        RAD = radius;
        XC = x_center;
        YC = y_center;
    }
    public double[] randPoint() {
        double ang = Math.random() * 2 * Math.PI,
            hyp = Math.sqrt(Math.random()) * RAD,
            adj = Math.cos(ang) * hyp,
            opp = Math.sin(ang) * hyp;
        return new double[]{XC + adj, YC + opp};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */
