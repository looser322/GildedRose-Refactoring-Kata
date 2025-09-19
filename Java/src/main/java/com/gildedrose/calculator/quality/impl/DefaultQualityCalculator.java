package com.gildedrose.calculator.quality.impl;

import com.gildedrose.Item;
import com.gildedrose.calculator.quality.QualityCalculator;

import static com.gildedrose.config.Constant.ITEM_MIN_QUALITY;
import static com.gildedrose.config.Constant.SELLIN_EXPIRATION_THRESHOLD;

public class DefaultQualityCalculator implements QualityCalculator {
    @Override
    public int calculateQuality(Item item, int updatedSellIn) {
        int decreaseAmount = (updatedSellIn < SELLIN_EXPIRATION_THRESHOLD) ? 2 : 1;
        int newQuality = item.quality - decreaseAmount;
        return Math.max(ITEM_MIN_QUALITY, newQuality);
    }
}
