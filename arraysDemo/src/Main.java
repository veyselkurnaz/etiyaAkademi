public class Main {
    public static void main(String[] args) {
        String student1 = "Veysel";
        String student2 = "Özlem";
        String student3 = "Ertuğrul";
        String student4 = "Eslem";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("--------------------------------------------");

        String[] students = new String[4];
        students[0]="Veysel";
        students[1]="Özlem";
        students[2]="Ertuğrul";
        students[3]="Eslem";

        for (int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        System.out.println("--------------------------------------------");

        for (String student:students){
            System.out.println(student);
        }

    }
}