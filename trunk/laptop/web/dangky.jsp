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
        <script type="text/javascript"
        src="js/javascript.js"></script>

        <title>JSP Page</title>
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <%@include file="includes/header.jsp" %>
            </div>
            <div id="content">
                
               <div id="leftContent">
                    <div id="sitemap">
                        <%@include  file="includes/sitemap.jsp" %>
                    </div>
                   <div id="maincontent">
                       <%@include  file="includes/dangky.jsp" %>
                   </div>

               </div>
               <div id="rightContent">
                   <br/>
                   <div id="thongtin">

                       <%@include  file="includes/dangnhap.jsp" %>
                   </div>
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
                <%@include  file="includes/footer.jsp" %>
            </div>

        </div>

    </body>
</html>
