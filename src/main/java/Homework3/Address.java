package Homework3;

public class Address {
    private String name;
    private String familyName;
    private String socialStatus;
    private String numberOfPhone;

    public Address(String name, String familyName, String socialStatus, String numberOfPhone) {
        this.name = name;
        this.familyName = familyName;
        this.socialStatus = socialStatus;
        this.numberOfPhone = numberOfPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address that = (Address) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (familyName != null ? !familyName.equals(that.familyName) : that.familyName != null) return false;
        if (socialStatus != null ? !socialStatus.equals(that.socialStatus) : that.socialStatus != null) return false;
        return numberOfPhone != null ? numberOfPhone.equals(that.numberOfPhone) : that.numberOfPhone == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (socialStatus != null ? socialStatus.hashCode() : 0);
        result = 31 * result + (numberOfPhone != null ? numberOfPhone.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                '}';
    }
}
