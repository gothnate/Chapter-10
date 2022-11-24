import java.util.*;
public class UseCourse
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String dept;
      String[] labCourses = {"BIO", "CHM", "CIS", "PHY"};
      int id, credits;
      int found = 0;
      int i;

      // your code here
      System.out.print("Enter Department: ");
      dept = input.nextLine().toUpperCase();
      System.out.print("Enter ID: ");
      id = input.nextInt();
      System.out.print("Enter Credits: ");
      credits = input.nextInt();
      input.close();
      for (i = 0; i < labCourses.length; i++) {
          if (dept.equalsIgnoreCase(labCourses[i])) {
              found = 1;
              break;
          }
      }

      if (found == 1) {
          LabCourse labCourse = new LabCourse(dept, id, credits);
          labCourse.display();
      } else {
          CollegeCourse collegeCourse = new CollegeCourse(dept, id, credits);
          collegeCourse.display();
      }
   }
}