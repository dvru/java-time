public class FlourPacker {


    public static boolean canPack(int bigCount, int smallCount, int goal)
    {

        //Negative Cases
        //1. If any negative return false
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        //2. If maximum KG available from bags is less then goal return false
        int BIGKG = 5;
        int SMALLKG = 1;
        int maxKg = (bigCount * BIGKG) + (smallCount * SMALLKG); //maxKg = 5
        if(goal > maxKg){//5 > 5 //false
            return false;
        }

        //3. If bigCount == 0 then goal must be lesser then or equal to smallCount*SMALL KG
        if (bigCount == 0){
            return (goal - (smallCount* SMALLKG)) <= 0;
        }


        int remainingGoal = goal; // 5

        while(remainingGoal >= BIGKG && bigCount > 0){ //remainingGoal = 0, bigCount = 0
            remainingGoal -= BIGKG;//0
            bigCount--;//0
        }

        return remainingGoal - smallCount* SMALLKG <= 0;
    }
}
