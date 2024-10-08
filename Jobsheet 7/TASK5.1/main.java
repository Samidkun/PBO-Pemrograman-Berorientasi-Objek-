public class main {
    private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return sisiA + sisiB + Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    public static <mainSegitiga> void main(String[] args) {
        main segitiga = new main();

        // Demonstrating totalSudut overloading
        System.out.println("Total sudut dengan satu parameter: " + ((main) segitiga).totalSudut(60));
        System.out.println("Total sudut dengan dua parameter: " + ((main) segitiga).totalSudut(60, 45));

        // Demonstrating keliling overloading
        System.out.println("Keliling segitiga dengan tiga sisi: " + ((main) segitiga).keliling(3, 4, 5));
        System.out.println("Keliling segitiga siku-siku: " + ((main) segitiga).keliling(3, 4));
    }
}