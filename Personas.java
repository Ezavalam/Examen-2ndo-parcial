package Ejercicios;
import java.util.Random;

public class Personas {

    protected String nombre; 
    protected boolean zapatos;
    protected boolean materia;
    protected boolean adulto;
    protected boolean iphone;
    
    public Personas() {
    }
    
    public Personas(String nombre) {
        this.nombre = nombre;
    }
    
    Random rd = new Random();

    public void setZap() {
        zapatos = rd.nextBoolean();
    }
    
    public boolean getZap() {
        return zapatos;
    }
    
    public void setMateria() {
        materia = rd.nextBoolean();
    }
    
    public boolean getMateria() {
        return materia;
    }
    
    public void setAdulto() {
        adulto = rd.nextBoolean();
    }
    
    public boolean getAdulto() {
        return adulto;
    }
    
    public void setIphone() {
        iphone = rd.nextBoolean();
    }
    
    public boolean getIphone() {
        return iphone;
    } 
}