package entidades;

/**
 *
 * @author ronar
 */
public abstract class Electrodomestico {

    // atributos
    protected float percioBase;
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
        this.percioBase = Electrodomestico.PRECIO_BASE;
        this.color = Electrodomestico.COLOR;
        this.consumoEnergetico = Electrodomestico.CONSUMO_ENERGETICO;
        this.peso = Electrodomestico.PESO;
    }

    public Electrodomestico(float precio, float peso) {
        this.percioBase = precio;
        this.peso = peso;
        this.color = Electrodomestico.COLOR;
        this.consumoEnergetico = Electrodomestico.CONSUMO_ENERGETICO;
    }
    public Electrodomestico(float precio, float peso, String color, char consumoEnergetico){
        this.percioBase = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

}
