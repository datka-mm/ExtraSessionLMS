package com.company.service.impl;

import com.company.classes.Medicine;
import com.company.classes.Pharmacy;
import com.company.exceptions.MyException;
import com.company.service.MedicineService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MedicineServiceImpl implements MedicineService {

    static int idCounter;

    @Override
    public Medicine addMedicineToPharmacy(List<Pharmacy> pharmacies) {
        Medicine medicine = null;
        try {
            System.out.print("Enter pharmacy id: ");
            int id = new Scanner(System.in).nextInt();
            for (Pharmacy p : pharmacies) {
                if (p.getId() == id) {
                    System.out.println("Enter medicine name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Enter medicine price: ");
                    int price = new Scanner(System.in).nextInt();
                    medicine = new Medicine(++idCounter, name, price);
                    p.getMedicines().add(medicine);
                } else {
                    throw new MyException("Pharmacy with id: " + id + " not found!");
                }
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Write only numbers!");
        }
        return medicine;
    }

    @Override
    public Medicine findMedicineByName(List<Pharmacy> pharmacies) {
        return null;
    }

    @Override
    public List<Medicine> getAllMedicine(List<Pharmacy> pharmacies) {
        return null;
    }

    @Override
    public void deleteMedicine(List<Pharmacy> pharmacies) {

    }
}
