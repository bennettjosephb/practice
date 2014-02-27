<%@page isELIgnored="false"%><!DOCTYPE html>
<html>
<head>
<meta charset=utf-8 />
<title>Layout</title>
<style>
* {
	margin: 0;
	padding: 0;
}

html,body {
	height: 100%;
}

#wrap {
	min-height: 100%;
}

/* Make Header Sticky */
#header_container {
	background: #eee;
	border: 1px solid #666;
	height: 50px;
	left: 0;
	position: fixed;
	width: 100%;
	top: 0;
}

#header {
	line-height: 50px;
	margin: 0 auto;
	width: 940px;
	text-align: center;
}

#content {
	padding-bottom: 30px;
	width: 1000px;
	-moz-border-radius: 3px;
	border-radius: 3px;
	padding-top: 10px;
	padding-right: 10px;
	padding-left: 10px;
	margin-top: 60px;
	margin-bottom: 40px;
	text-align: justify;
	margin-right: auto;
	margin-left: auto;
	background-color: #FF00FF;
	margin-top: 60px;
}

#footer {
	height: 30px;
	margin-top: -30px;
	bottom: 0;
	background: green;
}
</style>
</head>
<body>
	<div id="wrap">
		<!-- BEGIN: Sticky Header -->
		<div id="header_container">
			<div id="header">Hwweader Content</div>
		</div>
		<!-- END: Sticky Header -->


		<div id="content">
			<p>Greetings, it is now </p>
		</div>
	</div>
	<div id="footer">Aenean vulputate eleifend tellus. Aenean leo
		ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam
		lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus
		viverra nulla ut metus</div>
</body>
</html>