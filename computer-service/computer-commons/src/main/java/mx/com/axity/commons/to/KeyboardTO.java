package mx.com.axity.commons.to;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class KeyboardTO implements Serializable {

    private int idcomputer;
    private String brand;
    private int serialnumber;
    private int idorder;
    private int idkeyboard;
    private int idmouse;
    private int idmonitor;
}
