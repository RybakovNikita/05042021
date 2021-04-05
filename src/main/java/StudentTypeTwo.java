public class StudentTypeTwo implements Study {
    @Override
    public double learn (double talant){
        System.out.println("Стедунтку №2 понадобится "+ 22/talant*2 +"часов");
        return  22/talant*2;
    }
}
