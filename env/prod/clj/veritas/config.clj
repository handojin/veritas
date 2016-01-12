(ns veritas.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[veritas started successfully]=-"))
   :middleware identity})
