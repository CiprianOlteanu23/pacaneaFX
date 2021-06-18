# **pacaneaFX**

## **[ALPHA-1] - 18.06.2021:**

### **KNOWN BUGS:** 

**[R1-MP]:** 

If you run x86 (32-bit) aproximately first seconds (specs dependent) you will experience horrible lag. After some time the execution will be significantly smoother.

**[G1-TB]:**

If you run out of money to play a higher bet, a flashing message will be thrown in toolbar, but if you lower the bet and play, the flashing message that worn you are out of money will appear

### **TODOs:**

**[1]** -> Functionality of gamble pane including UI

**[2]** -> First 20 slots to be equal with last 20

**[3]** -> Gameplay sounds

**[4]** -> Radios

**[5]** -> Adapt to any screen, any platform

**[6]** -> Diagonal line comparission

**[7]** -> **(OPTIONAL)** fix **[R1-MP]** bug

**[8]** -> Fix **[G1-TB]** bug

**[9]** -> Daily rewards

**[10]** -> Special wins

**[11]** -> SQL DAL

**[12]** -> .exe deploy

**[13]** -> fluid credit and bet display

### **What you get:**

**First of all you will experience the best ever Java written game and also the best ever slot machine, who on earth put manele on slot machines, exactly, real casino experience 
at office, at home or when driving around (I will not judge you)**

**[SplashScreen]:** 

Refined with fade and fill transitions, splash screeen is the most perfect transition from Windows to **PACANELE**, also, this splash screen 
is somehow thinked to mask the game loadings and prevents it to lag.

**[SlotMachine]:**

As intended this is a slot game, so must contain a slot machine engine.

Main pane has 5 ScrollPanes which contains 5 VBox'es. At runtime 100 panes will be dynamical added to VBox'es.
To be sure it will run, ScrollPanes are animated to go almost to bottom, there will be one more element which will remain hidden, it's main objective is to be partially 
uncovered if slot "rebounds" when is down.

At new release of play, ScrollPanes will return to 0 position in some millis, remaining undetectable transition, the symbols of each pane will be random changed with another,
and animation to the bottom will occur.

If three or more symbols are identically on the same line, will return symbol-specific win. Also the player can win multiple lines simultaneous;

**[Bootleg soundboard]:**

You can hear some rip-off sounds that means play, stop of each line or win-specific sounds. These are not final.

**[CashManager]:**

Cash manager is a well structured class which role is credit calculations, win calculations and bet rate depending remaining credit.
It contains credit updates, if you win or just pay for a play, win calculator, it will gather win depending on symbols and currentBet using some bet/symbol-ratios.

**[Comparison]:**
As you play you can win or not. Blame comparison algorithm, it will compare symbols of each line and will looking for three line, four line or full line win, all of same symbol.
If you win, sounds will play and CashManager will return your rewards.

For the moment comparison is only for lines, so you just can't win something on diagonals.

Also if you win, winning bars will be highlighted.

**[SpecialEffects]:**

If you are not drunk you can spot some elements have motion blur
