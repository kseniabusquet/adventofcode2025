(ns advent-2.commons)

(defn generate-num-sequence [ranges]
  (sort (flatten (map #(range (first %) (inc (last %))) ranges))))

(defn filter-equal-parts [s]
  (let [split-idx (/ (count s) 2)]
    (= (subs s 0 split-idx)
       (subs s split-idx))))

(defn has-repeated-pattern? [s]
  (let [len (count s)]
    (some (fn [pattern-len]
            (and (= 0 (mod len pattern-len))
                 (let [pattern (subs s 0 pattern-len)
                       repetitions (/ len pattern-len)]
                   (and (>= repetitions 2)
                        (= s (apply str (repeat repetitions pattern)))))))
          (range 1 (inc (/ len 2))))))
