/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	cast:expresion -> tipo:tipo  valor:expresion

public class Cast extends AbstractExpresion {

	public Cast(Tipo tipo, Expresion valor) {
		this.tipo = tipo;
		this.valor = valor;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo, valor);
	}

	public Cast(Object tipo, Object valor) {
		this.tipo = (Tipo) getAST(tipo);
		this.valor = (Expresion) getAST(valor);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo, valor);
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
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

	private Tipo tipo;
	private Expresion valor;

	public String toString() {
       return "{tipo:" + getTipo() + ", valor:" + getValor() + "}";
   }
}
