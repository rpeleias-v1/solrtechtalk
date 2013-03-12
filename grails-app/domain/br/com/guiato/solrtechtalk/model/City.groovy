package br.com.guiato.solrtechtalk.model

class City {

	// enable indexing of a domain class. This will enable the dynamic methods on the domain object.
	static enableSorSearch = true

	//To have the index updated on inserts, updates and deletes of your domain classes
	static solrAutoIndex = true
	
    static hasOne = [state: State]

    String name
}
