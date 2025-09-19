package com.gildedrose.calculator.quality.impl;

import com.gildedrose.Item;
import com.gildedrose.calculator.quality.QualityCalculator;

import static com.gildedrose.config.Constant.ITEM_MAX_QUALITY;
import static com.gildedrose.config.Constant.SELLIN_EXPIRATION_THRESHOLD;

public class AgedBrieQualityCalculator implements QualityCalculator {
    @Override
    public int calculateQuality(Item item, int updatedSellIn) {
        int increaseAmount = (updatedSellIn < SELLIN_EXPIRATION_THRESHOLD) ? 2 : 1;
        int newQuality = item.quality + increaseAmount;
        return Math.min(ITEM_MAX_QUALITY, newQuality);
    }
}
