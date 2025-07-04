package ex_17_OOPs.Inheritance.Multilevel;

public class Inheritance2 {
    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.setName("Him");
        developer.setEmpID(5434);
        developer.setDomain("QA");

        System.out.println(developer.getName());
        System.out.println(developer.getDomain());
        System.out.println(developer.getEmpID());
        System.out.println(developer.getSalary());

    }
}
