public class Student {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Study study = new StudentFactory().createStudent(TypeStudent.ONE);
            study.learn(1);
        }
        for (int i = 0; i < 3; i++) {
            Study study = new StudentFactory().createStudent(TypeStudent.TWO);
            study.learn(0.5);
        }
        for (int i = 0; i < 3; i++) {
            Study study = new StudentFactory().createStudent(TypeStudent.THREE);
            study.learn(0.1);
        }
    }
}
