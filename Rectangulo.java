class Rectángulo extends FiguraGeometrica {

    /* Atributos */
    private double lado1;
    private double lado2;

    /*
     * Metodo constructor para inicializar la clase
     * 
     * @param lado1 el primer lado del recangulo
     * 
     * @param lado2 el segundo lado del rectangulo
     * 
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Rectángulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /*
     * Metodo para obtener el area
     * 
     * @return muestra el area del rectangulo
     * 
     * Complejidad temporal: O(1) Tiempo Constante
     */
    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }

    /*
     * Metodo para obtener el perimetro
     * 
     * @return muestra el perimetro del rectangulo
     * 
     * Complejidad temporal: O(1) Tiempo Constante
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
