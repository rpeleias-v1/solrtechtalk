package br.com.guiato.solrtechtalk.controller

import br.com.guiato.solrtechtalk.service.SolrService

class SolrController {

	def solrSearchService

    def index = {
        def countries = solrSearchService.findAllCoutries()
        def states = solrSearchService.findStatesByCountry(countries?.get(0))
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
    			states: solrSearchService.findStatesByCountry(selectedCountry)
    		]
    		return model
    	}
    }

    def listCitiesByState = {
    	def selectedState = State.get(params?.idSelectedState)
    	if (selectedState) {
    		def model = [
    			cities: solrSearchService.listCitiesByState(selectedState)
    		]
            render(template: 'listCitiesCountryState', model: model)
    	}    	
    }
}
