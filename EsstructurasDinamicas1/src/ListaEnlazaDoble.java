public class ListaEnlazaDoble {
    public Nodo cabeza = null;
    private  int size = 0;
    public Nodo siguiente = null;
    //Insetar al principio de la lista
    public void insertAHead(String data) {
        Nodo newNodo = new Nodo(data);
        if (cabeza == null) {
            cabeza = newNodo;
            siguiente = newNodo;
        } else {
            newNodo.setNext(cabeza);
            cabeza.setAnterior(newNodo);
            cabeza = newNodo;
        }
        size++;
    }

    //Insertar al fina de la lista
    public void insertAtTail(String data) {
        Nodo newNodo = new Nodo(data);
        if (siguiente == null) {
            cabeza = newNodo;
            siguiente = newNodo;
        } else {
            siguiente.setNext(newNodo);
            newNodo.setAnterior(siguiente);
            siguiente = newNodo;
        }
        size++;
    }
    //Recorrer lista hacia adelante
    public void recorrerPersona() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.getData() + ", ");
            temp = temp.getNext();
        }

    }
    // Recorre lista hacia atras
    public void recorrerHaciaAtras() {
        Nodo temp = siguiente;
        int indice = size - 1; // Obtener el índice del último elemento
        while (temp != null) {
            System.out.print(temp.getData() + ", ");
            temp = temp.getAnterior();
            indice--;
        }
    }
    //Mostrar tamaño de la lista
    public int size(){
        return size;
    }
    //Devoler si la lista enlazada esta vacia
    public boolean isEmpety(){
        return size == 0;
    }
    //Buscar por index
    public String searchIndex(int n){
        Nodo temp = cabeza;
        int contador = 0;
        while (contador < n && temp.getNext() != null){
            temp = temp.getNext();
            contador++;
        }
        if(contador != n){
            return null;
        }else {
            return temp.getData();
        }
    }
    //Buscar  por valor
    public int searchValor(String n){
        Nodo temp = cabeza;
        int index = 0;
        while (temp != null){
            if (temp.getData().equals(n)){
                return index + 1;
            }
            temp = temp.getNext();
            index++;
        }
        return -1;
    }
    //Borrar un elemento
    public void deletePersonaPosition(int n) {
        if (n < 0 || n >= size) {
            throw new IllegalArgumentException("La posición es inválida");
        }
        if (n == 0) {
            cabeza = cabeza.getNext();
            size--;
            return;
        }
        Nodo temp = cabeza;
        for (int i = 0; i < n - 1; i++) {
            temp = temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());
        size--;
    }
}
