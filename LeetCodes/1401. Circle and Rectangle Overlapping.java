// You are given a circle represented as (radius, xCenter, yCenter) and an axis-aligned rectangle represented as (x1, y1, x2, y2), where (x1, y1) are the coordinates of the bottom-left corner, and (x2, y2) are the coordinates of the top-right corner of the rectangle.

// Return true if the circle and rectangle are overlapped otherwise return false. In other words, check if there is any point (xi, yi) that belongs to the circle and the rectangle at the same time.

class Solution {
       public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        double v_x = Math.abs(xCenter - (double) (x1 + x2) / 2) - (double) (x2 - x1) / 2;
        double v_y = Math.abs(yCenter - (double) (y1 + y2) / 2) - (double) (y2 - y1) / 2;

        return Math.max(0, v_x) * Math.max(0, v_x) + Math.max(0, v_y) * Math.max(0, v_y) <= radius * radius; 
    }
}
