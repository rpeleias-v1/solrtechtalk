package br.com.guiato.solrtechtalk.controller

import br.com.guiato.solrtechtalk.service.SQLService

import br.com.guiato.solrtechtalk.model.*;

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

    def listCitiesByState = {
    	def selectedState = State.get(params?.idSelectedState)
    	if (selectedState) {
    		def model = [
    			cities: sqlService.listCitiesByState(selectedState)
    		]
            render(template: 'listCitiesCountryState', model: model)
    	}    	
    }
}
