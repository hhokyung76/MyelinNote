package com.mediaflow.tips.jedis;

import java.util.List;

import redis.clients.jedis.Jedis;
 
public class JeditTest 
{
    public static void main( String[] args )
    {
    	int count = 0;
        Jedis jedis = new Jedis("192.168.0.44"); 
        
        
//        jedis.auth("foobared");
        List<String> messages = null;

        System.out.println("Waiting for a message in the queue");
        while(true){
          messages = jedis.blpop(0,"queue");
//          System.out.println("Got the message");
//          System.out.println("KEY:" + messages.get(0) + " VALUE:" + messages.get(1));
          String payload = messages.get(1);
          //Do some processing with the payload
          if (count % 1000 == 0)
        	  System.out.println("Message received:" + payload);
          count++;
        }
         
         
    }
}