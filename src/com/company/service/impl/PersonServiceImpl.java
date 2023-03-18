package com.company.service.impl;

import com.company.classes.Person;
import com.company.classes.Pharmacy;
import com.company.exceptions.MyException;
import com.company.service.PersonService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {

    static int counter;

    @Override
    public Person addPersonToPharmacy(List<Pharmacy> pharmacies) {
        try {
            System.out.println("Enter pharmacy id: ");
            int pharmacyId = new Scanner(System.in).nextInt();
            for (Pharmacy p : pharmacies) {
                if (p.getId() == pharmacyId) {
                    System.out.println("Enter first name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Enter last name: ");
                    String lastName = new Scanner(System.in).nextLine();
                    System.out.println("Enter email (@): ");
                    String email = new Scanner(System.in).nextLine();
                    if (!email.contains("@")) {
                        throw new MyException("Email must contains '@'!");
                    }

                    boolean isTrue = true;
                    for (Pharmacy pharmacy : pharmacies) {
                        if (pharmacy.getStaff().isEmpty()) {
                            for (Person person : pharmacy.getStaff()) {
                                if (person.getEmail().equals(email)) {
                                    isTrue = true;
                                    throw new MyException("Duplicate email");
                                } else {
                                    isTrue = false;
                                }
                            }
                        } else {
                            Person person = new Person(++counter, name, lastName, email);
                            p.getStaff().add(person);
                            return person;
                        }
                    }

                    if (isTrue) {
                        Person person = new Person(++counter, name, lastName, email);
                        p.getStaff().add(person);
                        return person;
                    }
                }
            }
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Person findPersonById(List<Pharmacy> pharmacies) {
        return null;
    }

    @Override
    public List<Person> getAllPharmacyStaff(List<Pharmacy> pharmacies) {
        try {
            System.out.print("Enter pharmacy id: ");
            int id = new Scanner(System.in).nextInt();
            for (Pharmacy p : pharmacies) {
                if (p.getId() == id) {
                    return p.getStaff();
                } else {
                    throw new MyException("Not found!");
                }
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Write only numbers!");
        }
        return null;
    }

    @Override
    public Person updatePersonName(List<Pharmacy> pharmacies) {
        return null;
    }

    @Override
    public void deletePersonFromPharmacy(List<Pharmacy> pharmacies) {
    }
}
