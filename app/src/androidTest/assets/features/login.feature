#language: pt

Funcionalidade: Login do usuario

  @login-validando
  Cenario: Validar elementos do Login
    Dado Que eu inicio a tela de Login
    E Eu vejo Hint e o campo de Email
    E Eu vejo Hint e o campo de Senha
    Quando Eu vejo o Botao de Login
    Então Eu vejo a imagem do Login
