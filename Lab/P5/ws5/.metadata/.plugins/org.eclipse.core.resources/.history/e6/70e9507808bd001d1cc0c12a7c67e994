/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	litChar:expresion -> valor:String

public class LitChar extends AbstractExpresion {

	public LitChar(String valor) {
		this.valor = valor;
	}

	public LitChar(Object valor) {
		this.valor = (valor instanceof Token) ? ((Token)valor).getText() : (String) valor;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(valor);
	}

	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String valor;

	public String toString() {
       return "{valor:" + getValor() + "}";
   }
}
