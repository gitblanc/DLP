/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	expresionDistinto:expresion -> not:expresion

public class ExpresionDistinto extends AbstractExpresion {

	public ExpresionDistinto(Expresion not) {
		this.not = not;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(not);
	}

	public ExpresionDistinto(Object not) {
		this.not = (Expresion) getAST(not);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(not);
	}

	public Expresion getNot() {
		return not;
	}
	public void setNot(Expresion not) {
		this.not = not;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion not;

	public String toString() {
       return "{not:" + getNot() + "}";
   }
}
