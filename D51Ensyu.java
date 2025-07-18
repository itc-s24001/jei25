public class D51Ensyu {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("学籍番号と名前を入力してください");
            return;
        }

        D51Student student = new D51Student(args[0], args[1]);

        System.out.println("学籍番号: " + student.getStudentId());
        System.out.println("氏名: " + student.getName());
    }
}

class D51Student {
    private String studentId;
    private String name;

    public D51Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
}
