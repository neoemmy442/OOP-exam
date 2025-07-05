package efrisescapulationdemo;

class TaxCategory {
    public double calculateVAT(double amount) {
        return amount * 0.18; // Default VAT rate
    }
}

// Subclass for Retailer
class Retailer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.18;
    }
}

// Subclass for Wholesaler
class Wholesaler extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.15;
    }
}

// Subclass for Importer
class Importer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.10;
    }
}

// Main class
public class VATDemo {
    public static void main(String[] args) {
        // Array of TaxCategory references, holding subclass instances
        TaxCategory[] taxpayers = {
            new Retailer(),
            new Wholesaler(),
            new Importer()
        };

        // Sample transaction amounts
        double[] amounts = {100000, 200000, 150000};

        // Demonstrating dynamic method dispatch
        for (int i = 0; i < taxpayers.length; i++) {
            System.out.println("Transaction Amount: " + amounts[i]);
            System.out.println("VAT: " + taxpayers[i].calculateVAT(amounts[i]));
            System.out.println("---------------------------");
        }
    }
}
