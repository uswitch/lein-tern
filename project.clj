(defproject uswitch/lein-tern "0.2.1"
  :description "Migrations as data"
  :url "http://github.com/uswitch/lein-tern"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :scm  {:name "git"
         :url "https://github.com/uswitch/lein-tern"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-time "0.8.0"]
                 [org.clojure/java.jdbc "0.7.0-alpha3"]
                 [postgresql "9.3-1102.jdbc41"]
                 [java-jdbc/dsl "0.1.0"]]
  :plugins [[s3-wagon-private "1.2.0"]]
  :profiles {:dev {:dependencies [[expectations "2.0.9"]]
                   :plugins      [[lein-autoexpect "1.0"]
                                  [lein-expectations "0.0.8"]]}}
  :eval-in-leiningen true)
