(defn powerMod [b e m]
  (defn m* [p q] (mod (* p q) m))
  (loop [b b, e e, x 1]
    (if (zero? e) x
      (if (even? e) (recur (m* b b) (/ e 2) x)
        (recur (m* b b) (quot e 2) (m* b x))))))

(defn mbprime? [x, y] (= 1 (powerMod y (- x 1) x)))

(defn prime2? [x] (map #(mbprime? x (+ 1 %)) (take 10 (repeatedly #(rand-int (- x 1))))))

(defn prime? [n] (reduce (fn [x,y] (and x y)) (prime2? n)))

(defn prime?? [n]
  (if (even? n) false
      (let [root (num (int (Math/sqrt n)))]
	(loop [i 3]
	  (if (> i root) true
	      (if (zero? (mod n i)) false
		  (recur (+ i 2))))))))

(defn euler7 [x, n] (let [p (prime?? x)] (if (and p (= n 10001)) x (recur (+ x 2) (if p (inc n) n)))))

(time (euler7 13 6))
