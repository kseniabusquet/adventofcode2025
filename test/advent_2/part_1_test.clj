(ns advent-2.part-1-test
  (:require [advent-2.part-1 :refer [calculate-sum]]
            [advent-2.test-cases :refer [test-case-1 test-case-2]]
            [clojure.test :refer [deftest is testing]]))

(deftest part-1-test
  (testing
    (is (= 1227775554 (calculate-sum test-case-1)))
    (is (= 19219508902 (calculate-sum test-case-2)))))
