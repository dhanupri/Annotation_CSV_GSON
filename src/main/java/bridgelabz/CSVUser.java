package bridgelabz;

import com.opencsv.bean.CsvBindByName;

import javax.swing.text.StringContent;
//POJO class for reading csv directly

public class CSVUser {
    @CsvBindByName(column = "name")
    private String name;
    @CsvBindByName(column = "email")
    private String email;
    @CsvBindByName(column = "phone")
    private String phone;
    @CsvBindByName(column = "country")
    private String country;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    CSVUser(String name, String email, String phone, String country ){

        this.name=name;
        this.email=email;
        this.phone=phone;
        this.country=country;
    }

    @Override
    public String toString() {
        return "CSVUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
