<!-- IT19056326 S.P.P.P.Wanigarathne -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>VISA pending students</title>

 
  <link href="../static/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="../static/admin/css/sb-admin-2.min.css" rel="stylesheet">

  <!-- Custom styles for this page -->
  <link href="../static/admin/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
</head>

<body id="page-top">



  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">VISA Administrator</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item">
        <a class="nav-link" href="/admin/visa-dashboard">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Dashboard</span></a>
      </li>

      <li class="nav-item">
        <a class="nav-link" href="/admin/visa-pendingstudents">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Visa Acceptable Students</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/admin/visa-pendinglist">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Pending VISA for Verification</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Verfied VISA</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>


    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <form class="form-inline">
            <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
              <i class="fa fa-bars"></i>
            </button>
          </form>

          <!-- Topbar Search -->
          <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
            <div class="input-group">
              <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
              <div class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fas fa-search fa-sm"></i>
                </button>
              </div>
            </div>
          </form>

          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
            <li class="nav-item dropdown no-arrow d-sm-none">
              <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-search fa-fw"></i>
              </a>
              <!-- Dropdown - Messages -->
              <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in" aria-labelledby="searchDropdown">
                <form class="form-inline mr-auto w-100 navbar-search">
                  <div class="input-group">
                    <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
                    <div class="input-group-append">
                      <button class="btn btn-primary" type="button">
                        <i class="fas fa-search fa-sm"></i>
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </li>

            <!-- Nav Item - Alerts -->
            <li class="nav-item dropdown no-arrow mx-1">
              <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-bell fa-fw"></i>
                <!-- Counter - Alerts -->
                <span class="badge badge-danger badge-counter">3+</span>
              </a>
              <!-- Dropdown - Alerts -->
              <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="alertsDropdown">
                <h6 class="dropdown-header">
                  Alerts Center
                </h6>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="mr-3">
                    <div class="icon-circle bg-primary">
                      <i class="fas fa-file-alt text-white"></i>
                    </div>
                  </div>
                  <div>
                    <div class="small text-gray-500">December 12, 2019</div>
                    <span class="font-weight-bold">A new monthly report is ready to download!</span>
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="mr-3">
                    <div class="icon-circle bg-success">
                      <i class="fas fa-donate text-white"></i>
                    </div>
                  </div>
                  <div>
                    <div class="small text-gray-500">December 7, 2019</div>
                    $290.29 has been deposited into your account!
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="mr-3">
                    <div class="icon-circle bg-warning">
                      <i class="fas fa-exclamation-triangle text-white"></i>
                    </div>
                  </div>
                  <div>
                    <div class="small text-gray-500">December 2, 2019</div>
                    Spending Alert: We've noticed unusually high spending for your account.
                  </div>
                </a>
                <a class="dropdown-item text-center small text-gray-500" href="#">Show All Alerts</a>
              </div>
            </li>

            <!-- Nav Item - Messages -->
            <li class="nav-item dropdown no-arrow mx-1">
              <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-envelope fa-fw"></i>
                <!-- Counter - Messages -->
                <span class="badge badge-danger badge-counter">7</span>
              </a>
              <!-- Dropdown - Messages -->
              <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="messagesDropdown">
                <h6 class="dropdown-header">
                  Message Center
                </h6>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="dropdown-list-image mr-3">
                    <img class="rounded-circle" src="https://source.unsplash.com/fn_BT9fwg_E/60x60" alt="">
                    <div class="status-indicator bg-success"></div>
                  </div>
                  <div class="font-weight-bold">
                    <div class="text-truncate">Hi there! I am wondering if you can help me with a problem I've been having.</div>
                    <div class="small text-gray-500">Emily Fowler · 58m</div>
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="dropdown-list-image mr-3">
                    <img class="rounded-circle" src="https://source.unsplash.com/AU4VPcFN4LE/60x60" alt="">
                    <div class="status-indicator"></div>
                  </div>
                  <div>
                    <div class="text-truncate">I have the photos that you ordered last month, how would you like them sent to you?</div>
                    <div class="small text-gray-500">Jae Chun · 1d</div>
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="dropdown-list-image mr-3">
                    <img class="rounded-circle" src="https://source.unsplash.com/CS2uCrpNzJY/60x60" alt="">
                    <div class="status-indicator bg-warning"></div>
                  </div>
                  <div>
                    <div class="text-truncate">Last month's report looks great, I am very happy with the progress so far, keep up the good work!</div>
                    <div class="small text-gray-500">Morgan Alvarez · 2d</div>
                  </div>
                </a>
                <a class="dropdown-item d-flex align-items-center" href="#">
                  <div class="dropdown-list-image mr-3">
                    <img class="rounded-circle" src="https://source.unsplash.com/Mv9hjnEUHR4/60x60" alt="">
                    <div class="status-indicator bg-success"></div>
                  </div>
                  <div>
                    <div class="text-truncate">Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</div>
                    <div class="small text-gray-500">Chicken the Dog · 2w</div>
                  </div>
                </a>
                <a class="dropdown-item text-center small text-gray-500" href="#">Read More Messages</a>
              </div>
            </li>

            <div class="topbar-divider d-none d-sm-block"></div>

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Valerie Luna</span>
                <img class="img-profile rounded-circle" src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
              </a>
              <!-- Dropdown - User Information -->
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#">
                  <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                  Profile
                </a>
                <a class="dropdown-item" href="#">
                  <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                  Settings
                </a>
                <a class="dropdown-item" href="#">
                  <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                  Activity Log
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Logout
                </a>
              </div>
            </li>

          </ul>

        </nav>
        <!-- End of Topbar -->

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800">Update VISA Application Form Details</h1>
         
          <form:form  modelAttribute="pendingforvisa" class="wasvalidated" method="post" action="updatevisa">

            <div class="form-row">
                <div class="col-md-3 mb-3">
                    <label for="validationTooltipUsername">Student ID</label>
                    <div class="input-group">
                      <div class="input-group-prepend">
                        <span class="input-group-text" id="validationTooltipUsernamePrepend">@</span>
                      </div>
                      <form:input path="id" name="id" type="text" class="form-control" id="validationTooltipUsername" aria-describedby="validationTooltipUsernamePrepend"  readonly="readonly"/>                     
                    </div>
                  </div>
            </div>

            <div class="form-row">
              <div class="col-md-4 mb-3">
                <label for="validationTooltip01">First name</label>
                <form:input path="fname" name="fname" type="text" class="form-control" id="firstname"  placeholder="First name"  />
                  <div class="has-error">
                  	<form:errors path="fname" class="help-inline" style="color:red;" />
                  </div>
              </div>
              <div class="col-md-4 mb-3">
                <label for="validationTooltip02">Last name</label>
                <form:input path="lname" name="lname" type="text" class="form-control" id="lastname" placeholder="Last name"   />
                 <div class="has-error">
                  	<form:errors path="lname" class="help-inline" style="color:red;" />
                  </div>
              </div>
              <div class="col-md-4 mb-3">
                <label for="validationTooltip02">Other name</label>
                <form:input path="other" name="lname" type="text" class="form-control" id="othername" placeholder="Other name"   />
                 <div class="has-error">
                  	<form:errors path="other" class="help-inline" style="color:red;" />
                  </div>
              </div>
              
            </div>

            <div class="form-row">
                <div class="col-md-6 mb-3 mt-3">
                    <label for="validationTooltipUsername">Personal Email for VISA Process</label>
                    <div class="input-group">
                      <form:input path="email" name="email" type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"  class="form-control" id="visaemail"  placeholder="student@gmail.com"  aria-describedby="validationTooltipUsernamePrepend" />
                       <div class="has-error">
                  	<form:errors path="email" class="help-inline" style="color:red;" />
                  </div>
                    </div>
                  </div>
            </div>
                
            <div class="form-row">

                <div class="col-md-6 mb-3 mt-3">
                    <label for="validationTooltipUsername">Gender</label>
                    <div class="input-group">

                        <form:select path="gender" class="custom-select" id="gender" name="gender" >
                            <option >Select the gender</option>
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                            <option value="Other">Other</option>
                          </form:select>
                    </div>
                      <div class="has-error">
                  	<form:errors path="gender" class="help-inline" style="color:red;" />
                  </div>
                  </div>

                  <div class="col-md-6 mb-3 mt-3">
                    <label for="validationTooltipUsername">Select Date Of Birth</label>
                    <div class="input-group">
                      <form:input path="dob" type="date" class="form-control" name="dob"  id="dateofbirth"  aria-describedby="validationTooltipUsernamePrepend" />
                        <div class="has-error">
                  	<form:errors path="dob" class="help-inline" style="color:red;" />
                  </div>
                    </div>
                  </div>

            </div>

            <label for="validationTooltip03 mt-1">Place Of Birth</label>

            <div class="form-row ">
              <div class="col-md-6 mb-3">
                <form:input path="city" type="text" class="form-control" name="city" id="city" placeholder="City"  />
                <div class="has-error">
                  	<form:errors path="city" class="help-inline" style="color:red;" />
                  </div>
              </div>
              <div class="col-md-3 mb-3 ">
                <form:input path="state" type="text" class="form-control" name="state" id="state" placeholder="State"   />
                  <div class="has-error">
                  	<form:errors path="state" class="help-inline" style="color:red;" />
                  </div>
              </div>
              <div class="col-md-3 mb-3 ">
                <form:input path="zip" type="text" class="form-control" name="zip" id="zip" placeholder="Zip"  />
                  <div class="has-error">
                  	<form:errors path="zip" class="help-inline" style="color:red;" />
                  </div>
              </div>
            </div>

            <div class="form-row">

                <div class="col-md-6 mb-2 mt-3">
                    <label for="validationTooltipUsername">Current Martial Status</label>
                    <div class="input-group">

                        <form:select class="custom-select" id="marrage" name="marrage"  path="marrage">
                            <option ></option>
                            <option value="Married">Married</option>
                            <option value="Engaged">Engaged</option>
                            <option value="Not-Married">Not-Married</option>
                          </form:select>
                    </div>
                      <div class="has-error">
                  	<form:errors path="marrage" class="help-inline" style="color:red;" />
                  </div>
                  </div>
                </div> 

                  <div class="col-md-6 mb-2 mt-3">
                    <label for="validationTooltip01">Country Of Current Residence</label>
                    <form:input path="country" type="text" class="form-control" id="currentResidence" name="country"  placeholder="Country Name"  />
                      <div class="has-error">
                  	<form:errors path="country" class="help-inline" style="color:red;" />
                  </div>
            	</div>
			
			<input onclick="getUpdate();" type="submit" class="btn btn-primary mt-4" value="Update">
            <button class="btn btn-secondary mt-4 ml-4" type="submit" id="cancel">Cancel</button>
          </form:form>
        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

      <!-- Footer -->
      <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; Your Website 2020</span>
          </div>
        </div>
      </footer>
      <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.html">Logout</a>
        </div>
      </div>
    </div>
  </div>
  
  
  <script>

	function getUpdate() {

		var retVal = confirm("Do You Want to Update This Record?");
		if(retVal==true) {
			return true;
			} 
		else {
			return false;	
			} 
		
		}


</script>	
  
  <script>

  function editText() {
	    document.getElementById('firstname').removeAttribute('readonly');
	    document.getElementById('lastname').removeAttribute('readonly');
	    document.getElementById('visaemail').removeAttribute('readonly');
	    document.getElementById('gender').removeAttribute('disabled');
	    document.getElementById('dateofbirth').removeAttribute('readonly');
	    document.getElementById('city').removeAttribute('readonly');
	    document.getElementById('state').removeAttribute('readonly');
	    document.getElementById('zip').removeAttribute('readonly');
	    document.getElementById('marrage').removeAttribute('disabled');
	    document.getElementById('currentResidence').removeAttribute('readonly');

	    document.getElementById('updateText').innerText = "Save";
	    document.getElementById('cancel').removeAttribute('hidden');
	}

  </script>
  
  <!-- Bootstrap core JavaScript-->
  <script src="../static/admin/vendor/jquery/jquery.min.js"></script>
  <script src="../static/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="../static/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="../static/admin/js/sb-admin-2.min.js"></script>

<script src="../static/admin/js/view.js"></script>

</body>

</html>