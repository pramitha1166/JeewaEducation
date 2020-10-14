<!-- IT19056326 S.P.P.P.Wanigarathne -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%
        
        
        
    //	if(session.getAttribute("visauserid")==null){
    	//	response.sendRedirect("/profile/visa");
    	//}
    %>
    
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

  <title>Employee Admin - Admin Profile</title>
  

  <link href="../../static/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="../../static/admin/css/sb-admin-2.min.css" rel="stylesheet">
  
  
  <!-- css for toast massage -->
  <link href="../../static/admin/css/visatoast.css" rel="stylesheet">

  <!-- Custom styles for this page -->
  <link href="../../static/admin/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
  
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css"></head>
  
</head>

<body id="page-top">


  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-danger sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">JeewaEducation</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item">
        <a class="nav-link" href="index.html">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>My VISA Section</span></a>
      </li>

      <li class="nav-item">
        <a class="nav-link" href="index.html">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Home</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="index.html">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>About</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="index.html">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Contact Us</span></a>
      </li>

     



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
                <button class="btn btn-danger" type="button">
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
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">
                	<security:authorize access="isAuthenticated()">
					    <security:authentication property="principal.username" />
					</security:authorize>
                </span>
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
                <a class="dropdown-item" href="/logout" data-toggle="modal" data-target="#logoutModal">
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Logout
                </a>
              </div>
            </li>

          </ul>

         </nav>

                
        <!-- Begin Page Content -->
        <div class="container-fluid">

            <!-- Page Heading -->
            <h1 class="h3 mb-2 text-gray-800">Submit VISA Application Form Details</h1>
            
            <h2 class="h2 mb-2 text-gray-800">Hello ${visastd.firstname} ${visastd.lastname}. Now you can submit your VISA.</h2>
           
            
                 <div class="form-row">
                 
                 	<div class="col-md-6 mb-2 mt-3">
                 	
                 		2*2 User Photo:<input type="file" class="form-control text-info" name="medicalFile" id="medical" />
            			
                 	
                 	</div>
                 	<div class="col-md-3 mb-2 mt-3">
                 	
                 		<button id="uploadFile" class="uploadImageBtn" onclick="uploadFile();">Upload</button>
                 		
                 	
                 	</div>
                 	<div class="col-md-3 mb-2 mt-6">
                 	
                 		<img class="img-fluid" name="medicalThumb" id="medicalThumb" width />
                 	
                 	</div>
                 
                 </div>
                 
           
            <form:form class="wasvalidated" modelAttribute="application" id="submitForm" enctype="multipart/form-data">
  
              <div class="form-row">
                <div class="col-md-4 mb-3">
                  <label for="validationTooltip01">First name</label>
                  <form:input type="text" value="${visastd.firstname}" path="fname" class="form-control text-info" id="fname" name="fname"  aria-describedby="validationTooltipUsernamePrepend"/>
                  
                  <div class="has-error">
                  	<form:errors path="fname" class="help-inline" style="color:red;" />
                  </div>
                  
                  
                </div>
                <div class="col-md-4 mb-3">
                  <label for="validationTooltip02">Last name</label>
                  <form:input path="lname" value="${visastd.lastname}" type="text" class="form-control text-info" id="lname"   name="lname"  />
                  
                  <div class="has-error">
                  	<form:errors path="lname" class="help-inline" style="color:red;" />
                  </div>               
                  
                </div>
                <div class="col-md-4 mb-3">
                  <label for="validationTooltip02">Other name</label>
                  <form:input path="other" type="text" class="form-control text-info" id="other" name="other"   />
                  
                  <div class="has-error">
                  	<form:errors path="other" class="help-inline" style="color:red;" />
                  </div>
                </div>
                
              </div>
  
              <div class="form-row">
                  <div class="col-md-6 mb-3 mt-3">
                      <label for="validationTooltipUsername">Personal Email for VISA Process</label>
                    <!-- pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"  -->
                        <form:input value="${visastd.email}" path="email" type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" id="email" name="email" class="form-control text-info"   aria-describedby="validationTooltipUsernamePrepend" />
                        
		                  <div class="has-error">
		                  	<form:errors path="email" class="help-inline" style="color:red;" />
		                  </div>
                      
                    </div>
              </div>
                  
              <div class="form-row">
  
                  <div class="col-md-6 mb-3 mt-3">
                      <label for="validationTooltipUsername">Gender</label>
                      <div class="input-group">
  
                          <form:select path="gender" class="custom-select text-info" id="gender" name="gender" >
                              <option value="${visastd.sex}">${visastd.sex}</option>
                              <option value="Male">Male</option>
                              <option value="Female">Female</option>                         
                          </form:select>
                            
                      </div>
                      
			                  <div class="has-error">
			                  	<form:errors path="gender" class="help-inline" style="color:red;" />
			                  </div>
                    </div>
  
                    <div class="col-md-6 mb-3 mt-3">
                      <label for="validationTooltipUsername">Select Date Of Birth</label>
                      <div class="input-group">
                        <form:input path="dob" value="" type="date" class="form-control text-info" name="dob" id="dob" aria-describedby="validationTooltipUsernamePrepend" />                              
                      </div>
                        <div class="has-error">
                  			<form:errors path="dob" class="help-inline" style="color:red;" />
                  		</div>
                    </div>
  
              </div>
  
              <label for="validationTooltip03 mt-1">Place Of Birth</label>
  
              <div class="form-row ">
                <div class="col-md-6 mb-3">
                  City:<form:input path="city" type="text" class="form-control text-info" name="city" id="city" />
                  <div class="has-error">
                  	<form:errors path="city" class="help-inline" style="color:red;" />
                  </div>
                </div>
                <div class="col-md-3 mb-3 ">
                  State:<form:input path="state" type="text" class="form-control text-info" name="state" id="state" />
                  <div class="has-error">
                  	<form:errors path="state" class="help-inline" style="color:red;" />
                  </div>
                </div>
                <div class="col-md-3 mb-3 ">
                  Zip:<form:input path="zip" type="text" class="form-control text-info" name="zip" id="zip" />
                  <div class="has-error">
                  	<form:errors path="zip" class="help-inline" style="color:red;" />
                  </div>
                </div>
              </div>
  
              <div class="form-row">
  
                  <div class="col-md-6 mb-2 mt-3">
                      <label for="validationTooltipUsername">Current Martial Status</label>
                      <div class="input-group">
  
                          <form:select path="marrage" class="custom-select text-info" name="marrage" id="marrage" >
                              <option value="">Select Current Martial Status</option>
                              <option value="Married">Married</option>
                              <option value="Engaged">Engaged</option>
                              <option value="Not-Married">Not-Married</option>
                            </form:select>
                      </div>
                      <div class="has-error">
                  	      <form:errors path="marrage" class="help-inline" style="color:red;" />
                  	  </div>
                    </div>
                    
                    <div class="col-md-6 mb-2 mt-3">
                      <label for="validationTooltip01">Country Of Current Residence</label>
                      <form:input path="country" type="text" name="country" class="form-control text-info" id="country" />
                      <form:input value="${visastd.id}" path="studentid" type="hidden" name="studentid" class="form-control text-info" id="studentid" />
                      <form:input value="not-verified" path="status" type="hidden" name="status" class="form-control text-info" id="status"/>
                      <div class="has-error">
                  		 <form:errors path="country" class="help-inline" style="color:red;" />          
                  	  </div>
              		</div>
                 </div>
               	
  
                  <input  type="hidden" value="<c:out value="${pageContext.request.remoteUser}"/>" name="username">
  
              <form:button  class="btn btn-primary mt-4" type="submit" id="updateText">Submit</form:button>
              <button class="btn btn-secondary mt-4 ml-4" type="reset" id="cancel" >Reset</button>
            </form:form>
                 		
          </div>







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
            </div>


        </div>      
        
        
             
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
          <a class="btn btn-primary" href="/logout">Logout</a>
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



	function validateForm() {

		var fname = $('#fname').val();
		var lname = $('#lname').val();
		var email = $('#email').val();
		var dob = $('#dob').val();
		//var pattern = '/^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/';

		if(fname=='') {
			toastr["warning"]("Firstname Cannot Be Emplty!");
			return false;
		}else if(lname=='') {
			toastr["warning"]("Last Name Cannot Be Emplty!");
			return false;
		}else if(email=='') {
			toastr["warning"]("Email Cannot Be Emplty!");
			return false;
		}else if(dob=='') {
			toastr["warning"]("Date Of Birth Cannot Be Emplty!");
			return false;
		}
		else {
			return true;
		}
		
	}
	
  
	function getAdd() {

		var retVal = confirm("Are You Sure to Apply?");
		if(retVal==true) {	
			var res = validateForm();

			if(res==true) {
				submitApplication();
				return true;
			}else {
				return false;	
			}
		} 
		else {
			return false;	
		} 
		
	}

 
	
	$(document).ready(function() {


		$("#medical").change(function() {
			showMedicaThumb(this);
		});
		

		$("#submitForm").submit(function(event) {

			event.preventDefault();

			//submitApplication();
			getAdd();

		});

		$("#uploadFile").submit(function() {
			
			uploadFile();
			
		});


	});



	function uploadFile() {

		var formData = new FormData();
		var file = $('#medical')[0].files[0];

		formData.append("fileUpload", file);
		
		$.ajax({
	        url : '/profile/visa/upload',
	        type : 'POST',
	        data : formData,
	        enctype : 'multipart/form-data',
	        contentType : false,
	        cache : false,
	        processData : false,
	        beforeSend: function() {
		        
	        	
	        	toastr["info"]("File is Uploading!");
				
		      	},
	        success : function(response) {
	        
	        	//alert("sucess");
	        	//$(this).addClass("active");
	        	toastr["success"]("File Upload Successfully!");
	        	
		        },
	        error: function(){

	        	toastr["warning"]("File Upload Not Sucess! Please Check File And Reupload!");
	        	//toastr.success("hasdasdsa","Success",{timeOut: 3000});
		        }    
		});

		
	}
	
	
	function showMedicaThumb(inputFile) {

		file = inputFile.files[0];
		reader = new FileReader();

		reader.onload = function(e) {
			$('#medicalThumb').attr('src', e.target.result);
		};

		reader.readAsDataURL(file); 
		
	}

	function submitApplication() {
		
		var visa = {

				fname : $("#fname").val(),
				lname : $("#lname").val(),
				other : $("#other").val(),
				email : $("#email").val(),
				gender : $("#gender").val(),
				dob : $("#dob").val(),
				city : $("#city").val(),
				state : $("#state").val(),
				zip : $("#zip").val(),
				marrage : $("#marrage").val(),
				country : $("#country").val(),
				studentid : $("#studentid").val(),
				status : $("#status").val(),
		}
		
		$.ajax({

			type : "POST",
			contentType : "application/json",
			url : "/profile/visa/save",
			data : JSON.stringify(visa),
			dataType : 'json',
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

		//resetData();

	}

	

	function resetData() {

		$("#fname").val("");
		$("#lname").val("");
		$("#other").val("");
		$("#email").val("");
		$("#gender").val("");
		$("#dob").val("");
		$("#city").val("");
		$("#state").val("");
		$("#zip").val("");
		$("#marrage").val("");
		$("#country").val("");
		$("#studentid").val("");
		$("#status").val("");	
		
	}
		

	
	</script>
	

    </body>
</html>