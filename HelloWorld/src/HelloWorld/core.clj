(ns HelloWorld.core)

;Since it is not REPL, in Eclipse, it executes the last command
;
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
;square
(defn square [x] (* x x))
(square 1.3)
;division in nominator/denominator form
(defn divide [x , y] (/ x y))
(divide 1 3)
;division in float form
(divide 1.0 4)
;so I would guess the same process will be applied to the rest operations.
;check equality between 2 arguments
;post return false when they are not equal
(= (- 10 (* 2 3)) 4)
;use java class??? the . part could also be a sumbol
(= "HELLO WORLD" (.toUpperCase "Hello World"))
;use of list, lists are enclosed with parentheses 
;compare with multiple arguments, in this case, it compares list and 
;convert vector to list
(= (list :a :b :c) '(:a :b :c)) 
(= '(1 2 3 4) (conj '(2 3 4) 1) (conj '(3 4) 2 1))

;the difference between conj a list and a vector
;conj an element into a list, the element is added to the index 0
;conj an element into a vector, the element is appended to the end
;be aware, the adding an elements operation follows the sequential order.
(= [1 2 3 4] (conj [1 2] 3 4))

;set #{} it follows strictly as how sets have been difined in the math content
;as my observation, sets don't care about the sequential orders
(= #{:a :c :d :b} (set '(:a :b :c :d)))
;conj set
(= #{1 2 3 4} (conj #{1 2 3} 4))

;map uses key value pair, the symbols ":%"s are the keys 
(= 20 ((hash-map :a 10, :b 20, :c 30) :b))
;another hash-map idiom
(= 20 (:b {:a 10, :b 20, :c 30}))

;map conj