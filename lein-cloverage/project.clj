(defproject inoft/lein-cloverage "1.0.5-SNAPSHOT"
  :description "Lein plugin for cloverage"
  :url "https://github.com/inoft/cloverage"
  :scm {:name "git"
        :dir  ".."
        :url  "https://www.github.com/inoft/cloverage"
        :tag  "HEAD"}
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :min-lein-version "2.0.0"
  :eval-in-leiningen true
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
