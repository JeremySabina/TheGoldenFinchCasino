package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {
    String accountName;
    String password;
    String house;
    Float accountBalance;



    public CasinoAccount(String accountName, String accountPassword) {
        this.accountName = accountName;
        this.password = accountPassword;
    }

    // Getters

    public String getAccountName() {
        return accountName;
    }

    public String getPassword() {
        return password;
    }

    public Float getAccountBalance() {
        return accountBalance;
    }

    public void alterAccountBalance(Float value) {
        this.accountBalance += value;
    }

}
