(ns advent-2.part-2-test
  (:require [advent-2.part-2 :refer [calculate-sum]]
            [advent-2.test-cases :refer [test-case-1 test-case-2]]
            [clojure.test :refer [deftest is testing]]))

(deftest part-2-test
  (testing
    (is (= 4174379265 (calculate-sum test-case-1)))
    (is (= 27180728081 (calculate-sum test-case-2)))))
