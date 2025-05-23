package FoodOrderingApplication.services;

import FoodOrderingApplication.model.Order;
import FoodOrderingApplication.model.User;
import FoodOrderingApplication.request.OrderRequest;

import java.util.List;

public interface OrderService {
    public Order createOrder(OrderRequest  orderRequest, User user) throws Exception;

    public Order updateOrder(Long orderId,String orderStatus) throws Exception;

    public void cancelOrder(Long orderId) throws Exception;

    public List<Order> getUsersOrder(Long userID) throws Exception;

    public List<Order> getRestaurantOrder(Long restaurantId,String orderStatus) throws Exception;

    public Order findOrderById(Long orderId) throws Exception;

}
