public class SmartphoneAdapter implements PowerOutlet{
    private SmartphoneCharger smarthphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smarthphoneCharger){
        this.smarthphoneCharger = smarthphoneCharger;
    }

    @Override 
    public void plugIn(){
        System.out.println("Smartphone Charger adapter is plugging in!");
        smarthphoneCharger.chargePhone();
        System.out.println();
    }


}