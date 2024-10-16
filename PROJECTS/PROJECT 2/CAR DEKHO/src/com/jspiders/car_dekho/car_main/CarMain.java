package com.jspiders.car_dekho.car_main;

import java.util.Scanner;

import com.jspiders.car_dekho.car_operations.CarOperations;

public class CarMain {

	public static void main(String[] args) {
		
		boolean login = true;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while(login) {
			System.out.println("====================================================================");
			System.out.println("****************** WELCOME TO THE CAR DEKHO ************************");
			System.out.println("====================================================================");
			System.out.println("=======================>>> CAR DEKHO <<<============================");
			System.out.print("====================================================================");
			
			System.out.println("\n1.Add Car \n2.Search Car Details \n3.Update Car Details \n4.Remove Car Details \n5.Show Cars \n6.Exit");
			System.out.println();
			System.out.print("Please Enter Your Choice "+"\n===>");
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1 : {
					CarOperations carOperations = new CarOperations();
					carOperations.addCar();
				}
				break;
				
				case 2 : {
					CarOperations carOperations = new CarOperations();
					carOperations.searchCarDetails();
				}
				break;
				
				case 3 : {
					CarOperations carOperations = new CarOperations();
					carOperations.updateCar();
				}
				break;
				
				case 4 : {
					CarOperations carOperations = new CarOperations();
					carOperations.remove();
				}
				break;
				
				case 5 : {
					CarOperations carOperations = new CarOperations();
					carOperations.availableCars();
				}
				break;
				
				case 6 : {
					login = false;
					System.out.println("===========================================================================");
					System.out.println("---------->>>>> !!!... Thanks for Using CAR DEKHO ...!!! ------------->>>>>");
					System.out.println("===========================================================================");
					break;
				}
				
				default:
					System.out.println("=============================================================================");
					System.out.println("------->>>>> !!!... Oops You Have Entered Wrong Choice...!!! ----------->>>>>");
					System.out.println("=============================================================================");			
			}
		}
	}
}
