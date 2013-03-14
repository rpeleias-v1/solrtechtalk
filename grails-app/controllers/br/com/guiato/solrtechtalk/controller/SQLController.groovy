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
    	def selectedCountry = params?.selectedCountry
    	def selectedState = params?.selectedState
    	if (selectedCountry && selectedState) {
            def cities = sqlService.listCitiesByCountryAndState(selectedCountry, selectedState)
    		def model = [
    			cities: cities,
                totalCityNumber: cities.size()
    		]
            render(template: 'listCitiesCountryState', model: model)
    	}
    	
    }
}
