package dev.kagamirai.styrax

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import kotlin.test.assertEquals

object StyraxFeature : Spek({
    Feature("Magic") {
        Scenario("Shooting at the stars") {
            When("Trying to aim") {
                1 + 1
            }
            Then("It succeeds") {
                assertEquals(1, 2)
            }
        }
    }
})