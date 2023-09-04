package br.com.renner.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadatroPages {

    @FindBy(xpath="//button[contains(.,'QUERO ME CADASTRAR')]")
    public static WebElement btnQueroMeCadastrar;

    @FindBy(xpath="//h2[contains(.,'CADASTRO')]")
    public static WebElement txtCadastroTitulo;

    @FindBy(name="login")
    public static WebElement txtEmailCadastro;

    @FindBy(xpath="(//input[@type='text'])[3]")
    public static WebElement txtCPFCadastro;

    @FindBy(name="firstName")
    public static WebElement txtNomeCadastro;

    @FindBy(name="lastName")
    public static WebElement txtSobreNomeCadastro;

    @FindBy(xpath="(//input[contains (@type, 'text')])[6]")
    public static WebElement txtDataDeNascimentoCadastro;

    @FindBy(xpath="(//input[contains (@type, 'text')])[7]")
    public static WebElement txtTelefoneCadastro;

    @FindBy(name="password")
    public static WebElement txtSenhaCadastro;

    @FindBy(xpath="//form/div[6]//div/label[2]/span")
    public static WebElement RadioMasculino;

    @FindBy(xpath="(//div[@class='custom-checkbox css-1eqwit9 e1mqrq3c0'])[2]")
    public static WebElement CbxTermoAceiteCadastro;

    @FindBy(xpath="//span[contains(.,'Desejo receber promoções, novidades e informações das Lojas Renner')]")
    public static WebElement TermoAcordo;

    @FindBy(xpath="//button[contains(.,'Cadastrar')]")
    public static WebElement ClicarBtnCadastrar;

    @FindBy(xpath="//p[@class='modal-alert-message']")
    public static WebElement GetMensagemCadastroSucesso;

    @FindBy(xpath=" //button[contains(.,'OK')]")
    public static WebElement BtnOKModal;

    @FindBy(xpath="//p[contains(text(),'CPF inválido!')]")
    public static WebElement txtMensagemCPFInvalido;

    @FindBy (xpath = "//p[contains(text(),'Desculpe. Atualmente, o cadastro em nossa loja Virtual/APP está disponível apenas para maiores de 16 anos.')]")
    public static WebElement txtMensagemMenorIdade;





}
