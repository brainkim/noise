(ns noise.scaler)

; given a root, filter for all the numbers between 0 and 120 
; that belong to the major scale for that root

(def major-scale [2 2 1 2 2 2 1])

(defn find-key [root scale]
  (let [lowest-root (mod root 12)]
   (take-while (partial > 120)
               (reductions + lowest-root (cycle scale)))))

(find-key 60 major-scale)
