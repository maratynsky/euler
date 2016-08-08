(defn pow2 [x] (* x x))

(reduce * (first (filter #(and (= 1000 (reduce + %)) (= (+ (pow2 (get % 0)) (pow2 (get % 1))) (pow2 (get % 2))))
  (for [a (range 2 999) b (range 2 999) c (range 2 999)]
    [a b c]))))
