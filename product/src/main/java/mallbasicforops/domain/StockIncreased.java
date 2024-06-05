package mallbasicforops.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mallbasicforops.domain.*;
import mallbasicforops.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private Integer stock;

    public StockIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public StockIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
