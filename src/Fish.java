public class Fish extends LivingThings{
    Fish(BreathImplemenetor breathImplemenetor){
        super(breathImplemenetor);
    }
    public void breathe(){
        breatheObj.breath();
    }
}
