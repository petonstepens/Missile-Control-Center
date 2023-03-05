import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class MissleLaunch {
    
    public static void main(String[] args) {
        Scanner CourseCorrect = new Scanner(System.in);
        Scanner launchMissle = new Scanner(System.in);
        Random rand = new Random();

        int latitude = rand.nextInt(360);
        int longitude = rand.nextInt(360);
        int courseChange = rand.nextInt(359);

        out.println("Type 'abort' (without quotes) at any time to abort the missile.");
        String missleCoords = (latitude +",  " + longitude + ".");
        out.println("Launch missle to coordinates " + missleCoords + " y/n");
        String launchConfirm = launchMissle.nextLine();
        int latChange = latitude - courseChange;

        if (launchConfirm.equals("y")) {
            out.println("Missle has been launched.");
            if (courseChange == (0)) {
                out.println("The missle has hit its target, with no needed course corrections.");
            } else {
                out.println("The missle is off course. Would you like to correct its flight path? y/n");
            
                String correctCourse = CourseCorrect.nextLine();
                if (correctCourse.equals("y")) {
                    out.println("You have corrected the course of the missle by " + latChange + " degrees latitude.");
                    out.println("The missle succesfully struck its target.");
                } else {
                    if (correctCourse.equals("n")) {
                    out.println("News flash! A missle launched by the US Government has crashed into a neighborhood! No reported injuries.");
                } if (correctCourse.equals("abort")) {
                    out.println("Missile aborted.");
                }
            }
            }
        } else {
            if (launchConfirm.equals("abort")) {
            out.println("Launch aborted.");
        }
    }

        launchMissle.close();
        CourseCorrect.close();

}
}