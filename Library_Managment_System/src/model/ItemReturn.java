package model;

public class ItemReturn {

    private String return_id;
    private String borrow_id;
    private String returnDate;
    private String isLate;
    private String numberOfDateLate;
    private String fineAmount;
    private String isFinePaymentPaid;
    private String itemID;

    public ItemReturn(String return_id, String borrow_id, String returnDate, String isLate, String numberOfDateLate, String fineAmount, String isFinePaymentPaid, String itemID) {
        this.return_id = return_id;
        this.borrow_id = borrow_id;
        this.returnDate = returnDate;
        this.isLate = isLate;
        this.numberOfDateLate = numberOfDateLate;
        this.fineAmount = fineAmount;
        this.isFinePaymentPaid = isFinePaymentPaid;
        this.itemID = itemID;
    }

    public String getReturn_id() {
        return return_id;
    }

    public void setReturn_id(String return_id) {
        this.return_id = return_id;
    }

    public String getBorrow_id() {
        return borrow_id;
    }

    public void setBorrow_id(String borrow_id) {
        this.borrow_id = borrow_id;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getIsLate() {
        return isLate;
    }

    public void setIsLate(String isLate) {
        this.isLate = isLate;
    }

    public String getNumberOfDateLate() {
        return numberOfDateLate;
    }

    public void setNumberOfDateLate(String numberOfDateLate) {
        this.numberOfDateLate = numberOfDateLate;
    }

    public String getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(String fineAmount) {
        this.fineAmount = fineAmount;
    }

    public String getIsFinePaymentPaid() {
        return isFinePaymentPaid;
    }

    public void setIsFinePaymentPaid(String isFinePaymentPaid) {
        this.isFinePaymentPaid = isFinePaymentPaid;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

}
