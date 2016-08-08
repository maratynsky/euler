(defn palindrome? [s]
  (if (<= (count s) 1)
    true
    (and (= (first s) (last s))
         (palindrome? (drop-last (drop 1 s))))))

(defn palindromen? [n]
  (palindrome? (str n)))


(apply max (filter palindromen? (for [x (range 999 100 -1) y (range 999 100 -1)] (* x y))))