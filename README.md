
# projetoLumierre_JavaWeb
<<<<<<< HEAD
# javaweb
=======
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
    -anoLancamento: Interger
    -avaliacao: String
    -duracao: String
    -valorAluguel: String
  }

  class Serie {
    -tituloSeries: String
    -genero: String
    -anoLancamento: String
    -avaliacao: String
    -valorAluguel: String
    -duracao: String
    -numeroTemporada: Integer
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
>>>>>>> 394d9f7d0f3495b06d302f58b4b53440c51b4a87
