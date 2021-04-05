public class StudentFactory {
    public  Study createStudent(TypeStudent typeStudent) {
        Study study = null;
        switch (typeStudent) {
            case ONE:
                study = new StudentTypeOne();
                break;
            case TWO:
                study = new StudentTypeTwo();
                break;
            case THREE:
                study = new StudentTypeThree();
                break;

        }
        return study;
    }
}