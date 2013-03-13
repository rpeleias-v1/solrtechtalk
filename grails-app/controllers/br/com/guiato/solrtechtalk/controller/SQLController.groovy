package br.com.guiato.solrtechtalk.controller

import br.com.guiato.solrtechtalk.service.SQLService

class SQLController {

	def sqlService

    def index = {
        def countries = sqlService.findAllCoutries()
        def states = sqlService.findStatesByCountry(countries?.get(0))
    	def model = [
    		countries: countries,
            states: states
    	]
    	return model
    }

    def findStatesByCountry = {
    	def selectedCountry = params?.country
    	if (selectedCountry) {
    		def model = [
    			states: sqlService.findStatesByCountry(selectedCountry)
    		]
    		return model
    	}
    }

    def listCitiesByCountryAndState = {
    	def selectedCountry = params?.country
    	def selectedState = params?.state
    	if (selectedCountry && selectedState) {
    		def model = [
    			cities: sqlService.listCitiesByCountryAndState(selectedCountry, selectedState)
    		]
    	}
    	render(template: 'listCitiesCOuntryState', model: model)
    }
}
