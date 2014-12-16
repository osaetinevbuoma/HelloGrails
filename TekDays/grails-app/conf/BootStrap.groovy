
import grails.util.GrailsUtil
import com.tekdays.TekEvent
import com.tekdays.TekUser
import com.tekdays.Sponsor
import com.tekdays.Sponsorship
import com.tekdays.TekMessage

class BootStrap {

    def init = { servletContext ->
        if (GrailsUtil.environment == "development") {
            /**
             * TekUser instances
             */
            new TekUser(
                fullName: "John Doe",
                userName: "jdoe",
                password: "t0ps3cr3t",
                email: 'jdoe@johnsgroovyshop.com',
                website: 'blog.johnsgroovyshop.com',
                bio: """
                John has been programming for over 40 years. He has
                worked with every programming language known to man
                and has settled on Groovy. In his spare time, John
                dabbles in astro physics and plays
                shuffleboard.
            """
            ).save()
            
            new TekUser(
                fullName: "John Deere",
                userName: "tractorman",
                password: "t0ps3cr3t",
                email: 'john.deere@porkproducers.org',
                website: 'www.perl.porkproducers.org',
                bio: """
                John is a top notch Perl programmer and a pretty
                good hand around the farm. If he can't program it he
                can plow it!
            """
            ).save()

            def user3 = new TekUser(
                fullName: "Sarah Martin",
                userName: 'sarah',
                password: '54321',
                email: 'sarah@martinworld.com',
                website: 'www.martinworld.com',
                bio: 'Web designer and Grails afficianado.'
            ).save()

            def user4 = new TekUser(
                fullName: 'Bill Smith',
                userName: 'Mr_Bill',
                password: '12345',
                email: 'mrbill@email.com',
                website: 'www.mrbillswebsite.com',
                bio: 'Software developer, claymation artist.'
            ).save()
            
            /**
             * TekEvent Instances
             */
            def event1 = new TekEvent(
                name: "Gateway Code Camp",
                city: "Saint Louis, MO",
                organizer: TekUser.findByFullName("John Doe"),
                venue: "TDB",
                startDate: new Date("11/21/2014"),
                endDate: new Date("11/21/2014"),
                description: """This conference will bring coders from
                            across platforms, languages, and industries
                            together for an exciting day of tips, tricks,
                            and tech! Stay sharp! Stay at the top of your
                            game! But, don't stay home! Come an join us
                            this fall for the first annual Gateway Code
                            Camp."""
            )
            
            if (!event1.save()) {
                event1.errors.allErrors.each{
                    error -> println "An error occurred with event1: ${error}"
                }
            }
            
            def event2 = new TekEvent(
                name: "Perl Before Swine",
                city: "Austin, MN",
                organizer: TekUser.findByFullName("John Deere"),
                venue: "SPAM Museum",
                startDate: new Date("11/2/2014"),
                endDate: new Date("11/2/2014"),
                description: """Join the Perl programmers of the Pork Producers
                            of America as we hone our skills and ham it up
                            a bit. You can show off your programming chops
                            while trying to win a year's supply of pork
                            chops in our programming challenge.\n\

                            Come and join us in historic (and aromatic),
                            Austin, Minnesota. You'll know when you're
                            there!"""
            )
            
            if (!event2.save()) {
                event2.errors.allErrors.each{
                    error -> println "An error occurred with event2: $error"
                }
            }
            
            /**
             * Add volunteers for events
             */
            def g1 = TekEvent.findByName("Gateway Code Camp")

            g1.addToVolunteers(user3)
            g1.addToVolunteers(user4)

            g1.addToRespondents('ben@grailsmail.com')
            g1.addToRespondents('zachary@linuxgurus.org')
            g1.addToRespondents('solomon@bootstrapwelding.com')
            g1.save()
            
            /**
             * Create sponsors
             */
            def s1 = new Sponsor(
                name: 'Contegix',
                website: 'http://www.contegix.com',
                description: "Beyond Managed Hosting for your Enterprise"
            ).save()
            
            def s2 = new Sponsor(
                name: 'Object Computing Incorporated',
                website: 'http://ociweb.com',
                description: 'An OO Software Engineering Company'
            ).save()
            
            /**
             * Create sponsorships
             */
            def sp1 = new Sponsorship(
                event: g1,
                sponsor: s1,
                contributionType: 'Other',
                description: 'Cool T-Shirts').save()
            
            def sp2 = new Sponsorship(
                event: g1,
                sponsor: s2,
                contributionType: 'Venue',
                description: 'Will be paying for the Moscone').save()

            /**
             * TekMessage
             */
            def parent1 = new TekMessage(
                subject: "Lorem ipsum dolor sit amet",
                content: """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut 
                    labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris 
                    nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit 
                    esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
                    culpa qui officia deserunt mollit anim id est laborum.
                """,
                event: event1,
                author: TekUser.findByFullName("John Doe")
            ).save()

            def parent2 = new TekMessage(
                subject: "Sed ut perspiciatis unde omnis iste natus error",
                content: """
                    Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, 
                    totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. 
                    Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos 
                    qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, 
                    adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. 
                    Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi 
                    consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel 
                    illum qui dolorem eum fugiat quo voluptas nulla pariatur?
                """,
                event: event2,
                author: TekUser.findByFullName("Bill Smith")
            ).save()

            def parent3 = new TekMessage(
                subject: "Lorem ipsum dolor sit amet",
                content: """
                    Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, 
                    totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. 
                    Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos 
                    qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, 
                    adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. 
                    Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi 
                    consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel 
                    illum qui dolorem eum fugiat quo voluptas nulla pariatur?
                """,
                event: event1,
                author: TekUser.findByFullName("John Deere")
            ).save()

            def parent4 = new TekMessage(
                subject: "Sed ut perspiciatis unde omnis iste natus error",
                content: """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut 
                    labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris 
                    nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit 
                    esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
                    culpa qui officia deserunt mollit anim id est laborum.
                """,
                event: event2,
                author: TekUser.findByFullName("Sarah Martin")
            ).save()

            def child1 = new TekMessage(
                subject: "Lorem ipsum dolor sit amet",
                content: """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut 
                    labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris 
                    nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit 
                    esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
                    culpa qui officia deserunt mollit anim id est laborum.
                """,
                event: event1,
                author: TekUser.findByFullName("Bill Smith"),
                parent: parent1
            ).save()

            def child2 = new TekMessage(
                subject: "Lorem ipsum dolor sit amet",
                content: """
                    Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, 
                    totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. 
                    Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos 
                    qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, 
                    adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. 
                    Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi 
                    consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel 
                    illum qui dolorem eum fugiat quo voluptas nulla pariatur?
                """,
                event: event1,
                author: TekUser.findByFullName("Sarah Martin"),
                parent: parent1
            ).save()
        }
    }

    def destroy = {
    }
}
