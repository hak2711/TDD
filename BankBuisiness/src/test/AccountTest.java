package test;

import main.Account;
import org.junit.Test;

import static org.junit.Assert.fail;

public class AccountTest {
    @Test
    public void testAccount() throws Exception {
        Account account = new Account(10000);
    }

    @Test
    public void testGetBalance() throws Exception{
        Account account = new Account(10000);
        if(account.getBalance() != 10000){
            fail("Error occurred");
        }

        account = new Account(1000);
        if(account.getBalance() != 1000){
            fail("Error occurred");
        }

        account = new Account(0);
        if(account.getBalance() != 0) {
            fail("Error occurred");
        }
    }
}
