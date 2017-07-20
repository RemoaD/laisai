var flag = 0;
var time = 60;
var timer=null;
var codeContent = $(".ccodes");/*显示验证码*/
var code;//定义一个全局验证码

$(function(){
	createCode(codeContent);
})

$(".ccodes").click(function(){
	createCode(codeContent);
})

/*邮箱*/
$(".email").focus(function(){
	$(this).parents("tr").find(".interpret").html("请输入邮箱");
})
$(".email").blur(function(){
	var mail = /\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;
	if(!mail.test($(this).val())){
		$(this).parents("tr").find(".interpret").html("<img src='img/false.png' class='wrong'>请输入正确的邮箱");
		flag = 0;
	}

	else if($(this).val().length==0){
		$(this).parents("tr").find(".interpret").html("<img src='img/false.png' class='wrong'>邮箱不能为空");
		flag = 0;
	}

	else{
		$(this).parents("tr").find(".interpret").html("<img src='img/true.png'>输入正确");
		flag = 1;
	}
})

/*密码*/
$(".password").focus(function(){
	$(this).parents("tr").find(".interpret").html("请输入6-18位字符");
})
$(".password").blur(function(){
	if($(this).val().length < 6){
		if($(this).val() == ""){
			$(this).parents("tr").find(".interpret").html("<img src='img/false.png' class='false'>密码不能为空");
		}else{
			$(this).parents("tr").find(".interpret").html("<img src='img/false.png' class='false'>密码长度太短");
		}
		flag = 0;
	}else if($(this).val().length > 18){
		$(this).parents("tr").find(".interpret").html("<img src='img/false.png' class='false'>密码长度太长");
		flag =0;
	}else{
		$(this).parents("tr").find(".interpret").html("<img src='img/true.png'>输入正确");
		flag = 1;
	}
})


/*邮箱验证码*/
$(".codes_2").focus(function(){
	$(this).parents("tr").find(".interpret").html("请输入验证码");
})
$(".codes_2").blur(function(){
	if($(this).val()==""){
		$(this).parents("tr").find(".interpret").html("<img src='img/false.png' class='false'>验证码不能为空");
		flag=0;
	}else{
		$(this).parents("tr").find(".interpret").html("");
		flag=1;
	}
})


/*随机加载验证码*/
function createCode(codeContent){
	var selectChar = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');//所有候选组成验证码的字符，也可以用中文的 
	code = '';
	var codeLength=5;
	for(var i=0;i<codeLength;i++){
		var charIndex =Math.floor(Math.random()*selectChar.length);//随机数
		//alert(charIndex);
		code +=selectChar[charIndex];//一张验证码有五个字符组成
		codeContent.html(code);//显示验证码
	}
}
/*输入验证码*/
$(".codes").focus(function(){
	$(this).parents("tr").find(".interpret").html('不区分大小写');
})
$(".codes").blur(function(){
	var Code = $(this).val();	//输入验证码的值
	var codefalse=$(this).parents("tr").find(".interpret");
	var ccode=$(".ccodes").text();	//显示的验证码的值
	codeBlur(Code,codefalse,ccode,codeContent);
})

function codeBlur(Code,codefalse,ccode,codeContent){
	Code=Code.toUpperCase();
	if(Code.length <=0){
		codefalse.removeClass("disnone");
		codefalse.html('<img src="img/false.png" class="false">'+"验证码为空");
	}else if(Code !=ccode && Code.length >0){
		codefalse.removeClass("disnone");
		codefalse.html('<img src="img/false.png" class="false">'+"验证码有误");
		createCode(codeContent);//如果输入的验证码有误就刷新验证码	
	}
	else{
		codefalse.html("");	
	}
}

// 检测
$(".login-btn").click(function(e){
	if($(this).parent().find(".email").val()==""||$(this).parent().find(".password").val()==""||$(this).parent().find(".codes").val()==""){
		alert("请正确填写");
	}
	else if($(this).parent().find("img").hasClass("false")){
		alert("请正确填写");
	}
})