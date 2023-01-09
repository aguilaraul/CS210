/**
 * @Authors:  Robert Edmonston, Raul Aguilar, Austin Garrison
 * @Date:     October 07 2021
 * FA21 CS 210 5198 Final Project
 * Roulette Simulator Application (RSA)
 * 
 * Based on code by:
 * Evan Silverthorn (silvee49322@gmail.com)
 * and Robert Edmonston ( bedmonston@icloud.com)
 */

public class Player {
  private String name;
  private int balance;
  //private boolean isBankrupt = false;

  public Player(String name) {
    this.name = name;
    this.balance = 1000;
  }

  public Player(String aName, int aBalance) {
    name = aName;
    balance = aBalance;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int newBalance)
  {
    balance = newBalance;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String newName)
  {
    // Useful if we want to limit what a Player name can be
    name = newName;
  }
}