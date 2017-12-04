package jp.ac.uryukyu.ie.e175719;

public class Hero extends LivingThing {


    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }


    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     * hp = hitPoint
     * na = name
     * de = dead
     */

    @Override
    public void wounded(int damage){
        int hp = getHitPoint();
        String na = getName();
        boolean de = getDead();
        hp -= damage;
        setHitPoint(hp);
        if( hp < 0 ) {
            de = true;
            setDead(de);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", na);
        }
    }
}