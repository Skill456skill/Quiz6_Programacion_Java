class Triángulo extends FiguraGeometrica {

    /* Atributos */
    private double base;
    private double altura;

    /*
     * Metodo constructor para inicializar la clase
     * 
     * @param base la base del triangulo
     * 
     * @param altura la altura del triangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Triángulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /*
     * Metodo para obtener el area
     * 
     * @return muestra el area del triangulo
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    /*
     * Metodo para obtener el perimetro
     * 
     * @return Muestra el perimetro del triangulo
     * 
     * Complejidad temporal: O(1) Tiempo Constante
     */
    @Override
    public double obtenerPerimetro() {
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}
