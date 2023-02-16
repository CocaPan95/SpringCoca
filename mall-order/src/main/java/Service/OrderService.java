package Service;

import domain.Orderss;
import dto.UserDto;

import java.util.List;

public interface OrderService {
    int GetOrderCount();

    Orderss GetOrder(Long OrderId);

    List<Orderss> GetOrderAll();
    Orderss GetOrderByNo(String OrderNo);

    List<Orderss> OrderQuery(UserDto userDto);

    int InsertOrder(Orderss order);

    int UpdateOrder(Orderss order);

    int DeleteOrder(Integer OrderId);
}
