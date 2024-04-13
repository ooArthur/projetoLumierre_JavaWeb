const dad = document.getElementById("dadElement");

/* --------------------------------------------------------SEPARAÇÃO------------------------------------------------------------------ */
const addMovie = document.getElementById("add-movie");

addMovie.addEventListener("click", () => {
    const content = `
        <div class="add">
        <div class="titleadd">
            <div class="image">
            <img src="../images/icon-filme.svg" alt="" id="img-title">
        </div>
        <div class="title-add">
            <h1>Adicionar filme</h1>
        </div>
        </div>
        
        <div class="form">
            <form action="">
                <label for="">Título:</label>
                <input type="text" name="title" id="title" placeholder="Digite o título do filme">
                
                <label for="">Gênero:</label>
                <select name="category" id="category">
                    <option value="" disabled selected hidden>Selecione a categoria</option>
                    <option value="action">Ação</option>
                    <option value="adventure">Aventura</option>
                    <option value="comedy">Comédia</option>
                    <option value="comromance">Comédia Romântica</option>
                    <option value="documentary">Documentário</option>
                    <option value="drama">Drama</option>
                    <option value="fantasy">Fantasia</option>
                    <option value="scifi">Ficção Científica</option>
                    <option value="animation">Animação</option>
                    <option value="musical">Musical</option>
                    <option value="romance">Romance</option>
                    <option value="horror">Terror</option>
                    <option value="thriller">Suspense</option>
                </select>

                <label for="">Ano de lançamento:</label>
                <input type="number" name="date" id="date" placeholder="Digite o ano de lançamento">
                
                <label for="">Sinopse:</label>
                <input type="text" name="sinopse" id="sinopse" placeholder="Digite a sinopse do filme">

                <div class="double-inputs">
                    <div class="input1">
                    <label for="">Valor de aluguel:</label>
                    <input type="text" name="price" id="price" placeholder="Valor do aluguel semanal">
                    </div>
                    <div class="input2">
                    <label for="">Duração:</label>
                    <input type="text" name="duration" id="duration" placeholder="Duração | ex.: 105">
                    </div>
                </div>

                <label for="">Capa:</label>
                <input type="url" name="capa" id="capa" placeholder="Digite a URL da capa desejada">

                <button id="btn-add" type="sumbit">Adicionar</button>
            </form>
        </div>
        </div>
    `;

    dad.innerHTML = content;
});

/* --------------------------------------------------------SEPARAÇÃO------------------------------------------------------------------ */

const listMovie = document.getElementById("list-movie");

listMovie.addEventListener("click", () => {
    const content = `
 `;

    dad.innerHTML = content;
});

/* --------------------------------------------------------SEPARAÇÃO------------------------------------------------------------------ */

const addUSer = document.getElementById("add-user");

// Adicionando Usuario
addUSer.addEventListener("click", () => {
    const content = `
      <div class="add">
      <div class="titleadd">
          <div class="image">
          <img src="../images/icon-user.svg" alt="" id="img-title">
      </div>
      <div class="title-add">
          <h1>Adicionar usuário</h1>
      </div>
      </div>
      
      <div class="form">
          <form action="">
              <label for="" >Nome:</label>
              <input type="text" name="title" id="title" placeholder="Digite seu nome">

              <label for="">E-mail:</label>
              <input type="email" name="email" id="email" placeholder="Digite seu e-mail">

              <label for="">Senha:</label>
              <input type="text" name="senha" id="senha" placeholder="Digite sua senha">
              
              <label for="">Nível de permissão:</label>
              <select name="category" id="category">
                  <option value="" disabled selected hidden>Selecione o nível de permissão</option>
                  <option value="adm">Administrador</option>
                  <option value="client">Cliente</option>
              </select>

              <label for="">Data de nascimento:</label>
              <input type="date" name="date" id="date">
               
              <button id="btn-add" type="sumbit">Adicionar</button>
          </form>
      </div>
      </div>
    `;

    dad.innerHTML = content;
});

/* --------------------------------------------------------SEPARAÇÃO------------------------------------------------------------------ */

const listUser = document.getElementById("list-user");

listUser.addEventListener("click", () => {
    const content = `                <div class="list-users">
      <table class="table-users">
          <tr class="list-title">
              <th>ID</th>
              <th>Nome</th>
              <th>Email</th>
              <th>Senha</th>
              <th>Data de Nascimento</th>
              <th>Permissão</th>
              <th>Editar</th>
              <th>Deletar</th>
          </tr>
          <tr class="users">
              <span></span>
              <td>1</td>
              <td>Sarah Christine</td>
              <td>sarinhalllz@gmail.com</td>
              <td>sasa123</td>
              <td>25-04-2007</td>
              <td>admin</td>
              <td><button class="btn-edit">Editar</button></td>
              <td><button class="btn-delete">Deletar</button></td>
          </tr>
      </table>
    </div>
    `;

    dad.innerHTML = content;
});

/* --------------------------------------------------------SEPARAÇÃO------------------------------------------------------------------ */
