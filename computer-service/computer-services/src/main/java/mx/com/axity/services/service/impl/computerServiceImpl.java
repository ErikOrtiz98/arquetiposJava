package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.*;
import mx.com.axity.model.*;
import mx.com.axity.persistence.*;
import mx.com.axity.services.service.IcomputerService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class computerServiceImpl implements IcomputerService {

    static final Logger LOG = LogManager.getLogger(computerServiceImpl.class);

    @Autowired
    UserDAO userDAO;
    @Autowired
    OrderDAO orderDAO;
    @Autowired
    ComputerDAO computerDAO;
    @Autowired
    KeyboardDAO keyboardDAO;
    @Autowired
    MouseDAO mouseDAO;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<UserTO> getUsers() {

        LOG.info("Consulting all users");
        List<UserDO> usersDO= this.userDAO.findAll();
        Type userDAOType = new TypeToken<List<UserDO>>() {}.getType();
        List<UserTO> usersTO = this.modelMapper.map(usersDO, userDAOType);
        
        LOG.info("return {} elements", usersTO.size());

        return usersTO;
    }
    @Override
    public UserTO getUsersbyid(Long id) {

        LOG.info("Consulting users by ID");
        UserDO usersDO= this.userDAO.findByid(id);
        UserTO usersTO = this.modelMapper.map(usersDO, UserTO.class);
        LOG.info("return {} elements", usersTO);

        return usersTO;
    }
    @Override
    public OrderTO getOrderById(int id) {

        LOG.info("Consulting orders by ID");
        OrderDO orderDO= this.orderDAO.findByIdorder(id);
        OrderTO orderTO = this.modelMapper.map(orderDO, OrderTO.class);

        List<ComputersDO> computerDO = this.computerDAO.findAllByIdorder(id);
        Type ComputersDAOType = new TypeToken<List<ComputersDO>>() {}.getType();
        List<ComputersTO> ComputerTO = this.modelMapper.map(computerDO, ComputersDAOType);
        orderTO.setComputers(ComputerTO);
        orderTO.setAmounthComputers(ComputerTO.size());

        LOG.info("return {} elements", orderTO);

        return orderTO;
    }
    @Override
    public ResponseTO Createorder(OrderTO order) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        OrderDO orderDO=new OrderDO();
        orderDO.setDescription(order.getDescription());
        List<ComputersTO> computers=order.getComputers();
        ResponseTO responseValue = new ResponseTO();
        ComputersDO computerDO=new ComputersDO();
        if (computers.size()>5||order.getAmounthComputers()!=computers.size()){
            responseValue.setCode(400);
            responseValue.setMessage("reached the limit of 5 devices or value it does not match  --> ");
            return responseValue;
        }
        LOG.info(orderDO);
        orderDAO.save(orderDO);
        for (int i=0;i<computers.size();i++){
            computerDO=modelMapper.map(computers.get(i), ComputersDO.class);
            computerDO.setIdorder(Math.toIntExact(orderDO.getIdorder()));
            LOG.info(computerDO);
            ComputersTO computerTO = new ComputersTO();
            computerTO=modelMapper.map(computerDO, ComputersTO.class);
            responseValue=createComputer(computerTO);
        }

        
        responseValue.setCode(200);
        responseValue.setMessage("save order with id --> " + orderDO.getIdorder());
        return responseValue;
    }
    @Override
    public ResponseTO createComputer(ComputersTO computer){
        int amount;
        ResponseTO responseValue = new ResponseTO();
        amount=(computerDAO.findAllByIdorder(computer.getIdcomputer())).size();
        if (amount>=5){
            responseValue.setCode(400);
            responseValue.setMessage("order with id -->"+computer.getIdcomputer()+" already hay 5 devices");
            return responseValue;
        }
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        ComputersDO computerDO=modelMapper.map(computer, ComputersDO.class);
        computerDAO.save(computerDO);

        responseValue.setCode(201);
        responseValue.setMessage("save computer with id --> " + computerDO.getIdcomputer());

        return responseValue;
    }
    @Override
    public List<OrderTO> GetOrders(){
        LOG.info("Consulting all orders");
        List<OrderDO> orderDO= this.orderDAO.findAll();
        Type orderDAOType = new TypeToken<List<OrderDO>>() {}.getType();
        List<OrderTO> orderTO = this.modelMapper.map(orderDO, orderDAOType);

        LOG.info("return {} elements", orderTO.size());

        return orderTO;
    }
}
