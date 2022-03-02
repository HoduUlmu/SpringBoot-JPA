package jpabook.jpashop.repository.order.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OrderItemQueryDto {

    @JsonIgnore
    private final Long orderId;
    private final String itemName;
    private final int orderPrice;
    private final int count;
}
