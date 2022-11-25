package com.isep.rpg;

public abstract class Combatant {

    public Combatant(String n, int h, int a) {
        name = n;
        healthPoint = h;
        attackPoint = a;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
    public int getAttackPoint(){ return attackPoint;}

    public void loose(int hp) {
        healthPoint -= hp;
        // ... équivalant à : healthPoint = healthPoint - hp;
    }
    // Chaque "vrai" combatant (non "abstract") implémente un code différent
    // pour la méthode "fight"
    public  void fight(Combatant combatant){
        if(combatant.getHealthPoint() > this.getHealthPoint()){
            combatant.win();
            this.loose(combatant.getAttackPoint());
        }
        if (combatant.getHealthPoint() == this.getHealthPoint()) {
            combatant.loose(this.getAttackPoint());
            this.loose(combatant.getAttackPoint());
        }
        else{
            combatant.loose(this.getAttackPoint());
            this.win();
        }
    };
    public boolean isAlive(){
        if (getHealthPoint() > 0)
            return true;
        else return false;
    }
    public void win(){
        healthPoint += 1;
    }
    private String name;
    private int healthPoint;
    private int attackPoint;

}
