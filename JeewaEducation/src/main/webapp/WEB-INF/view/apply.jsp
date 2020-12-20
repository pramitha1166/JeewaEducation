<!-- IT19056326 S.P.P.P.Wanigarathne -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>VISA Administrator - Login</title>

  <!-- Custom fonts for this template-->
  <link href="../static/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="../static/admin/css/sb-admin-2.min.css" rel="stylesheet">
</head>
<body class="bg-gradient-primary">

  <div class="container">

    <!-- Outer Row -->
    <div class="row justify-content-center">

      <div class="col-xl-10 col-lg-12 col-md-9">

        <div class="card o-hidden border-0 shadow-lg my-5">
          <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
              <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
              <div class="col-lg-6">
                <div class="p-5">
                  <div class="text-center">
                    <h1 class="h4 text-gray-900 mb-4">Hi! Please Fill Below Form to Apply for VISA</h1>
                  </div>
                  <form id="submitForm" action="#" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                      <input  type="text" class="form-control form-control-user" id="username" aria-describedby="emailHelp" name="username" placeholder="Enter UserName..." />
                    </div>
                    <div class="form-group">
                      <input  type="hidden"  id="role" value="VISASTUDENT"  />
                      <input  type="hidden"  id="enabled" value=1  />
                    </div>
                    <div class="form-group">
                      <input  type="password" class="form-control form-control-user" id="password" name="password" placeholder="Password" />
                    </div>
                    <div class="form-group">
                      <input path="repassword" type="password" class="form-control form-control-user" id="repassword" name="confirmpassword" placeholder="Confirm Password" />
                    </div>
     
                    <input type="submit" class="btn btn-primary btn-user btn-block" id="submit" value="Apply">                                  
                  </form>
                  <hr>
                  <div class="">or Sign Up With:</div>
                  <p><a href="/oauth2/authorize/google"><img src="http://pngimg.com/uploads/google/google_PNG19635.png" style="height:60px"></a></p>
                  <hr>
                  <div class="text-center">
                    <a class="small" href="register.html">Please Login if Already Applied</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>

      </div>

    </div>

  </div>

  
          <!-- Bootstrap core JavaScript-->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js" integrity="sha512-bLT0Qm9VnAYZDflyKcBaQ2gg0hSYNQrJ8RilYldYQ1FxQYoCLtUjuuRuZo+fjqhx/qtq/1itJ0C2ejDxltZVFg==" crossorigin="anonymous"></script>
  <script src="../../static/admin/vendor/jquery/jquery.min.js"></script>
  <script src="../../static/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
 

  <!-- Custom scripts for all pages-->
  <script src="../../static/admin/js/sb-admin-2.min.js"></script>

  <script src="../../static/admin/js/view.js"></script>
 
 <script src="../../static/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

 <script src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js" integrity="sha512-VEd+nq25CkR676O+pLBnDW09R7VQX9Mdiij052gVCp5yVH3jGtH70Ho/UUv4mJDsEdTvqRCFZg0NKGiojGnUCw==" crossorigin="anonymous"></script>

  <script>


  $(document).ready(function() {

	  $("#submitForm").submit(function(event) {

		  event.preventDefault();

		  addVisaStudent();
		  
		  });
		  
	  });
  
  function addVisaStudent() {


	  var enabled = 1;
	  var password = $('#password').val();
	  var role = 'VISASTUDENT';
	  var username = $('#username').val(); 
	  
	  var user = {
			  enabled: $("#enabled").val(),
			  password: $("#password").val(),
			  role: $("#role").val(),
			  username: $("#username").val(),
	  }

	  $.ajax({
		  	type : "POST",
			contentType : "application/json",
			url : '/apply/savestudent',
			data : JSON.stringify({'enabled': enabled, 'password': password, 'role': role, 'username': username}),
			success : function(result) {
				if(result.status == "Done"){
					toastr["success"]("Aplication Submit Suceessfully!");
				}else {
					toastr["info"]("Aplication Submit Fail!");
				}
				console.log(result);
			},
			error : function(e) {
				toastr["error"]("Error With Submiting Application. Maybe You Already Apply For VISA. Thank You.","Error");
				console.log("Error: ",e);
			}
		  });
  }

  </script>

</body>

</html>