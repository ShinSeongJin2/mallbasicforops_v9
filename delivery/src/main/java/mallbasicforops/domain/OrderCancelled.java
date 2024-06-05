package mallbasicforops.domain;

import java.util.*;
import lombok.*;
import mallbasicforops.domain.*;
import mallbasicforops.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String userId;
    private Long productId;
    private String productName;
    private Integer qty;
    private String address;
    private String status;
    private Date orderDt;
}
