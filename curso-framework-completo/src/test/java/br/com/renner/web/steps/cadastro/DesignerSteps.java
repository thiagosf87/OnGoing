package br.com.renner.web.steps.cadastro;

import br.com.renner.web.interactions.DesignerInteractions;
import io.cucumber.java.pt.*;

public class DesignerSteps {

    DesignerInteractions designerInteractions = new DesignerInteractions();

    private static String DesignerStep;


    //Cenário: Logar no PLM
    @Dado("que acesso o PLM staging")
    public void LogoNoPLM() {
        designerInteractions.acessarTelaDeLogin();
    }

    @Quando("visualizo a tela de login e preencho o username e password corretamente")
    public void PreenchoCamposDoLogin() {
        designerInteractions.PreenchoUsername();
        designerInteractions.PreenchoPassword();
        designerInteractions.clicarEmLogin();
    }


    @Entao("Usuário é logado com sucesso")
    public void UsuarioLogadoComSucesso() {
        designerInteractions.LogadoComSucesso();

    }

    //Cenário de criar hierarquia do item

    @Dado("que estou na home page do PLM")
    public void HomePageDoPLM() {
        designerInteractions.HomePageDoPLM();
    }

    @Quando("clico em style e escolho alguma season, divisão e grupo")
    public void PreencheAHierarquia() {
        designerInteractions.PreenchoHierarquia();
    }


    @E("Acesso uma subclasse")
    public void AcessoUmaSubclasse() {
        designerInteractions.AcessoSubclasse();
    }



    //Troco a role para Designer KU
    @Então("clico na role")
    public void Roles() {
        designerInteractions.ClicoEmRole();

    }

    @E("seleciono a  role Designer KU")
    public void RoleDesignerKU() {
        designerInteractions.TrocarRole();
    }

    @E("confirmo a troca da role para Designer KU")
    public void ConfirmarTrocaRole() {
        designerInteractions.ConfirmarTrocaDaRole();
    }


    //Preencher campos a nivel de subclasse

    @E("Posso preencher o campo Designer")
    public void PreencherOCampoDesigner() {
        designerInteractions.PreencherDesigner();
    }
    @E("Posso preencher o campo Buyer")
    public void PreencherOCampoBuyer() {
        designerInteractions.PreencherBuyer();
    }

    @E("Posso preencher o campo DTP")
    public void PreencherOCampoDTP() {
        designerInteractions.PreencherDTP();
    }


    @Então("posso preencher o campo Graphic Designer")
    public void PreencherOCampoGraphicDesigner() {
        designerInteractions.PreencherGraphicDesigner();

    }


    //Crio um novo item para subclasse
    @Quando("crio um novo item para a subclasse")
    public void NewStyle() {
        designerInteractions.CriarItem();
        designerInteractions.ClicarSaveGo();
    }

    //Altero a view
    @Quando("Altero a view para Designer")
    public void AlteroAView() {
        designerInteractions.ClicarEmView();
    }

    //valido que os campos do style estão de acordo com a subclasse
    @Então("Valido que os campos de pré cadastro a nível de item estão preenchidos de acordo com a subclasse")
    public void ValidoOsCamposDesigner() {
        designerInteractions.ValidarCamposDesigner();
    }



    @Dado("que retorno para a subclasse")
    public void RetornarParaSubclasse() {
        designerInteractions.RetornoParasubclass();
    }



    @Então("Posso editar os campos apagando os seus respectivos valores")
    public void ApagarOsCamposAnivelDeGrupo() {
        designerInteractions.ApagarOCampoGraphicDesigner();
        designerInteractions.ApagarOCampoBuyer();
        designerInteractions.ApagarOCampoDTP();
        designerInteractions.ApagarOCampoDesigner();
    }

    @Então("valido que os campos de pré cadastro do style devem estar vazios")
    public void ValidarQueOsCamposDoItemEstejamVazios() {
        designerInteractions.CampoGraphicDesignerApagado();
        designerInteractions.CampoBuyerApagado();
        designerInteractions.CampoDTPApagado();
        designerInteractions.CampoDesignerApagado();

    }



    @Dado("que estou em uma subclasse e crio um novo item dentro da subclasse")
    public void NewStyle2() {
        designerInteractions.CriarItem2();
        designerInteractions.ClicarSaveGo2();
    }



    @Então("valido que os campos de pré cadastro do style estão vazios")
    public void validoQueOsCamposDePréCadastroDoStyleEstãoVazios() {
        designerInteractions.CampoDesignerApagado();
        designerInteractions.CampoBuyerApagado();
        designerInteractions.CampoDTPApagado();
        designerInteractions.CampoGraphicDesignerApagado();
    }

    @Dado("que estou no style e edito os campos de pré cadastro atribuindo novos valores")
    public void queEstouNoStyleEEditoOsCamposDePréCadastroAtribuindoNovosValores() {
        designerInteractions.NovoValorCampoDesigner();
        designerInteractions.NovoValorCampoBuyer();
        designerInteractions.NovoValorCampoDTP();
        designerInteractions.NovoValorCampoGraphicDesigner();
    }


    @Quando("retorno a subclasse")
    public void RetornoAsubclass2() {
        designerInteractions.RetornoParasubclass2();
    }


    @Então("valido que os campos de pré cadastro preenchidos a nível de style não devem refletir para a sublasse")
    public void validoQueOsCamposDePréCadastroPreenchidosANívelDeStyleNãoDevemRefletirParaASubclasse() {
        designerInteractions.ValidacaoCampoGraphicANivelDeGrupo();
        designerInteractions.ValidacaoCampoBuyerANivelDeGrupo();
        designerInteractions.ValidacaoCampoDTPANivelDeGrupo();
        designerInteractions.ValidacaoCampoDesignerANivelDeGrupo();
    }

}



