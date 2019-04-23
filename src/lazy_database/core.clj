(ns lazy-database.core
  (:gen-class)
  (:require [hugsql.core :refer [def-db-fns]]
            [clojure.java.jdbc :as j]))

(def url "postgresql://postgres:mysecretpassword@localhost:54321/")

(def-db-fns "test.sql")

(defn not-lazy []
  (let [counter (atom 0)]
    (doseq [i (bigdata url)]
      (swap! counter inc))
    @counter))

(defn lazy []
  (let [counter (atom 0)]
    (j/with-db-transaction [tx url]
                           (bigdata tx {} {} {:row-fn     (fn [row]
                                                            (swap! counter inc))
                                              :fetch-size 10}))
    @counter))

(defn -main
  [& args]
  (prn "hi"))
