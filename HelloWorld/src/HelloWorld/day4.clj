(ns HelloWorld.day4)

;I think this is the way we create anonymous fn for 4clojure questions
(fn [x coll]
(if (nil? (get coll x))
  true) )

;still dont know why it doesnt run the tests.
((fn [x coll]
  (if (and (nil? (get coll x)) (contains? coll x))
  true false)) :b {:a nil})