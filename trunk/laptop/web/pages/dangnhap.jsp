<%-- 
    Document   : dangnhap
    Created on : Nov 17, 2010, 2:25:38 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<h3>Thông tin đăng nhập</h3>
<%
if(request.getParameterValues("username")==null){

%>
<form id="frmDangNhap" method="post" action="src/controller/dangnhapcontroller">
    <table>
        <tr>
            <td>Username:</td>
            <td><input type="text" id="txtUserName" size="15" ></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" id="txtPassword"size="15"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="đăng nhập" id="btnDangNhap"/>
            </td>
        </tr>
    </table>
</form>
<%
    }
else
    {
        if(session.getAttribute("username")!=null){
            
        }
    }
%>
