<!DOCTYPE html>
<%@page import="com.surabhi.domain.PalUI"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.surabhi.domain.Pal"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Surabi Trust</title>
	
    <!-- css -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link href="resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<link href="resources/css/nivo-lightbox.css" rel="stylesheet" />
	<link href="resources/css/nivo-lightbox-theme/default/default.css" rel="stylesheet" type="text/css" />
	<link href="resources/css/animations.css" rel="stylesheet" />
    <link href="resources/css/style.css" rel="stylesheet">
	<link href="resources/color/default.css" rel="stylesheet">

</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-custom">

	


	<!-- Section: services -->
    <section id="service" class="home-section color-dark bg-gray">
		<div class="container marginbot-50">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<div>
					<div class="section-heading text-center">
					<h2 class="h-bold">What we can do for you</h2>
					<div class="divider-header"></div>
					</div>
					</div>
				</div>
			</div>

		</div>

		<div class="text-center">
		<div class="container">
	
   
        <div class="row animatedParent">
        <%
   List<PalUI> benefeciaries =(ArrayList<PalUI>) request.getAttribute("benefeciaries");
							for (int i = 0; i < benefeciaries.size(); i++) {
								
%>
            <div class="col-xs-6 col-sm-4 col-md-4">
				<div class="animated rotateInDownLeft">
                <div class="service-box">
					<div class="service-icon">
						<span class="fa fa-camera fa-2x"></span> 
					</div>
					<div class="service-desc">						
						<h5><%=benefeciaries.get(i).getName()%></h5>
						<div class="divider-header"></div>
						<p>
						<span style="font-weight:bold;">Interested in </span><%=benefeciaries.get(i).getLikingSubject()%><%=benefeciaries.get(i).getLikingSport()%><%=benefeciaries.get(i).getOtherInterest()%>
						</p>
						<a href="javascript:submit('<%=i%>');" class="btn btn-skin">Select</a>
					</div>
                </div>
				</div>
            </div>
			
<%} %>
        </div>		
		</div>
		</div>
	</section>
	<!-- /Section: services -->
	<form id="chooseBeneficiaryForm" method="POST" action="connectBeneficiary" >
	<input type="hidden"  id="beneficiaryIndex" value="" name="beneficiaryIndex"/>
	</form>

	
	<footer>
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<ul class="footer-menu">
						<li><a href="#">Home</a></li>
						<li><a href="#">Press release</a></li>
					</ul>
				</div>
				<div class="col-md-6 text-right">
					<p>&copy;Copyright 2015 - Surabi. Designed by Surabi Team</p>
                    <!-- 
                        All links in the footer should remain intact. 
                        Licenseing information is available at: http://bootstraptaste.com/license/
                        You can buy this theme without footer links online at: http://bootstraptaste.com/buy/?theme=Bocor
                    -->
				</div>
			</div>	
		</div>
	</footer>

    <!-- Core JavaScript Files -->
    <script src="resources/js/jquery.min.js"></script>	 
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script src="resources/js/jquery.sticky.js"></script>
    <script src="resources/js/jquery.easing.min.js"></script>	
	<script src="resources/js/jquery.scrollTo.js"></script>
	<script src="resources/js/jquery.appear.js"></script>
	<script src="resources/js/stellar.js"></script>
	<script src="resources/js/nivo-lightbox.min.js"></script>
	
    <script src="resources/js/custom.js"></script>
	<script src="resources/js/css3-animate-it.js"></script>
<script type="text/javascript">
function submit(param){
	document.getElementById("beneficiaryIndex").value = param;
	document.getElementById("chooseBeneficiaryForm").submit();
}
</script>
</body>

</html>
