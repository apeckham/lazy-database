(defproject lazy-database "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.layerware/hugsql "0.4.9"]
                 [org.postgresql/postgresql "42.2.5.jre7"]]
  :main ^:skip-aot lazy-database.core
  :jvm-opts ["-Dcom.sun.management.jmxremote"
             "-Dcom.sun.management.jmxremote.ssl=false"
             "-Dcom.sun.management.jmxremote.authenticate=false"
             "-Dcom.sun.management.jmxremote.port=43210"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
