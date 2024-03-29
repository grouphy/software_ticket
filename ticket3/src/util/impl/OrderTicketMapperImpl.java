package util.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.OrderTicket;
import util.RowMapperObject;
/**
 * 订票信息对象映射
 *@author Mr.DU
 * @date: 2019-06-24
 */
public class OrderTicketMapperImpl implements RowMapperObject {

	@Override
	public Object rowMapperObject(ResultSet rs) throws SQLException {
		OrderTicket o = new OrderTicket();
		o.setId(rs.getInt("id"));
		o.setFlight_id(rs.getInt("flight_id"));
		o.setTakeoff_time(rs.getString("takeoff_time"));
		o.setStart_place(rs.getString("start_place"));
		o.setEnd_place(rs.getString("end_place"));
		o.setPrice(rs.getDouble("price"));
		o.setUsername(rs.getString("username"));
		o.setIdentity(rs.getString("identity"));
		o.setLoginname(rs.getString("loginname"));
		o.setTra_name(rs.getString("tra_name"));
		return o;
	}

}
