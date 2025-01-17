package com.sofkau.question;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class ResultadoCompra {


    public static final Target MENSAJE_COMPRA = Target
            .the("MENSAJE DE LOGIN")
            .located(MobileBy.AccessibilityId("THANK YOU FOR YOU ORDER"));

    public static Question<String> isEqualTo() {
        return TheTarget.textOf(MENSAJE_COMPRA);
    }

    private ResultadoCompra() {
    }
}
