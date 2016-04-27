(def neo4j-version "3.0.0")

(defproject testclj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]

  :profiles {:provided {:dependencies [[org.neo4j/neo4j ~neo4j-version]]}}

  :java-source-paths ["src/java"]

  :source-paths ["src/clj"]

  :aot :all

  :omit-source true

  :uberjar-name "testclj.jar"

  :global-vars {*warn-on-reflection* true})
