public class FiguraGeometrica {

    /* Atributos */
    private String nombre;
    private String color;

    /*
     * Metodo constructor para inicializar la clase
     *
     * @param nombre nombre de la prenda
     * 
     * @param color color de la prenda
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /*
     * Metodo para obtener el area
     * 
     * @return muestra el valor del area de la figura
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerArea() {
        return 0.0;
    }

    /*
     * Metodo para obtener el perimetro
     * 
     * @return muestra el valor del perimetro de la figura
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerPerimetro() {
        return 0.0;
    }

    /* Getters y Setters */

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }
}