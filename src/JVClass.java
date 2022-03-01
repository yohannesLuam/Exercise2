public class JVClass {
    public static void main(String[] args) {
        float earthWeightYohannes = 52;
        float marsWeightYohannes = (earthWeightYohannes * 0.38F);
        double marsWeightYohannesDbl;
        int marsWeightYohannesInt;
        char w;
        int mathEg;

        // Writing weight on Mars in floats in the console
        System.out.println(earthWeightYohannes + "kg on Earth is equal to " + marsWeightYohannes + "kg on Mars");

        // Assigning the value to a double variable
        marsWeightYohannesDbl = marsWeightYohannes;
        System.out.println(marsWeightYohannesDbl + "kg is the weight on Mars in Double");

        // Limiting to 4 decimal places
        System.out.printf("Weight on Mars to 4 decimal places is: %.4f %n", marsWeightYohannesDbl );

        // Casting into int
        marsWeightYohannesInt = (int)marsWeightYohannesDbl;
        System.out.println(marsWeightYohannesInt + "kg is the weight on Mars in int");

        // Casting into char
        w = (char)marsWeightYohannesInt;
        System.out.println("The ASCII table equivalent of weight on Mars is: " + w);

        // Math on char
        mathEg = 2 * w;
        System.out.println("Example of mathematical operation on char datatype: "+mathEg);
    }
}
