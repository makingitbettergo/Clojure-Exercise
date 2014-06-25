(ns HelloWorld.core)

;Since it is not REPL, in Eclipse, it executes the last command
;
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
;square
(defn square [x]
  (* x x))

;division in nominator/denominator form
(defn divide [x , y]
  (/ x y))
(println (divide 1 3))
;division in float form
(println (divide 1.0 4))

;so I would guess the same process will be applied to the rest operations.
;check equality between 2 arguments
;post return false when they are not equal
(println (= (- 10 (* 2 3)) 4))

;use java class??? the . part could also be a sumbol
(println (= "HELLO WORLD" (clojure.string/upper-case "Hello World")))

;use of list, lists are enclosed with parentheses 
;compare with multiple arguments, in this case, it compares list and 
;convert vector to list
(println (= (list :a :b :c) '(:a :b :c)))
(println (= '(1 2 3 4) (conj '(2 3 4) 1) (conj '(3 4) 2 1)))

;the difference between conj a list and a vector
;conj an element into a list, the element is added to the index 0
;conj an element into a vector, the element is appended to the end
;be aware, the adding an elements operation follows the sequential order.
(println (= [1 2 3 4] (conj [1 2] 3 4)))

;set #{} it follows strictly as how sets have been difined in the math content
;as my observation, sets don't care about the sequential orders
(println (= #{:a :c :d :b} (set '(:a :b :c :d))))

;conj set
(println (= #{1 2 3 4} (conj #{1 2 3} 4)))

;map uses key value pair, the symbols ":%"s are the keys 
(println (= 20 ((hash-map :a 10, :b 20, :c 30) :b)))
;another hash-map idiom
(println (= 20 (:b {:a 10, :b 20, :c 30})))

;map conj. one more thing, it seems only hash-map uses comma to separate entries 
(println (= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3])))

;sequence
(println (= 3 (first '(3 2 1))))
(println (= 3 (second [2 3 1])))
(println (= 3 (last '(2 1 3))))

;rest get the rest except the first
(println (= [20 30 40] (rest [10 20 30 40])))

;working with function declaration
;declare a anonymous function
(println (
   (fn add-five [x]
     (+ x 5))
    3))

(println (
   (fn [x]
     (+ x 5))
    3))

(println (
   #(+ % 5)
    3))

;double a number
(println (
    (fn [x]
    (* x 2))
    2))

;the % represents for the variable. I know it
;is not approriate to talk variable in Clojure, it helps understanding
(println (
    #(* % 2)
    2))

;format command for customized string construction
(println (format "Hello, %s! %b %d %f" "Dave" true 1 2.0))

;regonize the difference between map function and map data structure
(println (map #(+ % 3) '(1 2 3)))

;use filter I have tried that filter does not work with hashmap
;when clojure prints a list, it does not show the type
(println (filter #(> % 5) '(2 3 4 6 7 8 1)))

