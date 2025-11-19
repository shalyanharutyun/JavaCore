package medicalCenter;

public class Doctor extends Person {

    private String email;
    private Profession profession;

    public Doctor(String id, String name, String surname, String phone, String email, Profession profession) {
        super(id, name, surname, phone);
        this.email = email;
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                super.toString() +
                ", email='" + email + '\'' +
                ", profession=" + profession +
                '}';
    }
}

