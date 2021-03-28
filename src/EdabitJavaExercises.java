public class EdabitJavaExercises {

    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(perimeterOfRectangle(5,6));
    }

    //Write a function that takes an integer minutes and converts it to seconds.
    public static int convert(int minutes) {
        return minutes * 60;
    }

    //Create a function that takes length and width and finds the perimeter of a rectangle.
    public static int perimeterOfRectangle(int length, int width) {
        return 2 * (length + width);
    }
}
