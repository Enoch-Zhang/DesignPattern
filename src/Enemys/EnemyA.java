package Enemys;

public class EnemyA extends Enemy{

    public EnemyA(){
        this.Enemyname="�����ӵ�";
        this.atk=100;
        this.def=30;
        this.hp=300;
        this.mp=300;
    }

    @Override
    public int Attack() {
        return this.atk;
    }

    @Override
    public EnemyA clone(){
        EnemyA o = null;
        try {
             o = (EnemyA) super.clone();
        } catch (CloneNotSupportedException e) {
             System.out.println(e.toString());
        }
        return o;
    }

    @Override
    public void useAtk() {
        System.out.println(this.Enemyname + "��������ͨ����");
    }

    @Override
    public String toString() {
        return "��������:" + Enemyname +
                ",hp=" + hp +
                ", mp=" + mp +
                ", atk=" + atk +
                ", def=" + def ;

    }

    public static void main(String args[]){
        EnemyA a=new EnemyA();
        a.useAtk();
//        System.out.println(a.useAtk());

    }


}