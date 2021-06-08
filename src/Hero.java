public class Hero {
    //これらはフィールド
    String name; //名前
    int hp; //体力

    void attack() {

    }

    void run() {
        System.out.println(this.name + "は、逃げ出した");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }

    void sit(int sec) {
        this.hp += sec; //座る秒数だけ回復
        System.out.println(this.name + "は、" + sec + "秒座った");
        System.out.println("HPが" + sec + "ポイント回復した");
    }

    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ");
        System.out.println("5のダメージ");
    }

    void sleep() {
        this.hp = 100;
        //thisは自分自身のインスタンスを指している。フィールドを用いるときはthisをつけよう
        System.out.println(this.name + "は、眠って回復した！");
    }
}
