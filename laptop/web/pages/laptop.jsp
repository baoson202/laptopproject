<%-- 
    Document   : laptop
    Created on : Nov 17, 2010, 3:20:19 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<div id="timkiem">
<h3>Thông tin laptop</h3>
<form id="frmTimKiem" method="post" action="">
    <table>
        <tr>
            <td>Tùy chọn</td>
            <td>
                <input type="text" id="txtTuyChon" size="10">
            </td>
            <td>
                <select name="cbHang">
                    <option value="0">HP</option>
                    <option value="1">Compaq</option>
                    <option value="2">Dell</option>
                </select>
            </td>
            <td>Giá từ</td>
            <td>
                <input type="text" id="txtGiaTu" size="10">
            </td>
            <td>Giá đến</td>
            <td>
                <input type="text" id="txtGiaDen" size="10">
            </td>
            <td><input type="submit" id="btnTim" value="Tìm"></td>
        </tr>
    </table>
</form>
<%@include  file="danhsachlaptop.jsp" %>
</div>