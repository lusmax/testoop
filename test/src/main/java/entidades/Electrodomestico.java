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
    
}
