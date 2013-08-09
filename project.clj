(defproject inoft-cloverage-parent "1.0.4-SNAPSHOT"
  :description "Parent project for cloverage and lein-cloverage."
  :url "http://github.com/inoft/cloverage"
  :dependencies
    []
  :plugins
    [[lein-sub "0.2.4"]
     ]
  :sub
    ["cloverage"
     "lein-cloverage"]
  :codox
    {:sources ["cloverage/src"
               "lein-cloverage/src"]})