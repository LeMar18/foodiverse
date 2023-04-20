package com.foodverse.widgets.card;

import java.util.List;

import com.foodverse.models.Offer;
import com.foodverse.models.Shop;
import com.foodverse.utility.core.Props;
import com.foodverse.widgets.media.AssetSize;

public record OfferProps(
    String thumbnail,
    String name,
    float rating,
    List<Offer> offers) implements Props {

    public static OfferProps from(Shop shop) {
        return new OfferProps(
            shop.getThumbnails().get(AssetSize.SMALL),
            shop.getName(),
            shop.getRating(),
            shop.getOffers());
    }

}
