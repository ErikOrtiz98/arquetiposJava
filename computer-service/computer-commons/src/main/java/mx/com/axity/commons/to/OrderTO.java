package mx.com.axity.commons.to;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class OrderTO implements Serializable {

    private int idorder;
    private String description;
    private int amounthComputers;
    private List<ComputersTO> computers;

    
}

