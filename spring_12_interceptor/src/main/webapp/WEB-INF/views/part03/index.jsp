<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href='resources/css/header.css' type='text/css' rel='stylesheet' />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script src="resources/js/header.js"></script>

<script type="text/javascript">
  $(document).ready(function(){
	  //alert('${sessionScope.chk}');
	  let chk = '${empty sessionScope.chk}'=='true' ? true : false;
	  console.log("chk=>" + chk);
	  init(chk);
  });
</script>

</head>
<body>
   <p id="logInPage">
      <a href="login.do">로그인</a>   
   </p>
   
   <p id="logOutPage">
      <a href="logout.do">로그아웃</a>
   </p>
   
   <div>
      <p>index page</p>
   </div>
</body>
</html>