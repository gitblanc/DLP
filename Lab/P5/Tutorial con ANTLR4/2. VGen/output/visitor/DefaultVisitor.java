/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import ast.*;
import java.util.*;

/*
DefaultVisitor. Implementación base del visitor para ser derivada por nuevos visitor.
	No modificar esta clase. Para crear nuevos visitor usar el fichero "_PlantillaParaVisitors.txt".
	DefaultVisitor ofrece una implementación por defecto de cada nodo que se limita a visitar los nodos hijos.
*/
public class DefaultVisitor implements Visitor {

	//	class Program { List<Definicion> definicion; }
	public Object visit(Program node, Object param) {
		visitChildren(node.getDefinicion(), param);
		return null;
	}

	//	class DefVariable { Tipo tipo;  String nombre; }
	public Object visit(DefVariable node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class DefStruct { String nombre;  List<Definicion> definicion; }
	public Object visit(DefStruct node, Object param) {
		visitChildren(node.getDefinicion(), param);
		return null;
	}

	//	class DefFuncion { String nombre;  List<Parametros> parametros;  Tipo tipo;  List<DefVariable> defvariable;  List<Sentencia> sentencia; }
	public Object visit(DefFuncion node, Object param) {
		visitChildren(node.getParametros(), param);
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		visitChildren(node.getDefvariable(), param);
		visitChildren(node.getSentencia(), param);
		return null;
	}

	//	class Parametros { String nombre;  Tipo tipo; }
	public Object visit(Parametros node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class VariableStruct { String nombre;  Tipo tipo; }
	public Object visit(VariableStruct node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class IntTipo {  }
	public Object visit(IntTipo node, Object param) {
		return null;
	}

	//	class RealTipo {  }
	public Object visit(RealTipo node, Object param) {
		return null;
	}

	//	class CharTipo {  }
	public Object visit(CharTipo node, Object param) {
		return null;
	}

	//	class ArrayTipo { String posicion;  Tipo tipo; }
	public Object visit(ArrayTipo node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class StructTipo { String nombre; }
	public Object visit(StructTipo node, Object param) {
		return null;
	}

	//	class Asignacion { Expresion izquierda;  Expresion derecha; }
	public Object visit(Asignacion node, Object param) {
		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);
		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);
		return null;
	}

	//	class Print { Expresion print;  String printTipo; }
	public Object visit(Print node, Object param) {
		if (node.getPrint() != null)
			node.getPrint().accept(this, param);
		return null;
	}

	//	class Read { Expresion read; }
	public Object visit(Read node, Object param) {
		if (node.getRead() != null)
			node.getRead().accept(this, param);
		return null;
	}

	//	class FuncionLlamada { String nombre;  List<Expresion> expresion; }
	public Object visit(FuncionLlamada node, Object param) {
		visitChildren(node.getExpresion(), param);
		return null;
	}

	//	class If { Expresion condicion;  List<Sentencia> if_true;  List<Sentencia> if_false; }
	public Object visit(If node, Object param) {
		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);
		visitChildren(node.getIf_true(), param);
		visitChildren(node.getIf_false(), param);
		return null;
	}

	//	class While { Expresion condicion;  List<Sentencia> sentencia; }
	public Object visit(While node, Object param) {
		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);
		visitChildren(node.getSentencia(), param);
		return null;
	}

	//	class Return { Expresion retorno; }
	public Object visit(Return node, Object param) {
		if (node.getRetorno() != null)
			node.getRetorno().accept(this, param);
		return null;
	}

	//	class ExpresionAritmetica { Expresion izquierda;  String operador;  Expresion derecha; }
	public Object visit(ExpresionAritmetica node, Object param) {
		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);
		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);
		return null;
	}

	//	class ExpresionLogica { Expresion izquierda;  String operador;  Expresion derecha; }
	public Object visit(ExpresionLogica node, Object param) {
		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);
		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);
		return null;
	}

	//	class ExpresionDistinto { Expresion not; }
	public Object visit(ExpresionDistinto node, Object param) {
		if (node.getNot() != null)
			node.getNot().accept(this, param);
		return null;
	}

	//	class Variable { String nombre; }
	public Object visit(Variable node, Object param) {
		return null;
	}

	//	class Ident { String valor; }
	public Object visit(Ident node, Object param) {
		return null;
	}

	//	class LitEnt { String valor; }
	public Object visit(LitEnt node, Object param) {
		return null;
	}

	//	class LitReal { String valor; }
	public Object visit(LitReal node, Object param) {
		return null;
	}

	//	class LitChar { String valor; }
	public Object visit(LitChar node, Object param) {
		return null;
	}

	//	class Cast { Tipo tipo;  Expresion valor; }
	public Object visit(Cast node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		if (node.getValor() != null)
			node.getValor().accept(this, param);
		return null;
	}

	//	class Array { Expresion nombre;  Expresion valor; }
	public Object visit(Array node, Object param) {
		if (node.getNombre() != null)
			node.getNombre().accept(this, param);
		if (node.getValor() != null)
			node.getValor().accept(this, param);
		return null;
	}

	//	class Struct { Expresion nombre;  String campos; }
	public Object visit(Struct node, Object param) {
		if (node.getNombre() != null)
			node.getNombre().accept(this, param);
		return null;
	}

	//	class ExpresionLlamada { String nombre;  List<Expresion> expresion; }
	public Object visit(ExpresionLlamada node, Object param) {
		visitChildren(node.getExpresion(), param);
		return null;
	}

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
                child.accept(this, param);
    }
}
