/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	struct:expresion -> nombre:expresion  campos:String

public class Struct extends AbstractExpresion {

	public Struct(Expresion nombre, String campos) {
		this.nombre = nombre;
		this.campos = campos;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre);
	}

	public Struct(Object nombre, Object campos) {
		this.nombre = (Expresion) getAST(nombre);
		this.campos = (campos instanceof Token) ? ((Token)campos).getText() : (String) campos;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, campos);
	}

	public Expresion getNombre() {
		return nombre;
	}
	public void setNombre(Expresion nombre) {
		this.nombre = nombre;
	}

	public String getCampos() {
		return campos;
	}
	public void setCampos(String campos) {
		this.campos = campos;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion nombre;
	private String campos;

	public String toString() {
       return "{nombre:" + getNombre() + ", campos:" + getCampos() + "}";
   }
}
