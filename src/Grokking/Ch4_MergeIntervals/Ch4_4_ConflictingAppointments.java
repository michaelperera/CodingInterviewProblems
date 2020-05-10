package Grokking.Ch4_MergeIntervals;

import java.util.Arrays;
import java.util.Comparator;

class Ch4_4_ConflictingAppointments {

    public static boolean canAttendAllAppointments(Interval[] intervals) {


        Arrays.sort(intervals, Comparator.comparingInt(a -> a.start));




        int i =0;

        while (i< intervals.length-1) {

            if(intervals[i].end > intervals[i+1].start ){
                return false;
            }
            i++;
        }






        return true;
    }

    public static void main(String[] args) {
        Interval[] intervals = { new Interval(1, 4), new Interval(2, 5), new Interval(7, 9) };
        boolean result = Ch4_4_ConflictingAppointments.canAttendAllAppointments(intervals);
        System.out.println("Can attend all appointments: " + result);

        Interval[] intervals1 = { new Interval(6, 7), new Interval(2, 4), new Interval(8, 12) };
        result = Ch4_4_ConflictingAppointments.canAttendAllAppointments(intervals1);
        System.out.println("Can attend all appointments: " + result);

        Interval[] intervals2 = { new Interval(4, 5), new Interval(2, 3), new Interval(3, 6) };
        result = Ch4_4_ConflictingAppointments.canAttendAllAppointments(intervals2);
        System.out.println("Can attend all appointments: " + result);
    }
}