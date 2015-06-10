(ns yalh.sample-lib.core-test
  (:require [clojure.test :refer :all]
            [yalh.sample-lib.core :refer :all]))

(deftest t-ohai
  (is (= "Ohai foobar!" (ohai "foobar"))))
