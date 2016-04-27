# testclj

An experiment to see if its possible to use clojure for creating Neo4j 3.0+ stored procedures.

# Instructions

To build:

```bash
lein uberjar
```

Copy `target/testclj.jar` to `$NEO4j/plugins` folder and start Neo4j server. You will see the following error in `logs/neo4j.log`.


```
Caused by: org.neo4j.kernel.lifecycle.LifecycleException: Component 'org.neo4j.kernel.impl.proc.Procedures@4d415d32' was successfully initialized, but failed to start. Please see attached cause exception.
    at org.neo4j.kernel.lifecycle.LifeSupport$LifecycleInstance.start(LifeSupport.java:444)
    at org.neo4j.kernel.lifecycle.LifeSupport.start(LifeSupport.java:107)
    at org.neo4j.kernel.impl.factory.GraphDatabaseFacadeFactory.newFacade(GraphDatabaseFacadeFactory.java:140)
    ... 10 more
Caused by: org.neo4j.kernel.api.exceptions.ProcedureException: Procedures must return a Stream of records, where a record is a concrete class
that you define and not a raw Stream.
    at org.neo4j.kernel.impl.proc.OutputMappers.mapper(OutputMappers.java:153)
    at org.neo4j.kernel.impl.proc.ReflectiveProcedureCompiler.compileProcedure(ReflectiveProcedureCompiler.java:106)
    at org.neo4j.kernel.impl.proc.ReflectiveProcedureCompiler.compile(ReflectiveProcedureCompiler.java:84)
    at org.neo4j.kernel.impl.proc.ProcedureJarLoader.loadProcedures(ProcedureJarLoader.java:88)
    at org.neo4j.kernel.impl.proc.ProcedureJarLoader.loadProceduresFromDir(ProcedureJarLoader.java:77)
    at org.neo4j.kernel.impl.proc.Procedures.start(Procedures.java:125)
    at org.neo4j.kernel.lifecycle.LifeSupport$LifecycleInstance.start(LifeSupport.java:434)
    ... 12 more
```


## Notes
https://github.com/neo4j/neo4j/blob/76992abcc408126c940245b3732fce254266a99b/manual/embedded-examples/src/main/java/org/neo4j/examples/ProcedureExample.java
https://github.com/neo4j-contrib/neo4j-apoc-procedures/blob/master/src/main/java/apoc/date/Date.java
https://stackoverflow.com/questions/3688730/how-to-pass-a-typed-collection-from-clojure-to-java
https://stackoverflow.com/questions/15123214/clojure-macro-using-gen-class-doesnt-create-annotations
https://stackoverflow.com/questions/7703467/attaching-metadata-to-a-clojure-gen-class