package mx.com.axity.commons.to;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
public class ResponseTO implements Serializable {

    private int code;
    private String message;
}