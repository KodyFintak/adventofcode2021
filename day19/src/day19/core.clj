(ns day19.core)

(defn add
  [a b]
  (+ a b))

(defrecord Coordinates [x y z])

(defn parse-beacon [input]
  (Coordinates. 0 0 0))