/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	arrayTipo:tipo -> posicion:String  tipo:tipo

public class ArrayTipo extends AbstractTipo {

	public ArrayTipo(String posicion, Tipo tipo) {
		this.posicion = posicion;
		this.tipo = tipo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo);
	}

	public ArrayTipo(Object posicion, Object tipo) {
		this.posicion = (posicion instanceof Token) ? ((Token)posicion).getText() : (String) posicion;
		this.tipo = (Tipo) getAST(tipo);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(posicion, tipo);
	}

	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String posicion;
	private Tipo tipo;

	public String toString() {
       return "{posicion:" + getPosicion() + ", tipo:" + getTipo() + "}";
   }
}
