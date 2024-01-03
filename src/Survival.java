public class Survival extends Terror {
    public int num_jugadores;
    public Survival(String nombre_juego, int anio, String dificultad, int num_jugadores ){
        super(nombre_juego, anio, dificultad);
        this.num_jugadores=num_jugadores;
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El numero de jugadores es: " + num_jugadores);
    }
}
