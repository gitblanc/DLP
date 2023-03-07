/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	return:sentencia -> retorno:expresion

public class Return extends AbstractSentencia {

	public Return(Expresion retorno) {
		this.retorno = retorno;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(retorno);
	}

	public Return(Object retorno) {
		this.retorno = (Expresion) getAST(retorno);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(retorno);
	}

	public Expresion getRetorno() {
		return retorno;
	}
	public void setRetorno(Expresion retorno) {
		this.retorno = retorno;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion retorno;

	public String toString() {
       return "{retorno:" + getRetorno() + "}";
   }
}
