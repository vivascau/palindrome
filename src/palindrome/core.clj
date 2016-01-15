(ns palindrome.core)


(defn normalized [string]
  (clojure.string/lower-case (clojure.string/join (clojure.string/split string #"\s"))))

(defn palindrome? [string]
  (let [lowerCaseString (normalized string)]
    (= (seq lowerCaseString)(reverse lowerCaseString))))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (palindrome? (first args))))
