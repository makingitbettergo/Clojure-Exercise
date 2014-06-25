(ns HelloWorld.core)
;Since it is not REPL, in Eclipse, it executes the last command
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
