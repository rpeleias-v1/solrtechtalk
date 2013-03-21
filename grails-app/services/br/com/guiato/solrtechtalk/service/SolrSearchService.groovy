package br.com.guiato.solrtechtalk.service

import br.com.guiato.solrtechtalk.model.Country;
import br.com.guiato.solrtechtalk.model.State;
import br.com.guiato.solrtechtalk.model.City;

import org.grails.solr.Solr
import org.apache.solr.client.solrj.SolrQuery
import org.apache.solr.client.solrj.SolrQuery.ORDER

class SolrSearchService {

	boolean transactional = true

    def findAllCoutries() {
    	def result = Country.searchSolr("${Country.solrFieldName("name")}:*")
    	//TODO- change from SolrDocument to Object
    	List<Country> countries = result.queryResponse.results
    	return countries
    }

    def findStatesByCountry(Country country) {
    	def result = State.searchSolr("${State.solrFieldName('name')}:" + country.name + "" )
        List<State> states = result.queryResponse.results
        return states
    }

    def listCitiesByState(State state) {
    	def result = State.searchSolr("${City.solrFieldName('name')}:" + state.name + "" )
        List<City> cities = result.queryResponse.results
        return cities
    }
}
