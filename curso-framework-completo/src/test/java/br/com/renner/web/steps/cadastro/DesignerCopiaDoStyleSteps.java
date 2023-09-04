package br.com.renner.web.steps.cadastro;

import br.com.renner.web.interactions.DesignerCopiaDoStyleInteractions;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.*;

public class DesignerCopiaDoStyleSteps {


    DesignerCopiaDoStyleInteractions designerCopiaDoStyleInteractions = new DesignerCopiaDoStyleInteractions();

    private static String DesignerCopiaDoStyleSteps;

    @Dado("que estou na home page do sistema PLM")
    public void estou_na_home_page_do_PLM() {
        designerCopiaDoStyleInteractions.HomePageDoPLM();
    }

    @Quando("clico em style e escolho alguma season, divisão, grupo e subclasse")
    public void clico_em_style_e_escolho_alguma_season_divisaoESubclasse() {
        designerCopiaDoStyleInteractions.PreencherAHierarquia();
    }


    @Entao("posso preencher novamente os campos de pré cadastro")
    public void posso_preencher_novamente_os_campos_de_pre_cadastro() {
        designerCopiaDoStyleInteractions.NovoValorParaOCampoDesigner();
        designerCopiaDoStyleInteractions.NovoValorParaOCampoBuyer();
        designerCopiaDoStyleInteractions.NovoValorParaOCampoDTP();
        designerCopiaDoStyleInteractions.NovoValorParaOCampoGraphicDesigner();



    }

    @Dado("que estou em uma subclasse e crio um terceiro style para o grupo")
    public void que_estou_na_subclasse_e_crio_um_terceiro_style() {
        designerCopiaDoStyleInteractions.CrioUmTerceiroStyle();
        designerCopiaDoStyleInteractions.ClicarEmSaveGo();

    }



    @Quando("os campos de pré cadastro no style venham preenchidos de acordo com a subclasse")
    public void os_campos_de_pre_cadastro_no_style_venham_preenchidos_de_acordo_com_a_subclasse() {
        designerCopiaDoStyleInteractions.ValidarOCampoDesigner();
        designerCopiaDoStyleInteractions.ValidarOCampoBuyer();
        designerCopiaDoStyleInteractions.ValidarOCampoDTP();
        designerCopiaDoStyleInteractions.ValidarOCampoGraphicDesigner();

    }

    @Entao("apago os valores para os campos de pré cadastro a nivel de style")
    public void apagoOsValoresParaOsCamposDePreCadastroANivelDeStyleEPreenchoComOutrosValores() {
        designerCopiaDoStyleInteractions.ApagarValorCampoDesignerANiveldeStyle();
        designerCopiaDoStyleInteractions.ApagarValorCampoBuyerANiveldeStyle();
        designerCopiaDoStyleInteractions.ApagarValorCampoDTPANiveldeStyle();
        designerCopiaDoStyleInteractions.ApagarValorCampoGraphicDesignerANiveldeStyle(); }



     @E("preencho com outros valores")
     public void Preencho_os_campos_com_outros_valores() {
        designerCopiaDoStyleInteractions.NovoValorCampoDesignerANiveldeStyle();
        designerCopiaDoStyleInteractions.NovoValorCampoBuyerANiveldeStyle();
        designerCopiaDoStyleInteractions.NovoValorCampoDTPANiveldeStyle();
        designerCopiaDoStyleInteractions.NovoValorCampoGraphicDesignerANiveldeStyle();


    }

    //@E("copio o Code do Style")
    //public void Copio_O_Code_Do_Style() {
       // designerCopiaDoStyleInteractions.CopiarCodeDoStyle();
    //}






    @Dado("que estou em um style, copio o code style e retorno para subclasse")
    public void que_estou_em_um_style_Copio_CodeStyle_E_retorno_para_subclasse() {
        designerCopiaDoStyleInteractions.CopiarCodeStyle();
        designerCopiaDoStyleInteractions.RetornarParaSubclasse();

    }

    @Entao("faço a cópia do style que alterei os campos de pré cadastro")
    public void faco_a_copia_do_style_que_alterei_os_campos_de_pre_cadastro() {
        designerCopiaDoStyleInteractions.CriarCopia();

    }

    @E("entro no style")
    public void Entro_No_Style() {
        designerCopiaDoStyleInteractions.EntrarNoStyle();
    }

    @Entao("posso validar que a copia do item venha de acordo com os valores do item original")
    public void possoValidarQueACopiaDoItemVenhaDeAcordoComOsValoresDoItemOriginal() {
        designerCopiaDoStyleInteractions.ConfirmarValorParaOCampoDesigner();
        designerCopiaDoStyleInteractions.ConfirmarValorParaOCampoBuyer();
        designerCopiaDoStyleInteractions.ConfirmarValorParaOCampoDTP();
        designerCopiaDoStyleInteractions.ConfirmarValorParaOOCampoGraphicDesigner();
    }




}
