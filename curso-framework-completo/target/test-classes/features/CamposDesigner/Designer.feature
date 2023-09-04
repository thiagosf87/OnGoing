#language: pt
@Designer
Funcionalidade: Evolucao da ficha tecnica do Designer

  Cenário: Logar no PLM
    Dado que acesso o PLM staging
    Quando visualizo a tela de login e preencho o username e password corretamente
    Então Usuário é logado com sucesso



    Dado que estou na home page do PLM
    Quando clico em style e escolho alguma season, divisão e grupo
    E Acesso uma subclasse
    E clico na role
    E seleciono a  role Designer KU
    E confirmo a troca da role para Designer KU
    Então  Posso preencher o campo Designer
    E  Posso preencher o campo Buyer
    E  Posso preencher o campo DTP
    E posso preencher o campo Graphic Designer



    Dado crio um novo item para a subclasse
    Quando Altero a view para Designer
    Então Valido que os campos de pré cadastro a nível de item estão preenchidos de acordo com a subclasse


    Dado que retorno para a subclasse
    Então Posso editar os campos apagando os seus respectivos valores


    Dado que estou em uma subclasse e crio um novo item dentro da subclasse
    Então valido que os campos de pré cadastro do style estão vazios


    Dado que estou no style e edito os campos de pré cadastro atribuindo novos valores
    Quando retorno a subclasse
    Então valido que os campos de pré cadastro preenchidos a nível de style não devem refletir para a sublasse











