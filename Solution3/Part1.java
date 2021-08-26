interface LaptopBrand{
    public void displayBrand();
}

interface LaptopRam{
    public void displayRam();
}

class Laptop implements LaptopBrand, LaptopRam{
    public void displayBrand(){
        System.out.println("The brand of laptop is Dell");
    }

    public void displayRam(){
        System.out.println("This laptop has 8 gb RAM");
    }
}

public class Part1 {
    public static void main(String[] args){
        Laptop laptop = new Laptop();
        laptop.displayBrand();
        laptop.displayRam();
    }
}
