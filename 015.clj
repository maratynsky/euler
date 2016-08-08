(def foo (memoize (fn [x y n]
  (if (or (= x n) (= y n))
    1
    (+
     (foo (inc x) y n)
     (foo x (inc y) n))))))

(time (foo 0 0 20))
