package ejem5;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioBase;
    private int aniosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * aniosAntiguedad);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { 
    	this.nombre = nombre; 
    }

    public String getApellido() { 
    	return apellido; 
    }
    public void setApellido(String apellido) { 
    	this.apellido = apellido; 
    }

    public double getSalarioBase() { 
    	return salarioBase; 
    }
    public void setSalarioBase(double salarioBase) { 
    	this.salarioBase = salarioBase; 
    }

    public int getAniosAntiguedad() { 
    	return aniosAntiguedad; 
    }
    public void setAniosAntiguedad(int aniosAntiguedad) { 
    	this.aniosAntiguedad = aniosAntiguedad; 
    }
}
