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

To get a node repl over nrepl do:

```sh
cljs-node-lighttable $ lein repl
nREPL server started on port 60691 on host 127.0.0.1
REPL-y 0.3.0
Clojure 1.5.1
user=> (require '[cljs.repl.node :as node])
nil
user=> (node/run-node-nrepl)
Type `:cljs/quit` to stop the ClojureScript REPL
nil
cljs.user=> (.log js/console "Hi from cljs")
Hi from cljs
nil
cljs.user=>
```

### Status: Not working

With the last update of cljs-noderepl the repl works with nrepl, but it doesn't work connecting with lighttable (Add connection -> Clojure (external nrepl)).

