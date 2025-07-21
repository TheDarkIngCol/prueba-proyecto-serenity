package com.co.mydemoapp.tasks;

import com.co.mydemoapp.ui.LoginPage;
import com.co.mydemoapp.questions.TargetQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actors.OnStage;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.assertj.core.api.Assertions.assertThat;

public class Login implements Task {

    public final String usuario;
    public final String contrasena;

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public static Login conCredencialesExitoso(String usuario, String contrasena) {
        return Tasks.instrumented(Login.class, usuario, contrasena);
    }

    public static Login conCredencialesBloqueado(String usuario, String contrasena) {
        return Tasks.instrumented(Login.class, usuario, contrasena);
    }

    public static String validarMensajeError() {
        Actor actor = OnStage.theActorInTheSpotlight();
        String mensaje = TargetQuestion.title(LoginPage.MENSAJE_ERROR).answeredBy(actor);
        assertThat(mensaje).contains("Sorry this user has been locked out.");
        Logger.getLogger(Login.class.getName()).info("Mensaje de error validado: " + mensaje);
        return mensaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.USER_INPUT, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(usuario).into(LoginPage.USER_INPUT),
                Enter.theValue(contrasena).into(LoginPage.USER_PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
        System.out.println("[Login] Login exitoso");
    }

}
