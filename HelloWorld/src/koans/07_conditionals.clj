(ns koans.07-conditionals)

(defn explain-defcon-level [exercise-term]
  (case exercise-term
        :fade-out          :you-and-what-army
        :double-take       :call-me-when-its-important
        :round-house       :o-rly
        :fast-pace         :thats-pretty-bad
        :cocked-pistol     :sirens
        :say-what?))

  "You will face many decisions"
  (println
    (= :a (if (false? (= 4 5))
            :a
            :b)))

  "Some of them leave you no alternative"
  (println(= [] (if (> 4 3)
                  [])))

  "And in such a situation you may have nothing"
  (println(= nil (if (nil? 0)
                  [:a :b :c])))

  "In others your alternative may be interesting"
  (println(= :glory (if (not (empty? ()))
                      :doom
                      :glory)))

  "You may have a multitude of possible paths"
  (println(let [x 5]
            (= :your-road (cond (= x 3) :road-not-taken
                                (= x 3) :another-road-not-taken
                                :else :your-road))))

  "Or your fate may be sealed"
  (println(= 'doom (if-not (zero? 1)
                  'doom
                  'more-doom)))

  "In case of emergency, sound the alarms"
  (println(= :say-what?
             (explain-defcon-level :sirens)))
  
  "Maybe you can have another try?"
  (= :thats-pretty-bad
     (explain-defcon-level :fast-pace))

  "But admit it when you don't know what to do"
  (println(= :say-what?
             (explain-defcon-level :yo-mama)))
  ;actually this is how case works:
  ;the function takes an argument, then it looks for the
  ;condition, if condition matches, return corresponding item
  ;else it returns default