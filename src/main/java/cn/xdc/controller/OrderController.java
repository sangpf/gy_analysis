package cn.xdc.controller;

import cn.xdc.bean.Order;
import cn.xdc.bean.query.OrderQuery;
import cn.xdc.bean.vo.OrderVo;
import cn.xdc.common.page.Pagination;
import cn.xdc.service.OrderService;
import cn.xdc.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping(value = "/order")
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    //添加
    @ResponseBody
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public AjaxResult add(Order order){
        try {
            orderService.addOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.errorResult();
        }
        return AjaxResult.successResult();
    }

    //修改
    @ResponseBody
    @RequestMapping(value = "/edit.do")
    public AjaxResult edit(Order order,ModelMap model){
        try {
            orderService.updateOrderByKey(order);
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.errorResult();
        }
        return AjaxResult.successResult();
    }

    //列表
    @ResponseBody
    @RequestMapping(value = "/list.do")
    public AjaxResult list(Order order, HttpServletResponse response){

        if (order.getInvId() == null){
            return AjaxResult.errorResult("invId is null");
        }
        OrderQuery orderQuery = new OrderQuery();
        orderQuery.setInvId(order.getInvId());
        List<OrderVo> orderList = orderService.getOrderList(orderQuery);

        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put("data",orderList);
        return ajaxResult;
    }

    //分页列表
    @ResponseBody
    @RequestMapping(value = "/listWithPage.do")
    public AjaxResult ListWithPage(Integer pageNo,Order order){
        if (order.getInvId() == null){
            return AjaxResult.errorResult("invId is null");
        }
        OrderQuery orderQuery = new OrderQuery();
        orderQuery.setInvId(order.getInvId());
        //设置页号
        orderQuery.setPageNo(Pagination.cpn(pageNo));
        Pagination pagination = orderService.getOrderListWithPage(orderQuery);

        return AjaxResult.successData(pagination);
    }

    //删除多个
    @ResponseBody
    @RequestMapping(value = "/deletes.do")
    public AjaxResult deletes(Integer[] ids,ModelMap model){
        try {
            orderService.deleteOrderByKeys(ids);
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.errorResult();
        }
        return AjaxResult.successResult();
    }

}
