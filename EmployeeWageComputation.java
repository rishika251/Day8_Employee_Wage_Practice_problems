package com.bridgelabz.Day8;

public class EmployeeWageComputation {
	 public static final int FULL_TIME = 0;
	    public static final int PART_TIME = 1;
	    public static final int perHourWage = 400;
	    public static int totalEmpHr;
	    public static int totalWorkingDay;
	    public static double totalWage;

	    public static void main(String[] args) {
	        //checking attendence
	        Attendance uc1 = new Attendance();
	        uc1.checkAttendance();

	        System.out.println();

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
	}


