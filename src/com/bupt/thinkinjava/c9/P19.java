package com.bupt.thinkinjava.c9;

import java.util.Random;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

/**
 * 工厂模式创建框架:模拟抛硬币和掷筛子；
 */
interface Game{
    int play();
}
interface GameFactory{
    Game getGame();
}
class Game1 implements Game{
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
}
class Game1Factory implements GameFactory{
    @Override
    public Game getGame() {
        return new Game1();
    }
}
class Game2 implements Game{
    Random random=new Random();
    @Override
    public int play() {
        int i=random.nextInt(6)+1;
        return i;
    }
}
class Game2Factory implements GameFactory{
    @Override
    public Game getGame() {
        return new Game2();
    }
}
public class P19 {
    public static void playGame(GameFactory gameFactory){
        Game game=gameFactory.getGame();
        System.out.println(game.play());
    }
    public static void main(String[] args) {
        printnb("抛硬币结果： ");
        P19.playGame(new Game1Factory());
        print("掷骰子结果：  ");
        P19.playGame(new Game2Factory());
    }
}
