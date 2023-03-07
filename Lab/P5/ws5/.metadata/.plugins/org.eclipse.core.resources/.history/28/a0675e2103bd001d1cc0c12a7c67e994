/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	if:sentencia -> condicion:expresion  if_true:sentencia*  if_false:sentencia*

public class If extends AbstractSentencia {

	public If(Expresion condicion, List<Sentencia> if_true, List<Sentencia> if_false) {
		this.condicion = condicion;
		this.if_true = if_true;
		this.if_false = if_false;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, if_true, if_false);
	}

	public If(Object condicion, Object if_true, Object if_false) {
		this.condicion = (Expresion) getAST(condicion);
		this.if_true = this.<Sentencia>getAstFromContexts(if_true);
		this.if_false = this.<Sentencia>getAstFromContexts(if_false);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, if_true, if_false);
	}

	public Expresion getCondicion() {
		return condicion;
	}
	public void setCondicion(Expresion condicion) {
		this.condicion = condicion;
	}

	public List<Sentencia> getIf_true() {
		return if_true;
	}
	public void setIf_true(List<Sentencia> if_true) {
		this.if_true = if_true;
	}

	public List<Sentencia> getIf_false() {
		return if_false;
	}
	public void setIf_false(List<Sentencia> if_false) {
		this.if_false = if_false;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion condicion;
	private List<Sentencia> if_true;
	private List<Sentencia> if_false;

	public String toString() {
       return "{condicion:" + getCondicion() + ", if_true:" + getIf_true() + ", if_false:" + getIf_false() + "}";
   }
}
