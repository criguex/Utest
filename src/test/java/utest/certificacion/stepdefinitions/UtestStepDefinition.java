package utest.certificacion.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import utest.certificacion.task.RegistroUsuario;
import utest.certificacion.utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utest.certificacion.utils.constant.ConstantManage.ACTOR;
import static utest.certificacion.utils.constant.ConstantManage.URL;

public class UtestStepDefinition {


    @Before
    public void SetUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Estoy en la pagina de utest$")
    public void estoy_en_la_pagina_de_utest()  {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowseWeb().onTheUrl(URL)));

    }
    @Cuando("^lleno los formularios$")
    public void lleno_los_formularios() {
        theActorCalled(ACTOR).wasAbleTo(RegistroUsuario.registro());

    }

    @Entonces("^quedo registrado en la pagina$")
    public void quedo_registrado_en_la_pagina()  {

    }




}
