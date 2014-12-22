package com.tekdays

class TekEvent {
    String city
    String name
    TekUser organizer
    String venue
    Date startDate
    Date endDate
    String description
	String nickname
	
	String toString() {
		"$name, $city"
	}

	static searchable = true
    static hasMany = [volunteers: TekUser, respondents: String, sponsorships: Sponsorship, tasks: Task, messages: TekMessage]
    static constraints = {
        name()
        city()
        description(maxSize: 5000)
		nickname nullable: true, unique: true
        organizer()
        venue()
        startDate()
        endDate()
        volunteers(nullable: true)
        sponsorships(nullable: true)
        tasks nullable: true
        messages nullable: true
    }
}
