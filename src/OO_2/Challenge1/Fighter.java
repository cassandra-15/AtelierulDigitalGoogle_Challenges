package OO_2.Challenge1;

public class Fighter {
    private String name;
    private Integer heath;
    private Integer damagePerAttack;

    public Fighter(String name, Integer heath, Integer damagePerAttack) {
        this.name = name;
        this.heath = heath;
        this.damagePerAttack = damagePerAttack;
    }

    public String attack(Fighter oponent) {
        if (this.damagePerAttack > oponent.damagePerAttack)
            return this.name;
        else
            return oponent.name;
    }

}
