/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ayush
 */
public class Account {
    
    private String bankname;
    private String routingnumber;
    private String accountnumber;
    private int balance;
    
   //extra code
    private int abc;

    public void setAbc(int abc) {
        this.abc = abc;
    }

    public int getAbc() {
        return abc;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getRoutingnumber() {
        return routingnumber;
    }

    public void setRoutingnumber(String routingnumber) {
        this.routingnumber = routingnumber;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString(){
        return bankname;
    }
    
}
