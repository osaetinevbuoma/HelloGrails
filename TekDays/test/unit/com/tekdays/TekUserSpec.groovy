package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(TekUser)
class TekUserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test bio max size"() {
    	when: "a tekUser is created with bio"
    		def tekUser = new TekUser(bio: "This is some bio");

    	then: "ensure that bio is less than or equal to 5000"
    		tekUser.bio.size() <= 5000
    }
}
