package br.com.renner.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesignerCopiaDoStylePages {

    @FindBy(linkText = "Renner STAGING")
    public static WebElement TxtRennerStaging2;

    @FindBy(xpath = "//span[@class='MuiTab-wrapper' and @data-csi-tab-name='Style']")
    public static WebElement TxtStyle2;


    @FindBy(linkText = "FW22")
    public static WebElement LinkSeason2;

    @FindBy(linkText = "Masculino Jovem")
    public static WebElement LinkDivision2;

    @FindBy(linkText = "SURF")
    public static WebElement LinkGroup2;

    @FindBy(linkText = "Camiseta MC")
    public static WebElement LinkSubclass;


    //Preencher novos valores para os campos de pré cadastro

    @FindBy(xpath = "(//td)[17]")
    public static WebElement CampoDesignerANivelDeSubclasse;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputCampoDesignerANivelDeSubclasse;

    @FindBy(xpath = "(//td)[19]")
    public static WebElement CampoBuyerANivelDeSubclasse;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputCampoBuyerANivelDeSubclasse;

    @FindBy(xpath = "(//td)[20]")
    public static WebElement CampoDTPANivelDeSubclasse;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputCampoDTPANivelDeSubclasse;

    @FindBy(xpath = "(//td)[21]")
    public static WebElement CampoGraphicANivelDeSubclasse;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputCampoGraphicANivelDeSubclasse;


    //Criar um style

    @FindBy(xpath = "//div[normalize-space()='New Style']")
    public static WebElement BtnNewStyle3;

    @FindBy(xpath = "(//input[@role='textbox'])[8]")
    public static WebElement CampoStyleType3;

    @FindBy(xpath = "//div[@class='dijitReset dijitMenuItem' and @item='0']")
    public static WebElement InputStyleTypeStyle3;

    @FindBy(xpath = "//span[normalize-space()='Save & Go']")
    public static WebElement BtnSaveGo3;




    //Validar a nivel de style os campos de pré cadastro

    @FindBy(xpath = "(//td)[14]")
    public static WebElement CampoValidacaoDesigner;


    @FindBy(xpath = "(//td)[15]")
    public static WebElement CampoValidacaoBuyer;

    @FindBy(xpath = "(//td)[16]")
    public static WebElement CampoValidacaoDTP;

    @FindBy(xpath = "(//td)[17]")
    public static WebElement CampoValidacaoGraphicDesigner;
//testeKaique


    //Apagar valores a nivel de style

    @FindBy(xpath = "//td[normalize-space()='dario.oliveira@lojasrenner.com.br']")
    public static WebElement CampoDesignerStyleApagar;

    @FindBy(xpath = "//div[@item='0']")
    public static WebElement InputapagarValorCampoDesignerStyle;

    @FindBy(xpath = "//td[normalize-space()='raphaela.mezzomo@lojasrenner.com.br']")
    public static WebElement CampoBuyerStyleApagar;

    @FindBy(xpath = "//div[@item='0']")
    public static WebElement InputApagarValorCampoBuyerStyle;

    @FindBy(xpath = "//td[normalize-space()='andrea.araujo@lojasrenner.com.br']")
    public static WebElement CampoDTPStyleApagar;

    @FindBy(xpath = "//div[@item='0']")
    public static WebElement InputApagarValorCampoDTPStyle;

    @FindBy(xpath = "//td[normalize-space()='alana.paro@lojasrenner.com.br']")
    public static WebElement CampoGraphicDesignerStyleApagar;

    @FindBy(xpath = "//div[@item='0']")
    public static WebElement InputApagarValorCampoGraphicDesignerStyle;











    //Preencher novos valores a nivel de style

    @FindBy(xpath = "(//td)[14]")
    public static WebElement CampoDesignerStyleNovoValor;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputNovoValorCampoDesignerStyle;

    @FindBy(xpath = "(//td)[15]")
    public static WebElement CampoBuyerStyleNovoValor;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputNovoValorCampoBuyerStyle;

    @FindBy(xpath = "(//td)[16]")
    public static WebElement CampoDTPStyleNovoValor;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputNovoValorCampoDTPStyle;

    @FindBy(xpath = "(//td)[17]")
    public static WebElement CampoGraphicDesignerStyleNovoValor;

    @FindBy(xpath = "//*[@id='dijit_TooltipDialog_0']/div/div/div/div/div[3]/input[1]")
    public static WebElement InputNovoValorCampoGraphicDesignerStyle;



    //Copiar code do style
    //@FindBy(xpath = "(//span[@class='text'])[5]")
    //public static WebElement TxtCodeStyle;
    @FindBy(xpath = "//td[@data-csi-heading='Node Name::0']")
    public static WebElement TxtCodeStyle;






    //Retornar p subclasse

    @FindBy(xpath = "//a[normalize-space()='Camiseta MC']")
    public static WebElement LinkRetornarSubclasse;



    //clicar em all code

    @FindBy(xpath = "(//span[@class='dijitReset dijitInline dijitButtonText'][normalize-space()='All'])[2]")
    public static WebElement BtnCodeAll;

    //Escreve o code na lista suspensa
    @FindBy(xpath = "//div[@role='presentation']//input[@role='textbox']")
    public static WebElement InputCodeAll;


    //Flega o code que foi escrito na lista suspensa
    @FindBy(xpath = "(//div[@class='dijitReset dijitMenuItem'])[1]")
    public static WebElement ClickCodeAll;



    //flegar o code
    //@FindBy(xpath = "/html[1]/body[1]/div[16]/div[1]/div[3]/div[1]/input[1]")
    //public static WebElement BtnFlegarOCode;


    //Clicar em actions para selecionar o que foi flegado
    @FindBy(xpath = "//th[@class='headingRight actionsColumn noexport']//span[@class='csi-table-header-content']")
    public static WebElement BtnActions;



    //clicar no botão de copia
    @FindBy(xpath = "//span[@title='Copy']")
    public static WebElement BtnCopy;


    //selecionar template com copy ou copy2

    @FindBy(xpath = "//tbody[@data-dojo-attach-point='bodyNode']/tr[@data-csi-form-field='CopyTemplates']/td/div/div/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@role='textbox']")
    public static WebElement CampoTemplatesCopy;

    @FindBy(xpath = "//div[@data-csi-automation='field-Style-CopyForm-CopyTemplates']//div//input[@role='textbox']")
    public static WebElement InputListaTemplateCopy;

    @FindBy(xpath = "//input[@title='Style']")
    public static WebElement CampoStyleType2;

    @FindBy(xpath = "//tbody[@data-dojo-attach-point='bodyNode']/tr[@data-csi-form-field='RNR_Style_MarcaPropia_enum']/td/div/div/div[@class='dijitReset dijitInputField dijitInputContainer']/input[@role='textbox']")
    public static WebElement CampoBrand;

    //@FindBy(xpath = "//span[@class='dijitReset dijitInline dijitButtonText' and text()='Save']")
    //public static WebElement BtnSave;


    //Rola a tela até achar o elemento link style e clicar nele

    @FindBy(xpath = "//tr[contains(@class,'csiSelected')]//td[contains(@class,'attrString firstColumn')]//a[contains(@class,'browse')]")
    public static WebElement LinkStyle;




    //validar que os campos venham de acordo com o item original o qual foi copiado


    @FindBy(xpath = "(//td)[14]")
    public static WebElement ValorCampoDesignerCopia;

    @FindBy(xpath = "(//td)[15]")
    public static WebElement ValorCampoBuyerCopia;

    @FindBy(xpath = "(//td)[16]")
    public static WebElement ValorCampoDTPCopia;

    @FindBy(xpath = "(//td)[17]")
    public static WebElement ValorCampoGraphicDesignerCopia;

































}
