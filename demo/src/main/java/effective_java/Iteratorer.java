package src.main.java.effective_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
 





public class Iteratorer{ 



public static void iteratorBug(){  

  Collection<Suit> suits = Arrays.asList(Suit.values());

  Collection<Rank> ranks = Arrays.asList(Rank.values());


  List<Card> deck = new ArrayList<>();

  for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ){
    Suit suit = i.next();
    for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
     {
        deck.add(new Card(suit, j.next()));
     }
  }
  
}
  
  public static enum Suit { CLUB, DIAMOND, HEART, SPADE }

public static enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,NINE, TEN, JACK, QUEEN, KING }

public static class Card{
  
  public Card(Suit s, Rank r){
    
  }
}
}

