dataSource {
    pooled = true
    driverClassName = "org.postgresql.Driver"
    dialect = org.hibernate.dialect.PostgreSQLDialect
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update"
            url = "jdbc:postgres://localhost/solrintegration"
            username = "grails"
            password = "grails"
        }   
    }   
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:postgres://localhost/solrintegration"
            username = "grails"
            password = "grails"
        }   
    }   
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:postgres://localhost/solrintegration"
            username = "grails"
            password = "grails"
        }   
    }
}
