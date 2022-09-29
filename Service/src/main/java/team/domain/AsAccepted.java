package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AsAccepted extends AbstractEvent {

    private Long id;
    private String status;
    private Long requestId;
    private Date requestDate;
    private String customerName;
    private String phoneNumber;
    private Integer price;
    private String symtom;

    public AsAccepted(Service aggregate){
        super(aggregate);
    }
    public AsAccepted(){
        super();
    }
}
