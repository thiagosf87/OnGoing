package br.com.renner.web.steps.login;

import br.com.renner.toolbox.GlobalTools;
import br.com.renner.toolbox.ToolsPage;
import br.com.renner.web.interactions.LoginInteractions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.io.IOException;

import static br.com.renner.web.pages.LoginPages.*;
import static br.com.renner.web.steps.hooks.WebSetup.driver;

public class LoginSteps {

    ToolsPage toolsPage = new ToolsPage();
    GlobalTools globalTools = new GlobalTools();
    LoginInteractions loginInteractions = new LoginInteractions();

    private static String loginStepName;

    public LoginSteps() throws IOException, ParseException {

    }

    /***
     * Passos do Dado
     */

    @Dado("que estou na página de incio do site Renner")
    public void queAcessoOSiteRenner() {
        loginStepName = "Estar na página incial site Renner";
    }
    @Dado("clico na opção entre ou cadastre-se")
    public void clicoNaOpçãoEntreOuCadastreSe() {
        loginStepName = "Clicar no botão Entre ou Cadastre-se";
        loginInteractions.selecionarEntreOuCadastrese();
    }

    /***
     * Passos do Quando
     */

    @Quando("realizo o login com email e senha validos")
    public void realizoOLoginComEmailESenhaValidos() {
        loginStepName = "Informo email e senha validos";
        loginInteractions.preencherDadosLoginValidosEmail();
    }

    @Quando("realizo o login com cpf e senha validos")
    public void realizoOLoginComCpfESenhaValidos() {
        loginStepName = "Informo cpf e senha validos";
        loginInteractions.preencherDadosLoginValidosCPF();
    }

    @Quando("informo dados de login {string} e senha {string} validos")
    public void informoDadosDeLoginValidos(String login, String senha) {
        loginStepName = "Informo dados de login validos";
        loginInteractions.preencherDadosLogin(login);
        loginInteractions.preencgerDadosSenha(senha);
        loginInteractions.botaoEntrar();
    }

    @Quando("realizo o login com email e senha invalidos")
    public void realizoOLoginComEmailESenhaInvalidos() {
        loginStepName = "Informo email e senha invalidos";
        loginInteractions.preencherDadosLoginInvalido();

    }

    @E("uma mensagem de alerta e exibida")
    public void umaMensagemDeAlertaEExibida() {
        loginStepName = "Exibe mensagem de erro";
        loginInteractions.validarMensagemErroLogin();
    }

    @Quando("realizo o login com cpf e senha invalidos")
    public void realizoOLoginComCpfESenhaInvalidos() {
        loginStepName = "Informo cpf e senha invalidos";

    }

    /***
     * Passos de validação
     */

    @Então("login deve ser realizado com sucesso")
    public void loginDeveSerRealizadoComSucesso() {
        loginStepName = "Validar login efetuado com sucesso";
        loginInteractions.validarUsusario();
    }

    @Então("o usuario nao deve estar logado")
    public void oUsuarioNaoDeveEstarLogado() throws InterruptedException {
        loginStepName = "Valido usuario não logado";
        Thread.sleep(2000);
        Assert.assertTrue(!UsuarioLogado.isDisplayed());
    }


}
