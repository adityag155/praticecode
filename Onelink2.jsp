<html>
<body>

<%
int fno=Integer.parseInt(request.getParameter("fno"));
int sno=Integer.parseInt(request.getParameter("sno"));
int sum=fno+sno;
%>

<center>
<font color="blue" size="15">


<%
out.println("Summation="+sum);
%>

</font>
</center>



</html>
</body>