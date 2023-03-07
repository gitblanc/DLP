/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	intTipo:tipo -> 

public class IntTipo extends AbstractTipo {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{IntTipo}";
   }
}
