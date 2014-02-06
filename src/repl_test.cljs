(ns cljs.user
  (:require [clojure.browser.repl]))

(defn hello
  []
  (js/alert "hello"))

(defn whoami
  []
  (.-userAgent js/navigator))
