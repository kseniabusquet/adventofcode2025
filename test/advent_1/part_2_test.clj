(ns advent-1.part-2-test
  (:require [advent-1.part-2 :refer [get-password]]
            [advent-1.test-cases :refer [test-case-1 test-case-2]]
            [clojure.test :refer [deftest is testing]]))

(deftest part-2-test
  (testing
    (is (= 6 (get-password test-case-1)))
    (is (= 6638 (get-password test-case-2)))))
