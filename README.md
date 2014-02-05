cljs-node-repl
====================

A sample project for using cljs with node with a repl.
Clone it and mess around with it.

### Requires:
* Leiningen > 2
* Node > 0.8

### Compile to js:

Open a terminal and run `lein cljsbuild auto` or `lein cljsbuild once`

### Run

```sh
node cljs_node_lighttable.js
```
And you should see `Hello world!` in the console

### Status:

##### Vim: OK. See below in the vim section

##### Lighttable: Not working
With the last update of cljs-noderepl the repl works with nrepl, but it doesn't work connecting with lighttable (Add connection -> Clojure (external nrepl)).

### Standalone node repl

#### Simple

Follow the [instructions in the cljs-noderepl repo](https://github.com/bodil/cljs-noderepl#leiningen-plugin)

```
$ lein trampoline noderepl
```

or

```
rlwrap -r -m -q '\"' -b "(){}[],^%3@\";:'" lein trampoline noderepl
```

cljs-node-lighttable $ lein repl

#### Over nrepl

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

### Vim

Install [vim-fireplace](https://github.com/tpope/vim-fireplace)

Then start the repl and require the node repl:

```sh
cljs-node-lighttable $ lein repl
nREPL server started on port 60691 on host 127.0.0.1
REPL-y 0.3.0
Clojure 1.5.1
user=> (require '[cljs.repl.node :as node])
nil
```

Then open vim in the clojurescript project, and do:

```
:Piggieback (cljs.repl.node/repl-env)
```

It will take a bit to connect, when vim is responsive again go
over some of the examples in `core.cljs` and eval the expr using `cpp`

