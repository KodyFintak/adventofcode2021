(ns day19.core)

(defrecord Coordinates [x y z])

(defn parse-beacon [input]
  (Coordinates. 0 0 0))