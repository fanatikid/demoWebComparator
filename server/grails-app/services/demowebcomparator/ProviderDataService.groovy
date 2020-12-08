package demowebcomparator

import grails.gorm.services.Service

@Service(Provider)
interface ProviderDataService {
    List<Provider> getAll()
    Provider get(long id)

    Provider save(String name)
    Provider save(long id, String code, String name, String summary, boolean isActive)
}