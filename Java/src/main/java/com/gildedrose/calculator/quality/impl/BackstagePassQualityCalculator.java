package com.gildedrose.calculator.quality.impl;

import com.gildedrose.Item;
import com.gildedrose.calculator.quality.QualityCalculator;

import static com.gildedrose.config.Constant.*;

public class BackstagePassQualityCalculator implements QualityCalculator {

    private static final int SELL_IN_THRESHOLD_FOR_DOUBLE_INCREASE = 11;
    private static final int SELL_IN_THRESHOLD_FOR_TRIPLE_INCREASE = 6;

    @Override
    public int calculateQuality(Item item, int updatedSellIn) {
        if (updatedSellIn < SELLIN_EXPIRATION_THRESHOLD) return ITEM_MIN_QUALITY;

        int qualityIncrease = 1
            + (item.sellIn < SELL_IN_THRESHOLD_FOR_DOUBLE_INCREASE ? 1 : 0)
            + (item.sellIn < SELL_IN_THRESHOLD_FOR_TRIPLE_INCREASE ? 1 : 0);
        int newQuality = item.quality + qualityIncrease;

        return Math.min(ITEM_MAX_QUALITY, newQuality);
    }
}
