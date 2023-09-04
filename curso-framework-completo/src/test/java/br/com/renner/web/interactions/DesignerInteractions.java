package br.com.renner.web.interactions;

import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.toolbox.ToolsPage;
import br.com.renner.web.pages.DesignerPages;
import br.com.renner.web.pages.LoginPages;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static br.com.renner.web.steps.hooks.WebSetup.driver;
import static org.junit.Assert.assertEquals;

public class DesignerInteractions extends DesignerPages {
    //AÇÕES EM TELA DO USUÁRIO, EX CLICAR, SENDKEYS, CLEAR, ASSERT

    ToolsPage toolsPage = new ToolsPage();

    public DesignerInteractions() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }


    public void acessarTelaDeLogin() {
        //driver.get("https://lr-staging1.centricsoftware.com/WebAccess/login.html#URL=centric%3A%2F%2FREFLECTION%2FINSTANCE%2F_CS_Data%2Fnull&Tab=MyHome");
    }


    public void PreenchoUsername() {
        InputLoginId.click();
        InputLoginId.clear();
        InputLoginId.sendKeys("953628");
    }

    public void PreenchoPassword() {
        InputPassword.click();
        InputPassword.clear();
        InputPassword.sendKeys("k10080705");
    }


    public void clicarEmLogin() {
        BtnLogin.click();
    }

    public void LogadoComSucesso() {
        String mensagem = "Welcome, Kaique Renling";
        Assert.assertEquals(mensagem, txtgetMensagemLoginSucesso.getText());
        txtgetMensagemLoginSucesso.click();
    }

    public void HomePageDoPLM() {
        TxtRennerStaging.click();
    }

    public void PreenchoHierarquia() {
        TxtStyle.click();
        LinkSeason.click();
        LinkDivision.click();
        LinkGroup.click();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //  Block of code to handle errors
        }


    }

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void AcessoSubclasse() {
        for (int i = 0; i <= 2; i++) {
            js.executeScript("window.scrollBy(0, 250);");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        LinkEntrarSubclasse.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //troca de role dentro da subclasse

    public void ClicoEmRole() {

        try {
            Thread.sleep(6000);
        } catch (Exception e) {

        }

        BtnRole.click();
    }


    public void TrocarRole() {

        BtnRoleDesignerKU.click();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }

    public void ConfirmarTrocaDaRole() {
        BtnConfirmarTrocaRole.click();
        try {
            Thread.sleep(9000);
        } catch (Exception e) {

        }
    }

    //Preenche os campos de pré cadastro a nivel de subclasse

    public void PreencherDesigner() {

        PreencherCampoDesignerSubclasse.click();
        //PreencherBuyer.click();
        InputCampoDesignerSubclasse.clear();
        InputCampoDesignerSubclasse.sendKeys("tamires.silva@lojasrenner.com.br");
        InputCampoDesignerSubclasse.sendKeys(Keys.ENTER);
    }

    public void PreencherBuyer() {
        //PreencherBuyer.click();
        InputCampoBuyerSubclasse.clear();
        InputCampoBuyerSubclasse.sendKeys("manoela.telli@lojasrenner.com.br");
        InputCampoBuyerSubclasse.sendKeys(Keys.ENTER);
    }

    public void PreencherDTP() {
        //PreencherBuyer.click();
        InputCampoDTPSubclasse.clear();
        InputCampoDTPSubclasse.sendKeys("natalia.velozo@lojasrenner.com.br");
        InputCampoDTPSubclasse.sendKeys(Keys.ENTER);
    }


    public void PreencherGraphicDesigner() {

        //InputPreencherGraphicDesigner.click();
        //Thread.sleep(3000);
        InputGraphicDesignerSubclasse.clear();
        InputGraphicDesignerSubclasse.sendKeys("marco.boni@lojasrenner.com.br");
        InputGraphicDesignerSubclasse.sendKeys(Keys.ENTER);
    }



    //Criar item dentro da subclasse
    public void CriarItem() {

        BtnNewStyle.click();
        try {
            Thread.sleep(6000);
        } catch (Exception e) {

        }
        //InputStyleType.click();
        CampoStyleType.sendKeys("style");
        InputCampoStyleType.click();

    }

    public void ClicarSaveGo() {

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //  Block of code to handle errors
        }
        BtnSaveGo.click();
    }

    //Trocar view para designer
    public void ClicarEmView() {
        try {
            Thread.sleep(7000);
        } catch (Exception e) {
            //  Block of code to handle errors
        }
        CampoViews.click();
        CampoViews.sendKeys("designer");
        InputViewDesigner.click();
    }



    //valido que os campos a nivel de style venham de acordo com a subclasse

    public void ValidarCamposDesigner() {
        try {
            Thread.sleep(9000);
        } catch (Exception e) {

        }
        String Designer = "tamires.silva@lojasrenner.com.br";
        Assert.assertEquals(Designer, CampoDesignerStyleValor.getText());

        String Buyer = "manoela.telli@lojasrenner.com.br";
        Assert.assertEquals(Buyer, CampoBuyerStyleValor.getText());

        String DTP = "natalia.velozo@lojasrenner.com.br";
        Assert.assertEquals(DTP, CampoDTPStyleValor.getText());

        String GraphicDesigner = "marco.boni@lojasrenner.com.br";
        Assert.assertEquals(GraphicDesigner, CampoGraphicDesignerStyleValor.getText());

    }


    //retorno para subclasse

    public void RetornoParasubclass() {
        LinkRetornoASubclasse.click();
        try {
            Thread.sleep(8000);
        } catch (Exception e) {

        }

    }



    //Edito os campos a nivel de subclasse deixando eles em branco

    public void ApagarOCampoGraphicDesigner() {
        CampoDesignerSubclasse.click();
        InputCampoDesignerValorNulo.click();

    }

    public void ApagarOCampoBuyer() {
        CampoBuyerSubclasse.click();
        InputCampoBuyerValorNulo.click();
    }

    public void ApagarOCampoDTP() {
        CampoDTPSubclasse.click();
        InputCampoDTPValorNulo.click();
    }

    public void ApagarOCampoDesigner() {
        CampoGraphicDesignerSubclasse.click();
        InputCampoGraphicDesignerValorNulo.click();
    }




    //Crio um novo item dentro da subclasse
    public void CriarItem2() {
        try {
            Thread.sleep(4000);
        } catch (Exception e) {

        }
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOf(NewStyle2));//é legal apenas p qdo é text. enable e click

        BtnNewStyle2.click();
        try {
            Thread.sleep(4000);
        } catch (Exception e) {

        }
        //InputStyleType2.click();
        CampoStyleType2.sendKeys("style");
        InputCampoStyleType2.click();

    }

    public void ClicarSaveGo2() {

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //  Block of code to handle errors
        }
        BtnSaveGo2.click();
    }



    //Validar que os valores dentro do style venham de acordo com a subclasse

    public void CampoDesignerApagado() {
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOf(InputDesignerVazio));
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            //  Block of code to handle errors
        }

        String textoDoCampo = CampoDesignerStyleVazio.getText().trim();
        Assert.assertEquals("", textoDoCampo);
    }

    public void CampoBuyerApagado() {
        String textoDoCampo = CampoBuyerStyleVazio.getText().trim();
        Assert.assertEquals("", textoDoCampo);
    }

    public void CampoDTPApagado() {
        String textoDoCampo = CampoDTPStyleVazio.getText().trim();
        Assert.assertEquals("", textoDoCampo);
    }

    public void CampoGraphicDesignerApagado() {
        String textoDoCampo = CampoGraphicDesignerVazio.getText().trim();
        Assert.assertEquals("", textoDoCampo);
    }




    //Editar novos valores aos campos no style
    public void NovoValorCampoDesigner() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(CampoDesignerStyle));

        CampoDesignerStyle.click();

        InputDoCampoDesignerStyle.clear();
        InputDoCampoDesignerStyle.sendKeys("tamires.silva@lojasrenner.com.br");
        InputDoCampoDesignerStyle.sendKeys(Keys.ENTER);

    }

    public void NovoValorCampoBuyer() {
        InputDoCampoBuyerStyle.clear();
        InputDoCampoBuyerStyle.sendKeys("manoela.telli@lojasrenner.com.br");
        InputDoCampoBuyerStyle.sendKeys(Keys.ENTER);
    }

    public void NovoValorCampoDTP() {
        InputDoCampoDTPStyle.clear();
        InputDoCampoDTPStyle.sendKeys("natalia.velozo@lojasrenner.com.br");
        InputDoCampoDTPStyle.sendKeys(Keys.ENTER);
    }

    public void NovoValorCampoGraphicDesigner() {
        InputDoCampoGraphicDesignerStyle.clear();
        InputDoCampoGraphicDesignerStyle.sendKeys("marco.boni@lojasrenner.com.br");
        InputDoCampoGraphicDesignerStyle.sendKeys(Keys.ENTER);
    }



    //Retorno para subclasse novamente

    public void RetornoParasubclass2() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //
        }
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(btnRetornoaoGrupo2));

        LinkRetornoASubclasse.click();
    }




    //validar que as alterações a nivel de style não reflitam na subclasse
    public void ValidacaoCampoGraphicANivelDeGrupo() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        String textoDoCampo = txtGraphicANivelDeGrupo.getText().trim();
        Assert.assertEquals("", textoDoCampo);

    }

    public void ValidacaoCampoBuyerANivelDeGrupo() {
        String textoDoCampo = txtBuyerANivelDeGrupo.getText().trim();
        Assert.assertEquals("", textoDoCampo);
    }

    public void ValidacaoCampoDTPANivelDeGrupo() {
        String textoDoCampo = txtDTPANivelDeGrupo.getText().trim();
        Assert.assertEquals("", textoDoCampo);
    }

    public void ValidacaoCampoDesignerANivelDeGrupo() {
        String textoDoCampo = txtDesignerANivelDeGrupo.getText().trim();
        Assert.assertEquals("", textoDoCampo);
    }

}











