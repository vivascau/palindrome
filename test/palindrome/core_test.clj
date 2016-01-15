(ns palindrome.core-test
  (:require [clojure.test :refer :all]
            [palindrome.core :refer :all]))

(deftest palindrome-success-test
  (testing "Should correctly identify the palindrome 'Was it a car or a cat I saw'"
    (is (= true (palindrome? "Was it a car or a cat I saw" )))))

(deftest palindrome-failure-test
  (testing "Should correctly identify that is not a palindrome 'totally not a palindrome'"
    (is (= false (palindrome? "totally not a palindrome")))))
