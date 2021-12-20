(ns day19.core
  (:require [clojure.string :as str]))

(defrecord Coordinates [x y z])

(defn parse-beacon [input]
  (let [[x y z] (map #(Integer/parseInt %) (str/split input #","))]
    (Coordinates. x y z)
    ))

(defn parse-scanner-report [scanner-report]
  (let [rows (rest (str/split-lines scanner-report))]
    (map #(parse-beacon %) rows))
  )

(defn parse-report [report]
  (let [scanner-reports (str/split report #"\n\n")]
    (map #(parse-scanner-report %) scanner-reports))
  )
