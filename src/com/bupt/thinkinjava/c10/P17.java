package com.bupt.thinkinjava.c10;

import java.util.Random;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

/**
 * 工厂模式创建框架:模拟抛硬币和掷筛子；
 * 使用匿名内部类的方式重写；
 *
 */
interface Game{
    int play();
}

interface GameFactory{
    Game getGame();
}

class Game1 implements Game {
    Random random=new Random();
    @Override
    public int play() {
        int i=random.nextInt();
        if(i%2==0){

            return 0;
        }else {
            return 1;
        }
    }

    public static GameFactory gameFactory=new GameFactory() {
        @Override
        public Game getGame() {
            return new Game1();
        }
    };
}
//class Game1Factory implements GameFactory {
//    @Override
//    public Game getGame() {
//        return new Game1();
//    }
//}

class Game2 implements Game {
    Random random=new Random();
    @Override
    public int play() {
        int i=random.nextInt(6)+1;
        return i;
    }

    public static GameFactory gameFactory=new GameFactory() {
        @Override
        public Game getGame() {
            return new Game2();
        }
    };
}

//class Game2Factory implements GameFactory {
//    @Override
//    public Game getGame() {
//        return new Game2();
//    }
//}

public class P17 {
    public static void playGame(GameFactory gameFactory){
        Game game=gameFactory.getGame();
        System.out.println(game.play());
    }
    public static void main(String[] args) {
        printnb("抛硬币结果： ");
        P17.playGame(Game1.gameFactory);
        printnb("掷骰子结果： ");
        P17.playGame(Game2.gameFactory);
    }
}
