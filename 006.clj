(-
   ((fn [x] (* x x)) (reduce + 0 (range 101)))
   (reduce + 0 (map (fn [x] (* x x)) (range 101))))