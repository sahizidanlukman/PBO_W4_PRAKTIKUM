public class TestShape {
    public static void main(String[] args) {
        // --- UJI SHAPE ---
        Shape s1 = new Shape();
        System.out.println(s1);

        Shape s2 = new Shape("red", false);
        System.out.println(s2);

        s2.setColor("blue");
        s2.setFilled(true);
        System.out.println(s2.getColor());
        System.out.println(s2.isFilled());
        System.out.println(s2);

        // TAMBAHAN: UJI SQUARE 
        System.out.println("\n=== UJI SQUARE ===");
        Square sq = new Square(5.0);
        System.out.println("Kondisi Awal (side = 5.0):");
        System.out.println("Width : " + sq.getWidth() + " | Length: " + sq.getLength());

        // Menguji panggil setWidth(8.0)
        sq.setWidth(8.0);
        System.out.println("\nSetelah panggil sq.setWidth(8.0):");
        System.out.println("Width : " + sq.getWidth() + " | Length: " + sq.getLength());
    }
}