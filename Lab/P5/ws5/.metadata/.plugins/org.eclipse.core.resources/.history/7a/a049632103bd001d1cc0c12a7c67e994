/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	print:sentencia -> print:expresion  printTipo:String

public class Print extends AbstractSentencia {

	public Print(Expresion print, String printTipo) {
		this.print = print;
		this.printTipo = printTipo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(print);
	}

	public Print(Object print, Object printTipo) {
		this.print = (Expresion) getAST(print);
		this.printTipo = (printTipo instanceof Token) ? ((Token)printTipo).getText() : (String) printTipo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(print, printTipo);
	}

	public Expresion getPrint() {
		return print;
	}
	public void setPrint(Expresion print) {
		this.print = print;
	}

	public String getPrintTipo() {
		return printTipo;
	}
	public void setPrintTipo(String printTipo) {
		this.printTipo = printTipo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion print;
	private String printTipo;

	public String toString() {
       return "{print:" + getPrint() + ", printTipo:" + getPrintTipo() + "}";
   }
}
