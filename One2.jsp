<html>
<body>
This is One.jsp!!!

<br>

<%
int fno=100,sno=20;
int sum=fno+sno;
int sub=fno-sno;
out.println("Summation="+sum);
%>

<br>

<%
out.println("Substraction="+sub);

for(int i=1;i<=4;i++)
{
%>

<br>
CPC Academy

<%
out.println(i);
}
%>


</html>
</body>

/*
O/P:
This is One.jsp!!!
Summation=120
Substraction=80
CPC Academy 1
CPC Academy 2
CPC Academy 3
CPC Academy 4
*/