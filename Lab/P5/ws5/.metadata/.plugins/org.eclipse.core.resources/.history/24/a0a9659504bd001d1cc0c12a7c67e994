/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	defFuncion:definicion -> nombre:String  parametros:parametros*  tipo:tipo  defvariable:defVariable*  sentencia:sentencia*

public class DefFuncion extends AbstractDefinicion {

	public DefFuncion(String nombre, List<Parametros> parametros, Tipo tipo, List<DefVariable> defvariable, List<Sentencia> sentencia) {
		this.nombre = nombre;
		this.parametros = parametros;
		this.tipo = tipo;
		this.defvariable = defvariable;
		this.sentencia = sentencia;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametros, tipo, defvariable, sentencia);
	}

	public DefFuncion(Object nombre, Object parametros, Object tipo, Object defvariable, Object sentencia) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;
		this.parametros = this.<Parametros>getAstFromContexts(parametros);
		this.tipo = (Tipo) getAST(tipo);
		this.defvariable = this.<DefVariable>getAstFromContexts(defvariable);
		this.sentencia = this.<Sentencia>getAstFromContexts(sentencia);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, parametros, tipo, defvariable, sentencia);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Parametros> getParametros() {
		return parametros;
	}
	public void setParametros(List<Parametros> parametros) {
		this.parametros = parametros;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public List<DefVariable> getDefvariable() {
		return defvariable;
	}
	public void setDefvariable(List<DefVariable> defvariable) {
		this.defvariable = defvariable;
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

	private String nombre;
	private List<Parametros> parametros;
	private Tipo tipo;
	private List<DefVariable> defvariable;
	private List<Sentencia> sentencia;

	public String toString() {
       return "{nombre:" + getNombre() + ", parametros:" + getParametros() + ", tipo:" + getTipo() + ", defvariable:" + getDefvariable() + ", sentencia:" + getSentencia() + "}";
   }
}
