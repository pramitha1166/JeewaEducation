<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Timetable admin page</title>

  <!-- Custom fonts for this template-->
  <link href="../static/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="../static/admin/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
          <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Timetables for Students</h1>
              </div>

		<hr>	
              <form  method ="post" class="user" action="save1">
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" name="stimetableID" placeholder="StimetableID">
                  </div>
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" name="batch" placeholder="Batch">
                  </div>
                </div>
                
                
            <label for="image">Timetable Image:</label><br> <input type="file"  id="image" name="timetablefile"><br><br>

                <input type="submit" value ="Submit" class="btn btn-primary btn-user btn-block">
                  
   
 		
                <br>
              </form>
<br>

		<div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Exam hall arrangements for Students</h1>
              </div>
              <hr>
                       <form method ="post" class="user" action="save3">
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" name="sHallID" placeholder="HallarrangementsID">
                  </div>
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" name="sbatch" placeholder="Batch">
                  </div>
                </div>
              
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" name="syear" placeholder="Year">
                  </div>
                 
                </div>

		<label for="image">Exam arrangements file:</label><br>
		  <input type="file" id="image" name="shallfile"><br><br>
		  
                 <input type="submit" value ="Submit" class="btn btn-primary btn-user btn-block">
		
               <br>
              </form>
<br>

		<div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Timetable for Teachers</h1>
              </div>
		<hr>
              <form method ="post" class="user" action="save2">
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" name="ltimetableID" placeholder="LtimetableID">
                  </div>
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" name="lname" placeholder="Lecturer Name">
                  </div>
                </div>
                
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" name="lyear" placeholder="Year">
                  </div>
              
                </div>

		<label for="image">Timetable Image:</label><br>  <input type="file" id="image" name="ltimetablefile"><br><br>
                 <input type="submit" value ="Submit" class="btn btn-primary btn-user btn-block">
                -
           
		
                <hr>
               <br>
              </form>

            </div>
          </div>
        </div>
      </div>
    </div>

  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="../static/admin/vendor/jquery/jquery.min.js"></script>
  <script src="../static/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="../static/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="../static/admin/js/sb-admin-2.min.js"></script>

</body>

</html>
