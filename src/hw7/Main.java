/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;

/**
 *
 * @author patiw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StockMarket market = new StockMarket(10, 10); // 10 investos, 10 stocks
        // Add 10 investors and the initial balance
        market.addInvestor("Darunphop", 10000); // ID=0
        market.addInvestor("Aunnop", 10000); // ID=1
        market.addInvestor("Pimukthee", 10000); // ID=2
        market.addInvestor("Uttakran", 9000); // ID=3
        market.addInvestor("Potsawat", 9000); // ID=4
        market.addInvestor("Suttawee", 9000); // ID=5
        market.addInvestor("Supakarn", 8000); // ID=6
        market.addInvestor("Tanin", 8000); // ID=7
        market.addInvestor("Theerapat", 8000); // ID=8
        market.addInvestor("Kawewut", 8000); // ID=9
        // Add 10 stocks and the initial price
        market.addStock("PTT", 344);
        market.addStock("CPALL", 60.5);
        market.addStock("SCB", 144);
        market.addStock("KBANK", 170);
        market.addStock("CPF", 27.75);
        market.addStock("TRUE", 7.15);
        market.addStock("CPN", 53);
        market.addStock("BTS", 8.35);
        market.addStock("DTAC", 35.50);
        market.addStock("LH", 8.75);

//        market.showStockOwnership();
//        // Investors spent half of their money to randomly buy stocks from companies (IPO).
//        //market.simulateIPO(); //
        market.loadSavedIPO(); // load simulatedIPO
//        market.showStockOwnership();
//
//        market.portfolio("Darunphop");
//        market.portfolio("Aunnop");
        
        
        // To uncomment below, you need to implement Heap

        
        market.submitSellOrder("Pimukthee", "SCB", 5, 200);
        market.submitSellOrder("Supakarn", "SCB", 10, 180);
        market.quote("SCB");

        market.submitBuyOrder("Uttakran", "SCB", 6, 250);
        market.submitBuyOrder("Potsawat", "SCB", 6, 250);

        market.portfolio("Uttakran");
        market.portfolio("Potsawat");
        market.portfolio("Pimukthee");
        market.portfolio("Supakarn");

        market.quote("KBANK");
        market.submitBuyOrder("Suttawee", "KBANK", 2, 90);
        market.quote("KBANK");

        market.submitBuyOrder("Supakarn", "KBANK", 1, 85);
        market.quote("KBANK");

        market.submitBuyOrder("Tanin", "KBANK", 3, 90);
        market.quote("KBANK");
        market.submitBuyOrder("Theerapat", "KBANK", 2, 100);
        market.quote("KBANK");
        market.submitBuyOrder("Kawewut", "KBANK", 2, 80);
        market.quote("KBANK");


        market.submitSellOrder("Uttakran", "KBANK", 2, 150);
        market.quote("KBANK");

        market.submitSellOrder("Uttakran", "KBANK", 6, 85);

        market.portfolio("Uttakran");

        market.showStockOwnership();

        market.submitSellOrder("Darunphop", "PTT", 3, 350);
        market.submitSellOrder("Darunphop", "PTT", 3, 360);
        market.submitSellOrder("Darunphop", "PTT", 4, 370);
        market.submitSellOrder("Pimukthee", "PTT", 5, 355);
        market.submitSellOrder("Pimukthee", "PTT", 5, 365);
        market.submitSellOrder("Pimukthee", "PTT", 5, 375);
        market.submitSellOrder("Potsawat", "PTT", 3, 360);
        market.submitSellOrder("Potsawat", "PTT", 3, 370);
        market.submitSellOrder("Potsawat", "PTT", 4, 380);

        market.submitBuyOrder("Aunnop", "PTT", 6, 370);
        market.submitBuyOrder("Uttakran", "PTT", 6, 370);
        market.submitBuyOrder("Suttawee", "PTT", 10, 370);
        market.submitBuyOrder("Supakarn", "PTT", 10, 370);

        market.submitBuyOrder("Tanin", "PTT", 2, 330);
        market.submitBuyOrder("Tanin", "PTT", 2, 300);
        market.submitBuyOrder("Tanin", "PTT", 2, 270);

        market.submitBuyOrder("Theerapat", "PTT", 3, 330);
        market.submitBuyOrder("Theerapat", "PTT", 3, 250);
        market.submitBuyOrder("Theerapat", "PTT", 3, 200);

        market.submitSellOrder("Kawewut", "PTT", 3, 320);
        market.submitSellOrder("Kawewut", "PTT", 3, 240);
        market.submitSellOrder("Kawewut", "PTT", 4, 220);
        market.submitSellOrder("Aunnop", "PTT", 3, 320);
        market.submitSellOrder("Aunnop", "PTT", 3, 240);
        market.submitSellOrder("Aunnop", "PTT", 4, 220);

        market.quote("PTT");
        market.showStockOwnership();

        market.portfolio("Aunnop");

        market.submitBuyOrder("Darunphop", "PTT", 20, 150);
        market.submitBuyOrder("Darunphop", "PTT", 20, 100);
        market.submitBuyOrder("Darunphop", "PTT", 10, 50);

        market.submitSellOrder("Suttawee", "PTT", 10, 125);
        market.submitSellOrder("Supakarn", "PTT", 10, 75);
        market.submitSellOrder("Tanin", "PTT", 15, 75);
        market.submitSellOrder("Theerapat", "PTT", 15, 75);

        market.quote("PTT");

        market.portfolio("Aunnop");
    }
    
}
