public class EntradaDiario { 
    private String fecha; 
    private String aprendido; 
    private String realizado; 
    private String dificultades; 
    private String herramientas; 
 
    public EntradaDiario(String fecha, String aprendido, String realizado, String dificultades, String herramientas) { 
        this.fecha = fecha; 
        this.aprendido = aprendido; 
        this.realizado = realizado; 
        this.dificultades = dificultades; 
        this.herramientas = herramientas; 
    } 
 
    public String getFecha() { return fecha; } 
    public void setFecha(String fecha) { this.fecha = fecha; } 
 
    public String getAprendido() { return aprendido; } 
    public void setAprendido(String aprendido) { this.aprendido = aprendido; } 
 
    public String getRealizado() { return realizado; } 
    public void setRealizado(String realizado) { this.realizado = realizado; } 
 
    public String getDificultades() { return dificultades; } 
    public void setDificultades(String dificultades) { this.dificultades = dificultades; } 
 
    public String getHerramientas() { return herramientas; } 
    public void setHerramientas(String herramientas) { this.herramientas = herramientas; } 
 
    @Override 
    public String toString() { 
        return fecha + "|" + aprendido + "|" + realizado + "|" + dificultades + "|" + herramientas; 
    } 
} 
