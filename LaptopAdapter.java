public class LaptopAdapter implements PowerOutlet{
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop){
        this.laptop = laptop;
    }

    @Override 
    public void plugIn(){
        System.out.println("Laptop adapter is plugging in!");
        laptop.charge();
        System.out.println();
    }

}