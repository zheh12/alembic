(defproject alembic "0.3.1"
  :description "A jar distiller"
  :url "https://github.com/pallet/alembic"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[lein-as-resource "2.5.0"]
                 [org.flatland/classlojure "0.7.0"]
                 [org.tcrawley/dynapath "0.2.3"]]
  :exclusions [[org.clojure/clojure]]
  :profiles {:provided
             {:dependencies [[org.clojure/clojure "1.4.0"]]}})
