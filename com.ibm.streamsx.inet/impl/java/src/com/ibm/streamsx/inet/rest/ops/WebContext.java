/*
# Licensed Materials - Property of IBM
# Copyright IBM Corp. 2011, 2014 
# US Government Users Restricted Rights - Use, duplication or
# disclosure restricted by GSA ADP Schedule Contract with
# IBM Corp.
*/
package com.ibm.streamsx.inet.rest.ops;

import com.ibm.streams.operator.model.Parameter;
import com.ibm.streams.operator.model.PrimitiveOperator;
import com.ibm.streams.operator.model.Icons;

/**
 * Operator without any ports that simply defines a webcontext.
 *
 */
@PrimitiveOperator(description=WebContext.DESC)
@Icons(location32="impl/java/icons/WebContext_32.gif", location16="impl/java/icons/WebContext_16.gif")
public class WebContext extends ServletOperator {

	/*
	 * Override to make these parameters mandatory
	 */
	@Parameter(description=CONTEXT_DESC)
	public void setContext(String context) {}
	@Parameter(description=CRB_DESC)
	public void setContextResourceBase(String base) {}
	
	static final String DESC = "Embeds a Jetty web server to provide HTTP REST access to files defined by the `context` and `contextResourceBase` parameters.\\n" + 
			"**Limitations**:\\n" + 
			" * No security access is provided to the served files or applications. This is mainly aimed " + 
			"at demos.";

}
