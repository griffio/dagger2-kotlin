dagger2-example with Kotlin (1.0.4) annotation processor support Gradle build
=================================

[kapt-annotation-processing-for-kotlin](http://blog.jetbrains.com/kotlin/2015/05/kapt-annotation-processing-for-kotlin)

[better-annotation-processing-supporting-stubs-in-kapt](http://blog.jetbrains.com/kotlin/2015/06/better-annotation-processing-supporting-stubs-in-kapt)

[Implement Annotation Processing API (JSR 269) natively in Kotlin](https://youtrack.jetbrains.com/issue/KT-13499)

[Dagger2 site ](http://google.github.io/dagger/)

Notes:-

This example uses kapt generated stubs.

"bootstrap" Java code is required to reference generated sources, unless ```generateStubs = true``` is enabled.
Generating stubs allows "generated" sources to be referenced from Kotlin as the compiler will not be able to reference the missing sources.

Generated source is located in "build/generated/source/kapt/main",
as this is under build, normally excluded from project sources, this source root will be marked automatically by the Kotlin "kapt" Gradle plugin.

~~~
kapt {
  generateStubs = true
}
~~~

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
