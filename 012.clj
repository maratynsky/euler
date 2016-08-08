(defn triangle ([] (triangle 1 0)) ([a acc] (lazy-seq (cons (+ a acc) (triangle (inc a) (+ acc a))))))

(defn sieve [s]
  (cons (first s)
        (lazy-seq (sieve (filter #(not= 0 (mod % (first s)))
                                 (rest s))))))

(def primes (take 100000 (sieve (iterate inc 2))))
primes

(defn prime-divisors [x] (filter #(zero? (mod x %)) (take-while #(<= % (/ x 2)) primes)))

(defn expand [pd x] (distinct (concat pd (map #(/ x %) pd))))

(defn nod [x] (+ 2 (count (expand (prime-divisors x) x))))

(time (first (filter #(> (nod %) 12) (triangle))))
