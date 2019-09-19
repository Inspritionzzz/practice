package com.bupt.thinkinjava.c6;

//import java.sql.Connection;

import static com.bupt.utils.Print.print;

//定义自己的Connection类；
class Connection{

    private static int count=0;
    //private static int id=++count;
    //private final int id=count++;
    private int id=count++;
    Connection(){

    }

    public String toString() {
        //return super.toString();
        return "Connection"+id+"  "+count;
    }
    public  void doSomething(){

    }

    public String getCount(){

        return "Connection"+count;
    }
    public String getId(){
        return "Id"+id;
    }
}

class ConnectionManager{
    Connection connection;
    private static Connection[] pool=new Connection[10];
    private static int counter=0;
    //初始化；
    static {
        for(int i=0;i<pool.length;i++){
            pool[i]=new Connection();
        }
    }

    private ConnectionManager(){
        print("...");
    }

    public static Connection getConnection(){
        if(counter<pool.length)
            return pool[counter++];
        return null;
    }
}
public class P8 {
    public static void main(String[] args) {
        //ConnectionManager connectionManager=new ConnectionManager();
        //connectionManager.getConnection();
        Connection c = ConnectionManager.getConnection();
        System.out.println(c.getCount()+"  "+c.getId());
        while (c != null) {
            System.out.println(c);
            //c.doSomething();
            c = ConnectionManager.getConnection();
        }
    }
}
