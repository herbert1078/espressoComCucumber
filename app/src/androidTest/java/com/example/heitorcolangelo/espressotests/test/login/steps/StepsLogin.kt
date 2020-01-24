package com.example.heitorcolangelo.espressotests.test.login.steps
import android.support.test.rule.ActivityTestRule
import com.example.heitorcolangelo.espressotests.test.login.robot.RobotLogin
import com.example.heitorcolangelo.espressotests.test.common.ActivityFinisher
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity
import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then

class StepsLogin {

    private val activityRule = ActivityTestRule(LoginActivity::class.java, false, false)

    private val robot = RobotLogin()

    @Before
    fun setup() {

    }

    @After
    fun tearDown() {
        ActivityFinisher.finishOpenActivities() // Se tiver mais de um caso de teste é necessário utilizar para finalizar a tela
    }

    @Given("^Que eu inicio a tela de Login$")
    fun abrirATelaDeLogin() {
        robot.launchLoginScreen(activityRule)
    }

    @And("^Eu vejo Hint e o campo de Email$")
    fun validarHintEmail() {
        robot.verificarCampoEmail()
    }

    @And("^Eu vejo Hint e o campo de Senha$")
    fun validarHintSenha() {
        robot.verificarCampoSenha()
    }

    @And("^Eu vejo o Botao de Login$")
    fun verBotaoDeLogin() {
        robot.verificarBotaoLogin()
    }

    @Then("^Eu vejo a imagem do Login$")
    fun verImagemNoLogin() {
        robot.verificarImagem()
    }

}