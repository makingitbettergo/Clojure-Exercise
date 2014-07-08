(ns practice.untitled)

(str "hi," " I'm" " Yue")
(true? (fn [element coll]
         (and
          (contains? coll element)
          (nil? (get (coll element)))))
       :a {:a nil})


(ns practice.untitled)

(str "hi," " I'm" " Yue")

(true? ((fn [element coll]
  (and (contains? coll element)
       (nil? (get coll element)))) 
        :a {:a nil :b 1}))

(true?  (#(and (contains? %2 %1)
               (nil? (%2 %1)) )
          :a {:a nil :b 2}))

({:a "X"} :b)
({:a "X"} :a)

(last (take 2 {:a 1 :c 3 :d 5}))

(last (take 2 '(1 3 5)))

;this is a recursion solution...
(fn f [p n]
  (if (= n 0)
    (first p)
    (f (rest p) (- n 1))))

; assign all the elements with a value
((fn [v m]
   (zipmap m (repeat v)))
   0 [:a :b :c])