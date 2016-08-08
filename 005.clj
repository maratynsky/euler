(defn divisible? [x d] (if (= d 1) true (and (= 0 (mod x d)) (divisible? x (dec d)))))

(defn div? [x] (divisible? x 20))

(first (filter div? (lazy-seq (iterate inc 1))))
