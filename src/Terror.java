public class Terror extends Videojuegos{
    public String dificultad;
    public Terror(String nombre_juego, int anio, String dificultad){
        super(nombre_juego,anio);
        this.dificultad=dificultad;
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("La dificultad del juego es: " + dificultad);


    }
}
