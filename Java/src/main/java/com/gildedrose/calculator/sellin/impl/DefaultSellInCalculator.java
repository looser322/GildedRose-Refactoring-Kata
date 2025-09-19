package com.gildedrose.calculator.sellin.impl;

import com.gildedrose.Item;
import com.gildedrose.calculator.sellin.SellInCalculator;

public class DefaultSellInCalculator implements SellInCalculator {
    @Override
    public int calculateSellIn(Item item) {
        return item.sellIn - 1;
    }
}
