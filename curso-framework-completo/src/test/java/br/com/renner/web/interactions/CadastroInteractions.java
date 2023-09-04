package br.com.renner.web.interactions;

//import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.toolbox.GlobalTools;
import br.com.renner.toolbox.ToolsPage;
import br.com.renner.web.pages.CadatroPages;
import com.github.dockerjava.api.model.GenericResource;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static br.com.renner.web.steps.hooks.WebSetup.driver;

public class CadastroInteractions extends CadatroPages {

    ToolsPage toolsPage = new ToolsPage();
    public static Faker faker = new Faker();
    public CadastroInteractions() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
    }
    public void selecionoQueroMeCadastrar() {
        btnQueroMeCadastrar.click();
        txtCadastroTitulo.isDisplayed();
    }
    public void informarDadosCadastroValido() throws Exception {

        txtCadastroTitulo.isDisplayed();
        txtEmailCadastro.click();
        txtEmailCadastro.sendKeys(faker.internet().emailAddress());
        txtCPFCadastro.sendKeys(GlobalTools.cpfGenerator());
        txtNomeCadastro.sendKeys(faker.name().firstName());
        txtSobreNomeCadastro.sendKeys(faker.name().lastName());
        txtDataDeNascimentoCadastro.sendKeys(GlobalTools.birthdayGenerator(20, 30));
        RadioMasculino.click();
        txtSenhaCadastro.click();
        txtSenhaCadastro.sendKeys("123@automacao");
        txtTelefoneCadastro.click();
        txtTelefoneCadastro.sendKeys("41991674588");



    }

    public void informarEmail(String email) {
         txtEmailCadastro.click();
         txtEmailCadastro.clear();
         txtEmailCadastro.sendKeys(email);
    }

    public void informarCPF(String cpf) {
        txtCPFCadastro.click();
        txtCPFCadastro.clear();
        txtCPFCadastro.sendKeys(cpf);
    }

    public void informarNome(String nome) {
        txtNomeCadastro.click();
        txtNomeCadastro.clear();
        txtNomeCadastro.sendKeys(nome);
    }

    public void informarSobreNome(String sobrenome) {
        txtSobreNomeCadastro.click();
        txtSobreNomeCadastro.clear();
        txtSobreNomeCadastro.sendKeys(sobrenome);
    }

    public void informarDataNascimento(String dataNascimento) {
        txtDataDeNascimentoCadastro.click();
        txtDataDeNascimentoCadastro.clear();
        txtDataDeNascimentoCadastro.sendKeys(dataNascimento);
    }

    public void selecionarPreferencia() {
        RadioMasculino.click();
    }

    public void informarTelefone(String telefone) {
        txtTelefoneCadastro.click();
        txtTelefoneCadastro.clear();
        txtTelefoneCadastro.sendKeys(telefone);
    }

    public void informarSenha(String senha) {
        txtSenhaCadastro.click();
        txtSenhaCadastro.clear();
        txtSenhaCadastro.sendKeys(senha);
    }

    public void aceitarTermo() {
        CbxTermoAceiteCadastro.click();
    }

    public void ClicarBtnCadastrarr() {
        ClicarBtnCadastrar.click();
    }

    public void realizoCadastroCPFInvalido() throws Exception {

        txtCadastroTitulo.isDisplayed();
        txtEmailCadastro.click();
        txtEmailCadastro.sendKeys(faker.internet().emailAddress());
        txtCPFCadastro.sendKeys(GlobalTools.cpfGenerator());
        txtNomeCadastro.sendKeys(faker.name().firstName());
        txtSobreNomeCadastro.sendKeys(faker.name().lastName());
        txtDataDeNascimentoCadastro.sendKeys(GlobalTools.birthdayGenerator(20, 30));
        RadioMasculino.click();
        txtSenhaCadastro.click();
        txtSenhaCadastro.sendKeys("123@automacao");
        txtTelefoneCadastro.click();
        txtTelefoneCadastro.sendKeys("41991674588");
    }

    public void realizarCadastroMenorIdade() {
        txtCadastroTitulo.isDisplayed();
        txtEmailCadastro.click();
        txtEmailCadastro.sendKeys(faker.internet().emailAddress());
        txtCPFCadastro.sendKeys(GlobalTools.cpfGenerator());
        txtNomeCadastro.sendKeys(faker.name().firstName());
        txtSobreNomeCadastro.sendKeys(faker.name().lastName());
        txtDataDeNascimentoCadastro.sendKeys("01/01/2010");
        RadioMasculino.click();
        txtSenhaCadastro.click();
        txtSenhaCadastro.sendKeys("123@automacao");
        txtTelefoneCadastro.click();
        txtTelefoneCadastro.sendKeys("41991674588");
    }

    public void ValidarCadsatroComSucesso() {
        String mensagem = "Cadastro realziado com sucesso";
        Assert.assertEquals(mensagem , GetMensagemCadastroSucesso.getText());
        BtnOKModal.click();
    }

    public void ValidarMensagemErro() {
        String mensagem = "CPF já registrado";
        Assert.assertEquals(mensagem, GetMensagemCadastroSucesso.getText());
        BtnOKModal.click();

    }



    public void validoMensagemAlertaInvalido() {
        txtMensagemCPFInvalido.isDisplayed();
        String msg = "CPF inválido!";
        Assert.assertEquals(msg, txtMensagemCPFInvalido.getText());
    }

    public void validarMensagemAlertaMenorIdade() {
        txtMensagemMenorIdade.isDisplayed();
        String msg = "Desculpe. Atualmente, o cadastro em nossa loja Virtual/APP está disponível apenas para maiores de 16 anos.";
        Assert.assertEquals(msg, txtMensagemMenorIdade.getText());
    }
}
