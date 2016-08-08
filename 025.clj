(def fib (lazy-cat [1N 1N] (map + (rest fib) fib)))


(for [i (range) x fib] [(inc i) x])

(defn foo [x] (<= 1000 (count (str (get x 1)))))

(first (filter foo (for [i (range) x fib] [(inc i) x])))
