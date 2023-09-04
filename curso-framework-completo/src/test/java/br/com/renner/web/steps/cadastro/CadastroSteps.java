package br.com.renner.web.steps.cadastro;

import br.com.renner.web.interactions.CadastroInteractions;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class CadastroSteps {

    CadastroInteractions cadastroInteractions = new CadastroInteractions();

    private static String cadasroStepName;

    @Dado("que seleciono o botao quero me cadastrar")
    public void queSelecionoOBotaoQueroMeCadastrar() {
        cadasroStepName = "Selecionar botão quero me cadastrar";
        cadastroInteractions.selecionoQueroMeCadastrar();
    }

    @Dado("realizo o preenchimento dos dados obrigatorios")
    public void preencherCamposDoCadastro() throws Exception {
        cadasroStepName = "Preencher os dodos de cadastro";
        cadastroInteractions.informarDadosCadastroValido();

        //cadastroInteractions.informarEmail("automacao8@gmaiil.com");
        //cadastroInteractions.informarCPF("03135305058");
        //cadastroInteractions.informarNome("João");
        //cadastroInteractions.informarSobreNome("Luiz");
        //cadastroInteractions.informarDataNascimento("04/07/1994");
        //cadastroInteractions.selecionarPreferencia();
        //cadastroInteractions.informarSenha("1234567");
        //cadastroInteractions.informarTelefone("51999470081");
    }

    @E("realizo o preenchimento dos dados obrigatorios com CPF ja cadastrado")
    public void realizoOPreenchimentoDosDadosObrigatoriosComCPFJaCadastrado() {
        cadasroStepName = "Preencher os dodos de cadastro";
        cadastroInteractions.informarEmail("automacao8@gmaiil.com");
        cadastroInteractions.informarCPF("03135305058");
        cadastroInteractions.informarNome("João");
        cadastroInteractions.informarSobreNome("Luiz");
        cadastroInteractions.informarDataNascimento("04/07/1994");
        cadastroInteractions.selecionarPreferencia();
        cadastroInteractions.informarSenha("1234567");
        cadastroInteractions.informarTelefone("51999470081");
    }

    @Dado("seleciono termo de acordo")
    public void selecionoTermoDeAcordo() {
        cadasroStepName = "Selecionar Termo de Acordo";
        cadastroInteractions.aceitarTermo();
    }

    @Dado("realizo o cadastro")
    public void realizoOCadastro() {
        cadasroStepName = " Clicar no botão Cadastrar";
        cadastroInteractions.ClicarBtnCadastrarr();
    }

    @Então("sou cadastrado com sucesso")
    public void souCadastradoComSucesso() {
        cadasroStepName = "Cadastro realziado com sucesso";
        cadastroInteractions.ValidarCadsatroComSucesso();
    }


    @Então("recebo mensagem de erro")
    public void validoMensagemDeErro() {
        cadasroStepName = "Validar menagem de erro";
        cadastroInteractions.ValidarMensagemErro();
    }

    @Dado("informo um CPF invalido")
    public void informoUmCPFInvalido() throws Exception {
        cadasroStepName = "Informar CPF inválido para cadastro";
        cadastroInteractions.realizoCadastroCPFInvalido();

    }

    @Então("o sistema retornar mensagem de erro")
    public void oSistemaRetornarMensagemDeErro() {
        cadasroStepName = "Validar mensagem de alerta para cpf inválido";
        cadastroInteractions.validoMensagemAlertaInvalido();

    }
    @Dado("realizar cadastro preenchendo dados solicitados")
    public void realizarCadastroPreenchendoDadosSolicitados() {
        cadasroStepName = "Realizar cadastro menor de idade";
        cadastroInteractions.realizarCadastroMenorIdade();
    }

    @Então("o sistema retornar mensagem de idade inferior")
    public void oSistemaRetornarMensagemDeIdadeInferior() {
        cadastroInteractions.validarMensagemAlertaMenorIdade();

    }



}