public class Ejercicio {
    public static void main(String[] args) {
        Puerta puertaHabitacion = new Puerta(true);
        puertaHabitacion.estaAbierta();
        puertaHabitacion.cerrar();
        puertaHabitacion.estaAbierta();

        Puerta puertaCasa = new Puerta(false);
        puertaCasa.estaAbierta();
    }
}