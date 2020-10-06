package com.tasks3.carddeck;

import java.util.ArrayList;
import java.util.Random;

    public class Deck {
        private ArrayList<Card> cards;

        Deck() {
            cards = new ArrayList<Card>();
            for(int i = 0; i < Suit.values.length; ++i) {
                for (int j = 0; j < Rank.values.length; ++j) {
                    cards.add(new Card(Rank.values[j], Suit.values[i]));
                }
            }
        }

        //Перемішує колоду у випадковому порядку
        public void shuffle() {
            Card card;
            int rand;
            for(int i = 0; i < 36; ++i) {
                rand = new Random().nextInt(cards.size());
                card = cards.get(i);
                cards.set(i, cards.get(rand));
                cards.set(rand, card);
            }
        }

        /* * Впорядкування колоди за мастями та значеннями
         * Порядок сотрування:
         * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
         * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
         * Наприклад
         * HEARTS Ace
         * HEARTS King
         * HEARTS Queen
         * HEARTS Jack
         * HEARTS 10
         * HEARTS 9
         * HEARTS 8
         * HEARTS 7
         * HEARTS 6
         * І так далі для DIAMONDS, CLUBS, SPADES */
        public void order() {
            Card temp;
            for(int i = 1; i <= Suit.values.length; ++i) {
                for(int j = 1; j <= Rank.values.length; ++j) {
                    if(i*j-1 < cards.size()) return;
                    temp = cards.get(i*j-1);
                    cards.set(i*j-1, cards.get(cards.indexOf(new Card(Rank.values[j], Suit.values[j]))));
                    cards.set(cards.indexOf(new Card(Rank.values[j], Suit.values[j])), temp);
                }
            }
        }

        //Повертає true у випадку коли в колоді ще доступні карти
        public boolean hasNext() {
            return cards.size() != 0;
        }

        //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
        //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
        //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
        public Card drawOne() {
            ArrayList<Card> tempList = cards;
            order();
            Card tempCard = cards.remove(cards.indexOf(tempList.get(0)));
            cards = tempList;
            return tempCard;
        }
    }
