
public class Main {
    public static void main(String[] args) {
        Videojuegos juego1 = new Videojuegos("Resident Evil 6", 2012);
        Terror juego_terror1 = new Terror("Resident Evil 4", 2012, "Intermedia");
        Survival juego_survivalh = new Survival("RE:Village", 2022, "Intermedia", 1);

        Videojuegos listajuegos[] = new Videojuegos[3];

        try {
            listajuegos[0]=juego1;
            listajuegos[1]=juego_terror1;
            listajuegos[2]=juego_survivalh;
            listajuegos[3]=juego1;
        }catch (Exception e){
            System.out.println("Error al guardar los datos en la lista");
        }

        listajuegos[0]=juego1;
        listajuegos[1]=juego_terror1;
        listajuegos[2]=juego_survivalh;

        System.out.println("\nTu lista de objetos es: ");
        for(int i=0; i<(listajuegos.length);i++){
            System.out.println(listajuegos[i]);
        }
        System.out.println("\n");
        juego1.mostrarInfo();
        juego_terror1.mostrarInfo();
        juego_survivalh.mostrarInfo();

    }
}