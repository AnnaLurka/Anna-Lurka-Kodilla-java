package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User ania = new ZGeneration("Anna Katarzyna");
        User basia = new YGeneration("Barbara Genowefa");
        User cesia = new Millenials("Czesława Halina");
        //When
        String result1 = ania.sharePost();
        String result2 = basia.sharePost();
        String result3 = cesia.sharePost();
        //Then
        Assert.assertEquals("I'm using Snapchat.", result1);
        Assert.assertEquals("I'm using Twitter.", result2);
        Assert.assertEquals("I'm using Facebook.", result3);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User ania = new ZGeneration("Anna Katarzyna");
        User basia = new YGeneration("Barbara Genowefa");
        User cesia = new Millenials("Czesława Halina");
        //When
        ania.setSharingMedia(new TwitterPublisher());
        basia.setSharingMedia(new FacebookPublisher());
        cesia.setSharingMedia(new SnapchatPublisher());
        String result4 = ania.sharePost();
        String result5= basia.sharePost();
        String result6 = cesia.sharePost();
        //Then
        Assert.assertEquals("I'm using Twitter.", result4);
        Assert.assertEquals("I'm using Facebook.", result5);
        Assert.assertEquals("I'm using Snapchat.", result6);
    }
}
