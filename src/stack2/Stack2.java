
package stack2;
import java.util.Stack;

public class Stack2 {

    
    public static void main(String[] args) {
        Stack<Integer>pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        System.out.println("Elementos de la pila son"+pila); //obtener elemento de la parte supeior de la pila sin quitar peek
        System.out.println("Verificar si la fila esta vacia"+pila.peek());
        System.out.println("Eliminar elemento de la pila"+pila.pop());
        System.out.println("Eliminar elemento de la pila"+pila.isEmpty());
        
    }
    
}
