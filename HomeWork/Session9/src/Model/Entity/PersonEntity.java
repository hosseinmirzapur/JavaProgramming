package Model.Entity;

public class PersonEntity {
    String name;
    String nationalID;
    String birthDate;
    String mobileNumber;
    String fatherName;
    String visaID;
    String birthPlace;
    String phoneNumber;
    String dateEntry;

    public String getName() {
        return name;
    }

    public PersonEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getNationalID() {
        return nationalID;
    }

    public PersonEntity setNationalID(String nationalID) {
        this.nationalID = nationalID;
        return this;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public PersonEntity setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public PersonEntity setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public PersonEntity setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getVisaID() {
        return visaID;
    }

    public PersonEntity setVisaID(String visaID) {
        this.visaID = visaID;
        return this;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public PersonEntity setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PersonEntity setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getDateEntry() {
        return dateEntry;
    }

    public PersonEntity setDateEntry(String dateEntry) {
        this.dateEntry = dateEntry;
        return this;
    }
}
