/**
 * Created by stephenboynton on 6/26/17.
 */
public class Mainer {

    public static void main (String [] args) {
        System.out.println(calculateFeetAndInchesToCentimeters(2, 3));
        System.out.println(calculateFeetAndInchesToCentimeters(5));
    }

    public static double calculateFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet <= 0 && inches <= 0 || inches >= 12) {
            return -1;
        } else {
            double feetCent = feet * 30.48;
            double inchesCent = inches * 2.54;
            return feetCent + inchesCent;

        }
    }

    public static double calculateFeetAndInchesToCentimeters (double inches) {
        if (inches <= 0) {
            return -1;
        } else {
            double feet = inches / 12;
            return calculateFeetAndInchesToCentimeters(feet, 0);

        }
    }

}
