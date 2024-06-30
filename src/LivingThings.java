public abstract class LivingThings {

        BreathImplemenetor breatheObj;
        LivingThings(BreathImplemenetor breatheObj){
            this.breatheObj=breatheObj;
        }
        public void breathe(BreathImplemenetor breatheObj){
            breatheObj.breath();
        }

}
