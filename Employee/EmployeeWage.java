package com.Program.Employee;

import java.util.ArrayList;

public class EmployeeWage {
    public static final int PART_TIME_Work = 1;
    public static final int FUll_TIME_WORK = 2;
    int numOfCompany = 0;
    ArrayList<CompanyEmpWage> companyEmpWageArray = new ArrayList<CompanyEmpWage>();

    public void addCompanyEmpWage(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, empRatePerHr, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageArray.add(companyEmpWage);
    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageArray.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageArray.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays <= companyEmpWage.getNumOfWorkingDays() && totalEmpHrs < companyEmpWage.getMaxHoursPerMonth()) {
            totalWorkingDays++;
            double empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case FUll_TIME_WORK:
                    empHrs = 8;
                    break;
                case PART_TIME_Work:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            int empWage = empHrs * companyEmpWage.getEmpRatePerHour();
            totalEmpHrs += empHrs;
            totalEmpWage += empWage;
            System.out.println("Day"+" "+  totalWorkingDays +" "+ "Emp Hrs: " + empHrs +" "+ "Emp Wage: " + empWage);
        }
        return totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        System.out.println("Welcome to EmployeeWage");
        employeeWage.addCompanyEmpWage("TCS", 20, 20, 100);
        employeeWage.addCompanyEmpWage("INFOSYS", 10, 15, 100);
        employeeWage.addCompanyEmpWage("HCL", 15, 25, 100);
        employeeWage.computeEmpWage();
    }
}

