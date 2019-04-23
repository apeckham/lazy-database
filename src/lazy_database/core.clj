(ns lazy-database.core
  (:gen-class)
  (:require [hugsql.core :as hugsql]))

(defn -main
  [& args]
  (hugsql/def-db-fns "test.sql")
  (now "postgresql://postgres:mysecretpassword@localhost:54321/"))
