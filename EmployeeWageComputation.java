package com.bridgelabz.Day8;

public class EmployeeWageComputation {
	  public static final int FULL_TIME = 0;
	    public static final int PART_TIME = 1;
	    public static final int perHourWage = 400;
	    public static int totalEmpHr;
	    public static int totalWorkingDay;
	    public static double totalWage;
	    public static void main(String[] args) {
	        //checking attendence full time or part time
	        Attendance uc1 = new Attendance();
	        uc1.checkAttendance();

	        System.out.println();



	        //daily wage
	        EmpDailyWageUC2 uc2 = new EmpDailyWageUC2();
	        double dailyWageFT = uc2.getEmpDailyWage(8);
	        System.out.println("FULL TIME emplyoee daily wage is " + dailyWageFT + " Rs");

	        double dailyWagePT = uc2.getEmpDailyWage(4);
	        System.out.println("PART TIME emplyoee daily wage is " + dailyWagePT + " Rs");

	        System.out.println(); // for empty space

	    }

	    //check attendance
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

	}

