/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CypherStandaloneSetup extends CypherStandaloneSetupGenerated {

	public static void doSetup() {
		new CypherStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
