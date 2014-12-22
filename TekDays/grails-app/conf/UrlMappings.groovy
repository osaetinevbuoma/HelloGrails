class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
		
		/*name tek_days_event: "/events/$nickname" {
			controller = "tekEvent"
			action = "show"
		}*/
	}
}
