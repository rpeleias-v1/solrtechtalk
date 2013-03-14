package br.com.guiato.solrtechtalk.service

import br.com.guiato.solrtechtalk.model.*;

class IndexingService {

    def indexCountriesToSolr() {
    	def countries = Country.list()

    	countries.each { country ->
    		country.indexSolr()
    	}
    }

    def indexStatesToSolr() {
    	def states = State.list()

    	states.each { state ->
    		state.indexSolr()
    	}
    }

    def indexCitiesToSolr() {
    	def cities = City.list()

    	cities.each { city ->
    		city.indexSolr()
    	}
    }
}
