package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Sponsor)
class SponsorSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test creating a Sponsor"() {
    	when: "a new Sponsor is being created"
    		def sponsor = new Sponsor(
    			name: "Coca-Cola",
    			website: "www.coca-cola.com",
    			description: "The best soda available"
    		)

    	then: "name cannot be blank, website cannot be blank"
    		sponsor.name != null
    		sponsor.website != null
    }
}
