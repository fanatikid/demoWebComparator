package demowebcomparator

import grails.gorm.services.Service

@Service(Product)
interface ProductDataService {
    List<Product> getAll()
    Product getById(long id)

    // Broadband
    Product save(long id, Vertical vertical, Provider provider, boolean isSponsored, int numberPackages, int downloadSpeed, int uploadSpeed, int tvChannels, int mobileCount, int mobileDataCap, BigDecimal price)
    // Credit card - single spread
    Product save(long id, Vertical vertical, Provider provider, boolean isSponsored, BigDecimal spreadPercentage, int minLoanAmount, int maxLoanAmount, int minTermMonths, int maxTermMonths)
    // Credit Card - taeg
    Product save(long id, Vertical vertical, Provider provider, boolean isSponsored, BigDecimal taegPercentage, int minLoanAmount, int maxLoanAmount, int minTermMonths, int maxTermMonths, int minIncome)
}