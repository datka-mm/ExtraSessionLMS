package com.company;

import com.company.classes.Pharmacy;
import com.company.service.MedicineService;
import com.company.service.PersonService;
import com.company.service.impl.MedicineServiceImpl;
import com.company.service.impl.PersonServiceImpl;
import com.company.service.impl.PharmacyServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Pharmacy> pharmacies = new ArrayList<>();
        PharmacyServiceImpl pharmacyService = new PharmacyServiceImpl();
        PersonService personService = new PersonServiceImpl();
        MedicineService medicineService = new MedicineServiceImpl();

        while(true) {
            System.out.println("""
                    1 -> Add new pharmacy
                    2 -> Get pharmacy by id
                    3 -> Update pharmacy by id
                    4 -> Get all pharmacy
                    5 -> Delete pharmacy by id
                    6 -> Get pharmacy by address
                    7 -> Add person to pharmacy
                    8 -> Get pharmacy staff
                    9 -> Add new medicine to pharmacy
                    """);
            System.out.println("Choose command:");
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1 -> System.out.println(pharmacyService.addPharmacy(pharmacies));
                case 2 -> System.out.println(pharmacyService.getPharmacyById(pharmacies));
                case 3 -> System.out.println(pharmacyService.updatePharmacyId(pharmacies));
                case 4 -> System.out.println(pharmacyService.getAllPharmacy(pharmacies));
                case 5 -> pharmacyService.deletePharmacyById(pharmacies);
                case 6 -> System.out.println(pharmacyService.getPharmacyByAddress(pharmacies));
                case 7 -> System.out.println(personService.addPersonToPharmacy(pharmacies));
                case 8 -> System.out.println(personService.getAllPharmacyStaff(pharmacies));
                case 9 -> System.out.println(medicineService.addMedicineToPharmacy(pharmacies));
            }
        }
    }
}
