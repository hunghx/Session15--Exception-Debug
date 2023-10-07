import ra.model.Student;

public class TestDebug {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[1] = new Student(1,"Hồ Xuân Hùng");
        students[2] = new Student(2,"Đào Hoàng Hải");
        students[3] = new Student(3,"Lê Minh Tâm");
        students[4] = new Student(4,"Hà NGuyễn Minh Đức");

        // hiển thị danh sách sinh vieen

        display(students);

    }

   public static void display(Student[] students){
       for (Student s:students
       ) {
           if (s==null)continue;
           System.out.println("Tên sinh viên: "+s.getName() + " |Mã sinh viên : "+s.getId() );
       }
   }
}
