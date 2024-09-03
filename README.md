# DependencyInjectionUsingDaggar2

Dagger = Dependency Acyclic Graph

1. Use @Inject for all Empty constructors of your own classes
2. we you have not your own constructor, then never use @Inject , then we create module class with @Module annotation
3. use @Provides for Module class methods
4. Create Component class with @Component annotation for connecting Module and Component class

/**
* In some cases, you need to pass an interface as constructor parameter (Dependency),
* So you need to configure the interface to allow the injection
* (Create a class for use the interface and @Inject annotation on the constructor)
1. Annotate the constructor
2. Create a module class 
3. Add the module in the component

// create(): for empty constructors
// Builder(): for parametrized constructors


*/

/**
*  Custom Application Class:
*
*  1- If there are tasks that need to run before the creation of the first activity
*  2- If there are static immutable data such as shared network client object
*  3- If there are global objects such as data persistence and crash reporting
*
*
* */

