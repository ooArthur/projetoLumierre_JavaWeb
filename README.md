
# projetoLumierre_JavaWeb
    +-----------------+                +--------------+            +---------------+
    |     Cliente     |               |    Aluguel     |           |     filmes    |
    +-----------------+                +--------------+            +---------------+
    | - nome          |               | - nome         |          | - tituloFilme   |
    | - email         | <----1 ------>| - filme        |<----1--- | - genero        |
    | - password      |               | - series       |          | -anoLancamento  |
    | - endereco      |               | - dataAluguel  |          | - avaliacao     |
    | - CPF           |               | -dataADevolucao|          | -ValorAluguel   |
    +-----------------+               |                |          | -duracao        |
                                       +--------------+           |                 |
                                                                   +---------------+
                                                                           |
                                                                           |
                                                                    +------------------+
                                                                    |    Series        |
                                                                    +------------------+
                                                                    | - titleSeries    |
                                                                    | - genero         |
                                                                    | - anoLancamento  |
                                                                    | - avaliacao      |
                                                                    | - precoAluguel   |
                                                                    | - duracao        |
                                                                    | - numeroTemporada|
                                                                     +-----------------+
