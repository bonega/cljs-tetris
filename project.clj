(defproject cljs-tetris "0.1.0"
  :description "A functional Tetris written in Clojurescript."
  :url "https://github.com/bonega/cljs-tetris"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [libtetris "0.1.0"]
                 [enfocus "1.0.0-alpha3"]]
  :min-lein-version "2.0.0"
  :hooks [leiningen.cljsbuild]
  :plugins [[lein-cljsbuild "0.2.7"]]
  :cljsbuild {:crossovers [libtetris.core libtetris.scoring]
              :crossover-path "crossover-cljs"
              :builds {:dev {:source-path "src"
                             :compiler {:output-to "public/out/main.js"
                                        :optimizations :advanced
                                        :pretty-print false}}
                       :develop {:source-path "src"
                                 :compiler {:output-to "public/out/main.js"
                                            :optimizations :whitespace
                                            :pretty-print true}}}})
