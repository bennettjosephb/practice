<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!DOCTYPE html>
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
	width: 100%;
	text-align: center;
	background-color: #F1F1F1;
	border-bottom-color: #E0E0E0;
	border-bottom-style: solid;
	border-bottom-width: 1px;
}

#content {
	padding-bottom: 30px;
	width: 1000px;
	-moz-border-radius: 3px;
	border-radius: 3px;
	padding-top: 10px;
	padding-right: 10px;
	padding-left: 10px;
	text-align: justify;
	margin-right: auto;
	margin-left: auto;
	margin-top: 5px;
	height: inherit;
}

#footer {
	height: 29px;
	margin-top: -30px;
	bottom: 0;
	background-color: #F1F1F1;
	border-top-color: #E0E0E0;
	border-top-style: solid;
	border-top-width: 1px;
	padding-top: 8px;
	padding-left: 5px;
	font-size: 12px;
	font: Verdana, Tahoma, sans-serif;
	font-family: sans-serif, Arial Narrow, Arial, Helvetica Condensed,
		Helvetica;
	font-size: 12px;
	min-width: 1000px;
	font-size: 12px;
}

.rightAlign {
	float: right;
	background-color: #FFFFFF;
	width: 400px;
	height: 100%;
	padding: 20px;
	-webkit-box-sizing: border-box; /* Safari/Chrome, other WebKit */
	-moz-box-sizing: border-box; /* Firefox, other Gecko */
	box-sizing: border-box;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
}

#registrationForm {
	width: 360px;
	float: right;
	margin-bottom: 10px;
}

.label {
	color: #000000;
	width: 360px;
	height: 15px;
	font-size: 15px;
	font: Verdana, Tahoma, sans-serif;
	font-family: sans-serif, Arial Narrow, Arial, Helvetica Condensed,
		Helvetica;
	float: left;
	padding: 5px;
	float: left;
	float: left;
}

.textboxFirstName {
	height: 30px;
	width: 160px;
	padding-left: 5px;
	padding-right: 5px;
	border: solid 1px #E5E5E5;
	outline: 0;
	margin-left: 5px;
	margin-top: 5px;
	margin-right: 0px;
	margin-bottom: 5px;
	font: normal 15px/100% Verdana, Tahoma, sans-serif;
	background: #FFFFFF url('bg_form.png') left top repeat-x;
	background: -webkit-gradient(linear, left top, left 25, from(#FFFFFF),
		color-stop(4%, #EEEEEE), to(#FFFFFF));
	background: -moz-linear-gradient(top, #FFFFFF, #EEEEEE 1px, #FFFFFF 25px);
	box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-moz-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-webkit-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
}

.textboxFirstName:focus {
	transition-delay: 0.3s;
	-webkit-transition-delay: 0.3s;
	-webkit-transition: 0.3s linear;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
	border-color: #A0A0A0;
	-webkit-box-shadow: rgba(0, 0, 0, 0.15) 0px 0px 8px;
}

.textboxFirstNameError {
	border-color: #FF0000;
	-webkit-box-shadow: rgba(0, 0, 0, 0.15) 0px 0px 8px;
}

.textboxLastName {
	height: 30px;
	width: 160px;
	padding-left: 5px;
	padding-right: 5px;
	border: solid 1px #E5E5E5;
	outline: 0;
	margin-left: 0;
	margin-top: 5px;
	margin-right: 5px;
	margin-bottom: 5px;
	font: normal 15px/100% Verdana, Tahoma, sans-serif;
	background: #FFFFFF url('bg_form.png') left top repeat-x;
	background: -webkit-gradient(linear, left top, left 25, from(#FFFFFF),
		color-stop(4%, #EEEEEE), to(#FFFFFF));
	background: -moz-linear-gradient(top, #FFFFFF, #EEEEEE 1px, #FFFFFF 25px);
	box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-moz-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-webkit-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	margin-bottom: 5px;
}

.textboxLastName:focus {
	-webkit-transition: 0.3s linear;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
	transition-delay: 0.3s;
	-webkit-transition-delay: 0.3s;
	border-color: #A0A0A0;
	-webkit-box-shadow: rgba(0, 0, 0, 0.15) 0px 0px 8px;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
}

.month {
	height: 30px;
	width: 140px;
	padding-left: 5px;
	padding-right: 0px;
	border: solid 1px #E5E5E5;
	outline: 0;
	margin-left: 5px;
	margin-top: 5px;
	margin-right: 2px;
	margin-bottom: 5px;
	font: normal 15px/100% Verdana, Tahoma, sans-serif;
	background: #FFFFFF url('bg_form.png') left top repeat-x;
	background: -webkit-gradient(linear, left top, left 25, from(#FFFFFF),
		color-stop(4%, #EEEEEE), to(#FFFFFF));
	background: -moz-linear-gradient(top, #FFFFFF, #EEEEEE 1px, #FFFFFF 25px);
	box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-moz-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-webkit-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	margin-bottom: 5px;
}

.month:focus {
	-webkit-transition: 0.3s linear;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
	transition-delay: 0.3s;
	-webkit-transition-delay: 0.3s;
	border-color: #A0A0A0;
	-webkit-box-shadow: rgba(0, 0, 0, 0.15) 0px 0px 8px;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
}

.date {
	height: 30px;
	width: 80px;
	padding-left: 0px;
	padding-right: 0px;
	border: solid 1px #E5E5E5;
	outline: 0;
	margin-left: 5px;
	margin-top: 5px;
	margin-right: 2px;
	margin-bottom: 5px;
	font: normal 15px/100% Verdana, Tahoma, sans-serif;
	background: #FFFFFF url('bg_form.png') left top repeat-x;
	background: -webkit-gradient(linear, left top, left 25, from(#FFFFFF),
		color-stop(4%, #EEEEEE), to(#FFFFFF));
	background: -moz-linear-gradient(top, #FFFFFF, #EEEEEE 1px, #FFFFFF 25px);
	box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-moz-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-webkit-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	margin-bottom: 5px;
}

.date:focus {
	-webkit-transition: 0.3s linear;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
	transition-delay: 0.3s;
	-webkit-transition-delay: 0.3s;
	border-color: #A0A0A0;
	-webkit-box-shadow: rgba(0, 0, 0, 0.15) 0px 0px 8px;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
}

.year {
	height: 30px;
	width: 100px;
	padding-left: 0px;
	padding-right: 0px;
	border: solid 1px #E5E5E5;
	outline: 0;
	margin-left: 5px;
	margin-top: 5px;
	margin-right: 8px;
	margin-bottom: 5px;
	font: normal 15px/100% Verdana, Tahoma, sans-serif;
	background: #FFFFFF url('bg_form.png') left top repeat-x;
	background: -webkit-gradient(linear, left top, left 25, from(#FFFFFF),
		color-stop(4%, #EEEEEE), to(#FFFFFF));
	background: -moz-linear-gradient(top, #FFFFFF, #EEEEEE 1px, #FFFFFF 25px);
	box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-moz-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-webkit-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	margin-bottom: 5px;
}

.year:focus {
	-webkit-transition: 0.3s linear;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
	transition-delay: 0.3s;
	-webkit-transition-delay: 0.3s;
	border-color: #A0A0A0;
	-webkit-box-shadow: rgba(0, 0, 0, 0.15) 0px 0px 8px;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
}

.textboxChooseUserName {
	height: 30px;
	width: 337px;
	padding-left: 5px;
	padding-right: 5px;
	border: solid 1px #E5E5E5;
	outline: 0;
	margin-left: 5px;
	margin-top: 5px;
	margin-right: 2px;
	margin-bottom: 5px;
	font: normal 15px/100% Verdana, Tahoma, sans-serif;
	background: #FFFFFF url('bg_form.png') left top repeat-x;
	background: -webkit-gradient(linear, left top, left 25, from(#FFFFFF),
		color-stop(4%, #EEEEEE), to(#FFFFFF));
	background: -moz-linear-gradient(top, #FFFFFF, #EEEEEE 1px, #FFFFFF 25px);
	box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-moz-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-webkit-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
}

.textboxChooseUserName:focus {
	
}

input[type=checkbox].css-checkbox {
	display: none;
}

input[type=checkbox].css-checkbox+label.css-label {
	padding-left: 23px;
	height: 22px;
	display: inline-block;
	line-height: 22px;
	background-repeat: no-repeat;
	background-position: 0 0;
	font-size: 14px;
	font-family: sans-serif, Arial Narrow, Arial, Helvetica Condensed;
	vertical-align: middle;
	cursor: pointer;
	vertical-align: middle;
}

input[type=checkbox].css-checkbox:checked+label.css-label {
	background-position: 0 -22px;
}

label.css-label {
	background: url(images/csscheckbox.png);
	border-left: 5px solid transparent;
	-webkit-touch-callout: none;
	-webkit-user-select: none;
	-khtml-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
	-webkit-touch-callout: none;
}

.gender {
	height: 30px;
	width: 350px;
	padding-left: 0;
	padding-right: 0;
	border: solid 1px #E5E5E5;
	outline: 0;
	margin-left: 5px;
	margin-top: 5px;
	margin-right: 0;
	margin-bottom: 5px;
	font: normal 15px/100% Verdana, Tahoma, sans-serif;
	background: #FFFFFF url('bg_form.png') left top repeat-x;
	background: -webkit-gradient(linear, left top, left 25, from(#FFFFFF),
		color-stop(4%, #EEEEEE), to(#FFFFFF));
	background: -moz-linear-gradient(top, #FFFFFF, #EEEEEE 1px, #FFFFFF 25px);
	box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-moz-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-webkit-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
}

.gender:focus {
	-webkit-transition: 0.3s linear;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
	transition-delay: 0.3s;
	-webkit-transition-delay: 0.3s;
	border-color: #A0A0A0;
	-webkit-box-shadow: rgba(0, 0, 0, 0.15) 0px 0px 8px;
	-moz-transition: 0.3s linear;
	-o-transition: 0.3s linear;
	-ms-transition: 0.3s linear;
}

.site-footer,.page-wrap:after {
	/* .push must be the same height as footer */
	height: 142px;
}

.site-footer {
	background: orange;
}

.clear {
	clear: both;
}

.captchaImage {
	width: 350px;
	height: 50px;
	margin-left: 5px;
	margin-top: 5px;
	margin-right: 2px;
	margin-bottom: 5px;
}

.captchaRegenerate {
	height: 30px;
	width: 348px;
	padding-left: 5px;
	padding-right: 5px;
	border: solid 1px #E5E5E5;
	outline: 0;
	margin-left: 5px;
	margin-top: 5px;
	margin-right: 3px;
	margin-bottom: 5px;
	font: normal 12px/100% Verdana, Tahoma, sans-serif;
	color: #FFFFFF;
	background: -moz-linear-gradient(top, #ff2819 0%, #ab0000);
	background: -webkit-gradient(linear, left top, left bottom, from(#ff2819),
		to(#ab0000));
	-moz-border-radius: 0px;
	-webkit-border-radius: 0px;
	border-radius: 0px;
	border: 1px solid #7d0000;
	-moz-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	-webkit-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px
		2px rgba(255, 255, 255, 0.7);
	box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	text-shadow: 0px -1px 0px rgba(000, 000, 000, 0.4), 0px 1px 0px
		rgba(255, 255, 255, 0.3);
}

.captchaRegenerate:HOVER {
	background: -moz-linear-gradient(top, #ff0d00 0%, #960000);
	background: -webkit-gradient(linear, left top, left bottom, from(#ff0d00),
		to(#960000));
	-moz-border-radius: 0px;
	-webkit-border-radius: 0px;
	border-radius: 0px;
	border: 1px solid #7d0000;
	-moz-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	-webkit-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px
		2px rgba(255, 255, 255, 0.7);
	box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	text-shadow: 0px -1px 0px rgba(000, 000, 000, 0.4), 0px 1px 0px
		rgba(255, 255, 255, 0.3);
}

.captchaRegenerate:ACTIVE {
	color: #ffffff;
	background: -moz-linear-gradient(top, #f20c00 0%, #8f0202);
	background: -webkit-gradient(linear, left top, left bottom, from(#f20c00),
		to(#8f0202));
	-moz-border-radius: 0px;
	-webkit-border-radius: 0px;
	border-radius: 0px;
	border: 1px solid #7d0000;
	-moz-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	-webkit-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px
		2px rgba(255, 255, 255, 0.7);
	box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	text-shadow: 0px -1px 0px rgba(000, 000, 000, 0.4), 0px 1px 0px
		rgba(255, 255, 255, 0.3);
}

.submit {
	height: 30px;
	width: 348px;
	padding-left: 5px;
	padding-right: 5px;
	border: solid 1px #E5E5E5;
	outline: 0;
	margin-left: 5px;
	margin-top: 25px;
	margin-right: 3px;
	margin-bottom: 5px;
	font: normal 12px/100% Verdana, Tahoma, sans-serif;
	color: #FFFFFF;
	background: -moz-linear-gradient(top, #ff2819 0%, #ab0000);
	background: -webkit-gradient(linear, left top, left bottom, from(#ff2819),
		to(#ab0000));
	-moz-border-radius: 0px;
	-webkit-border-radius: 0px;
	border-radius: 0px;
	border: 1px solid #7d0000;
	-moz-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	-webkit-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px
		2px rgba(255, 255, 255, 0.7);
	box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	text-shadow: 0px -1px 0px rgba(000, 000, 000, 0.4), 0px 1px 0px
		rgba(255, 255, 255, 0.3);
}

.submit:HOVER {
	background: -moz-linear-gradient(top, #ff0d00 0%, #960000);
	background: -webkit-gradient(linear, left top, left bottom, from(#ff0d00),
		to(#960000));
	-moz-border-radius: 0px;
	-webkit-border-radius: 0px;
	border-radius: 0px;
	border: 1px solid #7d0000;
	-moz-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	-webkit-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px
		2px rgba(255, 255, 255, 0.7);
	box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	text-shadow: 0px -1px 0px rgba(000, 000, 000, 0.4), 0px 1px 0px
		rgba(255, 255, 255, 0.3);
}

.submit:ACTIVE {
	color: #ffffff;
	background: -moz-linear-gradient(top, #f20c00 0%, #8f0202);
	background: -webkit-gradient(linear, left top, left bottom, from(#f20c00),
		to(#8f0202));
	-moz-border-radius: 0px;
	-webkit-border-radius: 0px;
	border-radius: 0px;
	border: 1px solid #7d0000;
	-moz-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	-webkit-box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px
		2px rgba(255, 255, 255, 0.7);
	box-shadow: 0px 1px 3px rgba(000, 000, 000, 0.5), inset 0px 0px 2px
		rgba(255, 255, 255, 0.7);
	text-shadow: 0px -1px 0px rgba(000, 000, 000, 0.4), 0px 1px 0px
		rgba(255, 255, 255, 0.3);
}

.selectStyle {
	color: #F1F1F1;
	background-color: #FF0000;
}

::-webkit-input-placeholder {
	padding-top: 2px;
}

:-moz-placeholder { /* Firefox 18- */
	padding-top: 8px;
}

::-moz-placeholder { /* Firefox 19+ */
	padding-top: 8px;
}

:-ms-input-placeholder {
	padding-top: 8px;
}

.textBoxError {
	border-color: #C9C9C9;
	background: url('images/Warning.png'),
		-webkit-gradient(linear, left top, left 25, from(#FFFFFF),
		color-stop(4%, #EEEEEE), to(#FFFFFF));
	background: url('images/Warning.png'),
		-moz-linear-gradient(top, #FFFFFF, #EEEEEE 1px, #FFFFFF 25px);
	background-position: center right;
	background-repeat: no-repeat;
	outline: none;
}

#banner_area {
	float: left;
	margin-bottom: 10px;
}

#banner_area img {
	display: none;
	position: absolute;
	top: 0;
	left: 0;
}

#banner_area img:first-child {
	display: block;
}

#banner_area>img {
	width: 620px;
	height: 1000px;
}

#addForm {
	width: 620px;
	height: 1120px;
	background-color: #F1F1F1;
	float: left;
	margin-bottom: 10px;
	word-wrap: break-word;
	padding: 5px;
	font-family: sans-serif, Arial Narrow, Arial, Helvetica Condensed,
		Helvetica;
}

.fileUpload {
	margin-top: 10px;
	margin-bottom: 10px;
	margin-left: 5px;
}
</style>

<script src="js/jquery-2.1.0.js">
	
</script>
<script type="text/javascript">
	function reloadCaptcha() {
		$("#captcha_image").attr("src", "SimpleCaptcha.jpg");
	}
	$("#target").focus(function() {
		alert("Handler for .focus() called.");
	});
	$("input").focusout(function() {
		$(this).css("background-color", "#FFFFFF");
	});
	$("input").focusin(function() {
		$(this).css("background-color", "#FFFFFF");
	});

	$(document).ready(function() {
		$("input").focusin(function() {
			$(this).addClass("textBoxError");
		});
		$("input").focusout(function() {
			$(this).removeClass("textBoxError");
		});
	});
</script>

</head>
<body>
	<div id="wrap">
		<div id="header">LOGO OR HEADING</div>

		<div id="content">
			<div class="addForm" id="addForm">
				Instant Money Transfer </br> </br> </br> PFG Money is the quickest and safest way
				to send or receive money internationally. We offer the best foreign
				exchange rates, and our service is backed by a100% money back
				guarantee. Using PFG Money agents, in partnership with the worldwide
				network of world renowned remittance providers , money can be
				transferred to and from over 180 countries in just minutes. PFG
				Money and our partner agents are everywhere: you and your overseas
				contact will find an agent just around the corner. Instant Money
				Transfer is a simple four step process: </br> </br>1. The sender visits any
				PFG Money office or agent. He or she completes a simple form and
				provides the money to be sent plus a transfer fee. </br>2. Notification
				is sent immediately to the selected PFG Money office or agent in the
				country of the receiver. The sender provides the receiver with a
				security code. </br>3. The receiver visits the selected office or agent.
				They provide the security code and personal identification (where
				applicable). </br>4. The receiver is provided with the transferred funds
				in local currency. The sender instantly receives an SMS notification
				that the transaction has been completed. You’ll find ourservice
				second to none. Combining this with excellent exchange rates,
				competitive fees and a dedication to your security, why look
				anywhere else?
			</div>
			<form action="/newregistration.htm">
				<div class="registrationForm" id="registrationForm">
					<div class="label">Name</div>
					<input class="textboxFirstName" placeholder="First" type="text">
					<input class="textboxLastName" placeholder="Last" type="text">
					<div class="label">Choose your username</div>
					<input class="textboxChooseUserName" type="text">
					<div class="label">Password</div>
					<input class="textboxChooseUserName" type="password">
					<div class="label">Confirm password</div>
					<input class="textboxChooseUserName" type="password">
					<div class="label">Date of Birth</div>
					<select class="month">
						<option value="0">Month</option>
						<option value="1">January</option>
						<option value="2">Febuary</option>
						<option value="3">March</option>
						<option value="4">April</option>
						<option value="5">May</option>
						<option value="6">June</option>
						<option value="7">July</option>
						<option value="8">August</option>
						<option value="9">September</option>
						<option value="10">October</option>
						<option value="11">November</option>
						<option value="12">December</option>
					</select> <select class="date">
						<option value="0">Date</option>
						<c:forEach var="count" begin="1" end="31">
							<option value="${count}">${count}</option>
						</c:forEach>
					</select> <select class="year">
						<option value="0">Year</option>
						<c:forEach var="count" begin="1" end="200">
							<option value="${count}">${count + 1900}</option>
						</c:forEach>
					</select>
					<div class="label">Gender</div>
					<select class="gender">
						<option value="0">Gender</option>
						<option value="1">Male</option>
						<option value="2">Female</option>
						<option value="3">Other</option>
					</select>
					<div class="label">Mobile Phone</div>
					<input class="textboxChooseUserName" type="text">
					<div class="label">Your email address</div>
					<input class="textboxChooseUserName" type="text">
					<div class="label">Address Line 1</div>
					<input class="textboxChooseUserName" type="text">
					<div class="label">Address Line 2</div>
					<input class="textboxChooseUserName" type="text">
					<div class="label">Suburb</div>
					<input class="textboxChooseUserName" type="text">
					<div class="label">Postcode</div>
					<input class="textboxChooseUserName" type="text">
					<div class="label">State</div>
					<input class="textboxChooseUserName" type="text">
					<div class="label">Country</div>
					<select class="gender">
						<option value="0">Country</option>
						<option value="1">Male</option>
						<option value="2">Female</option>
						<option value="3">Other</option>
					</select>
					<div class="label">Type the character in below textbox</div>
					<img id="captcha_image" class="captchaImage" alt=""
						src="SimpleCaptcha.jpg" /> <input class="captchaRegenerate"
						type="button" value="Regenerate Image" onclick="reloadCaptcha()">
					<input class="textboxChooseUserName" type="text">
					<div class="label">ID Proof</div>
					<select class="gender">
						<option value="0">ID Type</option>
						<option value="1">Male</option>
						<option value="2">Female</option>
						<option value="3">Other</option>
					</select> <input class="fileUpload" type="file" name="file" /> <input
						type="checkbox" name="checkboxG1" id="checkboxG1"
						class="css-checkbox" /> <label for="checkboxG1" class="css-label">
						<a href="http://www.google.com">Terms and Conditions</a>
					</label> <input class="submit" type="submit" value="Submit">
				</div>
				<div class="clear"></div>
			</form>
		</div>
	</div>
	<div id="footer">@Copyright Pty Ltd</div>
</body>
</html>