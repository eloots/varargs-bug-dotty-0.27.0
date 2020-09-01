# Minimised example for varargs bug

In Dotty 0.27.0-RC1, the code in `Main` doesn't compile and produces
the following compilation error:

```
[info] Compiling 1 Scala source to /Users/ericloots/Trainingen/LBT/EPFL/dottyBugsMinimized/varargs-bug/step_000_initial_state/target/scala-0.27/classes ...
[error] -- [E051] Reference Error: /Users/ericloots/Trainingen/LBT/EPFL/dottyBugsMinimized/varargs-bug/step_000_initial_state/src/main/scala/org/cmt/Main.scala:9:6
[error] 9 |  log.error("Just logging a message {}", 5)
[error]   |  ^^^^^^^^^
[error]   |Ambiguous overload. The overloaded alternatives of method error in trait Logger with types
[error]   | (x$0: String, x$1: Object): Unit
[error]   | (x$0: String, x$1: Object*): Unit
[error]   |both match arguments (("Just logging a message {}" : String), (5 : Int))
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 0 s, completed 1 Sep 2020, 12:17:31
```

