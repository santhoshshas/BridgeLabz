package com.Program.Review_2;

import com.Program.Review_2.Department;
import com.Program.Review_2.Patient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String name;
    private Map<Department, List<Patient>> patients;

    public Hospital(String name) {
        this.name = name;
        this.patients = new HashMap<>();
        for (Department department : Department.values()) {
            patients.put(department, new ArrayList<>());
        }
    }

    public void addPatient(Department department, Patient patient) {
        patients.get(department).add(patient);
    }

    public String getName() {
        return name;
    }

    public Map<Department, List<Patient>> getPatients() {
        return patients;
    }
}
