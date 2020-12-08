package demowebcomparator

import grails.rest.Resource

@Resource(uri = '/product')
class Product {
    Long id
    boolean isSponsored

    Vertical vertical

    int numberPackages;
    int downloadSpeed;
    int uploadSpeed;
    int tvChannels;
    int mobileCount;
    int mobileDataCap;
    BigDecimal price;

    BigDecimal spreadPercentage;
    BigDecimal taegPercentage;
    int minLoanAmount;
    int maxLoanAmount;
    int minTermMonths;
    int maxTermMonths;
    int minIncome;

    static belongsTo = [provider: Provider]

    static constraints = {
        numberPackages nullable: true
        downloadSpeed nullable:true
        uploadSpeed nullable:true
        tvChannels nullable:true
        mobileCount nullable:true
        mobileDataCap nullable:true
        price nullable:true
        spreadPercentage nullable:true
        taegPercentage nullable:true
        minLoanAmount nullable:true
        maxLoanAmount nullable:true
        minTermMonths nullable:true
        maxTermMonths nullable:true
        minIncome nullable:true
    }

    static mapping = {
        id type: 'long'
    }
}
