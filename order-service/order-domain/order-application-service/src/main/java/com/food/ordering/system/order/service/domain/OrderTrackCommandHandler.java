package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderTrackCommandHandler {
    TrackOrderResponse trackOrder(TrackOrderQuery trackOrderQuery) {
        log.info("OrderTrackCommandHandler.trackOrder: {}", trackOrderQuery);
        return null;
    }
}
