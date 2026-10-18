class P52_Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudents;

    P52_Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        P52_Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName) {
        System.out.println("Student removed");
        enrollments--;
    }

}
