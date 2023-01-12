package OO_2.Challenge1;

public class BoxingMatch {
    //    public BoxingMatch(String name, String heath, Integer damagePerAttack) {
//        super(name, heath, damagePerAttack);
//    }
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Emy", 12, 145);
        Fighter f2 = new Fighter("Danniel", 15, 105);
        System.out.println("Winner: " + fight(f1, f2));
    }

    public static String fight(Fighter player1, Fighter player2) {
        return player1.attack(player2);
    }
}
