package demowebcomparator

import grails.rest.Resource

@Resource(uri = '/provider')
class Provider {
    long id
    String code
    String name
    String summary
    boolean isActive

    static hasMany = [products: Product]

    static constraints = {
        products nullable: true
    }

    static mapping = {
        summary sqlType: "varchar", length: 500
    }
}
