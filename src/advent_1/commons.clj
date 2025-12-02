(ns advent-1.commons)

(defn ->direction-num-operator [seq-val]
  (let [direction (subs seq-val 0 1)
        num (Integer/parseInt (subs seq-val 1))
        operator (case direction
                   "L" -
                   "R" +)]
    [direction num operator]))
