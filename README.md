
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


```mermaid
classDiagram
  class Cliente {
    -nome: String
    -email: String
    -password: String
    -endereco: String
    -CPF: String
  }

  class Filme {
    -tituloFilme: String
    -genero: String
    -anoLancamento: String
    -avaliacao: String
    -duracao: String
    -valorAluguel: String
  }

  class Serie {
    -tituloSeries: String
    -genero: String
    -anoLancamento: String
    -avaliacao: String
    -precoAluguel: String
    -duracao: String
    -numeroTemporada: String
  }

  class Aluguel {
    -cliente: Cliente
    -filme: Filme
    -serie: Serie
    -dataAluguel: Date
    -dataDevolucao: Date
  }

  Cliente --> Aluguel
  Filme --> Aluguel
  Serie --> Aluguel


```
