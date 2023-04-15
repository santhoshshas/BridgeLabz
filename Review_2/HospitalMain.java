package com.Program.Review_2;

import java.util.HashMap;
import java.util.Map;

public class HospitalMain {
    public static void main(String[] args) {
        Map<String, Hospital> hospitals = new HashMap<>();
        Hospital hospital1 = new Hospital("Hospital 1");
        Hospital hospital2 = new Hospital("Hospital 2");

        hospitals.put(hospital1.getName(), hospital1);
        hospitals.put(hospital2.getName(), hospital2);

        Patient patient1 = new Patient("Patient 1", 30, "1234567890", "City 1", "State 1", Department.ONCOLOGY);
        Patient patient2 = new Patient("Patient 2", 40, "1234567890", "City 2", "State 2", Department.NEUROLOGY);
        Patient patient3 = new Patient("Patient 3", 50, "1234567890", "City 3", "State 3", Department.CARDIOLOGY);
        Patient patient4 = new Patient("Patient 4", 60, "1234567890", "City 4", "State 4", Department.GYNOCOLOGY);

        hospital1.addPatient(Department.ONCOLOGY, patient1);
        hospital1.addPatient(Department.NEUROLOGY, patient2);

        hospital2.addPatient(Department.CARDIOLOGY, patient3);
        hospital2.addPatient(Department.GYNOCOLOGY, patient4);

        System.out.println(hospitals.get("Hospital 1").getPatients().get(Department.ONCOLOGY).get(0).getName());
        System.out.println(hospitals.get("Hospital 2").getPatients().get(Department.GYNOCOLOGY).get(0).getName());
        System.out.println(hospital1.getPatients());
    }
}
