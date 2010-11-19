<%-- 
    Document   : dangnhap
    Created on : Nov 17, 2010, 2:25:38 PM
    Author     : Administrator
--%>

<%@page import="models.util.TienIch"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<h3>Thông tin đăng nhập</h3>
<%
    
    //xu ly cookies
    String username="";
    if(session.getAttribute("username")!=null){
        username = session.getAttribute("username").toString();
    }
    if(username==""){




%>
<form id="frmDangNhap" method="post" action="dangnhapCon">
    <table>
        <tr>
            <td>Username:</td>
            <td><input type="text" name="txtUsername" size="15" ></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="txtPassword"size="15"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="đăng nhập" name="btnDangNhap" id="btnDangNhap" />
            </td>
        </tr>
        <tr>
            <td colspan="2" id="thongbao"><% Object tb = request.getAttribute("thongbao");
                                    if(tb!=null){
                                        out.print(tb);
                                    }
            %></td>
        </tr>
    </table>
</form>
<%
    }
else
    {

%>
<form id="frmDangXuat" method="post" action="dangxuatCon">
    <table>
        <tr>
            <td>Chào <%= username %> </td>
            
        </tr>
        
        <tr>
            <td><input type="submit" value="đăng xuất" name="btnDangXuat" id="btnDangXuat"/>
            </td>
        </tr>
    </table>
</form>
<%
    }
%>
