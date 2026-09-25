public class RefrigeratorAdapter implements PowerOutlet{
    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator){
        this.refrigerator = refrigerator;
    }

    @Override 
    public void plugIn(){
        System.out.println("Refrigerator adapter is plugging in!");
        refrigerator.startCooling();
        System.out.println();
    }

}