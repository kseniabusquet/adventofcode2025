(ns advent-2.part-2
  (:require [advent-2.commons :refer [has-repeated-pattern? generate-num-sequence]]))

(defn calculate-sum [ranges]
  (->> ranges
       generate-num-sequence
       (map str)
       (filter #(has-repeated-pattern? %))
       (map #(Long/parseLong %))
       (apply +)))
