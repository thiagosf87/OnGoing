package br.com.renner.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages {

    @FindBy(xpath = "(//span[contains(.,'Entre ou cadastre-se')])[2]")
    public static WebElement BtnEntreOuCadastrese;

    @FindBy(xpath = "//h2[@class='css-1063n1j e1wna1tp2'][contains(.,'Identificação')]")
    public static WebElement TituloIdentificacao;

    @FindBy(name = "login")
    public static WebElement InputCpfEmail;

    @FindBy(name = "loginID")
    public static WebElement InputLoginPLM;

    @FindBy(name = "password")
    public static WebElement InputSenha;

    @FindBy(xpath = "//button[@class='Button_button__vcDFE Button_medium__2sh2z' and contains(text(), 'ENTRAR')]")
    public static WebElement BtnEntrar;

    @FindBy(xpath = "//strong[@class='user-info__strong']")
    public static WebElement UsuarioLogado;

    @FindBy(xpath = "//p[@class='modal-alert-message']")
    public static WebElement MensagemErro;

}
