(ns advent-1.part-1-test
  (:require [advent-1.test-cases :refer [test-case-1 test-case-2]]
            [advent-1.part-1 :refer [get-password]]
            [clojure.test :refer [deftest is testing]]))

(deftest part-1-test
  (testing
   (is (= 3 (get-password test-case-1)))
   (is (= 1129 (get-password test-case-2)))))
