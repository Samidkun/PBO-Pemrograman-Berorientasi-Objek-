public class DemoSquare {
    public static void main(String[] args) {
        rectangle square = new rectangle(5, 5); // Misalkan panjang dan lebar sama untuk persegi

        square.displayInfo();
        System.out.println("Area: " + square.getArea());
        System.out.println("Circumference: " + square.getCircumference());
    }
}
