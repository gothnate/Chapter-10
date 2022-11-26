import java.util.Scanner;
public class DinnerEventDemo {
    public static void main(String[] args) {
        displayMotto();
        eventTypeMenu();
        int option, guests, entree, side1, side2, dessert;
        String eventNum;
        DinnerEvent dinnerEvents[] = new DinnerEvent[2];
        for (int i = 0; i < dinnerEvents.length; i++) {
            eventNum = getEventNumber();
            guests = getGuests();
            entree = getEntree();
            side1 = getSides();
            side2 = getSides();
            dessert = getDessert();

            dinnerEvents[i] = new DinnerEvent(eventNum, guests, entree, side1, side2, dessert);
            dinnerEvents[i].setContactPhoneNumber(getContactPhone());
            dinnerEvents[i].setEventType(getEventType());
        }
        option = getOption();
        while (option >= 1 && option <= 4) {
            if (option == 4) {
                System.exit(0);
            }
            if (option == 1) {
                sortByEventNumber(dinnerEvents);
            }
            if (option == 2) {
                sortByGuests(dinnerEvents);
            }
            if (option == 3) {
                sortByType(dinnerEvents);
            }
            //NOTE:  only used for single DinnerEvent
            //for (int i = 0; i < dinnerEvents.length; i++) {
            //    displayDetails(dinnerEvents[i]);
            //}
            option = getOption();
        }
    }
    private static void sortByType(DinnerEvent[] dinnerEvents) {
        int a;
        int b;
        DinnerEvent temp;
        int lena = dinnerEvents.length;
        int lenb = dinnerEvents.length - 1;
        for (a = 0; a < lenb; a++) {
           for (b = 0; b < lenb; b++) {
              if (dinnerEvents[b].getEventType() > dinnerEvents[b + 1].getEventType()) {
                 temp = dinnerEvents[b];
                 dinnerEvents[b] = dinnerEvents[b + 1];
                 dinnerEvents[b + 1] = temp;
              }
           }
           for (a = 0; a < lena; a++) {
              displayDetails(dinnerEvents[a]);
           }
        }
    }
    private static void sortByEventNumber(DinnerEvent[] dinnerEvents) {
        int a;
        int b;
        DinnerEvent temp;
        String stringb;
        String stringbPlus;
        int len = dinnerEvents.length - 1;
        for (a = 0; a < len; a++) {
           for (b = 0; b < len; b++) {
              stringb = dinnerEvents[b].getEventNumber();
              stringbPlus = dinnerEvents[b + 1].getEventNumber();
              if (stringb.compareTo(stringbPlus) > 0) {
                 temp = dinnerEvents[b];
                 dinnerEvents[b] = dinnerEvents[b + 1];
                 dinnerEvents[b + 1] = temp;
              }
           }
           for (a = 0; a < dinnerEvents.length; a++) {
              displayDetails(dinnerEvents[a]);
           }
        }
    }
    private static int getOption() {
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("------------------------------Sort by---------------------------------");
        System.out.println("| 1: Event Number || 2: Number of Guests || 3: Event Type || 4: Quit |");
        option = input.nextInt();
        return option;
    }
    private static void sortByGuests(DinnerEvent[] dinnerEvents) {
        int a;
        int b;
        DinnerEvent temp;
        int lena = dinnerEvents.length;
        int lenb = dinnerEvents.length - 1;
        for (a = 0; a < lenb; a++) {
           for (b = 0; b < lenb; b++) {
              if (dinnerEvents[b].getGuests() > dinnerEvents[b + 1].getGuests()) {
                 temp = dinnerEvents[b];
                 dinnerEvents[b] = dinnerEvents[b + 1];
                 dinnerEvents[b + 1] = temp;
              }
           }
           for (a = 0; a < lena; a++) {
              displayDetails(dinnerEvents[a]);
           }
        }
    }
    public static String getEventNumber() {
        String num;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter event number >> ");
        num = input.nextLine();
        return num;
    }
    public static int getGuests() {
        int guests;
        Scanner input = new Scanner(System.in);
        do {
           System.out.print("Enter number of guests >> ");
           guests = input.nextInt();
           input.nextLine();
        } while (guests < 5 || guests > 100);
        return guests;
    }
    public static String getContactPhone() {
        String phone;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your phone number >> ");
        phone = input.nextLine();
        return phone;
    }
    private static int getEventType() {
        int eventType;
        Scanner input = new Scanner(System.in);
        System.out.print("Event Type >> ");
        eventType = input.nextInt();
        System.out.println();
        return eventType;
    }
    public static int getEntree() {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("--Entree Choices-- ");
        for (int i = 0; i < DinnerEvent.ENTREES.length; i++) {
            System.out.print("| " + i + ": " + DinnerEvent.ENTREES[i] + " |");
        }
        System.out.println();
        System.out.print("Entree Selection >> ");
        num = input.nextInt();
        return num;
    }
    public static int getSides() {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("--Side Choices--");
        for (int i = 0; i < DinnerEvent.SIDES.length; i++) {
            System.out.print("| " + i + ": " + DinnerEvent.SIDES[i] + " |");
        }
        System.out.println();
        System.out.print("Side Selection >> ");
        num = input.nextInt();
        System.out.println();
        return num;
    }
    public static int getDessert() {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("--Dessert Choices-- ");
        for (int i = 0; i < DinnerEvent.DESSERTS.length; i++) {
            System.out.print("| " + i + ": " + DinnerEvent.DESSERTS[i] + " |");
        }
        System.out.println();
        System.out.print("Dessert Selection >> ");
        num = input.nextInt();
        System.out.println();
        return num;
    }

    public static void displayDetails(DinnerEvent dinnerEvents) {
        System.out.println();
        System.out.println("--EVENT DETAILS--");
        System.out.println("Event number is: " + dinnerEvents.getEventNumber());
        System.out.println("Number of guests is: " + dinnerEvents.getNumberOfGuests());
        System.out.println("Phone number is:  " + dinnerEvents.getContactPhone());
        System.out.println("The event type is: " + dinnerEvents.getEventName(dinnerEvents.getEventType() - 1));
        System.out.println("The price per guest is $" + dinnerEvents.getPricePerGuest());
        System.out.println("The total cost is: $" + dinnerEvents.getPriceForEvent());
        System.out.println(dinnerEvents.getMenu());
        System.out.println();
    }
    public static void displayMotto() {
        System.out.println("***********************************************************************");
        System.out.println("*                                                                     *");
        System.out.println("************ Carly's makes the food that makes it a party *************");
        System.out.println("*                                                                     *");
        System.out.println("***********************************************************************");
    }
    public static void eventTypeMenu() {
        System.out.println("----------------------------EVENT TYPE MENU----------------------------");
        System.out.println("| 1: Wedding || 2: Baptism || 3: Birthday || 4: Corporate || 5: Other |");
    }
}
