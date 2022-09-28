
* Participantes do projeto:
- Rhaniel Farias;
- William Benicio Dutra;
- Katia Dos Santos Queiroz;
- Kevin Richard Da Silva Candido.

    Essa aplicação foi desenvolvida com o #Spring-Boot 2.7.4, utilizando
a linguagem Java na versão 11.0.16 e o #Maven 4.0.0. Além disso, foi
configurado como banco de dados o #Postgres, H2 e #Mysql. Dessa forma Possibilitando
uma opção de escolha maior.

1. Essa API tem como objetivo registrar embalagens e atribuir 1500 pontos para o usuário, de acordo com a quantidade de embalagens de salgadinhos.
Ou seja: a cada embalagem registrada o usuário recebe 1500 pontos, os
quais podem ser usados para trocar por produtos, receber descontos,
entre outros.
2. Foi criado CRUD para  cadastrar usuário e embalagem de salgadinhos. Logo em seguida,  realizou-se o relacionamento entre as tabelas, considerando onetomany e manytoone, no qual o usuário é um para
muitos e a embalagem é muitos para um.
3. Criado o método incrementaPontos na UsuarioService, no qual armazena a quantidade de pontos
e vai  ser chamado na EmbalagemService, assim,  atribuindo o valor de 1500.
4. Realizado testes unitários nas classes UsuarioService e
EmbalagemService.
5. Abaixo segue Json para testes:
*Cadastro do Usuário:
URL: "http://localhost:8080/usuarios",
{"nomeUsuario": "usuario",         "dataNascimento": "2022-10-10",        "cpf": "69467677059",        "email":
"email@server.com",         "telefone": "(ddd)912345678"    }
*Cadastro da embalagem:
URL: "http://localhost:8080/embalagens",
{    "marcaSalgadinho": "doritos",    "numeroDeSerie": "1234567"}
