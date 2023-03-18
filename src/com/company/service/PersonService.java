package com.company.service;

import com.company.classes.Person;
import com.company.classes.Pharmacy;

import java.util.List;

public interface PersonService {

    Person addPersonToPharmacy(List<Pharmacy> pharmacies);

    Person findPersonById(List<Pharmacy> pharmacies);

    List<Person> getAllPharmacyStaff(List<Pharmacy> pharmacies);

    Person updatePersonName(List<Pharmacy> pharmacies);

    void deletePersonFromPharmacy(List<Pharmacy> pharmacies);

}
