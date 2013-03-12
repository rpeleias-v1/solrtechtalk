package br.com.guiato.solrtechtalk.service

import br.com.guiato.solrtechtalk.service.Country;
import br.com.guiato.solrtechtalk.service.State;
import br.com.guiato.solrtechtalk.service.City;

class SQLService {

    def findAllCoutries() {
    	List<Country> countries = Country.list();
    	return countries
    }

    def findStatesByCountry(Country country) {
    	List<State> states = State.findAllByCountry(country)
    	return states
    }

    def listCitiesByCountryAndState(Country country, State, state) {
    	List<City> cities = City.findAllByCountryAndState(country, state)
    	return cities
    }
}
