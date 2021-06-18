package misc.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.text.Text;

import java.rmi.activation.UnknownObjectException;
import java.util.ArrayList;

public class CashManager {

    private int currentBet = 1;
    private final ObservableList<Integer> bets = FXCollections.observableArrayList(1, 5, 10, 25, 50, 100, 200, 500, 1000, 2000, 5000, 10000, 50000, 100000, 500000);
    private final ObservableList<Integer> multipliers = FXCollections.observableArrayList(2,4,6,8,10);
    private Integer currentMoney = 100;
    private Integer currentWin = 0;

    public int plusBet() {
        int bet = 0;
        for (int i = 0; i < bets.size(); i++) {
            if (bets.get(i) == currentBet && currentBet != 500000) {
                if(bets.get(i+1) <= currentMoney){
                    return bets.get(i + 1);
                }
            } else bet = currentBet;
        }

        return bet;
    }

    public int minusBet() {
        int bet = 0;
        for (int i = 0; i < bets.size(); i++) {
            if (bets.get(i) == currentBet && currentBet != 1) {
                return bets.get(i - 1);
            } else bet = currentBet;
        }
        return bet;
    }

    public void takeMoney() {

            currentMoney -= currentBet;

    }

    public void giveMoney() {
        currentMoney += currentWin;
    }

    public int winType(String string){
        switch (string){
            case "Prunie":
                return 0;
            case "Lebenita":
                return 1;
            case "Lamai":
                return 2;
            case "Stele":
                return 3;
            case "Septar":
                return 4;
            default: throw new IllegalStateException("Unexpected value: " + string);
        }
    }

    public void calculateWin(boolean three, boolean four, boolean five, int winType){
        if (three){
            currentWin += 3*(currentBet*multipliers.get(winType));
        }else if(four){
            currentWin += 4*(currentBet*multipliers.get(winType));
        }else if(five){
            currentWin += 5*(currentBet*multipliers.get(winType));
        }
    }

    public void doubleWin() {
        currentWin *= 2;
    }

    public int getCurrentBet() {
        return currentBet;
    }

    public void setCurrentBet(int currentBet) {
        this.currentBet = currentBet;
    }

    public Integer getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(Integer currentMoney) {
        this.currentMoney = currentMoney;
    }

    public Integer getCurrentWin() {
        return currentWin;
    }

    public void setCurrentWin(Integer currentWin) {
        this.currentWin = currentWin;
    }

    public String currentBetToString() {
        return Integer.toString(currentBet);
    }

    public String currentMoneyToString() {
        return Integer.toString(currentMoney);
    }


    public String currentWinToString() {
        return "Ai castigat " + Integer.toString(currentWin) + " bistari!";
    }

}
