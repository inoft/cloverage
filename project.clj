(defproject inoft/cloverage-parent "1.0.4"
  :description "Parent project for cloverage and lein-cloverage."
  :url "http://github.com/inoft/cloverage"
  :scm {:name "git"
        :url  "https://www.github.com/inoft/cloverage"
        :tag  "HEAD"}
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :plugins
    [[lein-sub "0.2.4"]
     [lein-release "1.0.4"]
     ]
  :sub
    ["cloverage"
     "lein-cloverage"]  
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