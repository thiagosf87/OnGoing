#language: pt

Funcionalidade: Validar fluxo login

  Contexto:
    Dado que estou na página de incio do site Renner
    E clico na opção entre ou cadastre-se

  Cenário: Realizar login com email e senha
    Quando realizo o login com email e senha validos
    Então login deve ser realizado com sucesso

  Cenário: Realizar login com cpf e senha
    Quando realizo o login com cpf e senha validos
    Então login deve ser realizado com sucesso

  Esquema do Cenario: Relizar login com sucesso
    Quando informo dados de login "<login>" e senha "<senha>" validos
    Então login deve ser realizado com sucesso

    Exemplos:
      | login                       | senha  |
      | 99500566087                 | 123456 |
      | luizautomatizado2@gmail.com | 123456 |

  #### Cenários com erro
  @login
  Cenário: Fazer login com usuário inválido - email
    Quando realizo o login com email e senha invalidos
    E uma mensagem de alerta e exibida
    Então o usuario nao deve estar logado

  Cenário: Fazere login com usuário inválido - cpf
    Quando realizo o login com cpf e senha invalidos
    E uma mensagem de alerta e exibida
    Então o usuario nao deve estar logado

  Esquema do Cenario: Fazer login com usuario invalido - Email
    Quando informo dados de login "<login>" e senha "<senha>" validos
    E uma mensagem de alerta e exibida "<validacao>"
    Então o usuario nao deve estar logado

    Exemplos:
      | login                       | senha  | validacao           |
      | 99500566087                 | 123456 |  email nao valido   |
      | luizautomatizado2@gmail.com | 123456 |                     |