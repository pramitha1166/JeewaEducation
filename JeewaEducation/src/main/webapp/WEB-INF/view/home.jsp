<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Document title -->
    <title>Jeewa Education</title>
    <link rel='icon' href='favicon.ico' type='image/x-icon'/ >
    <!-- Stylesheets & Fonts -->
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,400i,700,700i%7CRajdhani:400,600,700"
        rel="stylesheet">
    <!-- Plugins Stylesheets -->
    <link rel="stylesheet" href="static/assets/css/loader/loaders.css">
    <link rel="stylesheet" href="static/assets/css/font-awesome/font-awesome.css">
    <link rel="stylesheet" href="static/assets/css/bootstrap.css">
    <link rel="stylesheet" href="static/assets/css/aos/aos.css">
    <link rel="stylesheet" href="static/assets/css/swiper/swiper.css">
    <link rel="stylesheet" href="static/assets/css/lightgallery.min.css">
    <!-- Template Stylesheet -->
    <link rel="stylesheet" href="static/assets/css/style.css">
    <!-- Responsive Stylesheet -->
    <link rel="stylesheet" href="static/assets/css/responsive.css">
</head>
<body>

  <!-- Loader Start -->
    <div class="css-loader">
        <div class="loader-inner line-scale d-flex align-items-center justify-content-center"></div>
    </div>
    <!-- Loader End -->
    <!-- Header Start -->
    <header class="position-absolute w-100">
        <div class="container">
            <div class="top-header d-none d-sm-flex justify-content-between align-items-center">
                <div class="contact">
                    <a href="tel:+1234567890" class="tel"><i class="fa fa-phone" aria-hidden="true"></i>+94 38 2 241721</a>
                    <a href="mailto:info@yourmail.com"><i class="fa fa-envelope"
                            aria-hidden="true"></i>panadura@jeewaeducation.lk</a>
                </div>
                <nav class="d-flex aic">
                    <a href="/login" class="login"><i class="fa fa-user" aria-hidden="true"></i>Login</a>
                    <ul class="nav social d-none d-md-flex">
                        <li><a href="https://www.facebook.com/JeewaEducation/" target="_blank"><i class="fa fa-facebook"></i></a></li>
                    </ul>
                </nav>
            </div>
            <nav class="navbar navbar-expand-md navbar-light">
                <a class="navbar-brand" href="index.html"><img src="assets/images/jeewa.png" alt=""></a>
                <div class="group d-flex align-items-center">
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation"><span
                            class="navbar-toggler-icon"></span></button>
                    <a class="login-icon d-sm-none" href="#"><i class="fa fa-user"></i></a>
                    <a class="cart" href="#"><i class="fa fa-shopping-cart"></i></a>
                </div>
                <a class="search-icon d-none d-md-block" href="#"><i class="fa fa-search"></i></a>
                <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">About Us</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Services</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Contact Us</a></li>
                    </ul>
                    <form class="bg-white search-form" method="get" id="searchform">
                        <div class="input-group">
                            <input class="field form-control" id="s" name="s" type="text" placeholder="Search">
                            <span class="input-group-btn">
                                <input class="submit btn btn-primary" id="searchsubmit" name="submit" type="submit"
                                    value="Search">
                            </span>
                        </div>
                    </form>
                </div>
            </nav>
        </div>
    </header>
    <!-- Header End -->
    <!-- Hero Start -->
    <section class="hero">
        <div class="container">
            <div class="row">
                <div class="col-12 offset-md-1 col-md-11">
                    <div class="swiper-container hero-slider">
                        <div class="swiper-wrapper">
                            <div class="swiper-slide slide-content d-flex align-items-center">
                                <div class="single-slide">
                                    <h1 data-aos="fade-right" data-aos-delay="200">Jeewa Education<br> Foreign Higher Education 
                                    </h1>
                                    <p data-aos="fade-right" data-aos-delay="600">
                                    </p>
                          
                                    <a data-aos="fade-right" data-aos-delay="900" href="/apply" class="btn btn-primary">Apply for VISA Now
                                        </a>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <!-- Add Control -->
            <span class="arr-left"><i class="fa fa-angle-left"></i></span>
            <span class="arr-right"><i class="fa fa-angle-right"></i></span>
        </div>
        <div class="texture"></div>
        <div class="diag-bg"></div>
    </section>
    <!-- Hero End -->
    <!-- Call To Action Start -->
    <section class="cta" data-aos="fade-up" data-aos-delay="0">
        <div class="container">
            <div class="cta-content d-xl-flex align-items-center justify-content-around text-center text-xl-left">
                <div class="content" data-aos="fade-right" data-aos-delay="200">
                    <h2>Study IELTS at Jeewa</h2>
                    <p>The International English Language Testing System (IELTS) is the most recognized and popular English language test to study and work abroad. IELTS test marks your English language proficiency by checking your fluency in four major areas; listening, reading, writing and speaking. It is a qualification that is accepted by over 10,000 organizations worldwide.</p>
                </div>
            </div>
        </div>
    </section>
    
    
    <section class="services">
        <div class="container">
            <div class="title text-center">
                
                <h1 class="title-blue">Our Partner Campuses</h1>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-lg-4">
                        <div class="media" data-aos="fade-up" data-aos-delay="200" data-aos-duration="400">
                            <div class="media-body">
                                <h5>Study in Adelaide</h5>
                                Adelaide is the ideal place to live and study. It’s affordable, friendly, accessible, and is rated as one of the world’s most liveable cities.

With over 500 occupations available for international graduates, Adelaide is the best place in Australia to gain valuable post-study work experience.
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-4">
                        <div class="media" data-aos="fade-up" data-aos-delay="400" data-aos-duration="600">
                            
                              <div class="media-body">
                                <h5>Study in Adelaide</h5>
                                Adelaide is the ideal place to live and study. It’s affordable, friendly, accessible, and is rated as one of the world’s most liveable cities.

With over 500 occupations available for international graduates, Adelaide is the best place in Australia to gain valuable post-study work experience.
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-4">
                        <div class="media" data-aos="fade-up" data-aos-delay="600" data-aos-duration="800">
                              <div class="media-body">
                                <h5>Study in Adelaide</h5>
                                Adelaide is the ideal place to live and study. It’s affordable, friendly, accessible, and is rated as one of the world’s most liveable cities.

With over 500 occupations available for international graduates, Adelaide is the best place in Australia to gain valuable post-study work experience.
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-4">
                        <div class="media" data-aos="fade-up" data-aos-delay="200" data-aos-duration="400">
                              <div class="media-body">
                                <h5>Study in Adelaide</h5>
                                Adelaide is the ideal place to live and study. It’s affordable, friendly, accessible, and is rated as one of the world’s most liveable cities.

With over 500 occupations available for international graduates, Adelaide is the best place in Australia to gain valuable post-study work experience.
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-4">
                        <div class="media" data-aos="fade-up" data-aos-delay="400" data-aos-duration="600">
                              <div class="media-body">
                                <h5>Study in Adelaide</h5>
                                Adelaide is the ideal place to live and study. It’s affordable, friendly, accessible, and is rated as one of the world’s most liveable cities.

With over 500 occupations available for international graduates, Adelaide is the best place in Australia to gain valuable post-study work experience.
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-4">
                        <div class="media" data-aos="fade-up" data-aos-delay="600" data-aos-duration="800">
                             <div class="media-body">
                                <h5>Study in Adelaide</h5>
                                Adelaide is the ideal place to live and study. It’s affordable, friendly, accessible, and is rated as one of the world’s most liveable cities.

With over 500 occupations available for international graduates, Adelaide is the best place in Australia to gain valuable post-study work experience.
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
   
    <!-- Recent Posts End -->
    <!-- Trust Start -->
    
    <!-- Pricing Start -->
   
    <!-- Pricing End -->
    <!-- Testimonial and Clients Start -->
   
    <!-- Testimonial and Clients End -->
    <!-- Call To Action 2 Start -->

    <!-- Call To Action 2 End -->
    <!-- Footer Start -->
    <footer>
        <!-- Widgets Start -->
        <div class="footer-widgets">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-xl-3">
                        <div class="single-widget contact-widget" data-aos="fade-up" data-aos-delay="0">
                            <h6 class="widget-tiltle">&nbsp;</h6>
                            
                            <div class="media">
                                <i class="fa fa-map-marker"></i>
                                <div class="media-body ml-3">
                                    <h6>Address</h6>
                                    474,Athur V. Dias Mavatha, Panadura, Sri Lanka.
                                </div>
                            </div>
                            <div class="media">
                                <i class="fa fa-envelope-o"></i>
                                <div class="media-body ml-3">
                                    <h6>Have any questions?</h6>
                                    <a href="mailto:support@steelthemes.com"> support@jeewaeducation.lk</a>
                                </div>
                            </div>
                            <div class="media">
                                <i class="fa fa-phone"></i>
                                <div class="media-body ml-3">
                                    <h6>Call us</h6>
                                    <a href="tel:+610791803458"> +94 38 2 243418, +94 38 2 241721, +94 38 5 677883</a>
                                </div>
                            </div>
                            <div class="media">
                                <i class="fa fa-fax"></i>
                                <div class="media-body ml-3">
                                    <h6>Fax</h6>
                                    <a> +94 38 4 281829</a>
                                </div>
                            </div>
                        </div>
                    </div>
            
   
                    <div class="col-md-6 col-xl-3">
               
                        <div class="single-widget subscribe-widget" data-aos="fade-up" data-aos-delay="800">
                            
                            <p>We respect your privacy</p>
                            <ul class="nav social-nav">
                                <li><a href="https://www.facebook.com/fh5co" target="_blank"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Widgets End -->
        <!-- Foot Note Start -->
        <div class="foot-note">
            <div class="container">
                <div
                    class="footer-content text-center text-lg-left d-lg-flex justify-content-between align-items-center">
                    <p class="mb-0" data-aos="fade-right" data-aos-offset="0">&copy; 2019 All Rights Reserved. Design by Pramitha Wanigarathne.</p>
                    <p class="mb-0" data-aos="fade-left" data-aos-offset="0"><a href="#">Terms Of Use</a><a
                            href="#">Privacy & Security
                            Statement</a></p>
                </div>
            </div>
        </div>
        <!-- Foot Note End -->
    </footer>
    <!-- Footer Endt -->
    <!--jQuery-->
    <script src="static/assets/js/jquery-3.3.1.js"></script>
    <!--Plugins-->
    <script src="static/assets/js/bootstrap.bundle.js"></script>
    <script src="static/assets/js/loaders.css.js"></script>
    <script src="static/assets/js/aos.js"></script>
    <script src="static/assets/js/swiper.min.js"></script>
    <script src="static/assets/js/lightgallery-all.min.js"></script>
    <!--Template Script-->
    <script src="static/assets/js/main.js"></script>
</body>

</html>