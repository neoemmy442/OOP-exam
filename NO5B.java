public class TransactionRecord {
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private String timestamp;

    public String getBuyerTIN() { return buyerTIN; }
    public void setBuyerTIN(String buyerTIN) { this.buyerTIN = buyerTIN; }

    public String getSellerTIN() { return sellerTIN; }
    public void setSellerTIN(String sellerTIN) { this.sellerTIN = sellerTIN; }

    public double getInvoiceAmount() { return invoiceAmount; }
    public void setInvoiceAmount(double invoiceAmount) { this.invoiceAmount = invoiceAmount; }

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}