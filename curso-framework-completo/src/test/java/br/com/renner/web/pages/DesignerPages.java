package br.com.renner.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

import static org.junit.Assert.assertEquals;

public class DesignerPages {


    //login

    @FindBy(id = "LoginID")
    public static WebElement InputLoginId;

    @FindBy(id = "Password")
    public static WebElement InputPassword;

    @FindBy(id = "loginButton_label")
    public static WebElement BtnLogin;

    @FindBy(xpath = "//div[contains(@class, 'csi-homepage-welcome') and contains(@class, 'csi-flex-grow')]")
    public static WebElement txtgetMensagemLoginSucesso;

    @FindBy(linkText = "Renner STAGING")
    public static WebElement TxtRennerStaging;

    //criar hierarquia

    @FindBy(xpath = "//span[@class='MuiTab-wrapper' and @data-csi-tab-name='Style']")
    public static WebElement TxtStyle;


    @FindBy(linkText = "FW22")
    public static WebElement LinkSeason;

    @FindBy(linkText = "Masculino Jovem")
    public static WebElement LinkDivision;

    @FindBy(linkText = "SURF")
    public static WebElement LinkGroup;

    @FindBy(linkText = "Camiseta MC")
    public static WebElement LinkEntrarSubclasse;

    //dentro da subclass trocar de role para designer KU

    @FindBy(xpath= "//span[@class='material-icons csi-toolbar-btn-icon-Admin']")
    public static WebElement BtnRole;

    @FindBy(xpath = "//*[@id='uniqName_4_32_text']")
    public static WebElement BtnRoleDesignerKU;

    @FindBy(xpath = "//span[normalize-space()='Change']")
    public static WebElement BtnConfirmarTrocaRole;


    //Preenche os campos de pré cadastro a nivel de subclass

    @FindBy(xpath = "(//td)[17]")
    public static WebElement PreencherCampoDesignerSubclasse;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputCampoDesignerSubclasse;

    @FindBy(xpath = "(//td)[19]")
    public static WebElement PreencherCampoBuyerSubclasse;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")   //evitar barras com várias div's e indices, e *
    public static WebElement InputCampoBuyerSubclasse;

    @FindBy(xpath = "(//td)[20]")
    public static WebElement PreencherCampoDTPSubclasse;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputCampoDTPSubclasse;

    @FindBy(xpath = "(//td)[21]")
    public static WebElement PreencherCampoGraphicDesignerSubclasse;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputGraphicDesignerSubclasse;

///html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[3]/div[3]/div/div[5]/div/div[1]/div[2]/table/tbody/tr[82]/td[15]/a



    //criar um item dentro da subclasse
    @FindBy(xpath = "//div[normalize-space()='New Style']")
    public static WebElement BtnNewStyle;

    @FindBy(xpath = "(//input[@role='textbox'])[8]")
    public static WebElement CampoStyleType;

    //input[@class='dijitReset dijitInputInner' and @id='uniqName_69_0']
    @FindBy(xpath = "//div[@class='dijitReset dijitMenuItem' and @item='0']")
    public static WebElement InputCampoStyleType;

    @FindBy(xpath = "//span[normalize-space()='Save & Go']")
    public static WebElement BtnSaveGo;

    //Trocar a view p designer
    @FindBy(xpath = "//input[@title='Cadastro de Item']")
    public static WebElement CampoViews;

    @FindBy(xpath = "//div[@class='dijitReset dijitMenuItem' and @role='option']//span[text()='Designer']")
    public static WebElement InputViewDesigner;


    //Validar que os campos a nivel de style estejam vindo de acordo com a subclasse

    @FindBy(xpath = "//td[contains(@data-csi-act, 'RNR_StyleAttributes_Designer_enum:Child:Attributes:0')]")
    public static WebElement CampoDesignerStyleValor;

    @FindBy(xpath = "//td[contains(@data-csi-act, 'RNR_StyleAttributes_Buyer_enum:Child:Attributes:0')]")
    public static WebElement CampoBuyerStyleValor;

    @FindBy(xpath = "//td[contains(@data-csi-act, 'RNR_StyleAttributes_Technician_enum:Child:Attributes:0')]")
    public static WebElement CampoDTPStyleValor;

    @FindBy(xpath = "//td[contains(@data-csi-heading, 'RNR_StyleAttributes_GraphicDesigner_enum')]")
    public static WebElement CampoGraphicDesignerStyleValor;



    //Retornar para subclasse

    @FindBy(linkText = "Camiseta MC")
    public static WebElement LinkRetornoASubclasse;


    //Apagar os valores a nivel de subclasse

    @FindBy(xpath = "//td[normalize-space()='marco.boni@lojasrenner.com.br']")
    public static WebElement CampoDesignerSubclasse;

    @FindBy(xpath = "//div[@item='0']")
    public static WebElement InputCampoDesignerValorNulo;

    @FindBy(xpath="//td[normalize-space()='manoela.telli@lojasrenner.com.br']")
    public static WebElement CampoBuyerSubclasse;

    @FindBy(xpath = "//div[@item='0']")
    public static WebElement InputCampoBuyerValorNulo;

    @FindBy(xpath = "//td[normalize-space()='natalia.velozo@lojasrenner.com.br']")
    public static WebElement CampoDTPSubclasse;

    @FindBy(xpath = "//div[@item='0']")
    public static WebElement InputCampoDTPValorNulo;

    @FindBy(xpath="(//td[normalize-space()='tamires.silva@lojasrenner.com.br'])[1]")
    public static WebElement CampoGraphicDesignerSubclasse;

    @FindBy(xpath = "//div[@item='0']")
    public static WebElement InputCampoGraphicDesignerValorNulo;






    //Criar novo item dentro da subclasse
    @FindBy(xpath = "(//div[normalize-space()='New Style'])")
    public static WebElement BtnNewStyle2;

    @FindBy(xpath = "(//input[@role='textbox'])[8]")
    public static WebElement CampoStyleType2;

    @FindBy(xpath = "//div[@class='dijitReset dijitMenuItem' and @item='0']")
    public static WebElement InputCampoStyleType2;

    @FindBy(xpath = "//span[normalize-space()='Save & Go']")
    public static WebElement BtnSaveGo2;



    //validar que os valores a nivel de style venham vazios

    @FindBy(xpath = "(//td)[14]")
    public static WebElement CampoDesignerStyleVazio;

    @FindBy(xpath = "(//td)[15]")
    public static WebElement CampoBuyerStyleVazio;

    @FindBy(xpath = "(//td)[16]")
    public static WebElement CampoDTPStyleVazio;

    @FindBy(xpath = "(//td)[17]")
    public static WebElement CampoGraphicDesignerVazio;




    //Preencher novos valores para os campos a nivel de style

    @FindBy(xpath = "(//td)[14]")
    public static WebElement CampoDesignerStyle;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputDoCampoDesignerStyle;

    @FindBy(xpath = "(//td)[15]")
    public static WebElement CampoBuyerStyle;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputDoCampoBuyerStyle;

    @FindBy(xpath = "(//td)[16]")
    public static WebElement CampoDTPStyle;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputDoCampoDTPStyle;

    @FindBy(xpath = "(//td)[17]")
    public static WebElement CampoGraphicDesignerStyle;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputDoCampoGraphicDesignerStyle;



    //retorno para subclasse
    @FindBy(linkText = "Camiseta MC")
    public static WebElement LinkRetornoASubclasse2;



    //validar que as alterações a nivel de style não reflitam na subclasse


    @FindBy(xpath = "(//td)[21]")
    public static WebElement txtDesignerANivelDeGrupo;

    @FindBy(xpath="(//td)[19]")
    public static WebElement txtBuyerANivelDeGrupo;

    @FindBy(xpath = "(//td)[20]")
    public static WebElement txtDTPANivelDeGrupo;

    @FindBy(xpath = "(//td)[17]")
    public static WebElement txtGraphicANivelDeGrupo;



















//botar o tipo de elemento ex role button(btn), input text(txt) ex DTP btn

    //wait enable click (wait expected condition

    //colocar na tools page um wait generico, o mesmo método p td mundo

























}
