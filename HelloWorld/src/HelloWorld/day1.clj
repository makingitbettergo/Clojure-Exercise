(ns HelloWorld.day1)

;today i start with local bindings
;is also from the 35th problem from 4clojure.com

;local binding, the idea is to bind a symbol, and the 
(println(let [x 5] (+ x 2)))
(println(let [x 2, y 10] (* x y)))
(println(let [z 1] z))
(println(let [z 1, y 3] (+ y z)))
(println(let [y 3, x 7] (+ x y)))
;reader macro, to get selected strings from a string
(println(apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

;the + means look for more, if there are more, put them together as one string
(println(apply str (re-seq #"[A]+" "AAAA")))

;what apply does is to remove quotes etc.
(println(str (re-seq #"[A]+" "AABAA")))
(println(str (re-seq #"[A]" "AAAA")))

;here are more detailed tests on apply
(println(apply max [1 2 3]))
;so the difference between these two is apply wrap the max function as 
;an argument and apply the result of the fn
(println(max [1 2 3]))
(println(min [1 2 3]))

;reduce this example is from Clojure doc.
;in this example, the function holds a vector and a number
(reduce 
(fn [primes number]
  (if (some zero? (map (partial mod number) primes))
          primes
          (conj primes number)))
[2]
(take 100 (iterate inc 3)))

;a simple use of reduce
(println(reduce 
         (fn [num1 num2]
           (+ num1 num2))
         [1 2 3 4 5]))
;a different version, works the same; thus reduce does not require
;the argument to be functions
(println (reduce + [1 2 3 4 5]))

;it even take different types; however, it seems not taking two vecs or lsts
(println (reduce + 1 [1 2 3 4 5]))
