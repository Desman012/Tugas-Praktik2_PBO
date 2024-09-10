package matematika;
public class Matematika implements InterfaceMatematika{
    @Override
    public void pertambahan(int a, int b){
        int total = a+b;
        System.out.println("Pertambahan : "+a+" + "+b+" : "+total);
    }

    @Override
    public void pengurangan(int a, int b) {
        int total = a-b;
        System.out.println("Pengurangan : "+a+"-"+b+" : "+total);
    }

    @Override
    public void perkalian(int a, int b) {
        int total = a*b;
        System.out.println("Perkalian : "+a+"*"+b+" : "+total);
    }

    @Override
    public void pembagian(int a, int b) {
        int total = a/b;
        System.out.println("Pembagian : "+a+"/"+b+" : "+total);
    }
}
