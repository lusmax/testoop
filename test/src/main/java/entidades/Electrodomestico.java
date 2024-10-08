package entidades;

/**
 *
 * @author ronar
 */
public abstract class Electrodomestico {

    // atributos
    protected float precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    // atributos por defecto
    public static final float PRECIO_BASE = 100;
    public static final String COLOR = "blanco";
    public static final char CONSUMO_ENERGETICO = 'F';
    public static final float PESO = 5;

    // Colores disponibles    
    protected String[] availableColor = {"blanco", "gris", "azul", "rojo", "negro"};

    // consumo energetico disponible
    protected char[] availableConsumptionEnergy = {'A', 'B', 'C', 'D', 'E', 'F'};

    //constructores
    public Electrodomestico() {
        this.precioBase = Electrodomestico.PRECIO_BASE;
        this.color = Electrodomestico.COLOR;
        this.consumoEnergetico = Electrodomestico.CONSUMO_ENERGETICO;
        this.peso = Electrodomestico.PESO;
    }

    public Electrodomestico(float precio, float peso) {
        this.precioBase = precio;
        this.peso = peso;
        this.color = Electrodomestico.COLOR;
        this.consumoEnergetico = Electrodomestico.CONSUMO_ENERGETICO;
    }

    public Electrodomestico(float precio, float peso, String color, char consumoEnergetico) {
        this.precioBase = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    //getters
    public float getPrecioBase() {
        return this.precioBase;
    }

    public String getColor() {
        return this.color;
    }

    public char getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public float getPeso() {
        return this.peso;
    }

    //setters
    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    //metodos

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
