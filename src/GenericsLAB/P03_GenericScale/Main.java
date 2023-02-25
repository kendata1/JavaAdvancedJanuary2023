package src.GenericsLAB.P03_GenericScale;

public class Main {
    public static void main(String[] args) {

        Scale scale = new Scale<String>("a","w");

        System.out.println(scale.getHeavier());
    }
}
