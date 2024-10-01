package source;

import source.inheritence.Dosen;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("098796545", "SAMID JAGO", 10000000, "1998077665");
        Dosen dosen2 = new Dosen("213456", "Safrizal Cupu", 300000, "4567689776");

        System.out.println(dosen1.getAllInfo());
        System.out.println(dosen2.getAllInfo());
    }
}
