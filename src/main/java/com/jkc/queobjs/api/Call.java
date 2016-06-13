package com.jkc.queobjs.api;

/**
 * A Call is the encapsulation of the parameter space given to an action.
 * It holds parameters specific to the action invocation is gives access to
 * the surrounding context.
 * 
 * @author jcoles
 *
 */
public interface Call extends ActionContext {
	
	// TODO Genericize
	Object getParameters();

}
