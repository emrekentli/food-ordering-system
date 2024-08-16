package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.entity.Restaurant;
import com.food.ordering.system.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface RestaurantRepository {
   Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);

}
