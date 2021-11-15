/**
 * Implementacion de lista doblemente enlazada
 */
public class Lista
{
    private Celda inicio;
    private Celda fin;
    
    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    
    /**
     * Agrega una celda nueva al final de la lista
     */
    public void agregarElemento(int valor) {
        if (inicio == null && fin == null) {
            inicio = new Celda(valor);
            fin = inicio;
        } else {
            Celda nueva = new Celda(valor, fin);
            fin.setSiguiente(nueva);
            fin = nueva;
        }
    }
    
    /**
     * Eliminar el elemento en la posicion dada
     * @param posicion Posicion que se quiere eliminar
     */
    public void eliminarElemento(int posicion) throws Exception {
        if (posicion < 0) {
            throw new Exception("La posicion del elemento debe ser mayor o igual a 0");
        }
        int contador = 0;
        Celda celdaActual = inicio;
        while(contador < posicion && celdaActual != null) {
            celdaActual = celdaActual.getSiguiente();
            contador++;
        }
        
        if (celdaActual == null) {
            throw new Exception("La celda en la posicion " + posicion + " no existe.");
        }
        
        Celda anterior = celdaActual.getAnterior();
        Celda siguiente = celdaActual.getSiguiente();
        if (anterior != null) {
            anterior.setSiguiente(siguiente);
        } else {
            inicio = siguiente;
        }
        if (siguiente != null) {
            siguiente.setAnterior(anterior);
        } else {
            fin = anterior;
        }
    }
    
    /**
     * Busca un valor en la lista y devuelve su posicion. 
     * 
     * @return devuelve la posicion o -1 si no encuentra el valor
     */
    public int buscar(int valor) {
        int posicion = -1;
        int contador = 0;
        Celda celdaActual = inicio;
        while (celdaActual != null && posicion < 0) {
            if (celdaActual.getValor() == valor) {
                posicion = contador;
            } 
            celdaActual = celdaActual.getSiguiente();
            ++contador;
        }
        return posicion;
    }

    /**
     * Busca el valor en la posicion dada y lo retorna
     * @param posicion
     * @return Valor en la posicion dada
     */
    public int getValor(int posicion) {
        //implementar esto
        return 0;
    }

    /**
     * Devuelve el primer elemento de la lista
     * @return
     */
    public int obtenerPrimero() {
        //implementar esto
        return 0;
    }

    /**
     * Devuelve el ultimo elemento de la lista
     * @return
     */
    public int obtenerUltimo() {
        //implementar esto
        return 0;
    }

    /**
     * devuelve la cantidad de elementos de la lista
     * @return
     */
    public int cantidadDeElementos() {
        //implementar esto
        return 0;
    }

    /**
     * Borra todos los elementos de la lista, deja una lista vacia
     */
    public void clear() {
        //implementar esto
    }

    /**
     * Agregar elemento en la posicion dada
     * @param valor
     * @param posicion
     */
    public void agregarElemento(int valor, int posicion) {
        //implementar esto
    }

    public String getStringInvertido() {
        String s = "";
        Celda celdaActual = fin;
        while(celdaActual != null) {
            s += celdaActual.getValor() + " <- ";
            celdaActual = celdaActual.getAnterior();
        }
        return s;
    }
    
    public String toString() {
        String s = "";
        Celda celdaActual = inicio;
        while(celdaActual != null) {
            s += celdaActual.getValor() + " -> ";
            celdaActual = celdaActual.getSiguiente();
        }
        return s;
    }
}   
