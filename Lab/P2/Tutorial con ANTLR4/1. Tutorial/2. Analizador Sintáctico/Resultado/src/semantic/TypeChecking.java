/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package semantic;

import ast.*;
import main.*;
import visitor.*;

public class TypeChecking extends DefaultVisitor {

    public TypeChecking(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    // # ----------------------------------------------------------
    /*
    * Poner aquí los visit.
    *
    * Si se ha usado VGen, solo hay que copiarlos de la clase 'visitor/_PlantillaParaVisitors.txt'.
    */

    // public Object visit(Program prog, Object param) {
    //      ...
    // }

    // ...
    // ...
    // ...

    // # ----------------------------------------------------------
    // Métodos auxiliares recomendados (opcionales) -------------

    /**
     * predicado. Método auxiliar para implementar los predicados. Borrar si no se quiere usar.
     *
     * Ejemplos de uso (suponiendo que existe un método "esPrimitivo(expr)"):
     *
     *      1. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo primitivo", expr.getStart());
     *      2. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo primitivo", expr); // Se asume getStart()
     *      3. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo primitivo");
     *
     * NOTA: El método getStart() (ejemplo 1) indica la linea/columna del fichero fuente donde estaba el nodo
     * (y así poder dar información más detallada de la posición del error). Si se usa VGen, dicho método
     * habrá sido generado en todos los nodos del AST.
     * No es obligatorio llamar a getStart() (ejemplo 2), ya que si se pasa el nodo, se usará por defecto dicha
     * posición.
     * Si no se quiere imprimir la posición del fichero, se puede omitir el tercer argumento (ejemplo 3).
     *
     * @param condition     Debe cumplirse para que no se produzca un error
     * @param errorMessage  Se imprime si no se cumple la condición
     * @param posicionError Fila y columna del fichero donde se ha producido el error.
     */

    private void predicado(boolean condition, String errorMessage, AST node) {
        predicado(condition, errorMessage, node.getStart());
    }

    private void predicado(boolean condition, String errorMessage, Position position) {
        if (!condition)
            errorManager.notify("Type Checking", errorMessage, position);
    }

    private void predicado(boolean condition, String errorMessage) {
        predicado(condition, errorMessage, (Position) null);
    }

    private ErrorManager errorManager;
}
