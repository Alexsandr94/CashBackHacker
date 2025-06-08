package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remain5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remain6() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }
}