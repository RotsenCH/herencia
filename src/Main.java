public class Main {
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo();
        miRectangulo.setX(20);
        miRectangulo.setY(10);
        miRectangulo.calcularPerimetro();
        System.out.println(miRectangulo.getPerimetro());
        miRectangulo.calcularArea();
        System.out.println(miRectangulo.getArea());

        Cuadrado miCuadrado = new Cuadrado();
        miCuadrado.setX(4);
        miCuadrado.setY(4);
        miCuadrado.calcularArea();
        miCuadrado.calcularPerimetro();

        System.out.println(miCuadrado.getPerimetro());
        System.out.println(miCuadrado.getArea());

        ColorTriangulo t1 = new ColorTriangulo("Azul", "Estilo x", 8.0, 12.0);
        ColorTriangulo t2 = new ColorTriangulo("Rojo", "Estilo y", 4.0, 3.0);

        System.out.println("\t\nDatos del triangulo 1");

        t1.mostrarEstilo();
        t1.mostrarDimension();
        t1.mostrarColor();

        System.out.println("Su area es: " + t1.area());

        System.out.println("\t\nDatos del triangulo 2");

        t2.mostrarEstilo();
        t2.mostrarDimension();
        t2.mostrarColor();

        System.out.println("Su area es: " + t2.area());
    }
}