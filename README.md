
# projetoLumierre_JavaWeb
    +-----------------+          +--------------+          +---------------+
    |     User       |          |    Rental    |          |     Movie     |
    +-----------------+          +--------------+          +---------------+
    | - name         |<----1      | - user       |<----1     | - title       |
    | - email        |----|------>| - movie     |----|     | - genre      |
    | - password     |          | - series    |    |     | - releaseYear|
    | - address      |          | - rentalDate|    |     | - rating     |
    +-----------------+          | - returnDate|    |     | - rentalPrice|
                                  +--------------+    |     | - rentalDuration|
                                                       +---------------+
                                                            |
                                                            |
                                                      +-------------+
                                                      | Series      |
                                                      +-------------+
                                                      | - title     |
                                                      | - genre     |
                                                      | - releaseYear|
                                                      | - rating    |
                                                      | - rentalPrice|
                                                      | - rentalDuration|
                                                      | - numberOfSeasons|
                                                      +---------------+
