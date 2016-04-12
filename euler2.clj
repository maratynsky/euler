
(def fib (lazy-cat [1 1] (map + (rest fib) fib)))
(defn euler2 [] (reduce + (filter even? (take-while (fn [x] (< x 4000000)) fib))))