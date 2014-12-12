package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(TekEvent)
class TekEventSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {
        when: "a tekEvent has a name and city"
            def tekEvent = new TekEvent(name: "Groovy One", city: "San Francisco", organizer: [fullName: "John Doe"] as TekUser)
            
        then: "the toString method will combine them"
            tekEvent.toString() == "Groovy One, San Francisco"
    }
    
    void "test description size"() {
        when: "a tekEvent has a description"
            def tekEvent = new TekEvent(description: "Some description")
            
        then: "the length must be less than or equal to 5000"
            tekEvent.description.size() <= 5000
    }

    void "test user is instance of event"() {
        when: "a tekEvent is created"
            def tekEvent = new TekEvent(organizer: [fullName: "John Doe"] as TekUser);

        then: "the tekEvent organizer must be an instance of TekUser"
            tekEvent.organizer instaceOf TekUser
    }
}
