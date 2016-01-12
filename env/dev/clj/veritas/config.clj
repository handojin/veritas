(ns veritas.config
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [veritas.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[veritas started successfully using the development profile]=-"))
   :middleware wrap-dev})
