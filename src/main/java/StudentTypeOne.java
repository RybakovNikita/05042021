public class StudentTypeOne implements Study {
    @Override
    public double learn (double talant){
        System.out.println("Стедунтку №1 понадобится "+ 22/talant/3 +"часов");
        return  22/talant/3;
    }
}
