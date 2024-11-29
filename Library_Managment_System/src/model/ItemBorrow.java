package model;

public class ItemBorrow {

    private String borrow_id;
    private String member_id;
    private String item_id;
    private String type;
    private String borrowDate;
    private String dueDate;
    private String isReturn;

    public ItemBorrow(String borrow_id, String member_id, String item_id, String type, String borrowDate, String dueDate, String isReturn) {
        this.borrow_id = borrow_id;
        this.member_id = member_id;
        this.item_id = item_id;
        this.type = type;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.isReturn = isReturn;
    }

    public String getBorrow_id() {
        return borrow_id;
    }

    public void setBorrow_id(String borrow_id) {
        this.borrow_id = borrow_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(String isReturn) {
        this.isReturn = isReturn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
