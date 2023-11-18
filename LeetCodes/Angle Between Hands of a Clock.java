/*
Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.

Answers within 10-5 of the actual value will be accepted as correct.
*/
// time 100%


class Solution {
    public double angleClock(int hour, int minutes) {

        double m = 360*minutes/60;
        double h = ((360*hour/12)+m/12)%360;
        double angle = Math.abs(h-m);
 
        return(Math.min(angle,360-angle));
        
    }
}
