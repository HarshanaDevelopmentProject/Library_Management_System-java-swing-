package model;

public class FinePayment {

    private String payment_id;
    private String return_id;
    private String fineAmount;
    private String paymentDate;
    private String paymentTime;
    private String isPaymentComplete;

    public FinePayment(String payment_id, String return_id, String fineAmount, String paymentDate, String paymentTime, String isPaymentComplete) {
        this.payment_id = payment_id;
        this.return_id = return_id;
        this.fineAmount = fineAmount;
        this.paymentDate = paymentDate;
        this.paymentTime = paymentTime;
        this.isPaymentComplete = isPaymentComplete;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getReturn_id() {
        return return_id;
    }

    public void setReturn_id(String return_id) {
        this.return_id = return_id;
    }

    public String getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(String fineAmount) {
        this.fineAmount = fineAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getIsPaymentComplete() {
        return isPaymentComplete;
    }

    public void setIsPaymentComplete(String isPaymentComplete) {
        this.isPaymentComplete = isPaymentComplete;
    }

}
