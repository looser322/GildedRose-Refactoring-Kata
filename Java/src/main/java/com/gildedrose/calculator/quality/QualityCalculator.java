package com.gildedrose.calculator.quality;

import com.gildedrose.Item;

public interface QualityCalculator {
    int calculateQuality(Item item, int updatedSellIn);
}
