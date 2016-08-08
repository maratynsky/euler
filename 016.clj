(defn pow [n m] (reduce * (repeat m n)))

(pow 2 3)


;;System.out.println(new BigInteger("2").pow(1000).toString().chars().mapToLong(value -> value-'0').sum());
