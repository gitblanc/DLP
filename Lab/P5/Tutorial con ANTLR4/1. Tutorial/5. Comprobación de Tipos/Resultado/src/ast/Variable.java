/**
 * @generated VGen (for ANTLR) 1.7.1
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	variable:expression -> name:String

public class Variable extends AbstractExpression {

    public Variable(String name) {
        this.name = name;
    }

    public Variable(Object name) {
        this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

        // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
        // Obtiene la linea/columna a partir de las de los hijos.
        setPositions(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    private String name;

    public String toString() {
        return "{name:" + getName() + "}";
    }

    public VarDefinition getDefinicion() {
        return definition;
    }

    public void setDefinicion(VarDefinition definition) {
        this.definition = definition;
    }

    private VarDefinition definition;

}
