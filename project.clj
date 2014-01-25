(defproject cljs-node-lighttable "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]]

  :plugins [[lein-cljsbuild "1.0.1"]
            [org.bodil/cljs-noderepl "0.1.10"]]

  :source-paths ["src"]

;;   :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :cljsbuild {
    :builds [{:id "cljs-node-lighttable"
              :source-paths ["src"]
              :compiler {
                :output-to "cljs_node_lighttable.js"
;;                 :source-map "cljs-node-lighttable.js.map"
                :optimizations :simple}}]})
