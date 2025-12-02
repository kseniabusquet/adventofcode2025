(ns advent-1.part-1
  (:require [advent-1.commons :refer [->direction-num-operator]]))

(defn f-1 [init-val seq-val counter]
  (let [[_direction num operator] (->direction-num-operator seq-val)
        final-pos (mod (operator init-val num) 100)]
    (when (zero? final-pos)
      (swap! counter inc))
    final-pos))

(defn get-password [seq]
  (let [counter (atom 0)]
    (reduce #(f-1 %1 %2 counter) 50 seq)
    @counter))
