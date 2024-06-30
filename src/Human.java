public class Human extends LivingThings{
    Human(BreathImplemenetor breathImplemenetor){
        super(breathImplemenetor);
    }
    public void breathe(){
        breatheObj.breath();
    }
}
