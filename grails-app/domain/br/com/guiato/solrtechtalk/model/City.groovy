package br.com.guiato.solrtechtalk.model

import org.grails.solr.Solr

class City {

	// enable indexing of a domain class. This will enable the dynamic methods on the domain object.
	static enableSolrSearch = true

	//To have the index updated on inserts, updates and deletes of your domain classes
	static solrAutoIndex = true
	
    static hasOne = [state: State]

    static mapping = {
    	version false
    }

    Long id 

    String name

    String toString() {
    	return name
    }
}
