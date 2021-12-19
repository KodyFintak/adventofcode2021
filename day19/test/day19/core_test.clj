(ns day19.core-test
  (:require [clojure.test :refer :all]
            [day19.core :refer :all])
  (:import (day19.core Coordinates)))

(deftest adding
  (testing "Adding two numbers"
    (is (= (add 1 1) 2))))

(deftest scanner-report
  (testing "Parse scanner report"
    (is (= (parse-beacon "0,0,0") (Coordinates. 0 0 0)))))