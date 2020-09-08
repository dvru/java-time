public class Main {

    public static void main(String[] args){
//        Player player = new Player();
//        player.fullName = "Kim Hu";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println(player.fullName + " has a remaining health of = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println(player.fullName + " has a remaining health of = " + player.healthRemaining());




        EnhancedPlayer player = new EnhancedPlayer("Beth", 200, "Sword");
        System.out.println("Initial Health is " + player.getHealth());
    }
}
