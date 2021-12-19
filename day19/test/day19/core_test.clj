(ns day19.core-test
  (:require [clojure.test :refer :all]
            [day19.core :refer :all]))

(deftest adding
  (testing "Adding two numbers"
    (is (= (add 1 1) 2))))
