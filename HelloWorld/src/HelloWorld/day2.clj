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
(defn daysList [])
(defn routine [day]
  (loop [s day]
    (println (format "Yue goes to school %d", s ))
    (if(< s 7)
    (recur (inc s)))))

(routine 1)
; so far got no clue about how to make a for loop in Clojure
;this is an advice from web. the person suggests using map as a for loop
(map (fn [x] (print (format "%s " x))) 
     ["Monday" "Tuesday" "Wednesday"])