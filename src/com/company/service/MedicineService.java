package com.company.service;

import com.company.classes.Medicine;
import com.company.classes.Pharmacy;

import java.util.List;

public interface MedicineService {

    Medicine addMedicineToPharmacy(List<Pharmacy> pharmacies);

    Medicine findMedicineByName(List<Pharmacy> pharmacies);

    List<Medicine> getAllMedicine(List<Pharmacy> pharmacies);

    void deleteMedicine(List<Pharmacy> pharmacies);
}