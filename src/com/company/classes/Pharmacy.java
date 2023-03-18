package com.company.classes;

import java.util.List;

public class Pharmacy {

    private int id;
    private String name;
    private String address;
    private List<Person> staff;
    private List<Medicine> medicines;

    public Pharmacy() {
    }

    public Pharmacy(int id, String name, String address, List<Person> staff, List<Medicine> medicines) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.staff = staff;
        this.medicines = medicines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getStaff() {
        return staff;
    }

    public void setStaff(List<Person> staff) {
        this.staff = staff;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }


    @Override
    public String toString() {
        return "Pharmacy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", staff=" + staff +
                ", medicines=" + medicines +"\n";
    }
}
