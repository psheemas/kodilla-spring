package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategy(){
        //Given
        User michal = new Millenials("Michal Jantar");
        User pawel = new YGeneration("Pawel Ziendal");
        User piotr = new ZGeneration("Piotr Klucha");

        //When
        String michalSays = michal.sharePost();
        System.out.println("Michal is saying: " + michalSays);
        String pawelSays = pawel.sharePost();
        System.out.println("Pawel is saying: " + pawelSays);
        String piotrSays = piotr.sharePost();
        System.out.println("Piotr is saying: " + piotrSays);

        //Then
        Assert.assertEquals("I'm using Facebook", michalSays);
        Assert.assertEquals("I'm using Twitter", pawelSays);
        Assert.assertEquals("I'm using Snapchat", piotrSays);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User michal = new Millenials("Michal Jantar");

        //When
        String michalSays = michal.sharePost();
        System.out.println("Michal is saying: " + michalSays);
        michal.changeUMind(new TwitterPublisher());
        michalSays = michal.sharePost();
        System.out.println("Michal is now saying: " + michalSays);

        //Then
        Assert.assertEquals("I'm using Twitter", michalSays);
    }
}
