/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	array:expresion -> nombre:String  valor:expresion

public class Array extends AbstractExpresion {

	public Array(String nombre, Expresion valor) {
		this.nombre = nombre;
		this.valor = valor;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(valor);
	}

	public Array(Object nombre, Object valor) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;
		this.valor = (Expresion) getAST(valor);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, valor);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Expresion getValor() {
		return valor;
	}
	public void setValor(Expresion valor) {
		this.valor = valor;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;
	private Expresion valor;

	public String toString() {
       return "{nombre:" + getNombre() + ", valor:" + getValor() + "}";
   }
}
