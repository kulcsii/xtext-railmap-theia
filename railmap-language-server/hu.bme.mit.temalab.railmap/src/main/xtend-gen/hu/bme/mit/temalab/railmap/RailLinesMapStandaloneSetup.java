/**
 * generated by Xtext 2.20.0-SNAPSHOT
 */
package hu.bme.mit.temalab.railmap;

import hu.bme.mit.temalab.railmap.RailLinesMapStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RailLinesMapStandaloneSetup extends RailLinesMapStandaloneSetupGenerated {
  public static void doSetup() {
    new RailLinesMapStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
