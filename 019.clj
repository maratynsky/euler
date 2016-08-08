(defn leap? [y] (or (and (zero? (mod y 4)) (not (zero? (mod y 100)))) (zero? (mod y 400))))

(def months {1 31
      3 31
      4 30
      5 31
      6 30
      7 31
      8 31
      9 30
      10 31
      11 30
      12 31})

(defn days-in-month [leap month] (if (= month 2) (if leap 29 28) (get months month)))

(def mon (reduce concat (map (fn[y] (let [leap (leap? y)] (map (fn[m] (days-in-month leap m)) (range 1 13)))) (range 1901 2001))))

(defn foo [[m c n]]
  [m (+ c (get m n)) (inc n)])

(defn sunday? [d] (= 5 (mod d 7)))

(count (filter true? (map sunday? (take (count mon)(map second (iterate foo [(vec mon) 0 0]))))))


