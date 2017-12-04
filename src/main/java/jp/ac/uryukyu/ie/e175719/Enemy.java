package jp.ac.uryukyu.ie.e175719;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
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
            System.out.printf("モンスター%sは倒れた。\n", na);
        }
    }

}
