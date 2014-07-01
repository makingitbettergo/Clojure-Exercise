(ns koans.08-higher-order-functions)

  
  "The map function relates a sequence to another"
  (println (str "q1 " (= [4 8 12] (map (fn [x] (* 4 x)) [1 2 3]))))

  "You may create that mapping"
  (println (str "q2 "(= [1 4 9 16 25] (map (fn [x] (* x x)) [1 2 3 4 5]))))

  "Or use the names of existing functions"
  (println (str "q3 "(= [false false true false false] (map nil? [:a :b nil :c :d]))))

  "A filter can be strong"
  (println (str "q4 "(= [] (filter (fn [x] false) '(:anything :goes :here)))))

  "Or very weak"
  (println (str "q5 "(= [:anything :goes :here] (filter (fn [x] true) '(:anything :goes :here)))))

  "Or somewhere in between"
  (println (str "q6 "(= [10 20 30] (filter (fn [x] (< x 40)) [10 20 30 40 50 60 70 80]))))

  "Maps and filters may be combined"
  (println (str "q7 "(= [10 20 30] (map (fn [x] (* 10 x)) (filter (fn [x] (< x 4)) [1 2 3 4 5 6 7 8])))))

  "Reducing can increase the result"
  (println (str "q8 "(= 24 (reduce (fn [a b] (* a b)) [1 2 3 4]))))

  "You can start somewhere else"
  (println (str "q9 "(= 2400 (reduce (fn [a b] (* a b)) 100 [1 2 3 4]))))
  ;in this case, reduce function starts from 100 rather than 1

  "Numbers are not the only things one can reduce"
  (println (str "q10 "(= "longest" (reduce (fn [a b]
                                    (if (< (count a) (count b) ) b a))
                                  ["which" "word" "is" "longest"]))))
