package gtunes

import grails.test.mixin.*
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(StoreController)
class StoreControllerSpec extends Specification {

//    def setup() {
//    }
//
//    def cleanup() {
//    }

    void "test something"() {
        expect:
        1 == 1
//        controller.index()
//        assert 'Welcome to the gTunes store!' == response.text
    }

    def "grailsApplication is not null"() {
        expect:
        grailsApplication != null
    }

    void "test index"() {
        when:
        controller.index()

        then:
        response.text == 'Welcome to the gTunes store!'
    }
}


