public class CirculoTest {

    public static void main(String[] args) {

        Circulo c1 = new Circulo(25.0, "verde");
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Área: " + c1.getArea());

        c1.setRadio(42.0);
        c1.setColor("rojo");

        Circulo c3 = new Circulo(20.0, "azul");
        System.out.println(c3);

        Circulo c2 = new Circulo(6.55);
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Área: " + c2.getArea());
    }
}