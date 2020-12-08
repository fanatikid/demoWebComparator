package demowebcomparator

import grails.rest.Resource

@Resource(uri = '/vertical')
class Vertical {
    long id
    String name
    String code

    static constraints = { }
}
