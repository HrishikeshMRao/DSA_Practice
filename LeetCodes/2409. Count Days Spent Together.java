/*
Alice and Bob are traveling to Rome for separate business meetings.

You are given 4 strings arriveAlice, leaveAlice, arriveBob, and leaveBob. Alice will be in the city from the dates arriveAlice to leaveAlice (inclusive), while Bob will be in the city from the dates arriveBob to leaveBob (inclusive). Each will be a 5-character string in the format "MM-DD", corresponding to the month and day of the date.

Return the total number of days that Alice and Bob are in Rome together.

You can assume that all dates occur in the same calendar year, which is not a leap year. Note that the number of days per month can be represented as: [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31].
*/



class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int[] Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[] Alice_arrive = Arrays.stream(arriveAlice.split("-", 2)).mapToInt(Integer::parseInt).toArray();
        int[] Alice_leave = Arrays.stream(leaveAlice.split("-", 2)).mapToInt(Integer::parseInt).toArray();
        int[] Bob_Arrive = Arrays.stream(arriveBob.split("-", 2)).mapToInt(Integer::parseInt).toArray();
        int[] Bob_leave = Arrays.stream(leaveBob.split("-", 2)).mapToInt(Integer::parseInt).toArray();
        
        for(int i=0;i<Alice_arrive[0]-1;i++)
        {
            Alice_arrive[1] += Month[i];
        }
        for(int i=0;i<Alice_leave[0]-1;i++)
        {
            Alice_leave[1] += Month[i];
        }
        for(int i=0;i<Bob_Arrive[0]-1;i++)
        {
            Bob_Arrive[1] += Month[i];
        }
        for(int i=0;i<Bob_leave[0]-1;i++)
        {
            Bob_leave[1] += Month[i];
        }

        int end = (Alice_leave[1]<Bob_leave[1])?Alice_leave[1]:Bob_leave[1];
        int stay =  (Alice_arrive[1]>Bob_Arrive[1])?end-Alice_arrive[1]:end-Bob_Arrive[1];

        if(stay>=0)return stay+1; return 0;

    }
}
