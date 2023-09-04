package br.com.renner.web.interactions;

import br.com.renner.toolbox.ToolsPage;
import br.com.renner.web.pages.DesignerCopiaDoStylePages;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

import static br.com.renner.web.steps.hooks.WebSetup.driver;

public class DesignerCopiaDoStyleInteractions extends DesignerCopiaDoStylePages {

    public Object EntrarNoStyle;
    ToolsPage toolsPage = new ToolsPage();

    public DesignerCopiaDoStyleInteractions() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }


    //inicio
    public void HomePageDoPLM() {
        TxtRennerStaging2.click();
    }



    public String codeStyleTest; // Declaração do campo codeStyle


    //Criar hierarquia do item


    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void PreencherAHierarquia() {
        TxtStyle2.click();
        LinkSeason2.click();
        LinkDivision2.click();
        LinkGroup2.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <= 2; i++) {
            js.executeScript("window.scrollBy(0, 250);");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        LinkSubclass.click();


    }

    //Alterar o valor dos campos a nivel de subclasse


    public void NovoValorParaOCampoDesigner() {

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CampoDesignerANivelDeSubclasse.click();
        InputCampoDesignerANivelDeSubclasse.clear();
        InputCampoDesignerANivelDeSubclasse.sendKeys("dario.oliveira@lojasrenner.com.br");
        InputCampoDesignerANivelDeSubclasse.sendKeys(Keys.ENTER);

    }


    public void NovoValorParaOCampoBuyer() {
        //CampoBuyerANivelDeGrupo.click();
        InputCampoBuyerANivelDeSubclasse.clear();
        InputCampoBuyerANivelDeSubclasse.sendKeys("raphaela.mezzomo@lojasrenner.com.br");
        InputCampoBuyerANivelDeSubclasse.sendKeys(Keys.ENTER);

    }

    public void NovoValorParaOCampoDTP() {
        InputCampoDTPANivelDeSubclasse.clear();
        InputCampoDTPANivelDeSubclasse.sendKeys("andrea.araujo@lojasrenner.com.br");
        InputCampoDTPANivelDeSubclasse.sendKeys(Keys.ENTER);
    }

    public void NovoValorParaOCampoGraphicDesigner() {
        //CampoGraphicANivelDeSubclasse.click();
        InputCampoGraphicANivelDeSubclasse.clear();
        InputCampoGraphicANivelDeSubclasse.sendKeys("alana.paro@lojasrenner.com.br");
        InputCampoGraphicANivelDeSubclasse.sendKeys(Keys.ENTER);
    }


    //Criar novo item


    public void CrioUmTerceiroStyle() {
        BtnNewStyle3.click();

        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            // Lidar com exceções, se necessário
        }

        //InputStyleType2.click();
        CampoStyleType3.sendKeys("style");
        InputStyleTypeStyle3.click();
    }


    public void ClicarEmSaveGo() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        BtnSaveGo3.click();
    }


    //Validar que os campos a nivel de style venha de acordo com a subclasse


    public void ValidarOCampoDesigner() {

        try {
            Thread.sleep(9000);
        } catch (Exception e) {

        }

        String Designer = "dario.oliveira@lojasrenner.com.br";
        Assert.assertEquals(Designer, CampoValidacaoDesigner.getText());
    }


    public void ValidarOCampoBuyer() {
        String Buyer = "raphaela.mezzomo@lojasrenner.com.br";
        Assert.assertEquals(Buyer, CampoValidacaoBuyer.getText());
    }

    public void ValidarOCampoDTP() {
        String DTP = "andrea.araujo@lojasrenner.com.br";
        Assert.assertEquals(DTP, CampoValidacaoDTP.getText());
    }


    public void ValidarOCampoGraphicDesigner() {
        String GraphicDesigner = "alana.paro@lojasrenner.com.br";
        Assert.assertEquals(GraphicDesigner, CampoValidacaoGraphicDesigner.getText());
    }


    //Apagar os campos a nivel de style
    public void ApagarValorCampoDesignerANiveldeStyle() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }

        CampoDesignerStyleApagar.click();
        InputapagarValorCampoDesignerStyle.click();

    }


    public void ApagarValorCampoBuyerANiveldeStyle() {
        CampoBuyerStyleApagar.click();
        InputApagarValorCampoBuyerStyle.click();

    }


    public void ApagarValorCampoDTPANiveldeStyle() {
        CampoDTPStyleApagar.click();
        InputApagarValorCampoDTPStyle.click();

    }


    public void ApagarValorCampoGraphicDesignerANiveldeStyle() {
        CampoGraphicDesignerStyleApagar.click();
        InputApagarValorCampoGraphicDesignerStyle.click();


    }


    //Alterar o valor para os campos a nível de style

    public void NovoValorCampoDesignerANiveldeStyle() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        CampoDesignerStyleNovoValor.click();

        InputNovoValorCampoDesignerStyle.clear();
        InputNovoValorCampoDesignerStyle.sendKeys("tamires.silva@lojasrenner.com.br");
        InputNovoValorCampoDesignerStyle.sendKeys(Keys.ENTER);
    }

    public void NovoValorCampoBuyerANiveldeStyle() {
        InputNovoValorCampoBuyerStyle.clear();
        InputNovoValorCampoBuyerStyle.sendKeys("kelin.farias@lojasrenner.com.br");
        InputNovoValorCampoBuyerStyle.sendKeys(Keys.ENTER);


    }

    public void NovoValorCampoDTPANiveldeStyle() {
        InputNovoValorCampoDTPStyle.clear();
        InputNovoValorCampoDTPStyle.sendKeys("aldizia.martins@lojasrenner.com.br");
        InputNovoValorCampoDTPStyle.sendKeys(Keys.ENTER);

    }

    public void NovoValorCampoGraphicDesignerANiveldeStyle() {
        InputNovoValorCampoGraphicDesignerStyle.clear();
        InputNovoValorCampoGraphicDesignerStyle.sendKeys("jefferson.trevisan@lojasrenner.com.br");
        InputNovoValorCampoGraphicDesignerStyle.sendKeys(Keys.ENTER);
    }


    //copiar CODE do Style
    public void CopiarCodeStyle() {

        codeStyleTest = TxtCodeStyle.getText();
        System.out.println(codeStyleTest);

    }


    //retorno para subclasse

    public void RetornarParaSubclasse() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        LinkRetornarSubclasse.click();
        try {
            Thread.sleep(9000);
        } catch (Exception e) {

        }

    }

    //criação de copia

    public void CriarCopia() {
        BtnCodeAll.click();
        try {
            Thread.sleep(6000);
        } catch (Exception e) {

        }


        InputCodeAll.sendKeys(codeStyleTest);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        ClickCodeAll.click();  //clica no item 1
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }


        BtnActions.click();
        try {
            Thread.sleep(4000);
        } catch (Exception e) {

        }
        BtnActions.click();


        BtnCopy.click();
        try {
            Thread.sleep(4000);
        } catch (Exception e) {

        }

        CampoTemplatesCopy.click();
        InputListaTemplateCopy.sendKeys("copy");
        //InputListaTemplateCopy.click();

        CampoStyleType2.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        CampoBrand.click();
        CampoBrand.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

//wait implicito substitui o threed sleep ou explicito. Melhor é o explicito
    //Clicar no style copiado
//wait posso escrever na tools page

    public void EntrarNoStyle() {
        Actions action = new Actions(driver);

        action.moveToElement(LinkStyle).perform();


            LinkStyle.click();

    }



//posso usar wait until

    //Vaidação da cópia
    public void ConfirmarValorParaOCampoDesigner() {

        try {
            Thread.sleep(7000);
        } catch (Exception e) {

        }


        String Designer = "tamires.silva@lojasrenner.com.br";
        Assert.assertEquals(Designer, ValorCampoDesignerCopia.getText().trim());
    }



    public void ConfirmarValorParaOCampoBuyer() {
        String Buyer = "kelin.farias@lojasrenner.com.br";
        Assert.assertEquals(Buyer, ValorCampoBuyerCopia.getText().trim());

    }

    public void ConfirmarValorParaOCampoDTP() {

        String DTP = "aldizia.martins@lojasrenner.com.br";
        Assert.assertEquals(DTP, ValorCampoDTPCopia.getText().trim());

    }

    public void ConfirmarValorParaOOCampoGraphicDesigner() {
        String GraphicDesigner = "jefferson.trevisan@lojasrenner.com.br";
        Assert.assertEquals(GraphicDesigner, ValorCampoGraphicDesignerCopia.getText().trim());
    }


}















