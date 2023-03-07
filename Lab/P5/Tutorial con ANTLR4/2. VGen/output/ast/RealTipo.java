/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	realTipo:tipo -> 

public class RealTipo extends AbstractTipo {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{RealTipo}";
   }
}
