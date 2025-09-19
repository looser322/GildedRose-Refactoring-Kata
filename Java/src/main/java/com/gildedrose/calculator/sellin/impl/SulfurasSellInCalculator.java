package com.gildedrose.calculator.sellin.impl;

import com.gildedrose.Item;
import com.gildedrose.calculator.sellin.SellInCalculator;

public class SulfurasSellInCalculator implements SellInCalculator {
    @Override
    public int calculate(Item item) {
        return item.sellIn;
    }
}
