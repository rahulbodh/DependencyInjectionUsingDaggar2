# DependencyInjectionUsingDaggar2

Dagger = Dependency Acyclic Graph

1. Use @Inject for all Empty constructors of your own classes
2. we you have not your own constructor, then never use @Inject , then we create module class with @Module annotation
3. use @Provides for Module class methods
4. Create Component class with @Component annotation for connecting Module and Component class
