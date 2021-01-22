package models;

public class Author {


    private long idNo;
    private String firstName;
    private String lastName;

    public Author(){}

    public long getIdNo() {
        return idNo;
    }

    public void setIdNo(long idNo) {
        this.idNo = idNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
