/**
 * @generated VGen (for ANTLR) 1.7.1
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	varDefinition -> type:type  name:String

public class VarDefinition extends AbstractAST  {

	public VarDefinition(Type type, String name) {
		this.type = type;
		this.name = name;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type);
	}

	public VarDefinition(Object type, Object name) {
		this.type = (Type) getAST(type);
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type, name);
	}

	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Type type;
	private String name;

	public String toString() {
       return "{type:" + getType() + ", name:" + getName() + "}";
   }
}
