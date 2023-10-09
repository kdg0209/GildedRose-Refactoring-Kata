package com.gildedrose;

public class Item {

    private static final int MAX_QUALITY = 50;

    private static final String AGED_BRIE_ITEM_NAME = "Aged Brie";
    private static final String BACK_STAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_ITEM = "Sulfuras, Hand of Ragnaros";

    public String name;
    public int sellIn; // 아이템을 판매해야하는 (남은) 기간
    public int quality; // 아이템의 가치

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {
        if (this.quality < MAX_QUALITY) {
            this.quality++;
        }
    }

    public void decreaseSellIn() {
        if (!this.name.equals(SULFURAS_ITEM)) {
            this.sellIn--;
        }
    }
}
