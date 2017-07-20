var flag = 0;

/*邮箱*/
$("#usermail").focus(function(){
	$(this).parents(".form-group").find(".error").html("请输入邮箱");
})
$("#usermail").blur(function(){
	var mail = /\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;
	if(!mail.test($(this).val())){
		$(this).parents(".form-group").find(".error").html("<img src='../img/false.png' class='wrong'>请输入正确的邮箱");
		flag = 0;
	}

	else if($(this).val().length==0){
		$(this).parents(".form-group").find(".error").html("<img src='../img/false.png' class='wrong'>邮箱不能为空");
		flag = 0;
	}

	else{
		$(this).parents(".form-group").find(".error").html("<img src='../img/true.png'>输入正确");
		flag = 1;
	}
})

/*密码*/
$("#uPassword").focus(function(){
	$(this).parents(".form-group").find(".error").html("请输入8-16位字符");
})
$("#uPassword").blur(function(){
	if($(this).val().length < 8){
		if($(this).val() == ""){
			$(this).parents(".form-group").find(".error").html("<img src='../img/false.png' class='false'>密码不能为空");
		}else{
			$(this).parents(".form-group").find(".error").html("<img src='../img/false.png' class='false'>密码长度太短");
		}
		flag = 0;
	}else if($(this).val().length > 16){
		$(this).parents(".form-group").find(".error").html("<img src='../img/false.png' class='false'>密码长度太长");
		flag =0;
	}else{
		$(this).parents(".form-group").find(".error").html("<img src='../img/true.png'>输入正确");
		flag = 1;
	}
})

/*再次输入密码*/
$("#uPasswordAgain").focus(function(){
	$(this).parents(".form-group").find(".error").html("请再次输入密码");
})
$("#uPasswordAgain").blur(function(){
	if($(this).val() == ""){
		$(this).parents(".form-group").find(".error").html("<img src='../img/false.png' class='false'>密码不能为空");
		flag = 0;
	
	}else{
		$(this).parents(".form-group").find(".error").html("<img src='../img/true.png'>输入正确");
		flag=1;
	}
})

/*邮箱验证码*/
$("#codes_2").focus(function(){
	$(this).parents(".form-group").find(".error").html("请输入验证码");
})
$("#codes_2").blur(function(){
	if($(this).val()==""){
		$(this).parents(".form-group").find(".error").html("<img src='../img/false.png' class='false'>验证码不能为空");
		flag=0;
	}else{
		$(this).parents(".form-group").find(".error").html("");
		flag=1;
	}
})


// 检测
$("#tijiaoBtn").click(function(){
	if($(this).parents().find("#usermail").val()==""||$(this).parents().find("#uPassword").val()==""||$(this).parents().find("#uPasswordAgain").val()==""||$(this).parents().find("#codes_2").val()==""){
		alert("请正确填写");
		return false;
	}
	else if($(this).parents().find("img").hasClass("false")){
		alert("请正确填写");
		return false;
	}
})