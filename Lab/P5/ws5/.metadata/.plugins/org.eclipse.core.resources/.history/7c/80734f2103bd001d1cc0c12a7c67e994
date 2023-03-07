/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	while:sentencia -> condicion:expresion  sentencia:sentencia*

public class While extends AbstractSentencia {

	public While(Expresion condicion, List<Sentencia> sentencia) {
		this.condicion = condicion;
		this.sentencia = sentencia;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, sentencia);
	}

	public While(Object condicion, Object sentencia) {
		this.condicion = (Expresion) getAST(condicion);
		this.sentencia = this.<Sentencia>getAstFromContexts(sentencia);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, sentencia);
	}

	public Expresion getCondicion() {
		return condicion;
	}
	public void setCondicion(Expresion condicion) {
		this.condicion = condicion;
	}

	public List<Sentencia> getSentencia() {
		return sentencia;
	}
	public void setSentencia(List<Sentencia> sentencia) {
		this.sentencia = sentencia;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion condicion;
	private List<Sentencia> sentencia;

	public String toString() {
       return "{condicion:" + getCondicion() + ", sentencia:" + getSentencia() + "}";
   }
}
