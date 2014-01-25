cljs-node-lighttable
====================

A sample project for using cljs with node in lighttable. Clone it and mess around with it.

### Compile to js:

Open a terminal and run `lein cljsbuild auto` or `lein cljsbuild once`

### Run

```sh
node cljs_node_lighttable.js
```
And you should see `Hello world!` in the console

### Node repl

Install [cljs-noderepl](https://github.com/bodil/cljs-noderepl) by filling your ~/.lein/profiles.clj with this:

```clojure
{:user {:plugins [[org.bodil/lein-noderepl "0.1.10"]]}}
```

Then in the terminal you can run lein trampoline noderepl to get a working cljs node repl.


### Status: Not working

Right now uncommenting the line of piggieback in the project cljs to get a nrepl working does not work.

```
cljs-node-lighttable $ lein repl
Error loading cemerick.piggieback: Could not locate cemerick/piggieback__init.class or cemerick/piggieback.clj on classpath:
Exception in thread "main" java.lang.RuntimeException: Unable to resolve var: cemerick.piggieback/wrap-cljs-repl in this context, compiling:(/private/var/folders/h8/h39h5bz90b5b8sng6b1bklgh0000gn/T/form-init2712513670654722874.clj:1:1194)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6567)
	at clojure.lang.Compiler.analyze(Compiler.java:6361)
	at clojure.lang.Compiler.analyze(Compiler.java:6322)
	at clojure.lang.Compiler$InvokeExpr.parse(Compiler.java:3624)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6562)
	at clojure.lang.Compiler.analyze(Compiler.java:6361)
	at clojure.lang.Compiler.analyze(Compiler.java:6322)
	at clojure.lang.Compiler$InvokeExpr.parse(Compiler.java:3624)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6562)
	at clojure.lang.Compiler.analyze(Compiler.java:6361)
	at clojure.lang.Compiler.access$100(Compiler.java:37)
	at clojure.lang.Compiler$LetExpr$Parser.parse(Compiler.java:5973)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6560)
	at clojure.lang.Compiler.analyze(Compiler.java:6361)
	at clojure.lang.Compiler.analyze(Compiler.java:6322)
	at clojure.lang.Compiler$BodyExpr$Parser.parse(Compiler.java:5708)
	at clojure.lang.Compiler$FnMethod.parse(Compiler.java:5139)
	at clojure.lang.Compiler$FnExpr.parse(Compiler.java:3751)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6558)
	at clojure.lang.Compiler.analyze(Compiler.java:6361)
	at clojure.lang.Compiler.eval(Compiler.java:6616)
	at clojure.lang.Compiler.eval(Compiler.java:6609)
	at clojure.lang.Compiler.load(Compiler.java:7064)
	at clojure.lang.Compiler.loadFile(Compiler.java:7020)
	at clojure.main$load_script.invoke(main.clj:294)
	at clojure.main$init_opt.invoke(main.clj:299)
	at clojure.main$initialize.invoke(main.clj:327)
	at clojure.main$null_opt.invoke(main.clj:362)
	at clojure.main$main.doInvoke(main.clj:440)
	at clojure.lang.RestFn.invoke(RestFn.java:421)
	at clojure.lang.Var.invoke(Var.java:419)
	at clojure.lang.AFn.applyToHelper(AFn.java:163)
	at clojure.lang.Var.applyTo(Var.java:532)
	at clojure.main.main(main.java:37)
Caused by: java.lang.RuntimeException: Unable to resolve var: cemerick.piggieback/wrap-cljs-repl in this context
	at clojure.lang.Util.runtimeException(Util.java:219)
	at clojure.lang.Compiler$TheVarExpr$Parser.parse(Compiler.java:650)
	at clojure.lang.Compiler.analyzeSeq(Compiler.java:6560)
	... 33 more
REPL server launch timed out.
```
