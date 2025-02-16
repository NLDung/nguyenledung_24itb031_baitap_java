import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();

        while (true) {
            System.out.println("\nWELCOME TO STUDENT MANAGEMENT");
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            System.out.print("Please select an option (1-5): ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter semester: ");
                    String semester = scanner.nextLine();
                    System.out.print("Enter course name (Java/.Net/C/C++): ");
                    String course = scanner.nextLine();
                    studentManagement.addStudent(id, name, semester, course);
                    break;

                case 2:
                    System.out.print("Enter student ID to find: ");
                    int searchId = scanner.nextInt();
                    Student student = studentManagement.findStudentById(searchId);
                    if (student != null) {
                        System.out.println("Found student: " + student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    studentManagement.sortStudentsByName();
                    System.out.println("Students sorted by name.");
                    break;

                case 3:
                    System.out.print("Enter student ID to update or delete: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Choose action: 1. Update, 2. Delete");
                    int action = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (action == 1) {
                        System.out.print("Enter new student name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new semester: ");
                        String newSemester = scanner.nextLine();
                        System.out.print("Enter new course name: ");
                        String newCourse = scanner.nextLine();
                        boolean updated = studentManagement.updateStudent(updateId, newName, newSemester, newCourse);
                        if (updated) {
                            System.out.println("Student updated successfully.");
                        } else {
                            System.out.println("Student not found.");
                        }
                    } else if (action == 2) {
                        boolean deleted = studentManagement.deleteStudent(updateId);
                        if (deleted) {
                            System.out.println("Student deleted successfully.");
                        } else {
                            System.out.println("Student not found.");
                        }
                    }
                    break;

                case 4:

                    studentManagement.displayReport();
                    break;

                case 5:

                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
