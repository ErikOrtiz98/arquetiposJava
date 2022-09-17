package mx.com.axity.web.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mx.com.axity.commons.to.*;
import mx.com.axity.services.facade.IcomputerFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("serviceorder/v1")
@Api(value="ServiceOrder")
public class HelloController {

    static final Logger LOG = LogManager.getLogger(HelloController.class);

    //@Autowired
    //RestTemplate restTemplate;

    @Autowired
    IcomputerFacade IcomputerFacade;

    @GetMapping(value = "/users", produces = "application/json")
    @ApiOperation(value = "Buscar Usuarios",
            notes = "Retorna todos los usuarios",
            response = UserTO.class,
            produces = "application/json")
    public ResponseEntity<List<UserTO>> getAllUsers() {
        List<UserTO> users = this.IcomputerFacade.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping(value = "/Orders", produces = "application/json")
    @ApiOperation(value = "Buscar Usuarios",
            notes = "Retorna todos los usuarios",
            response = OrderTO.class,
            produces = "application/json")
    public ResponseEntity<List<OrderTO>> getAllOrders() {
        List<OrderTO> orders = this.IcomputerFacade.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}", produces = "application/json")
    @ApiOperation(value = "Buscar Usuarios",
            notes = "Retorna todos los usuarios",
            response = UserTO.class,
            produces = "application/json")
    public ResponseEntity<UserTO> getuserById(@PathVariable("id") Long id) {
        UserTO users = this.IcomputerFacade.getUsersByid(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping(value = "/order/{id}", produces = "application/json")
    @ApiOperation(value = "Buscar Usuarios",
            notes = "Retorna todos los usuarios",
            response = OrderTO.class,
            produces = "application/json")
    public ResponseEntity<OrderTO> getorderById(@PathVariable("id") int id) {
        OrderTO order = this.IcomputerFacade.getOrderByid(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
    @PostMapping(value = "/order", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
        MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResponseTO> createOrder(@RequestBody OrderTO request) {
        LOG.info("Se invoca POST /order");
        ResponseTO responseValue = IcomputerFacade.createOrder(request);
        return new ResponseEntity<ResponseTO>(responseValue, HttpStatus.CREATED);
    }
    @PostMapping(value = "/computer", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
        MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResponseTO> createComputer(@RequestBody ComputersTO request) {
        LOG.info("Se invoca POST /computer");
        ResponseTO responseValue = IcomputerFacade.createComputer(request);
        return new ResponseEntity<ResponseTO>(responseValue, HttpStatus.CREATED);
    }
    @GetMapping(value = "/ping", produces = "application/json")
    @ApiOperation(value = "Ping",
            notes = "Pong",
            produces = "application/json")
    public ResponseEntity test() {
        return new ResponseEntity<>("pong", HttpStatus.OK);
    }
}
