(ns HelloWorld.day2)

;gotta put any symbol in brackets in order to avoid error
;and for loop function, it matches the parameters that after loop key
;word, then in the end of each loop, the recur function has to do something
;with both parameters, both parameters must present, throw exception
;nonetheless.
(loop [x 5 y[]]
  (println x y)
  (if (> x 0)
  (recur (dec x) (conj y x))))

;try something else. the idea of loop seems working
(defn routine [day]
  (loop [s day]
    (println (format "Yue goes to school %d", s ))
    (if(< s 7)
    (recur (inc s)))))

(routine 1)
; so far got no clue about how to make a for loop in Clojure
;this is an advice from web. the person suggests using map as a for loop
;THIS IS NOT RETURN ANYTHING.
(println(map (fn [x] x)
             ["Monday" "Tuesday" "Wednesday"]))
;standard print always return nil.
(println(map (fn [x] 
               (print (format "%s " x)
                      ))
             ["Monday" "Tuesday" "Wednesday"]))

;get value from a map, this is currently working; however, doesnt meet
;the solution in 4clojure
(true? (= nil (:a {:a nil :b 2 })))

;for loops
(for [x (range 40) 
      :when (= 1 (rem x 4))]
  x)
;these for loop operations need extra attention
;as I found these are more complex than the loops in Java
;most of all, these loops involve deep math concept behind the scene
(for [x (iterate #(+ 4 %) 0)
      :let [z (inc x)]
      :while (< z 40)]
  z)

(for [[x y] (partition 2 (range 20))]
  (+ x y))
