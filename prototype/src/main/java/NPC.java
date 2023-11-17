public  class NPC implements Copyable{
    String name;
    int healthPoint;
    int strength;
    int science;
    int stamina;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public NPC(String name,int healthPoint, int strength, int science, int stamina) {
       this.name=name;
        this.healthPoint = healthPoint;
        this.strength = strength;
        this.science = science;
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "name='" + name + '\'' +
                ", healthPoint=" + healthPoint +
                ", strength=" + strength +
                ", science=" + science +
                ", stamina=" + stamina +
                '}';
    }

    @Override
    public NPC clone() {
        return new NPC(name,healthPoint, strength, science, stamina) {

        };
    }
}
