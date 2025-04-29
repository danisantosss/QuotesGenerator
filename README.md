## Requisitos

Requisitos Funcionais
- RF01: O sistema deve permitir visualizar frases pré-criadas;
- RF02: O sistema deve permitir criar as frases de cada usuário;
- RF03: O sistema deve permitir visualizar frases criadas pelo usuário;
- RF04: O sistema deve permitir editar frases criadas pelo usuário;
- RF05: O sistema deve permitir excluir frases criadas pelo usuário;

Requisitos Não Funcionais
- RNF01: O sistema deve ser intuitivo
- RNF02: O sistema deve retornar a mensagem em no máximo 3 segundos

## Casos de Teste

<h3>Caso de Teste 1</h3>

Objetivo: Verificar se o sistema replica corretamente uma frase inserida pelo usuário.

Passos:

1. Rodar o sistema.

2. Escolher a opção de criar citação.

3. Digitar a frase "Eu sou o Homem de Ferro".

4. Pressionar Enter para confirmar.

Resultado Esperado:

A frase "Eu sou o Homem de Ferro" aparece exatamente como foi digitada.

<h3>Caso de Teste 2</h3>
Objetivo: Fazer com que o sistema gere uma citação de um determinado herói.

Passos:

1. Rodar o sistema.

2. Escolher a opção de exibir citação e escolher um herói, por exemplo o homem-aranha.

Resultado Esperado:

A frase "With great power comes great responsibility!" aparece no sistema.

<h3>Caso de Teste 3</h3>
Objetivo: Verificar como o sistema se comporta ao tentar replicar uma frase em branco.

Passos:

1. Deixar o campo de entrada vazio.

2. Pressionar Enter para confirmar.

Resultado Esperado:

O sistema deve exibir uma mensagem de erro ou simplesmente não realizar nenhuma ação.
