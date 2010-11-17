<%-- 
    Document   : index
    Created on : Nov 16, 2010, 10:11:36 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="css/style.css" rel="stylesheet" />
        <title>JSP Page</title>
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <%@include file="pages/header.jsp" %>
            </div>
            <div id="content">
                
               <div id="leftContent">
                    <div id="sitemap">
                        <a href="index.jsp">Trang chủ</a>
                        <a href="dangnhap.jsp">Đăng nhập</a>
                        <a href="dangky.jsp">Đăng ký</a>
                        <a href="laptop.jsp">Laptop</a>
                        <a href="phukien.jsp">phụ kiện</a>
                        <a href="quantri.jsp">Quản trị</a>
                    </div>
                   <div id="maincontent">
                       
                       <%@include  file="pages/dangnhap.jsp" %>
                   </div>

               </div>
               <div id="rightContent">
                   <br/>
                   <div id="thongtin">
                       <h3>Thông tin đặt hàng</h3>
                       <a href="#">Giỏ hàng của bạn</a><br/>
                       <a href="#">Xác nhận đơn hàng</a><br/>
                       <a href="#">Thanh tóan</a><br/>
                   </div>
                   <div id="quangcao">
                    <h3>Thông tin quảng cáo</h3>
                   </div>
                   <div id="thongtin">
                       <h3>Sản phẩm bán chạy</h3>
                       <div id="sanpham">
                           <img src="images/#.jpg"/>
                           <a href="#">Sản phẩm</a><br/>
                           Giá

                       </div>
                   </div>
                   
               </div>
               <div id="clear"></div>
            </div>

            <div id="footer">
                <%@include  file="pages/footer.jsp" %>
            </div>

        </div>

    </body>
</html>
