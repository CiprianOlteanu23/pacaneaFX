package misc;

import javafx.animation.PauseTransition;
import javafx.scene.text.Text;
import javafx.util.Duration;
import misc.data.CashManager;

import java.util.concurrent.atomic.AtomicInteger;

public class ToolbarHandle {


    public void initialText(Text creditIndicator, Integer credit, Text betText, Text messageText) {

        creditIndicator.setText(Integer.toString(credit));
        betText.setText(Integer.toString(1));
        messageText.setText("SELECTEAZA MANA SI DA-I TALPA BOSS");

    }

    public void minusCredit(Text credit, CashManager cashManager) {
        if(cashManager.getCurrentWin() != 0){
            cashManager.giveMoney();
            cashManager.setCurrentWin(0);
        }
        cashManager.takeMoney();
        credit.setText(Integer.toString(cashManager.getCurrentMoney()));
    }

    public void plusBet(Text bet, CashManager cashManager){
        int plusBet = cashManager.plusBet();
        cashManager.setCurrentBet(plusBet);
        bet.setText(Integer.toString(plusBet));
    }

    public void minusBet(Text bet, CashManager cashManager){
        int minusBet = cashManager.minusBet();
        cashManager.setCurrentBet(minusBet);
        bet.setText(Integer.toString(minusBet));
    }

//    private void dropToDrop(Text credit, int current, int next) {
//        int doubledCurrent = current;
//        doubledCurrent++;
//        if (doubledCurrent != next) {
//
//            credit.setText(Integer.toString(doubledCurrent));
//
//            PauseTransition pauseTransition = new PauseTransition(Duration.millis(100));
//            pauseTransition.setOnFinished(actionEvent -> {
//                dropToDrop(credit, current, next);
//            });
//            pauseTransition.play();
//        }
//
//    }

//    public void updateCredit(Text credit, CashManager cashManager) {
//        if (cashManager.getCurrentWin() != 0) {
//            Integer currentMoney = cashManager.getCurrentMoney();
//
//            cashManager.giveMoney();
//            dropToDrop(credit, currentMoney, cashManager.getCurrentMoney());
//            cashManager.setCurrentWin(0);
//            minusCredit(credit, cashManager);
//        }
//    }

}
