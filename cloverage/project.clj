(defproject inoft/cloverage "1.0.5-SNAPSHOT"
  :description "Form-level test coverage for clojure."
  :url "https://www.github.com/inoft/cloverage"
  :scm {:name "git"
        :dir  ".."
        :url  "https://www.github.com/inoft/cloverage"
        :tag  "HEAD"}
  :main cloverage.coverage
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.cli "0.2.2"]
                 [org.clojure/tools.logging "0.2.3"]
                 [org.clojure/data.xml "0.0.7"]
                 [bultitude "0.2.0"]
                 [slingshot "0.10.3"]]
  :plugins [[lein-release "1.0.4"]]
  :deploy-repositories [["releases" {:url ~(str "file:///" (System/getenv "INOFT_PUBLIC_REPO_PATH") "/releases")
                                     :username "john"
                                     :password "doh"
                                     :sign-releases false}]
                       ["snapshots" {:url ~(str "file:///" (System/getenv "INOFT_PUBLIC_REPO_PATH") "/snapshots")
                                      :username "john"
                                      :password "doh"
                                      :sign-releases false}]
                      ]
  :lein-release {:scm :git
                 :deploy-via :lein-deploy}
  )
