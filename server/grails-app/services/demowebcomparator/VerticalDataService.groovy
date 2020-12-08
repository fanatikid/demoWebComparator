package demowebcomparator

import grails.gorm.services.Service

@Service(Vertical)
interface VerticalDataService {

    Vertical save(String name)
    Vertical save(long id, String code, String name)

}