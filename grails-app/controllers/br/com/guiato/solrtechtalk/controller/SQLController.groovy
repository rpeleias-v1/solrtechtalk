package br.com.guiato.solrtechtalk.controller

import br.com.guiato.solrtechtalk.service.SQLService

class SQLController {

	def sqlService

    def findAllCoutries = {
    	def model = [
    		countries: sqlService.findAllCoutries();
    	]
    	render(model: model)
    }

    def findStatesByCountry = {
    	def selectedCountry = params?.country
    	if (selectedCountry) {
    		def model = [
    			states: sqlService.findStatesByCountry(selectedCountry);
    		]
    		render(model: model)
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
    	render(model: model)
    }
}
