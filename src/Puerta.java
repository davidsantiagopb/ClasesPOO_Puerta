public class Puerta {
    /***************************************************/
    /******************** Atributos ********************/
    /***************************************************/

    boolean abierta;
    String color;

/***************************************************/
/******************** Métodos ********************/
/***************************************************/

/**
 *
 * Constructor de la clase Puerta: Atributos de la clase
 * @param abierta
 * @param cerrada
 * Complejidad temporal: O(1) Tiempo Constante
 */
public Puerta(boolean abierta){
    this.abierta = abierta;
    }
    /**
     * Método que abre la puerta
     * @return boolean: Indica si la puerta se pudo abrir
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    void abrir(){
        this.abierta = true;
    }

    void cerrar(){
        this.abierta = false;
    }

    void estaAbierta(){
        if(this.abierta)
            System.out.println("Está abierta");
        else
            System.out.println("Está cerrada");
    }
}
