package mx.com.axity.commons.to;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class ComputersTO implements Serializable {

    private int idcomputer;
    private String brand;
    private int serialnumber;
    private int idorder;
    private KeyboardTO keyboard;
    private MouseTO mouse;
    private MonitorTO monitor;
}
