<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/css/style.css"/>
   </head>
   <body>
      <h1>Welcome</h1>
      <h2>${message}</h2>
       
      <div>
      	<a href="${pageContext.request.contextPath}/personList">Product List</a> 
      </div>
         
      <div>
      	<a href="${pageContext.request.contextPath}/Customer/List">Customer List</a> 
      </div>
      <div>
      	<a href="${pageContext.request.contextPath}/Product/List">Product List</a> 
      </div>
      

       
   </body>
   
</html>