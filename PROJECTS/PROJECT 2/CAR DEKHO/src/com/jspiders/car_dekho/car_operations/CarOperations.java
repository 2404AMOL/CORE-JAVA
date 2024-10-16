package com.jspiders.car_dekho.car_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jspiders.car_dekho.car_entity.CarEntity;

public class CarOperations {

	Scanner scanner = new Scanner(System.in);
	private static List<CarEntity> dbCars = new ArrayList<CarEntity>();
	
	public void addCar()
	{
		System.out.println();
		System.out.print("How Many Cars You Want To add"+"\n===>");
		int car = scanner.nextInt();
		
		for(int i=1;i<=car;i++)
		{
			System.out.println();
			System.out.println("===========================================================================");
			System.out.print("Enter The Car ID"+"\n===>");
			int id = scanner.nextInt();
			System.out.print("Enter The Car Name"+"\n===>");
			String name = scanner.next();
			System.out.print("Enter The Car Brand"+"\n===>");
			String brand = scanner.next();
			System.out.print("Enter The Engine Type"+"\n===>");
			String enginType = scanner.next();
			System.out.print("Enter The Car Price"+"\n===>");
			double price = scanner.nextDouble();
			
			dbCars.add(new CarEntity(id,name,brand,enginType,price));
			
			System.out.println("===========================================================================");
			System.out.println("======== !!!...Car Added Successfully...!!! ============");
			System.out.println("====================================================================");
			System.out.println("=======================>>> CAR DEKHO <<<============================");
			System.out.println("====================================================================");
			System.out.println("Car ID \t"+"Car Name \t"+"Car Brand \t"+"EngineType \t\t"+"Price");
			System.out.println("===========================================================================");
			System.out.println(id+"\t"+name+"\t\t"+brand+"\t"+enginType+"\t\t"+price);	
		}
		System.out.println();
		System.out.println("===========================================================================");
		System.out.println("\t!!!...Information Is Added Successfully...!!!");
		System.out.println("===========================================================================");

		return;
		}
	
		public void availableCars()
		{
			System.out.println("===========================================================================");
			System.out.println(" >>>>>>>>>>>\t	Avaibale Cars	\t<<<<<<<<<<<< ");
			System.out.println("===========================================================================");

			if (dbCars.isEmpty()) {
				System.out.println("----------------------------------------------");
				System.out.println("===>>	Oops Car Not Found..! ");
				System.out.println("----------------------------------------------");
			}
			else {
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("Car ID \t"+"Car Name\t"+"Car Brand \t"+"Car EngineType\t"+"Car Price");
				System.out.println("---------------------------------------------------------------------------");
				
				for (CarEntity carEntity : dbCars) {
					System.out.println(carEntity.getId()+"\t"+carEntity.getName()+"\t\t"+carEntity.getBrand()+"\t\t"+carEntity.getEngineType()+"\t\t"+carEntity.getPrice());
					System.out.println("---------------------------------------------------------------------------");

				}
			}
		}
		
		public void display(ArrayList<CarEntity> carEntity)
		{

			System.out.println("=============================================================================");
			System.out.println("\t\t\t------------Result-----------------\t\t");
			System.out.println("=============================================================================");
			
			for (CarEntity cars : carEntity) {
				System.out.println(cars);
			}
		}
		
		public void searchCarDetails()
		{
			System.out.print("\n1.Search By Id \n2.Search By Name \n3.Search By Brand Name \n4.Search By Engine Type \n5.Go Back To Home"+"\n===>");
			int search = scanner.nextInt();
			
			switch (search) {
			case 1 : {
				System.out.print("Enter The Car ID"+"\n===>");
				int carId = scanner.nextInt();
				
				ArrayList<CarEntity> carEntities1 = new ArrayList<CarEntity>();
				
				for (CarEntity c : dbCars) {
					if (c.getId() == carId) {
						carEntities1.add(c);
					}
				}
				display(carEntities1);
			}
			break;
			
			case 2 : {
				System.out.print("Enter The Car Name"+"\n===>");
				String carName = scanner.next();
				
				ArrayList<CarEntity> carEntities2 = new ArrayList<CarEntity>();
				
				for (CarEntity c : dbCars) {
					if (c.getBrand().equalsIgnoreCase(carName)) {
						carEntities2.add(c);
					}
				}
				display(carEntities2);
			}
			break;
			
			case 3 : {
				System.out.println("Enter The Brand Type"+"\n===>");
				String brandName = scanner.next();
				
				ArrayList<CarEntity> carEntities3 = new ArrayList<CarEntity>();
				
				for (CarEntity c : dbCars) {
					
					if (c.getBrand().equalsIgnoreCase(brandName)) {
						carEntities3.add(c);
					}
				}
				display(carEntities3);
			}

			case 4 : {
				System.out.println("Enter The Car Engine Type"+"\n===>");
				String engineType = scanner.next();
				
				ArrayList<CarEntity> carEntities4 = new ArrayList<CarEntity>();
				
				for (CarEntity c : dbCars) {
					
					if (c.getBrand().equalsIgnoreCase(engineType)) {
						carEntities4.add(c);
					}
				}
				display(carEntities4);
			}
			break;
			
			case 5 : {
				return;
			}
			default :
				System.out.println("=============================================================================");
				System.out.println("------->>>>> !!!... Please Enter Valid Choice ...!!! ----------->>>>>");
				System.out.println("=============================================================================");			
		}
	}
		
	public void updateCar()
	{
		System.out.println("**********************************************************************");
		System.out.print("************************* What You Want to update *********************"
				+"\n***********************************************************************"
				+ "\n1.Car Id \n2.car Name \n3.Car Brand \n4.Car Enginetype \n5.Car Price \n6.Go Back To Main Menu \n\nPlease Enter Your Choice \n===>>");

		int update = scanner.nextInt();
		
		switch (update) {
		case 1 : {
			System.out.print("Please Enter The New Car Id"+"\n===>");
			int newCarId = scanner.nextInt();
			
			for (CarEntity c : dbCars) {

				c.setId(newCarId);
				System.out.println("*************************************************************");
				System.out.println("@@@@@@@@@@@@@@@@ Car Id Successfully Updated @@@@@@@@@@@@@@@@");
				System.out.println("**************************************************************");			}
		}	
		break;
		
		case 2 : {
			System.out.print("Please Enter The New Car Name"+"\n===>");
			String newCarName = scanner.next();
			
			for (CarEntity c : dbCars) {
				c.setName(newCarName);
				System.out.println("*************************************************************");
				System.out.println("@@@@@@@@@@@@@@@@ Car Name Successfully Updated @@@@@@@@@@@@@@@@");
				System.out.println("**************************************************************");
			}
		}
		break;
		
		case 3 : {
			System.out.print("Please Enter The New Brand Type"+"\n===>");
			String newBrandName = scanner.next();
			
			for (CarEntity c : dbCars) {
				c.setBrand(newBrandName);
				System.out.println("*************************************************************");
				System.out.println("@@@@@@@@@@@@@@@@ Car Brand Successfully Updated @@@@@@@@@@@@@@@@");
				System.out.println("**************************************************************");	
			}
		}
		break;
		
		case 4 : {
			System.out.print("Please Enter The New Engine Type"+"\n===>");
			String newEngineType = scanner.next();
			
			for (CarEntity c : dbCars) {
				c.setEngineType(newEngineType);
				System.out.println("*************************************************************");
				System.out.println("@@@@@@@@@@@@@@@@ Car EngineType Successfully Updated @@@@@@@@@@@@@@@@");
				System.out.println("**************************************************************");
			}
		}
		break;
		
		case 5 : {
			System.out.print("Please Enter The New Price Of Car"+"\n===>");
			double newPrice = scanner.nextDouble();
			
			for (CarEntity c : dbCars) {
				c.setPrice(newPrice);
				System.out.println("*************************************************************");
				System.out.println("@@@@@@@@@@@@@@@@ Car Price Is Successfully Updated @@@@@@@@@@@@@@@@");
				System.out.println("**************************************************************");

			}
		}
		
		case 6 : {
			return;
		}
		default:
			System.out.println("=============================================================================");
			System.out.println("------->>>>> !!!... Please Enter Valid Choice ...!!! ----------->>>>>");
			System.out.println("=============================================================================");
		}
	}
	
	public void remove()
	{
		if (dbCars.isEmpty()) {
			System.out.println("Cars Not Avaibales..!");
		}
		else {
			this.availableCars();
			
			System.out.print("Enter The Car ID To Delete The Car Details"+"\n===>");
			int carId = scanner.nextInt();
			
			for (CarEntity c : dbCars) {
				
				if (c.getId() == carId) {
					dbCars.remove(c);
					System.out.println("=============================================================");
					System.out.println(">>>>>>>>>>>>>>	!!!...Car Details Deleted ...!!!");
					System.out.println("=============================================================");
					break;
				}
				else {
					System.out.println("Car Details not Found..!");		
				}
			}
		}
	}
		
}
