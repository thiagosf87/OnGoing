#language: pt


Funcionalidade: Validar fluxo regressivo para cadastro de usurario

  Contexto:
    Dado que estou na página de incio do site Renner
    E clico na opção entre ou cadastre-se


  Cenário: Cadastro de um novo usuario com sucesso
    Dado que seleciono o botao quero me cadastrar
    E realizo o preenchimento dos dados obrigatorios
    E seleciono termo de acordo
    E realizo o cadastro
    Então sou cadastrado com sucesso

  Cenário: validar cadastro CPF ja existente
    Dado que seleciono o botao quero me cadastrar
    E realizo o preenchimento dos dados obrigatorios com CPF ja cadastrado
    E seleciono termo de acordo
    E realizo o cadastro
    Então recebo mensagem de erro


    Cenario: Validar Cadastro CPF inválido
    Dado que seleciono o botao quero me cadastrar
    E informo um CPF invalido
      E seleciono termo de acordo
      E realizo o cadastro
    Então o sistema retornar mensagem de erro



  Cenario: Validar Cadastro com idade inferior a dezesseis anos
    Dado que seleciono o botao quero me cadastrar
    E realizar cadastro preenchendo dados solicitados
    E seleciono termo de acordo
    E realizo o cadastro
    Então o sistema retornar mensagem de idade inferior


