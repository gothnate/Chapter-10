import java.util.Scanner;
public class LessonWithRentalDemo {
    public static void main(String[] args) {
        displayMotto();
        equipmentTypeMenu();
        int option, equipmentType, minutes;
        String contractNumber;
        LessonWithRental rentals[] = new LessonWithRental[4];
        for (int i = 0; i < rentals.length; i++) {
            contractNumber = getContractNumber();
            minutes = getMinutes();
            equipmentType = getEquipmentType();
            rentals[i] = new LessonWithRental(contractNumber, minutes, equipmentType);
            rentals[i].setContactPhoneNumber(getContactPhone());
        }

        do {
           System.out.println("Display Rental:");
           option = getOption();
           if (option == 1) {
              sortByContractNumber(rentals);
           }
           if (option == 2) {
              sortByPrice(rentals);
           }
           if (option == 3) {
              sortByEquipmentType(rentals);
           }
        } while (option != 4);
     }

     private static void sortByEquipmentType(LessonWithRental[] rentals) {
        int a;
        int b;
        LessonWithRental temp;
        int lena = rentals.length;
        int lenb = rentals.length - 1;

        for (a = 0; a < lenb; a++) {
           for (b = 0; b < lenb; b++) {
              if (rentals[b].getEquipmentType() > rentals[b + 1].getEquipmentType()) {
                 temp = rentals[b];
                 rentals[b] = rentals[b + 1];
                 rentals[b + 1] = temp;
              }
           }
           for (a = 0; a < lena; a++) {
              displayDetails(rentals[a]);
           }
        }
     }

     private static void sortByContractNumber(LessonWithRental[] rentals) {
        int a;
        int b;
        LessonWithRental temp;
        String stringb;
        String stringbPlus;
        int len = rentals.length - 1;

        for (a = 0; a < len; a++) {
           for (b = 0; b < len; b++) {
              stringb = rentals[b].getContractNumber();
              stringbPlus = rentals[b + 1].getContractNumber();
              if (stringb.compareTo(stringbPlus) > 0) {
                 temp = rentals[b];
                 rentals[b] = rentals[b + 1];
                 rentals[b + 1] = temp;
              }
           }
           for (a = 0; a < rentals.length; a++) {
              displayDetails(rentals[a]);
           }
        }
     }

     private static int getOption() {
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("--------------------------Sort by--------------------------");
        System.out.println("1: Contract Number | 2: Price | 3: Equipment Type | 4: Quit");
        option = input.nextInt();
        return option;
     }

     private static void sortByPrice(LessonWithRental[] rentals) {
        int a;
        int b;
        LessonWithRental temp;
        int lena = rentals.length;
        int lenb = rentals.length - 1;

        for (a = 0; a < lenb; a++) {
           for (b = 0; b < lenb; b++) {
              if (rentals[b].getPrice() > rentals[b + 1].getPrice()) {
                 temp = rentals[b];
                 rentals[b] = rentals[b + 1];
                 rentals[b + 1] = temp;
              }
           }
           for (a = 0; a < lena; a++) {
              displayDetails(rentals[a]);
           }
        }
     }

     public static String getContractNumber() {
        String num;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter contract number >> ");
        num = input.nextLine();
        return num;
     }

     public static int getMinutes() {
        int minutes;
        Scanner input = new Scanner(System.in);
        do {
           System.out.print("Enter minutes >> ");
           minutes = input.nextInt();
           input.nextLine();
        } while (minutes > 7200 || minutes < 60);
        return minutes;
     }

     public static String getContactPhone() {
        String phone;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your phone number >> ");
        phone = input.nextLine();
        return phone;
     }

     private static int getEquipmentType() {
         int equipmentType;
         Scanner input = new Scanner(System.in);
         System.out.print("Equipment Type >> ");
         equipmentType = input.nextInt();
         return equipmentType;
     }

     public static LessonWithRental getLongLessonWithRental(LessonWithRental r1, LessonWithRental r2) {
         LessonWithRental longer = new LessonWithRental("X", 0, 0);
         int minutes1;
         int minutes2;
         minutes1 = r1.getHours() * Rental.MINUTES_IN_HOUR + r1.getExtraMinutes();
         minutes2 = r2.getHours() * Rental.MINUTES_IN_HOUR + r2.getExtraMinutes();
         if (minutes1 >= minutes2) {
             longer = r1;
         } else {
             longer = r2;
         }
         return longer;
     }

     public static void displayDetails(LessonWithRental r) {
        System.out.println();
        System.out.println("--Rental Details--");
        System.out.println("Contract Number: " + r.getContractNumber());
        System.out.println("Rental Hours: " + r.getHours() + " hours and " + r.getExtraMinutes() + " minutes");
        System.out.println("Phone Number: " + r.getContactPhone());
        System.out.println("Equipment Type: " + r.getEquipmentName(r.getEquipmentType() - 1));
        System.out.println("Rental Rate: " + r.HOUR_RATE);
        System.out.println("Total Price: $" + r.getPrice());
        System.out.println(r.getInstructor());
        System.out.println();
     }

     public static void displayMotto() {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S                                                                                                                   S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS Sammy's makes it fun in the sun SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S                                                                                                                   S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
     }

     public static void equipmentTypeMenu() {
        System.out.println("--------------------------------------------EQUIPMENT TYPE MENU------------------------------------------------------");
        System.out.println("1: Personal Watercraft | 2: Pontoon Boat | 3: Rowboat | 4: Canoe | 5: Kayak | 6: Beach Chair | 7: Umbrella | 8: Other");
     }
}
