/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	structTipo:tipo -> nombre:String

public class StructTipo extends AbstractTipo {

	public StructTipo(String nombre) {
		this.nombre = nombre;
	}

	public StructTipo(Object nombre) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;

	public String toString() {
       return "{nombre:" + getNombre() + "}";
   }
}
