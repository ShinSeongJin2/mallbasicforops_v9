package mallbasicforops.domain;

import java.util.*;
import lombok.*;
import mallbasicforops.domain.*;
import mallbasicforops.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private String userId;
    private String productName;
    private Integer qty;
    private String address;
    private String status;
    private Date deliveryDt;
}
