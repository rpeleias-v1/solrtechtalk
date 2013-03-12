dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
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
            driverClassName = 'com.p6spy.engine.spy.P6SpyDriver'
            url = 'jdbc:postgresql://localhost/solrtechtalk'
            username = 'goku2013'
            password = 'goku2013'
        }
    }
    test {
        dataSource {
            driverClassName = 'com.p6spy.engine.spy.P6SpyDriver'
            url = 'jdbc:postgresql://localhost/solrtechtalk'
            username = 'goku2013'
            password = 'goku2013'
        }
    }
    production {
        dataSource {
            driverClassName = 'com.p6spy.engine.spy.P6SpyDriver'
            url = 'jdbc:postgresql://localhost/solrtechtalk'
            username = 'goku2013'
            password = 'goku2013'
            pooled = true
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}
