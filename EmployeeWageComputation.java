package com.bridgelabz.Day8;

public class EmployeeWageComputation {
	public static final int FULL_TIME = 0;
    public static final int PART_TIME = 1;
    public static final int perHourWage = 400;
    public static int totalEmpHr;
    public static int totalWorkingDay;
    public static double totalWage;

    public static void main(String[] args) {
        //checking attendence full time or parttime
        //checking attendence full time or part-time
        Attendance uc1 = new Attendance();
        uc1.checkAttendance();

        System.out.println();
        System.out.println();//empty space


        //daily wage
        EmpDailyWageUC2 uc2 = new EmpDailyWageUC2();
        double dailyWageFT = uc2.getEmpDailyWage(8);
        System.out.println("FULL TIME emplyoee daily wage is " + dailyWageFT + " Rs");
        double dailyWagePT = uc2.getEmpDailyWage(4);
        System.out.println("PART TIME emplyoee daily wage is " + dailyWagePT + " Rs");
        System.out.println(); // for empty space
        //Monthly wage
        EmpMonthlyWage uc5 = new EmpMonthlyWage();
        double monthWageFT = uc5.getEmpMonthWage(dailyWageFT, 20);
        System.out.println("FULL TIME emplyoee Monthly wage is " + monthWageFT + " Rs");
        double monthWagePT = uc5.getEmpMonthWage(dailyWagePT, 20);
        System.out.println("PART TIME emplyoee Monthly wage is " + monthWagePT + " Rs");
        System.out.println(); // for empty space

        System.out.println(); // for empty space
        //
        //calculate total emp wage

        TotalEmpWage uc6 = new TotalEmpWage();
        double totalWageFT = uc6.getTotalWage(180, 20);
        System.out.println("FULL TIME emplyoee Total wage is " + totalWageFT + " Rs");
        double totalWagePT = uc6.getTotalWage(100, 21);
        System.out.println("FULL TIME emplyoee Total wage is " + totalWagePT + " Rs");
    }
    //check attendanc
    public static class Attendance extends EmployeeWageComputation {
        public void checkAttendance() {
            double checkEmpAtt = (int) (Math.floor(Math.random() * 10) % 4);
            if (checkEmpAtt == FULL_TIME) {
                System.out.println("FULL TIME Employee is Present ");
            } else if (checkEmpAtt == PART_TIME) {
                System.out.println("PART TIME Employee is Present ");
            } else {
                System.out.println("Employee is Absent ");
            }
        }
    }
    //calculate daily Wage
    public static class EmpDailyWageUC2 extends EmployeeWageComputation {
        public double getEmpDailyWage(int FullDayHR) {
            return perHourWage * FullDayHR;
        }
    }
    //calculate monthly vage
    public static class EmpMonthlyWage {
        public double getEmpMonthWage(double perDayWage, int workingDay) {
            return perDayWage * workingDay;
        }
    }
  //calculate total wage
    public static class TotalEmpWage extends EmployeeWageComputation {
        int Min_HRS_IN_MONTH = 100;
        int NUM_OF_WORKING_DAYS = 20;
        public double getTotalWage(int totalEmpHr, int totalWorkingDay) {
            if (totalEmpHr >= Min_HRS_IN_MONTH && totalWorkingDay >= NUM_OF_WORKING_DAYS) {
                totalWage = totalEmpHr * perHourWage;
            } else {
                System.out.println("Working Hours are not completed yet");
            }
            return totalWage;
        }
    }
}