<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- directive -->
<%@ page import="java.time.LocalTime,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current Time</title>  <br/>
</head>
<body>
  <!-- This is the declaration part -->
   <%!
      String message="Try jsp page";
      public String greet(String name)
      {
    	   return name.toUpperCase();
      }
      List<String> list=new ArrayList<>(Arrays.asList("apple","melon","banana"));
      int k=6;
   
   %>
   
	   Time now:<%= LocalTime.now() %>
	   <%= message %><br/> <!-- this is the expression  -->
	   <%= greet("sankar") %>
	   <ul>
	   <% for(int i=1;i<k;i++){ %>
	       <li> <%=k %>*<%=i%> = <%=(i*k) %>
	    <% } %>
	    </ul>
	    <% for(int i=0;i<list.size();i++) {%>
	        <li><%=list.get(i) %></li>
	    <%} %>
	   
	
</body>
</html>
