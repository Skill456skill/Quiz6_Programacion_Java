class Círculo extends FiguraGeometrica {

    /* Atributos */
    private double radio;

    /*
     * Metodo Constructor de Círculo
     * 
     * @param super el nombre y el color del círculo
     * 
     * @param radio el radio del círculo
     * 
     * Complejidad temporal: O(1) tiempo constante
     */
    public Círculo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /*
     * Metodo para obtener el area
     * 
     * @return muestra el area del círculo
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /*
     * Metodo para obtener el perimetro
     * 
     * @return muestra el perimetro del círculo
     * 
     * Complejidad temporal: O(1) Tiempo Constante
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}