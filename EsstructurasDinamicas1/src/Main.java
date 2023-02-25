import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazaDoble lista =new ListaEnlazaDoble();
        Scanner n = new Scanner(System.in);
        int seleccion;
        do {
            menu();
            seleccion = n.nextInt();
            switch (seleccion){
                case 1:
                    System.out.println("Ingresar Nombre: ");
                    String ingresName = n.next();
                    lista.insertAHead(ingresName);
                    break;
                case 2:
                    System.out.println("Ingresar Nombre: ");
                    String ingresNamefinal = n.next();
                    lista.insertAtTail(ingresNamefinal);
                    break;
                case 3:
                    //revisar
                    lista.recorrerPersona();
                    break;
                case 4:
                    //revisar
                    lista.recorrerHaciaAtras();
                    break;
                case 5:
                    System.out.println("Tamaño de la lista es de: "+lista.size());
                    break;
                case 6:
                    if (lista.isEmpety() != true){
                        System.out.println("la lista : Contiene elementos");
                    }else {
                        System.out.println("La lista: esta vacia");
                    }
                    break;
                case 7:
                    System.out.println("Numero de indice a buscar");
                    int numero = n.nextInt();
                    int numeroRestado = numero - 1;
                    System.out.println("Valor buscada es: " + lista.searchIndex(numeroRestado));
                    break;
                case 8:
                    //revisar
                    System.out.println("El valor a buscar");
                    String valorbusqueda = n.next();
                    System.out.println("Valor buscada esta el indice: " + lista.searchValor(valorbusqueda));
                    break;
                case 9:
                    System.out.println("Ingrese el numero de indice para borrar: ");
                    int numeroDelete = n.nextInt();
                    int numeroRestadoDelete = numeroDelete - 1;
                    lista.deletePersonaPosition(numeroRestadoDelete);
                    break;
                case 10:
                    System.exit(0);
            }

        }while (seleccion <= 10);
    }
    public static void menu(){
        System.out.println("\nSeleccione la opcion a trabaja: ");
        System.out.println("1. Insertar al inicio");
        System.out.println("2. Insertar al final");
        System.out.println("3. Recorrer hacia adelante");
        System.out.println("4. Recorrer hacia atras");
        System.out.println("5. Mostrar tamaño de la lista");
        System.out.println("6. Mostrar si la lista esta");
        System.out.println("7. Buscar elemento por indice");
        System.out.println("8. Buscar elemento por valor");
        System.out.println("9. Borrar elemento con indece");
        System.out.println("10. Salir");
    }
}