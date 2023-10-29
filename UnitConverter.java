import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter");
        System.out.println("1. Length");
        System.out.println("2. Area");
        System.out.println("3. Volume");
        System.out.print("Select a category (1/2/3): ");

        int category = scanner.nextInt();

        if (category == 1) {
            lengthConverter(scanner);
        } else if (category == 2) {
            areaConverter(scanner);
        } else if (category == 3) {
            volumeConverter(scanner);
        } else {
            System.out.println("Invalid category selection.");
        }

        scanner.close();
    }

    public static void lengthConverter(Scanner scanner) {
        System.out.println("Length Converter");
        System.out.print("Enter the length in meters: ");
        double meters = scanner.nextDouble();

        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        System.out.println("Length in feet: " + feet);
        System.out.println("Length in inches: " + inches);
    }

    public static void areaConverter(Scanner scanner) {
        System.out.println("Area Converter");
        System.out.print("Enter the area in square meters: ");
        double squareMeters = scanner.nextDouble();

        double squareFeet = squareMeters * 10.7639;

        System.out.println("Area in square feet: " + squareFeet);
    }

    public static void volumeConverter(Scanner scanner) {
        System.out.println("Volume Converter");
        System.out.print("Enter the volume in liters: ");
        double liters = scanner.nextDouble();

        double gallons = liters * 0.264172;
        double cubicInches = liters * 61.0237;

        System.out.println("Volume in gallons: " + gallons);
        System.out.println("Volume in cubic inches: " + cubicInches);
    }
}
