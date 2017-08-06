package org.zyz.rest;

/**
 * Created by fin_tech_2014 on 2017/5/18.
 */
public enum SingletonEnum {
    INSTANCE;

    SingletonEnum() {
        System.err.println("construct");
    }

    public void say(String arg) {
        System.err.println("say:" + arg + ":" + this.hashCode());
    }
}

class Singleton {

    private Singleton() {
    }

    private static class Instance {
        public static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return Instance.instance;
    }

    public void say(String arg) {
        System.err.println("say:" + arg + ":" + this.hashCode());
    }
}


//class Test {
//    public static void main(String[] args) {
//        Singleton.getInstance().say("hadoop");
//        Singleton.getInstance().say("pig");
//
//        SingletonEnum.INSTANCE.say("hadoop");
//        SingletonEnum.INSTANCE.say("pig");
//    }
//}