public class LessonWithRental extends Rental {
    private boolean lessonRequired;

    public static final String INSTRUCTORS[] = { "Dan", "Anna", "Bob", "Jessica", "Alice", "Tony", "Nate", "Kara" };

    public LessonWithRental(String eventNum, int minutes, int equipmentType) {
        super(eventNum, minutes);
        setEquipmentType(equipmentType);
        if (equipmentType == 0 || equipmentType == 1) {
            lessonRequired = true;
        } else {
            lessonRequired = false;
        }
    }

    public String getInstructor() {
        String message = "A lesson when renting a " + getEquipmentName(getEquipmentType()) + " is ";
        if (!lessonRequired) {
            message += "not ";
        }
        message += "required. The instructor is " + INSTRUCTORS[getEquipmentType()] + ".";
        return message;
    }
}