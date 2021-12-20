(ns day19.core-test
  (:require [clojure.test :refer :all]
            [day19.core :refer :all])
  (:import (day19.core Coordinates)))

(deftest scanner-report
  (testing "Parse scanner report"
    (is (= (parse-report "--- scanner 0 ---\n100,100,100") (list (Coordinates. 100 100 100))))
    (is (= (parse-report "--- scanner 0 ---\n100,100,100\n1,-1,1") (list (Coordinates. 100 100 100) (Coordinates. 1 -1 1))))
    )

  (testing "Parse scanner report row"
    (is (= (parse-beacon "0,0,0") (Coordinates. 0 0 0)))
    (is (= (parse-beacon "0,0,1") (Coordinates. 0 0 1)))
    (is (= (parse-beacon "-100,100,20") (Coordinates. -100 100 20)))
    )
  )