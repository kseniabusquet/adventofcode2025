(ns advent-1.part-2
  (:require [advent-1.commons :refer [->direction-num-operator]]))

(defn count-zeros [step init-val num]
  (loop [pos init-val
         clicks num
         zero-count 0]
    (if (zero? clicks)
      zero-count
      (let [new-pos (mod (+ pos step) 100)
            new-zero-count (if (zero? new-pos)
                             (inc zero-count)
                             zero-count)]
        (recur new-pos (dec clicks) new-zero-count)))))

(defn f-2 [init-val seq-val counter]
  (let [[direction num operator] (->direction-num-operator seq-val)
        step (if (= direction "L") -1 1)
        zeros-count (count-zeros step init-val num)
        final-pos (mod (operator init-val num) 100)]
    (swap! counter + zeros-count)
    final-pos))

(defn get-password [seq]
  (let [counter (atom 0)]
    (reduce #(f-2 %1 %2 counter) 50 seq)
    @counter))
