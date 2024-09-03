public class rectangle {
    private int length;
    private int width;

    // Konstruktor
    public rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Metode untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    // Metode untuk menghitung luas
    public int getArea() {
        return length * width;
    }

    // Metode untuk menghitung keliling
    public int getCircumference() {
        return 2 * (length + width);
    }
}
