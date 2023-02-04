/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.OrderManagement;

/**
 *
 * @author kal bugrara
 */
public class OrderSummary {
    int salesVolume;
    boolean totalAboveTarget;
    int orderPricePerformance;
    int numberOfOrderItemsAboveTarget;

    public OrderSummary(Order o) {
        salesVolume = o.getOrderTotal();
        totalAboveTarget = o.isOrderAboveTotalTarget();
        orderPricePerformance = o.getOrderPricePerformance();
        numberOfOrderItemsAboveTarget = o.getNumberOfOrderItemsAboveTarget();

    }

    public int getOrderProfit() {
        return orderPricePerformance;
    }
}
