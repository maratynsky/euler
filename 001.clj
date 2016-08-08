(defn euler1 [] (reduce + (filter (fn [x] (or (= 0 (mod x 3)) (= 0 (mod x 5)))) (range 0 1000))))
(euler1)
