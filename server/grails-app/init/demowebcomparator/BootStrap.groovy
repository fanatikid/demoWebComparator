package demowebcomparator

import grails.converters.JSON

class BootStrap {

    ProductDataService productDataService
    VerticalDataService verticalDataService
    ProviderDataService providerDataService

    def init = { servletContext ->
        log.info "Loading database..."
        Vertical verticalBB = verticalDataService.save(1L, "BB", "Broadband")
        Vertical verticalCC = verticalDataService.save(2L, "CC", "Credit Cards")
        Vertical verticalHL = verticalDataService.save(3L, "HL", "Home loans")

        // initial Providers List
        [
                [1L, "WZK", "WiZink", "O WiZink, que opera em Portugal desde novembro de 2016, é um banco espanhol especializado em cartões de crédito e soluções de poupança simples para ir ao encontro das necessidades do dia-a-dia dos seus clientes. Atualmente, só em território nacional, o WiZink conta com mais de 700.000 clientes.", true],
                [2L, "UNB", "Unibanco", "O Unibanco é uma empresa pertencente à entidade financeira Unicre. Atualmente, os valores do Unibanco estão patentes na assinatura “pelo sim, pelo sim”, que evoca a proximidade, utilidade e disponibilidade dos serviços oferecidos, assim como a necessidade de utilizar um cartão de crédito Unibanco para resolver os imprevistos do dia a dia.", true],
                [3L, "ACB", "ActivoBank", "A Cofidis surgiu em Portugal em 1996, onde hoje em dia acompanha mais de 300 mil clientes numa relação sustentável e personalizada, tendo vindo a conquistar uma posição de referência na venda e gestão de crédito a particulares.", false],
                [4L, "MEO", "MEO", "A MEO - Serviços de Comunicações e Multimédia S.A. – marca que integra o grupo PT - surgiu em 2007 através do lançamento de um novo formato de pacotes de telecomunicações: o triple play, que engloba os serviços de Televisão, Internet e Voz.", true],
                [5L, "VDF", "Vodafone", "O Grupo Vodafone foi fundado no Reino Unido, em 1985, fruto de uma joint venture entre a empresa Racal Strategic Radio Ltd e a Millicom. Originalmente sob o nome de Racal-Millicom, o nome Vodafone surge como junção das palavras “VOice-DAta-FONE” (telecomunicações de voz e de dados).", true],
                [6L, "NOS", "NOS", "A operadora NOS nasceu em 2013 sob o nome de ZON/Optimus, resultado de uma fusão entre duas das maiores empresas de pacotes de telecomunicações do país: a ZON Multimédia e a Optimus Telecomunicações.", true],
                [7L, "NOW", "NOWO", "A NOWO surgiu com uma forte aposta numa nova abordagem para romper com o oligopólio da MEO, da NOS e da Vodafone no mercado português das telecomunicações.", true],
                [8L, "ZON", "ZON", "A ZON Multimédia é um grupo empresarial que integra o principal índice bolsista nacional, o PSI-20. É lider no mercado de pay TV em Portugal e é o segundo maior Internet provider.", false],
                [9L, "STD", "Santander", "Tendo entrado em Portugal em 1988, o Santander é o segundo maior banco privado no país e um dos maiores da União Europeia, estando localizado entre os 10 maiores grupos financeiros do Mundo.", true],
                [10L, "CGD", "Caixa Geral de Depósitos", "A Caixa Geral de Depósitos é uma referência no mercado financeiro português e internacional, uma vez que marca a sua presença pela Europa, América e Ásia.", true],
                [11L, "BKI", "Bankinter", "O Bankinter é reconhecido no mercado espanhol como uma das entidades financeiras mais solventes e rentáveis. É uma referência na área da inovação e na qualidade de serviço que presta.", true]
        ].each { item ->
            providerDataService.save(item[0] as long, item[1].toString(), item[2].toString(), item[3].toString(), Boolean.parseBoolean(item[4].toString()))
        }

        // initial Products List
        // Broadband
        [
                [1L, verticalBB, 4, true, 4, 100, 40, 120, 1, 5, 29.99],
                [2L, verticalBB, 4, false, 4, 200, 100, 120, 1, 5, 39.99],
                [3L, verticalBB, 4, false, 4, 500, 200, 120, 1, 10, 69.99],
                [4L, verticalBB, 4, false, 4, 500, 200, 120, 2, 10, 59.99],
                [5L, verticalBB, 4, false, 4, 500, 200, 120, 4, 5, 89.99],
                [6L, verticalBB, 4, false, 4, 1000, 400, 120, 1, 2, 59.99],
                [7L, verticalBB, 4, false, 3, 1000, 400, 120, 0, null, 39.99],
                [8L, verticalBB, 4, false, 3, 500, 200, 120, 0, null, 29.99],
                [9L, verticalBB, 6, false, 4, 100, 40, 130, 1, 7, 29.99],
                [10L, verticalBB, 6, true, 4, 200, 100, 130, 1, 7, 39.99],
                [11L, verticalBB, 6, false, 4, 500, 200, 130, 1, 10, 69.99],
                [12L, verticalBB, 6, false, 4, 500, 200, 130, 2, 10, 59.99],
                [13L, verticalBB, 6, false, 4, 500, 200, 130, 4, 7, 89.99],
                [14L, verticalBB, 6, false, 4, 1000, 400, 130, 1, 3, 59.99],
                [15L, verticalBB, 6, false, 3, 1000, 400, 130, 0, null, 39.99],
                [16L, verticalBB, 5, false, 4, 500, 200, 120, 2, 10, 59.99],
                [17L, verticalBB, 5, false, 4, 500, 200, 120, 4, 5, 89.99],
                [18L, verticalBB, 5, false, 4, 1000, 400, 120, 1, 2, 59.99],
                [19L, verticalBB, 5, false, 3, 1000, 400, 120, 0, null, 39.99],
                [20L, verticalBB, 5, false, 3, 500, 200, 120, 0, null, 29.99],
                [21L, verticalBB, 7, false, 4, 500, 200, 120, 2, 10, 49.99],
                [22L, verticalBB, 7, false, 4, 500, 200, 120, 4, 5, 79.99],
                [23L, verticalBB, 7, false, 4, 1000, 400, 120, 1, 2, 49.99],
                [24L, verticalBB, 7, false, 3, 1000, 400, 120, 0, null, 29.99],
                [25L, verticalBB, 7, false, 3, 500, 200, 120, 0, null, 19.99],
                [26L, verticalBB, 8, true, 4, 200, 100, 130, 1, 7, 39.99],
                [27L, verticalBB, 8, false, 4, 500, 200, 130, 1, 10, 69.99],
                [28L, verticalBB, 8, false, 4, 500, 200, 130, 2, 10, 59.99],
                [29L, verticalBB, 8, false, 4, 500, 200, 130, 4, 7, 89.99],
                [30L, verticalBB, 8, false, 4, 1000, 400, 130, 1, 3, 59.99],
                [31L, verticalBB, 8, false, 3, 1000, 400, 130, 0, null, 39.99]
        ].each { item ->
            long id = item[0] as long
            Provider aProvider = providerDataService.get(Long.parseLong(item[2].toString()))
            boolean aBool = Boolean.parseBoolean(item[3].toString())
            int nbrPackages = Integer.parseInt(item[4].toString())
            int netDownload = Integer.parseInt(item[5].toString())
            int netUpload = Integer.parseInt(item[6].toString())
            int tvChannels = Integer.parseInt(item[7].toString())
            int mobileCount = Integer.parseInt(item[8].toString())
            int mobileData = item[9] != null ? Integer.parseInt(item[9].toString()) : 0
            BigDecimal price = Double.parseDouble(item[10].toString())

            productDataService.save(id, verticalBB, aProvider, aBool, nbrPackages, netDownload, netUpload, tvChannels, mobileCount, mobileData, price)
        }

        // Credit card - single spread
        productDataService.save(32L, verticalCC, providerDataService.get(1L), false, 1.2, 5000, 20000, 24, 80)

        // Credit Card - taeg
        [
                [33, verticalCC, 1, false, 6.0, 5000, 25000, 24, 80, 2000],
                [34, verticalCC, 2, true, 8.2, 5000, 20000, 24, 80, 1000],
                [35, verticalCC, 2, false, 6.0, 5000, 25000, 24, 80, 2000],
                [36, verticalCC, 3, false, 8.2, 5000, 20000, 24, 80, 1000],
                [37, verticalCC, 3, false, 6.0, 5000, 25000, 24, 80, 2000]
        ].each { item ->
            long id = Long.parseLong(item[0].toString())
            Provider aProvider = providerDataService.get(Long.parseLong(item[2].toString()))
            boolean aBool = Boolean.parseBoolean(item[3].toString())
            BigDecimal taeg = Double.parseDouble(item[4].toString())
            int minLoan = Integer.parseInt(item[5].toString())
            int maxLoan = Integer.parseInt(item[6].toString())
            int minMonths = Integer.parseInt(item[7].toString())
            int maxMonths = Integer.parseInt(item[8].toString())
            int minIncome = Integer.parseInt(item[9].toString())

            productDataService.save(id, verticalCC, aProvider, aBool, taeg, minLoan, maxLoan, minMonths, maxMonths, minIncome)
        }


        // Home Loan
        [
                [38, verticalHL, 9, true, 2.2, 40000, 1000000, 120, 480, 1000],
                [39, verticalHL, 9, false, 1.8, 40000, 1000000, 120, 480, 2000],
                [40, verticalHL, 10, false, 2.2, 40000, 1000000, 120, 480, 1000],
                [41, verticalHL, 10, false, 1.8, 40000, 1000000, 120, 480, 2000],
                [42, verticalHL, 11, false, 2.2, 40000, 1000000, 120, 480, 1000],
                [43, verticalHL, 11, false, 1.8, 40000, 1000000, 120, 480, 2000]
        ].each { item ->
            long id = Long.parseLong(item[0].toString())
            Provider aProvider = providerDataService.get(Long.parseLong(item[2].toString()))
            boolean aBool = Boolean.parseBoolean(item[3].toString())
            BigDecimal taeg = Double.parseDouble(item[4].toString())
            int minLoan = Integer.parseInt(item[5].toString())
            int maxLoan = Integer.parseInt(item[6].toString())
            int minMonths = Integer.parseInt(item[7].toString())
            int maxMonths = Integer.parseInt(item[8].toString())
            int minIncome = Integer.parseInt(item[9].toString())

            productDataService.save(id, verticalHL, aProvider, aBool, taeg, minLoan, maxLoan, minMonths, maxMonths, minIncome)
        }
    }
    def destroy = {
    }
}
