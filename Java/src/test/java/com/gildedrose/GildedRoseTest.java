package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    // 당신이 할 일은 시스템에 새로운 기능을 추가하여, 새로운 카테고리의 상품을 판매할 수 있도록하는 것입니다.

    // 모든 아이템은 SellIn 값을 가지며, 이는 아이템을 판매해야하는 (남은) 기간을 나태냅니다.
    // 모든 아이템은 Quality 값을 가지며, 이것은 아이템의 가치를 나타냅니다.
    // 하루가 지날때마다, 시스템은 두 값(SellIn, Quality)을 1 씩 감소시킵니다.

    // 판매하는 나머지 일수가 없어지면, Quality 값은 2배로 떨어집니다. [Quality 값은 결코 음수가 되지는 않습니다.]
    // "Aged Brie"(오래된 브리치즈)은(는) 시간이 지날수록 Quality 값이 올라갑니다.
    // Quality 값은 50를 초과 할 수 없습니다.
    // Sulfuras는 전설의 아이템이므로, 반드시 판매될 필요도 없고 Quality 값도 떨어지지 않습니다.

    // 업데이트 요구 사항
    // "Conjured" 아이템은 일반 아이템의 2배의 속도로 품질(Quality)이 저하됩니다.

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("fixme", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}
