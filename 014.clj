(defn collatz
  ([x] (if (odd? x)
         (inc (* 3 x))
         (/ x 2))))

(defn collatz-power [x] (inc (count (take-while #(not= % 1) (iterate collatz x)))))

(time (apply max-key #(collatz-power %) (range 2 1000001)))
