package griffio.solarsystem;

import griffio.components.SolarSystem;
import griffio.components.DaggerSolarSystem;
import griffio.modules.OuterPlanetsModule;
import griffio.modules.TerrestrialPlanetsModule;

public abstract class BaseApplication {

  public SolarSystem solarSystem() {
    return DaggerSolarSystem.builder()
        .terrestrialPlanetsModule(new TerrestrialPlanetsModule())
        .outerPlanetsModule(new OuterPlanetsModule())
        .build();
  }

}