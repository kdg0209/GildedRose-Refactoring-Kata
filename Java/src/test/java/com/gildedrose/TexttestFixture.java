package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TexttestFixture {

    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

    @Test
    void 상품명이_Sulfuras_인경우_기간도_떨어지지_않고_Quality_도_떨어지지_않는다() {

        // given
        Item[] items = new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 80),
            new Item("Sulfuras, Hand of Ragnaros", -1, 80)
        };

        // when
        GildedRose gildedRose = new GildedRose(items);
        int days = 1;
        for (int i = 0; i < days; i++) {
            gildedRose.updateQuality();
        }

        // then
        assertThat(items[0].quality).isEqualTo(80);
        assertThat(items[0].sellIn).isEqualTo(0);
        assertThat(items[1].quality).isEqualTo(80);
        assertThat(items[1].sellIn).isEqualTo(-1);
    }

    @Test
    @DisplayName("하루가 지남으로써 quality가 1로 증가한다.")
    void 상품명이_Aged_Brie_인경우_1일이_지나면_Quality_값이_1로_올라간다() {

        // given
        Item[] items = new Item[] {
            new Item("Aged Brie", 2, 0)
        };

        // when
        GildedRose gildedRose = new GildedRose(items);
        int days = 1;
        for (int i = 0; i < days; i++) {
            gildedRose.updateQuality();
        }

        // then
        assertThat(items[0].quality).isEqualTo(1);
    }

    @Test
    @DisplayName("하루가 지남으로써 quality가 2로 증가한다.")
    void 상품명이_Aged_Brie_인경우_2일이_지나면_Quality_값이_2로_올라간다() {

        // given
        Item[] items = new Item[] {
            new Item("Aged Brie", 2, 0)
        };

        // when
        GildedRose gildedRose = new GildedRose(items);
        int days = 1;
        for (int i = 0; i < days; i++) {
            gildedRose.updateQuality();
        }

        // then
        assertThat(items[0].quality).isEqualTo(1);
    }
}
