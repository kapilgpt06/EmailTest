package emailtest

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ValidControllerSpec extends Specification implements ControllerUnitTest<ValidController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
