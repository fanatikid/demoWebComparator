package demowebcomparator


import grails.rest.*
import grails.converters.*

class VerticalController {
	static responseFormats = ['json', 'xml']
    static defaultAction = "list"
	
    def index() { }
}
