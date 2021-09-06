dagger2-example with Kotlin (1.5.x) annotation processor support Gradle build
=================================

[kapt documentation](https://kotlinlang.org/docs/reference/kapt.html)

[kapt-annotation-processing-for-kotlin](http://blog.jetbrains.com/kotlin/2015/05/kapt-annotation-processing-for-kotlin)

[better-annotation-processing-supporting-stubs-in-kapt](http://blog.jetbrains.com/kotlin/2015/06/better-annotation-processing-supporting-stubs-in-kapt)

[Implement Annotation Processing API (JSR 269) natively in Kotlin](https://youtrack.jetbrains.com/issue/KT-13499)

[Use javac annotation processing implementation, generate AST stubs for Kotlin classes](https://youtrack.jetbrains.com/issue/KT-14937#tab=Linked%20Issues)

[Dagger2 site ](http://google.github.io/dagger/)

Notes:-

testing "org.jetbrains.kotlin.kapt" plugins

To enable experimental kapt, just add the following line to your build.gradle:
```apply plugin: 'kotlin-kapt'```

This example uses kapt3 annotation processor plugin, does not require stubs.

Use Kapt3  support for incremental compilation of Java stubs
 
Previous version, unless ```generateStubs = true``` is enabled, "bootstrap" Java code is required to reference generated sources.

In Kotlin 1.1.x, you may see some warnings emitted by the Kotlin compiler, https://github.com/JetBrains/kotlin/blob/master/compiler/cli/src/org/jetbrains/kotlin/cli/jvm/K2JVMCompiler.kt#L151
these seem related to https://youtrack.jetbrains.com/issue/KT-1643
and is fixed https://youtrack.jetbrains.com/issue/KT-14619
```
: The '-d' option with a directory destination is ignored because '-module' is specified
w: [kapt] Sources output directory is not specified, skipping annotation processing
```

~~~ groovy
kapt {
  generateStubs = true
}
~~~

Stubs, compiler generated intermediate classes, allows "generated" sources to be referenced from Kotlin otherwise the compiler will not be able to reference the missing sources.

Generated source is created in "build/generated/source/kapt/main", as this is under "build", normally excluded from IntelliJ's project sources, this source root will be marked in the build script itself.

~~~ groovy
sourceSets {
  main.java.srcDirs += [file("$buildDir/generated/source/kapt/main")]
}
~~~

---

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
