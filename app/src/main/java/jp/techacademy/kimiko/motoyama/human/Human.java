package jp.techacademy.kimiko.motoyama.human;

import android.util.Log;

/**
 * Created by kimiko on 2018/01/30.
 */

public class Human extends Animal implements Thinkable {
    String hobby;

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public void say() {
        Log.d("say", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("hobby", "私は" + this.hobby + "について考える");
    }
}
