package br.com.renner.web.interactions;

import br.com.renner.toolbox.GlobalTools;
import br.com.renner.toolbox.ToolsPage;
import br.com.renner.web.pages.LoginPages;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.parboiled.trees.BinaryTreeNode;
import static br.com.renner.web.steps.hooks.WebSetup.driver;

public class LoginInteractions extends LoginPages {

    ToolsPage toolsPage = new ToolsPage();
    GlobalTools globalTools = new GlobalTools();

    public LoginInteractions(){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);
    }

    public void selecionarEntreOuCadastrese() {
        BtnEntreOuCadastrese.click();
    }

    public void preencherDadosLoginValidosEmail() {
        TituloIdentificacao.isDisplayed();
        InputCpfEmail.click();
        InputCpfEmail.clear();
        InputCpfEmail.sendKeys(ToolsPage.getUserEmail());
        InputSenha.click();
        InputSenha.clear();
        InputSenha.sendKeys(ToolsPage.getPassword());
        BtnEntrar.click();
    }
    public void preencherDadosLoginValidosCPF() {
        TituloIdentificacao.isDisplayed();
        InputCpfEmail.click();
        InputCpfEmail.clear();
        InputCpfEmail.sendKeys(ToolsPage.getCPF());
        InputSenha.click();
        InputSenha.clear();
        InputSenha.sendKeys(ToolsPage.getPassword());
        BtnEntrar.click();
    }

    public void preencherDadosLoginInvalido() {
        TituloIdentificacao.isDisplayed();
        InputCpfEmail.click();
        InputCpfEmail.clear();
        InputCpfEmail.sendKeys("login@invalido.com");
        InputSenha.click();
        InputSenha.clear();
        InputSenha.sendKeys("123456");
        BtnEntrar.click();
    }

    public void validarUsusario() {
        String usaurio = "Francis";
        try{
            Assert.assertEquals(usaurio, UsuarioLogado.getText());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void preencherDadosLogin(String login) {
        TituloIdentificacao.isDisplayed();
        InputCpfEmail.click();
        InputCpfEmail.clear();
        InputCpfEmail.sendKeys(login);
    }

    public void preencgerDadosSenha(String senha) {
        InputSenha.click();
        InputSenha.clear();
        InputSenha.sendKeys(senha);
    }

    public void botaoEntrar() {
        BtnEntrar.click();
    }

    public void validarMensagemErroLogin() {
        String mensagemValidacao = "Esta combinação de usuário e senha é inválida.";
        try{
            Assert.assertEquals(mensagemValidacao, MensagemErro.getText());
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
