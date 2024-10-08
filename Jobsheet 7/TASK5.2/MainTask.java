public class MainTask {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen();
        Manusia manusia2 = new Mahasiswa();
        
        // Dynamic method dispatch in action
        manusia1.bernafas();  // Calls Manusia's bernafas()
        manusia1.makan();     // Calls Dosen's makan()
        
        manusia2.bernafas();  // Calls Manusia's bernafas()
        manusia2.makan();     // Calls Mahasiswa's makan()
        
        // Demonstrating type-specific methods
        if (manusia1 instanceof Dosen) {
            ((Dosen) manusia1).lembur();
        }
        
        if (manusia2 instanceof Mahasiswa) {
            ((Mahasiswa) manusia2).tidur();
        }
    }
} 