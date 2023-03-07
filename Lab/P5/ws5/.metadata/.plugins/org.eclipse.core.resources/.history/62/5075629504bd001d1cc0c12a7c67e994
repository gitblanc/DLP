/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	asignacion:sentencia -> izquierda:expresion  derecha:expresion

public class Asignacion extends AbstractSentencia {

	public Asignacion(Expresion izquierda, Expresion derecha) {
		this.izquierda = izquierda;
		this.derecha = derecha;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(izquierda, derecha);
	}

	public Asignacion(Object izquierda, Object derecha) {
		this.izquierda = (Expresion) getAST(izquierda);
		this.derecha = (Expresion) getAST(derecha);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(izquierda, derecha);
	}

	public Expresion getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Expresion izquierda) {
		this.izquierda = izquierda;
	}

	public Expresion getDerecha() {
		return derecha;
	}
	public void setDerecha(Expresion derecha) {
		this.derecha = derecha;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion izquierda;
	private Expresion derecha;

	public String toString() {
       return "{izquierda:" + getIzquierda() + ", derecha:" + getDerecha() + "}";
   }
}
