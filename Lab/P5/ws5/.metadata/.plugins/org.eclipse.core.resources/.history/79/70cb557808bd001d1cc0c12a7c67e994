/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	read:sentencia -> read:expresion

public class Read extends AbstractSentencia {

	public Read(Expresion read) {
		this.read = read;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(read);
	}

	public Read(Object read) {
		this.read = (Expresion) getAST(read);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(read);
	}

	public Expresion getRead() {
		return read;
	}
	public void setRead(Expresion read) {
		this.read = read;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion read;

	public String toString() {
       return "{read:" + getRead() + "}";
   }
}
