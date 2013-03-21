package br.com.guiato.solrtechtalk.controller

class IndexingController {

	def indexingService

    def index = { 

    }

    def indexCountriesToSolr = {
    	indexingService.indexCountriesToSolr();
    }

    def indexStatesToSolr = {
    	indexingService.indexStatesToSolr();
    }

    def indexCitiesToSolr = {
    	indexingService.indexCitiesToSolr();
    }

    def deleteCountriesOfSolr = {
        indexingService.deleteCountriesOfSolr();
    }

    def deleteStatesOfSolr = {
        indexingService.deleteStatesOfSolr();
    }

    def deleteCitiesOfSolr = {
        indexingService.deleteCitiesOfSolr();
    }
}
