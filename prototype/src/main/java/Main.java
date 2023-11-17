public class Main {
    public static void main(String[] args) {
        NPC npc=new NPC("oleg",10,10,101,10);
        NPC npc1= (NPC) npc.clone();
        System.out.println(npc1.toString());
        System.out.println(npc.toString());

    }
}
