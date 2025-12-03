(ns advent-2.part-1
  (:require [advent-2.commons :refer [filter-equal-parts generate-num-sequence]]))

(defn calculate-sum [ranges]
    (->> ranges
         generate-num-sequence
         (map str)
         (filter #(even? (count %)))
         (filter #(filter-equal-parts %))
         (map #(Long/parseLong %))
         (apply +)))
