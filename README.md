<<<<<<< HEAD
dagger2-example with Kotlin (1.0.0-beta-4584) annotation processor support Gradle build
=======
dagger2-example with Kotlin (1.0.0) annotation processor support Gradle build
>>>>>>> kotlin 1.0
=================================

[kapt-annotation-processing-for-kotlin](http://blog.jetbrains.com/kotlin/2015/05/kapt-annotation-processing-for-kotlin)

[better-annotation-processing-supporting-stubs-in-kapt](http://blog.jetbrains.com/kotlin/2015/06/better-annotation-processing-supporting-stubs-in-kapt)

Kotlin and Java exists side by side. The Dagger generated code must be configured in Java.

~~~java
 public SolarSystem solarSystem() {
    return DaggerSolarSystem.builder()
        .terrestrialPlanetsModule(new TerrestrialPlanetsModule())
        .outerPlanetsModule(new OuterPlanetsModule())
        .build();
  }
~~~

[Dagger2 site ](http://google.github.io/dagger/)

---

* @Component
  * @Module
    * @Provides

Shows Planets being injected via constructor by qualifier

~~~
public class TerrestrialPlanets @Inject (@Named("Mercury") val mercury: Planet,
                                         @Named("Venus") val venus: Planet,
                                         @Named("Earth") val earth: Planet,
                                         @Named("Mars") val mars: Planet) {
}
~~~

The TerrestrialPlanetsModule, for example, provides a singleton named "Mercury" etc.

~~~
@Module
public class TerrestrialPlanetsModule {

    @Provides @Singleton @Named("Mercury")
    public fun first() : Planet {
        return Mercury()
    }

    @Provides @Singleton @Named("Venus")
    public fun second() : Planet {
        return Venus()
    }

    @Provides @Singleton @Named("Earth")
    public fun third() : Planet {
        return Earth()
    }

    @Provides @Singleton @Named("Mars")
    public fun fourth() : Planet {
        return Mars()
    }

}
~~~

* Outer Planets module
  * Jupiter
  * Saturn
  * Uranus
  * Neptune

---

**Gradle build**

~~~
./gradlew run
~~~
