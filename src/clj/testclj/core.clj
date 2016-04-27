(ns testclj.core
  (:import (org.neo4j.procedure Name Procedure)
           (java.util.stream Stream)
           (org.testclj IProcedure StringResult)))

(deftype InputResource []
  IProcedure
  (^{Procedure ""}
   iden
    [this ^{Name "dummy"} dummy]
    (Stream/of (StringResult. dummy))))