<%-- 
    Document   : dangky
    Created on : Nov 17, 2010, 2:31:05 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<h3>Đăng ký thành viên</h3>
<form id="frmDangKy" method="post" action="src/controller/dangkycontroller">
    <table>

        <tr>
            <td>Username:</td>
            <td><input type="text" id="txtUserName"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" id="txtPassword"></td>
        </tr>
        <tr>
            <td>Họ tên:</td>
            <td><input type="text" id="txtHoTen"></td>
        </tr>
        <tr>
            <td>Địa chỉ:</td>
            <td><input type="text" id="txtDiaChi"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="text" id="txtEmail"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="đăng ký" id="btnDangKy"/>
            </td>
        </tr>
    </table>
</form>