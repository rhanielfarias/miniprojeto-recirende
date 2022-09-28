
* Participantes do projeto:
- Rhaniel Farias;
- William Benicio Dutra;
- Katia Dos Santos Queiroz;
- Kevin Richard Da Silva Candido.

    Essa aplica��o foi desenvolvida com o #Spring-Boot 2.7.4, utilizando
a linguagem Java na vers�o 11.0.16 e o #Maven 4.0.0. Al�m disso, foi
configurado como banco de dados o #Postgres, H2 e #Mysql. Dessa forma Possibilitando
uma op��o de escolha maior.

1. Essa API tem como objetivo registrar embalagens e atribuir 1500 pontos para o usu�rio, de acordo com a quantidade de embalagens de salgadinhos.
Ou seja: a cada embalagem registrada o usu�rio recebe 1500 pontos, os
quais podem ser usados para trocar por produtos, receber descontos,
entre outros.
2. Foi criado CRUD para  cadastrar usu�rio e embalagem de salgadinhos. Logo em seguida,  realizou-se o relacionamento entre as tabelas, considerando onetomany e manytoone, no qual o usu�rio � um para
muitos e a embalagem � muitos para um.
3. Criado o m�todo incrementaPontos na UsuarioService, no qual armazena a quantidade de pontos
e vai  ser chamado na EmbalagemService, assim,  atribuindo o valor de 1500.
4. Realizado testes unit�rios nas classes UsuarioService e
EmbalagemService.
5. Abaixo segue Json para testes:
*Cadastro do Usu�rio:
URL: "http://localhost:8080/usuarios",
{"nomeUsuario": "usuario",         "dataNascimento": "2022-10-10",        "cpf": "69467677059",        "email":
"email@server.com",         "telefone": "(ddd)912345678"    }
*Cadastro da embalagem:
URL: "http://localhost:8080/embalagens",
{    "marcaSalgadinho": "doritos",    "numeroDeSerie": "1234567"}
