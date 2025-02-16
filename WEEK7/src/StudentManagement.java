import java.util.*;

public class StudentManagement {
    private ArrayList<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudent(int id, String studentName, String semester, String courseName) {
        Student student = new Student(id, studentName, semester, courseName);
        students.add(student);
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    public void sortStudentsByName() {
        students.sort(Comparator.comparing(Student::getStudentName));
    }
    public boolean updateStudent(int id, String studentName, String semester, String courseName) {
        Student student = findStudentById(id);
        if (student != null) {
            student.setStudentName(studentName);
            student.setSemester(semester);
            student.setCourseName(courseName);
            return true;
        }
        return false;
    }

    public boolean deleteStudent(int id) {
        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }

    public void displayReport() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
