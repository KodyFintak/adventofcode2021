(ns day19.core
  (:require [clojure.string :as str]))

(defrecord Coordinates [x y z])

(defn parse-beacon [input]
  (let [[x y z] (map #(Integer/parseInt %) (str/split input #","))]
    (Coordinates. x y z)
    ))