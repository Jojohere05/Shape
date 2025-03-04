import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:  // Circle
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area: " + circle.calculateArea());
                    System.out.println("Perimeter: " + circle.calculatePerimeter());
                    break;

                case 2:  // Rectangle
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area: " + rectangle.calculateArea());
                    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                    break;

                case 3:  // Square
                    System.out.print("Enter side length: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    System.out.println("Area: " + square.calculateArea());
                    System.out.println("Perimeter: " + square.calculatePerimeter());
                    break;

                case 4:  // Sphere
                    System.out.print("Enter radius: ");
                    double sphereRadius = scanner.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    System.out.println("Surface Area: " + sphere.surfaceArea());
                    System.out.println("Volume: " + sphere.calculateVolume());
                    break;

                case 5:  // Cylinder
                    System.out.print("Enter radius: ");
                    double cylRadius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double cylHeight = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
                    System.out.println("Surface Area: " + cylinder.surfaceArea());
                    System.out.println("Volume: " + cylinder.calculateVolume());
                    break;

                case 6:  // Equilateral Pyramid (Square Base)
                    System.out.print("Enter base length: ");
                    double baseLength = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double pyramidHeight = scanner.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(baseLength, pyramidHeight);
                    System.out.println("Surface Area: " + pyramid.surfaceArea());
                    System.out.println("Volume: " + pyramid.calculateVolume());
                    break;

                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 7);

        scanner.close();
    }
}


    


