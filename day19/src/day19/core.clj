(ns day19.core
  (:require [clojure.string :as str]))

(defrecord Coordinates [x y z])

(defn parse-beacon-report [beacon-report]
  (let [[x y z] (map #(Integer/parseInt %) (str/split beacon-report #","))]
    (Coordinates. x y z)
    ))

(defn parse-scanner-report [scanner-report]
  (let [beacon-reports (rest (str/split-lines scanner-report))]
    (map #(parse-beacon-report %) beacon-reports))
  )

(defn parse-report [report]
  (let [scanner-reports (str/split report #"\n\n")]
    (map #(parse-scanner-report %) scanner-reports))
  )
