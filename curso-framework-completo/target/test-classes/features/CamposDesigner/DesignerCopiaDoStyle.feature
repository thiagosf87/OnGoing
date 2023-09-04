#language: pt
@DesignerCopiaDoStyle
Funcionalidade: Evolucao da ficha tecnica do Designer parte dois

  Cenario: Testes da ficha de pre cadastro
    Dado que acesso o PLM staging
    Quando visualizo a tela de login e preencho o username e password corretamente
    Então Usuário é logado com sucesso



    Dado que estou na home page do sistema PLM
    Quando clico em style e escolho alguma season, divisão, grupo e subclasse
    Então posso preencher novamente os campos de pré cadastro


    Dado que estou em uma subclasse e crio um terceiro style para o grupo
    Quando os campos de pré cadastro no style venham preenchidos de acordo com a subclasse
    Entao apago os valores para os campos de pré cadastro a nivel de style
    E preencho com outros valores




    Dado que estou em um style, copio o code style e retorno para subclasse
    Quando faço a cópia do style que alterei os campos de pré cadastro
    E entro no style
    Então posso validar que a copia do item venha de acordo com os valores do item original


