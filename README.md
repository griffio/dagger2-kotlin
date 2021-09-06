dagger2-example with Kotlin (1.5.x) kapt annotation processor supported Gradle build
=================================

[kapt documentation](https://kotlinlang.org/docs/reference/kapt.html)

[kapt-annotation-processing-for-kotlin](http://blog.jetbrains.com/kotlin/2015/05/kapt-annotation-processing-for-kotlin)

[better-annotation-processing-supporting-stubs-in-kapt](http://blog.jetbrains.com/kotlin/2015/06/better-annotation-processing-supporting-stubs-in-kapt)

[Implement Annotation Processing API (JSR 269) natively in Kotlin](https://youtrack.jetbrains.com/issue/KT-13499)

[Use javac annotation processing implementation, generate AST stubs for Kotlin classes](https://youtrack.jetbrains.com/issue/KT-14937#tab=Linked%20Issues)

[Dagger2 site ](http://google.github.io/dagger/)

Notes:-

* @Component
  * @Module
    * @Provides

Shows Planets being injected via constructor by qualifier

~~~ kotlin
public class TerrestrialPlanets @Inject (@Named("Mercury") val mercury: Planet,
                                         @Named("Venus") val venus: Planet,
                                         @Named("Earth") val earth: Planet,
                                         @Named("Mars") val mars: Planet) {
}
~~~

The TerrestrialPlanetsModule, for example, provides a singleton named "Mercury" etc.

~~~ kotlin
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

~~~
./gradlew test
~~~
