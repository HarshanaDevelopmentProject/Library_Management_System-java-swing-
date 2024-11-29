package model;

public class Member {

    private String member_id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String memberShipDate;

    public Member(String member_id, String name, String email, String phoneNumber, String address, String memberShipDate) {
        this.member_id = member_id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.memberShipDate = memberShipDate;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMemberShipDate() {
        return memberShipDate;
    }

    public void setMemberShipDate(String memberShipDate) {
        this.memberShipDate = memberShipDate;
    }

}
