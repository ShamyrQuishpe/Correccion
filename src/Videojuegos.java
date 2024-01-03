public class Videojuegos {
    public String nombre_juego;
    public int anio;
    public Videojuegos(String nombre_juego, int anio){
        this.nombre_juego=nombre_juego;
        this.anio=anio;
    }
    public String getNombreJuego(){
        return nombre_juego;
    }
    public void setNombre_juego(String nombre_juego){
        this.nombre_juego=nombre_juego;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(){
        this.anio=anio;
    }
    public void mostrarInfo(){
        System.out.println("El nombre del juego es: " + nombre_juego);
        System.out.println("El año del lanzamiento fue: " + anio);
    }
}
