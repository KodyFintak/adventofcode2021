(ns day19.core
  (:require [clojure.string :as str]))

(defrecord Coordinates [x y z])

(defn parse-beacon [input]
  (let [split-input (str/split input #",")
        [x y z] (map #(Integer/parseInt %) split-input)]
    (Coordinates. x y z)
    ))